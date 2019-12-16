package com.lee.itoken.common.web.model;

/**
 * @author WangLe
 * @date 2019/7/24 9:23
 * @description
 */
public class RespModel {
    /**
     * 是否成功
     */
    private boolean success = true;
    /**
     * 错误码
     */
    private String errCode;
    /**
     * 错误信息
     */
    private String errMsg;
    /**
     * 额外内容
     */
    private Object content;

    public RespModel(Object content) {
        this.content = content;
    }

    public RespModel(String errCode, String errMsg) {
        this.success = false;
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
