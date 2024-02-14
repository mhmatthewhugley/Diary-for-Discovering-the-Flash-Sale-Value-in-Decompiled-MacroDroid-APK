package com.sun.mail.util;

import java.io.IOException;

public class SocketConnectException extends IOException {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 3997871560538755463L;
    private int cto;
    private String host;
    private int port;

    static {
        Class<SocketConnectException> cls = SocketConnectException.class;
    }

    public SocketConnectException(String str, Exception exc, String str2, int i, int i2) {
        super(str);
        initCause(exc);
        this.host = str2;
        this.port = i;
        this.cto = i2;
    }

    public int getConnectionTimeout() {
        return this.cto;
    }

    public Exception getException() {
        return (Exception) getCause();
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}
