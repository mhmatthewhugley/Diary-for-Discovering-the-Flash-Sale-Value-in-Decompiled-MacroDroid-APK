package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;

public final class NetHttpTransport extends HttpTransport {

    /* renamed from: f */
    private static final String[] f52527f;

    /* renamed from: c */
    private final ConnectionFactory f52528c;

    /* renamed from: d */
    private final SSLSocketFactory f52529d;

    /* renamed from: e */
    private final HostnameVerifier f52530e;

    public static final class Builder {
    }

    static {
        String[] strArr = {HttpDelete.METHOD_NAME, "GET", HttpHead.METHOD_NAME, HttpOptions.METHOD_NAME, "POST", HttpPut.METHOD_NAME, HttpTrace.METHOD_NAME};
        f52527f = strArr;
        Arrays.sort(strArr);
    }

    public NetHttpTransport() {
        this((ConnectionFactory) null, (SSLSocketFactory) null, (HostnameVerifier) null);
    }

    /* renamed from: e */
    public boolean mo60469e(String str) {
        return Arrays.binarySearch(f52527f, str) >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public NetHttpRequest mo60266b(String str, String str2) throws IOException {
        Preconditions.m72715c(mo60469e(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.f52528c.mo60508a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            HostnameVerifier hostnameVerifier = this.f52530e;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f52529d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new NetHttpRequest(a);
    }

    NetHttpTransport(ConnectionFactory connectionFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f52528c = connectionFactory == null ? new DefaultConnectionFactory() : connectionFactory;
        this.f52529d = sSLSocketFactory;
        this.f52530e = hostnameVerifier;
    }
}
