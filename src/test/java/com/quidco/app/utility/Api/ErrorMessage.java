package com.quidco.app.utility.Api;

/**
 * Created by ashishmohindroo on 3/20/17.
 */
public class ErrorMessage {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage() {
    }
}
