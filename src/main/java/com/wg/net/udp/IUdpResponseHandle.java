package com.wg.net.udp;

public interface IUdpResponseHandle {

    void handle(byte[] responseData) throws Exception;
}
