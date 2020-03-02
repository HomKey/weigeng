package com.wg.net.udp;

import com.wg.util.HexUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.*;

public class UdpServer {
    private static final Logger logger = LoggerFactory.getLogger(UdpServer.class);
    private DatagramChannel channel;
    private Selector selector;

    public UdpServer() {
        try {
            // 获得一个通道管理器
            this.selector = Selector.open();
            // 获得一个Socket通道
            this.channel = DatagramChannel.open();
        } catch (IOException e) {
            selector = null;
            channel = null;
            logger.error("超时");
        }
        logger.info("服务启动成功");
    }

    public void listen(int port, IUdpResponseHandle responseHandle) throws IOException {
        if (channel == null || selector == null) {
            return;
        }
        // 设置通道为非阻塞
        this.channel.configureBlocking(false);
        this.channel.socket().bind(new InetSocketAddress(port));
        this.channel.register(selector, SelectionKey.OP_READ);
        while (selector.select() > 0) {
            logger.info("有新channel加入");
            /* 得到已经被捕获了的SelectionKey的集合 */
            Iterator iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = null;
                try {
                    key = (SelectionKey) iterator.next();
                    iterator.remove();
                    if (key.isReadable()) {
                        DatagramChannel sc = (DatagramChannel) key.channel();
                        ByteBuffer buf = ByteBuffer.allocate(1024);
                        buf.clear();
                        SocketAddress address = sc.receive(buf);
                        String clientAddress = address.toString().replace("/", "").split(":")[0];
                        String clientPort = address.toString().replace("/", "").split(":")[1];
                        logger.info("接收到client:" + "[ip=" + clientAddress + ";port=" + clientPort + "]");
                        buf.flip();
                        byte[] result = null;
                        while (buf.hasRemaining()) {
                            byte[] array = new byte[buf.limit()];
                            buf.get(array);
                            if (result == null) {
                                result = array;
                            } else {
                                byte[] newResult = new byte[result.length + array.length];
                                System.arraycopy(result, 0, newResult, 0, result.length);
                                System.arraycopy(array, 0, newResult, result.length, array.length);
                                result = newResult;
                            }
                        }
                        buf.clear();
                        try {
                            responseHandle.handle(result);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        if (key != null) {
                            key.cancel();
                            key.channel().close();
                        }
                    } catch (ClosedChannelException cex) {
                        cex.printStackTrace();
                    }
                }
            }
        }
    }
}
