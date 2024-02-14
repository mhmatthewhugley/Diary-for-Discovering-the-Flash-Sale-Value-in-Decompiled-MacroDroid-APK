package com.google.api.client.testing.http.javanet;

import com.google.api.client.util.Beta;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

@Beta
public class MockHttpURLConnection extends HttpURLConnection {
    @Deprecated

    /* renamed from: f */
    public static final byte[] f52702f = new byte[1];
    @Deprecated

    /* renamed from: g */
    public static final byte[] f52703g = new byte[5];

    /* renamed from: a */
    private boolean f52704a;

    /* renamed from: b */
    private OutputStream f52705b;

    /* renamed from: c */
    private InputStream f52706c;

    /* renamed from: d */
    private InputStream f52707d;

    /* renamed from: e */
    private Map<String, List<String>> f52708e;

    public void connect() throws IOException {
    }

    public void disconnect() {
    }

    public InputStream getErrorStream() {
        return this.f52707d;
    }

    public String getHeaderField(String str) {
        List list = this.f52708e.get(str);
        if (list == null) {
            return null;
        }
        return (String) list.get(0);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f52708e;
    }

    public InputStream getInputStream() throws IOException {
        if (this.responseCode < 400) {
            return this.f52706c;
        }
        throw new IOException();
    }

    public OutputStream getOutputStream() throws IOException {
        OutputStream outputStream = this.f52705b;
        if (outputStream != null) {
            return outputStream;
        }
        return super.getOutputStream();
    }

    public int getResponseCode() throws IOException {
        return this.responseCode;
    }

    public void setDoOutput(boolean z) {
        this.f52704a = true;
    }

    public boolean usingProxy() {
        return false;
    }
}
