package com.jjh.set;

public class SetException extends Exception {
    public int code;

    public SetException(String cause, int code) {
        super(cause);
        this.code = code;
    }

    public SetException(Exception exp, String cause, int code) {
        super(cause, exp);
        this.code = code;
    }
}
