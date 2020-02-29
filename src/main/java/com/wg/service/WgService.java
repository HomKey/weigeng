package com.wg.service;


import com.wg.util.WgDataUtils;

public class WgService {


    /**
     * 搜索门禁控制器
     *
     * @return
     */
    public byte[] getSearchDeviceCommand() {
        byte[] command = new byte[64];
        command[0] = 0x17;
        command[1] = (byte) 0x94;
        return command;
    }

    /**
     * 设置门禁控制的网络信息
     *
     * @param deviceNumber
     * @param ip
     * @param mask
     * @param gateway
     * @return
     */
    public byte[] getSetServerCommand(String deviceNumber, String ip, String mask, String gateway) {
        byte[] command = new byte[64];
        command[0] = 0x17;
        command[1] = (byte) 0x96;
        byte[] deviceBytes = WgDataUtils.toBytes(deviceNumber);
        command[4] = deviceBytes[0];
        command[5] = deviceBytes[1];
        command[6] = deviceBytes[2];
        command[7] = deviceBytes[3];
        String[] ipStrings = ip.split("\\.");
        command[8] = Integer.valueOf(ipStrings[0]).byteValue();
        command[9] = Integer.valueOf(ipStrings[1]).byteValue();
        command[10] = Integer.valueOf(ipStrings[2]).byteValue();
        command[11] = Integer.valueOf(ipStrings[3]).byteValue();
        String[] maskStrings = mask.split("\\.");
        command[12] = Integer.valueOf(maskStrings[0]).byteValue();
        command[13] = Integer.valueOf(maskStrings[1]).byteValue();
        command[14] = Integer.valueOf(maskStrings[2]).byteValue();
        command[15] = Integer.valueOf(maskStrings[3]).byteValue();
        String[] gatewayStrings = gateway.split("\\.");
        command[16] = Integer.valueOf(gatewayStrings[0]).byteValue();
        command[17] = Integer.valueOf(gatewayStrings[1]).byteValue();
        command[18] = Integer.valueOf(gatewayStrings[2]).byteValue();
        command[19] = Integer.valueOf(gatewayStrings[3]).byteValue();
        command[20] = 0x55;
        command[21] = (byte) 0xAA;
        command[22] = (byte) 0xAA;
        command[23] = 0x55;
        return command;
    }

    /**
     * 接收服务器的IP和端口
     *
     * @param deviceNumber
     * @param ip
     * @param port
     * @param time 每隔多少秒进行一次数据发送，若为0，表示有新数据时才会上送数据到该ip和端口的服务器
     * @return
     */
    public byte[] getSetTargetCommand(String deviceNumber, String ip, long port, int time) {
        byte[] command = new byte[64];
        command[0] = 0x17;
        command[1] = (byte) 0x90;
        byte[] deviceBytes = WgDataUtils.toBytes(deviceNumber);
        command[4] = deviceBytes[0];
        command[5] = deviceBytes[1];
        command[6] = deviceBytes[2];
        command[7] = deviceBytes[3];
        String[] ipStrings = ip.split("\\.");
        command[8] = Integer.valueOf(ipStrings[0]).byteValue();
        command[9] = Integer.valueOf(ipStrings[1]).byteValue();
        command[10] = Integer.valueOf(ipStrings[2]).byteValue();
        command[11] = Integer.valueOf(ipStrings[3]).byteValue();
        byte[] portBytes = WgDataUtils.toBytes(port);
        command[12] = portBytes[1];
        command[13] = portBytes[0];
        command[14] = (byte) time;
        return command;
    }

    /**
     * 接收控制器上送的数据
     * @param data
     */
    public void acceptData(byte[] data) {
        if (data.length != 64) {
            return;
        }
//        19 17



    }


}
