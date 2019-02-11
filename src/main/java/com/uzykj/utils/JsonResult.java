package com.uzykj.utils;

/**
 * @author ghostxbh
 * @date 11/02/2019 21:14
 */
public class JsonResult {
    private final Integer normal = 200;
    private final String message = "OK";
    private Integer code;
    private String meg;
    private Object result;

    public JsonResult() {

    }

    public JsonResult(Object result) {
        this.code = normal;
        this.meg = message;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
