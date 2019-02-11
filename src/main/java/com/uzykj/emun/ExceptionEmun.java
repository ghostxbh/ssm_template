package com.uzykj.emun;

/**
 * @author ghostxbh
 * @date 11/02/2019 21:04
 */
public enum ExceptionEmun {
    PARAMEX(1, "参数异常"), NULLEX(2, "空指针异常");
    private int code;
    private String meg;

    ExceptionEmun(int code, String meg) {
        this.code = code;
        this.meg = meg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }
}
