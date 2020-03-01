package com.wg.dto;

import com.wg.enums.ResponseEnum;

/**
 * Created by HomKey on 2020/3/1.
 */
public class ResponseResult {
    private Integer code;
    private String message;
    private Object data;

    public ResponseResult(ResponseEnum responseEnum, Object data){
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        this.data = data;
    }

    public ResponseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
