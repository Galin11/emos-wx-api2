package com.example.emos.wx.exception;

import lombok.Data;
/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-06 17:40
 * @version: 1.0
 */
@Data
public class EmosException extends RuntimeException{
    private String msg;
    private int code = 500;

    public EmosException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EmosException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public EmosException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public EmosException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
