package com.wg.entity;


import com.wg.dto.WgDataDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "event_info")
public class EventInfo extends BaseEntity{
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
    private Integer ioType;
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

    public EventInfo(WgDataDto dto) {
        this.type = dto.getType();
        this.deviceNumber = dto.getDeviceNumber();
        this.recordIndex = dto.getRecordIndex();
        this.recordType = dto.getRecordType();
        this.isPass = dto.getIsPass();
        this.doorNumber = dto.getDoorNumber();
        this.ioType = dto.getInout();
        this.userNumber = dto.getUserNumber();
        this.recordDate = dto.getRecordDate();
        this.reasonCode = dto.getReasonCode();
        this.gateMagnetism1 = dto.getGateMagnetism1();
        this.gateMagnetism2 = dto.getGateMagnetism2();
        this.gateMagnetism3 = dto.getGateMagnetism3();
        this.gateMagnetism4 = dto.getGateMagnetism4();
        this.gateButton1 = dto.getGateButton1();
        this.gateButton2 = dto.getGateButton2();
        this.gateButton3 = dto.getGateButton3();
        this.gateButton4 = dto.getGateButton4();
        this.gateRelay1 = dto.getGateRelay1();
        this.gateRelay2 = dto.getGateRelay2();
        this.gateRelay3 = dto.getGateRelay3();
        this.gateRelay4 = dto.getGateRelay4();
        this.hasError = dto.getHasError();
        this.date = dto.getDate();
        this.forceLockDoorAlarm = dto.getForceLockDoorAlarm();
        this.fireAlarm = dto.getFireAlarm();
    }

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

    public Integer getIoType() {
        return ioType;
    }

    public void setIoType(Integer ioType) {
        this.ioType = ioType;
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
}
