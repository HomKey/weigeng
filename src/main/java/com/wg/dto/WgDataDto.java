package com.wg.dto;

import com.wg.util.WgDataUtils;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WgDataDto {
    /**
     * 数据响应类型，主动请求响应0x17，被动上送响应0x19
     */
    private Integer type;
    /**
     * 设备序列号
     */
    private String deviceNumber;
    /**
     * 记录索引号
     */
    private Long recordIndex;
    /**
     * 0 无记录
     * 1 刷卡记录
     * 2 门磁按钮，设备启动，远程开门记录
     * 3 报警记录
     */
    private Integer recordType;
    /**
     * 0 表示不通过, 1表示通过
     */
    private Integer isPass;
    /**
     * 门号 1 2 3 4
     */
    private Integer doorNumber;
    /**
     * 进门/出门(1表示进门, 2表示出门)
     */
    private Integer inout;
    /**
     * 卡号(类型是刷卡记录时)
     * 编号(其他类型记录)
     */
    private String userNumber;
    private Date recordDate;
    private Integer reasonCode;

    /**
     * 门磁状态
     * 0 关
     * 1 开
     */
    private Integer gateMagnetism1;
    private Integer gateMagnetism2;
    private Integer gateMagnetism3;
    private Integer gateMagnetism4;
    /**
     * 门按钮状态
     * 0 松开
     * 1 按下
     */
    private Integer gateButton1;
    private Integer gateButton2;
    private Integer gateButton3;
    private Integer gateButton4;
    /**
     * 继电器状态
     * 0 门上锁
     * 1 门开锁
     */
    private Integer gateRelay1;
    private Integer gateRelay2;
    private Integer gateRelay3;
    private Integer gateRelay4;
    /**
     * 故障号
     * 0 无故障
     * 不等于0 有故障
     */
    private Integer hasError;
    private Date date;
    /**
     * 强制锁门
     */
    private Integer forceLockDoorAlarm;
    /**
     * 火警
     */
    private Integer fireAlarm;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Long getRecordIndex() {
        return recordIndex;
    }

    public void setRecordIndex(Long recordIndex) {
        this.recordIndex = recordIndex;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Integer getInout() {
        return inout;
    }

    public void setInout(Integer inout) {
        this.inout = inout;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Integer getGateMagnetism1() {
        return gateMagnetism1;
    }

    public void setGateMagnetism1(Integer gateMagnetism1) {
        this.gateMagnetism1 = gateMagnetism1;
    }

    public Integer getGateMagnetism2() {
        return gateMagnetism2;
    }

    public void setGateMagnetism2(Integer gateMagnetism2) {
        this.gateMagnetism2 = gateMagnetism2;
    }

    public Integer getGateMagnetism3() {
        return gateMagnetism3;
    }

    public void setGateMagnetism3(Integer gateMagnetism3) {
        this.gateMagnetism3 = gateMagnetism3;
    }

    public Integer getGateMagnetism4() {
        return gateMagnetism4;
    }

    public void setGateMagnetism4(Integer gateMagnetism4) {
        this.gateMagnetism4 = gateMagnetism4;
    }

    public Integer getGateButton1() {
        return gateButton1;
    }

    public void setGateButton1(Integer gateButton1) {
        this.gateButton1 = gateButton1;
    }

    public Integer getGateButton2() {
        return gateButton2;
    }

    public void setGateButton2(Integer gateButton2) {
        this.gateButton2 = gateButton2;
    }

    public Integer getGateButton3() {
        return gateButton3;
    }

    public void setGateButton3(Integer gateButton3) {
        this.gateButton3 = gateButton3;
    }

    public Integer getGateButton4() {
        return gateButton4;
    }

    public void setGateButton4(Integer gateButton4) {
        this.gateButton4 = gateButton4;
    }

    public Integer getGateRelay1() {
        return gateRelay1;
    }

    public void setGateRelay1(Integer gateRelay1) {
        this.gateRelay1 = gateRelay1;
    }

    public Integer getGateRelay2() {
        return gateRelay2;
    }

    public void setGateRelay2(Integer gateRelay2) {
        this.gateRelay2 = gateRelay2;
    }

    public Integer getGateRelay3() {
        return gateRelay3;
    }

    public void setGateRelay3(Integer gateRelay3) {
        this.gateRelay3 = gateRelay3;
    }

    public Integer getGateRelay4() {
        return gateRelay4;
    }

    public void setGateRelay4(Integer gateRelay4) {
        this.gateRelay4 = gateRelay4;
    }

    public Integer getHasError() {
        return hasError;
    }

    public void setHasError(Integer hasError) {
        this.hasError = hasError;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getForceLockDoorAlarm() {
        return forceLockDoorAlarm;
    }

    public void setForceLockDoorAlarm(Integer forceLockDoorAlarm) {
        this.forceLockDoorAlarm = forceLockDoorAlarm;
    }

    public Integer getFireAlarm() {
        return fireAlarm;
    }

    public void setFireAlarm(Integer fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    public WgDataDto(byte[] data) {
        type = (int) data[0];
        deviceNumber = WgDataUtils.toHexString(Arrays.copyOfRange(data, 4, 8));
        recordIndex = WgDataUtils.toLong(Arrays.copyOfRange(data, 8, 12));
        recordType = (int) data[12];
        isPass = (int) data[13];
        doorNumber = (int) data[14];
        inout = (int) data[15];
        userNumber = WgDataUtils.toHexString(Arrays.copyOfRange(data, 16, 20));
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                WgDataUtils.toIntByBCD(data[20]) * 100 + WgDataUtils.toIntByBCD(data[21]),
                WgDataUtils.toIntByBCD(data[22]) - 1,
                WgDataUtils.toIntByBCD(data[23]),
                WgDataUtils.toIntByBCD(data[24]),
                WgDataUtils.toIntByBCD(data[25]),
                WgDataUtils.toIntByBCD(data[26])
        );
        recordDate = calendar.getTime();
        reasonCode = (int) data[27];
        gateMagnetism1 = (int) data[28];
        gateMagnetism2 = (int) data[29];
        gateMagnetism3 = (int) data[30];
        gateMagnetism4 = (int) data[31];
        gateButton1 = (int) data[32];
        gateButton2 = (int) data[33];
        gateButton3 = (int) data[34];
        gateButton4 = (int) data[35];
        hasError = (int) data[36];
        calendar.set(
                (WgDataUtils.toIntByBCD(data[51]) + 2000),
                WgDataUtils.toIntByBCD(data[52]) - 1,
                WgDataUtils.toIntByBCD(data[53]),
                WgDataUtils.toIntByBCD(data[37]),
                WgDataUtils.toIntByBCD(data[38]),
                WgDataUtils.toIntByBCD(data[39])
        );
        date = calendar.getTime();
        gateRelay1 = data[49] & 1;
        gateRelay2 = data[49] >> 1 & 1;
        gateRelay3 = data[49] >> 2 & 1;
        gateRelay4 = data[49] >> 3 & 1;
        forceLockDoorAlarm = data[50] & 1;
        fireAlarm = data[50] >> 1 & 1;
    }

    @Override
    public String toString() {
        return "WgDataDto{" +
                "type=" + type +
                ", deviceNumber='" + deviceNumber + '\'' +
                ", recordIndex=" + recordIndex +
                ", recordType=" + recordType +
                ", isPass=" + isPass +
                ", doorNumber=" + doorNumber +
                ", inout=" + inout +
                ", userNumber='" + userNumber + '\'' +
                ", recordDate=" + recordDate +
                ", reasonCode=" + reasonCode +
                ", gateMagnetism1=" + gateMagnetism1 +
                ", gateMagnetism2=" + gateMagnetism2 +
                ", gateMagnetism3=" + gateMagnetism3 +
                ", gateMagnetism4=" + gateMagnetism4 +
                ", gateButton1=" + gateButton1 +
                ", gateButton2=" + gateButton2 +
                ", gateButton3=" + gateButton3 +
                ", gateButton4=" + gateButton4 +
                ", gateRelay1=" + gateRelay1 +
                ", gateRelay2=" + gateRelay2 +
                ", gateRelay3=" + gateRelay3 +
                ", gateRelay4=" + gateRelay4 +
                ", hasError=" + hasError +
                ", date=" + date +
                ", forceLockDoorAlarm=" + forceLockDoorAlarm +
                ", fireAlarm=" + fireAlarm +
                '}';
    }
}
