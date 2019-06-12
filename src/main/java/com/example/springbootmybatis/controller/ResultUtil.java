package com.example.springbootmybatis.controller;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 16:37 2019/6/11
 */
import java.io.Serializable;

public class ResultUtil<T> implements Serializable {

    private static final long serialVersionUID = 3637122497350396679L;

    private boolean success;
    private T data;
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultUtil(boolean success) {
        this.success = success;
    }

    public ResultUtil(boolean success, String msg) {
        super();
        this.success = success;
        this.msg = msg;
    }

    public ResultUtil(boolean success, T data, String msg) {
        super();
        this.success = success;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 返回正确结果不带数据
     *
     * @return
     */
    public static ResultUtil ok() {
        return new ResultUtil(true);
    }

    /**
     * 返回错误的结果带错误信息
     *
     * @param msg
     * @return
     */
    public static ResultUtil error(String msg) {
        return new ResultUtil(false, msg);
    }
}