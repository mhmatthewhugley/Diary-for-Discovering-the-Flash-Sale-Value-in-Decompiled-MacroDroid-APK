package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.protocol.HTTP;

final class NetHttpRequest extends LowLevelHttpRequest {

    /* renamed from: e */
    private final HttpURLConnection f52519e;

    NetHttpRequest(HttpURLConnection httpURLConnection) {
        this.f52519e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public void mo60255a(String str, String str2) {
        this.f52519e.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public LowLevelHttpResponse mo60256b() throws IOException {
        HttpURLConnection httpURLConnection = this.f52519e;
        if (mo60477f() != null) {
            String e = mo60476e();
            if (e != null) {
                mo60255a("Content-Type", e);
            }
            String c = mo60474c();
            if (c != null) {
                mo60255a(HTTP.CONTENT_ENCODING, c);
            }
            long d = mo60475d();
            int i = (d > 0 ? 1 : (d == 0 ? 0 : -1));
            if (i >= 0) {
                mo60255a("Content-Length", Long.toString(d));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || HttpPut.METHOD_NAME.equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (i < 0 || d > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) d);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    mo60477f().writeTo(outputStream);
                    try {
                    } catch (IOException e2) {
                        throw e2;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                Preconditions.m72715c(i == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new NetHttpResponse(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    /* renamed from: k */
    public void mo60482k(int i, int i2) {
        this.f52519e.setReadTimeout(i2);
        this.f52519e.setConnectTimeout(i);
    }
}
