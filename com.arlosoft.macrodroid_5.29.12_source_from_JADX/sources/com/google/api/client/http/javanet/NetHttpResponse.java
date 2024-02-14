package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class NetHttpResponse extends LowLevelHttpResponse {

    /* renamed from: a */
    private final HttpURLConnection f52520a;

    /* renamed from: b */
    private final int f52521b;

    /* renamed from: c */
    private final String f52522c;

    /* renamed from: d */
    private final ArrayList<String> f52523d;

    /* renamed from: e */
    private final ArrayList<String> f52524e;

    NetHttpResponse(HttpURLConnection httpURLConnection) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f52523d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f52524e = arrayList2;
        this.f52520a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f52521b = responseCode == -1 ? 0 : responseCode;
        this.f52522c = httpURLConnection.getResponseMessage();
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo60483a() {
        this.f52520a.disconnect();
    }

    /* renamed from: b */
    public InputStream mo60257b() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.f52520a.getInputStream();
        } catch (IOException unused) {
            inputStream = this.f52520a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new SizeValidatingInputStream(inputStream);
    }

    /* renamed from: c */
    public String mo60258c() {
        return this.f52520a.getContentEncoding();
    }

    /* renamed from: d */
    public String mo60259d() {
        return this.f52520a.getHeaderField("Content-Type");
    }

    /* renamed from: e */
    public int mo60260e() {
        return this.f52523d.size();
    }

    /* renamed from: f */
    public String mo60261f(int i) {
        return this.f52523d.get(i);
    }

    /* renamed from: g */
    public String mo60262g(int i) {
        return this.f52524e.get(i);
    }

    /* renamed from: h */
    public String mo60263h() {
        return this.f52522c;
    }

    /* renamed from: i */
    public int mo60264i() {
        return this.f52521b;
    }

    /* renamed from: j */
    public String mo60265j() {
        String headerField = this.f52520a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: k */
    public long mo60509k() {
        String headerField = this.f52520a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    private final class SizeValidatingInputStream extends FilterInputStream {

        /* renamed from: a */
        private long f52525a = 0;

        public SizeValidatingInputStream(InputStream inputStream) {
            super(inputStream);
        }

        /* renamed from: b */
        private void m72224b() throws IOException {
            long k = NetHttpResponse.this.mo60509k();
            if (k != -1) {
                long j = this.f52525a;
                if (j != 0 && j < k) {
                    long j2 = this.f52525a;
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("Connection closed prematurely: bytesRead = ");
                    sb.append(j2);
                    sb.append(", Content-Length = ");
                    sb.append(k);
                    throw new IOException(sb.toString());
                }
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                m72224b();
            } else {
                this.f52525a += (long) read;
            }
            return read;
        }

        public int read() throws IOException {
            int read = this.in.read();
            if (read == -1) {
                m72224b();
            } else {
                this.f52525a++;
            }
            return read;
        }
    }
}
