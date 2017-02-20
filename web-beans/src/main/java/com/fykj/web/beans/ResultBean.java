/**
  * -------------------------------------------------------------------------
  * (C) Copyright 
  * @版权所有：com.fykj
  * @项目名称：web-beans
  * @作者：fengshuhao
  * @联系方式：fengshuhao@
  * @创建时间：2017年2月20日 下午4:25:20
  * @版本号：0.0.1
  *-------------------------------------------------------------------------
  */
package com.fykj.web.beans;

/**
 * <p>
 * ResultBean描述
 * </p>
 * 
 * @author fengshuhao
 * @since 0.0.1
 */
public class ResultBean<T> {
    private boolean isSuccess;
    private String message;
    private T data;

    public ResultBean() {

    }

    public ResultBean(boolean isSuccess, String message, T date) {
        this.setIsSuccess(isSuccess);
        this.setMessage(message);
        this.setData(date);
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setProperties(boolean isSuccess, String message, T data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.setData(data);
    }

    @Override
    public String toString() {
        return "ResultBean [isSuccess=" + isSuccess + ", message=" + message
                + ", data=" + data + "]";
    }

}
