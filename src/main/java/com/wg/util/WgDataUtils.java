package com.wg.util;

public class WgDataUtils {

    public static int toIntByBCD(byte b) {
        return b - (b / 16) * 6;
    }

    public static byte toByteByBCD(int num) {
        return (byte) (num + (num / 10) * 6);
    }

    public static byte[] toBytes(String str) {
        if (str.length() % 2 == 1) {
            str = "0" + str;
        }
        byte[] result = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int parseInt = Integer.parseInt(str.substring(i * 2, (i + 1) * 2), 16);
            result[i] = (byte) parseInt;
        }
        return result;
    }

    public static byte[] toBytes(long l) {
        String s = Long.toHexString(l);
        return toBytes(s);
    }

    public static String toHexString(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bytes) {
            stringBuffer.append(toHexString(b));
        }
        return stringBuffer.toString();
    }

    /**
     * 字节数组转Long
     *
     * @param bytes
     * @return
     */
    public static Long toLong(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = bytes.length - 1; i >= 0; i--) {
            stringBuffer.append(toHexString(bytes[i]));
        }
        return Long.parseLong(stringBuffer.toString(), 16);
    }

    public static String toHexString(byte b) {
        String s = Integer.toHexString(b & 0xFF);
        if (s.length() == 1) {
            return "0" + s;
        } else {
            return s;
        }
    }
}
