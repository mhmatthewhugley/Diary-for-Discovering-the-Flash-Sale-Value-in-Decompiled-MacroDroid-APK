package p155r1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import org.apache.http.auth.AUTH;
import p155r1.C8192h;

/* renamed from: r1.e */
/* compiled from: SendGridCall */
class C8188e {
    C8188e() {
    }

    /* renamed from: c */
    private C8192h m33952c(int i, String str) {
        if (i < 200 || i >= 300) {
            return C8192h.C8193a.m33998a(i, str);
        }
        return C8192h.C8193a.m33999b(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ C8192h m33953d(String str, String str2, C8191g gVar) throws Exception {
        InputStream inputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(AUTH.WWW_AUTH_RESP, str2);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(gVar.mo38258e().toString().getBytes("UTF-8"));
        outputStream.close();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        int responseCode = httpURLConnection.getResponseCode();
        String e = m33954e(inputStream);
        httpURLConnection.disconnect();
        return m33952c(responseCode, e);
    }

    /* renamed from: e */
    private String m33954e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Callable<C8192h> mo38236b(String str, String str2, C8191g gVar) {
        return new C16346d(this, String.format("%s%s", new Object[]{"https://sendgrid.com/v3/", str}), str2, gVar);
    }
}
