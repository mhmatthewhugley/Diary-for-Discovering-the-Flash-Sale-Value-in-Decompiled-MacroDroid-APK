package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzyj {
    /* renamed from: a */
    public static void m58476a(String str, zzxm zzxm, zzyg zzyg, Type type, zzxq zzxq) {
        BufferedOutputStream bufferedOutputStream;
        try {
            Preconditions.m4488k(zzxm);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzxm.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzxq.mo50060a(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            m58477b(httpURLConnection, zzyg, type);
            return;
        } catch (SocketTimeoutException unused) {
            zzyg.mo49911o("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            zzyg.mo49911o("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e) {
            zzyg.mo49911o(e.getMessage());
            return;
        } catch (Throwable th) {
            zzyi.m58475a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static void m58477b(HttpURLConnection httpURLConnection, zzyg zzyg, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (m58478c(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!m58478c(responseCode)) {
                zzyg.mo49911o((String) zzxl.m58379a(sb2, String.class));
            } else {
                zzyg.mo49910c((zzxn) zzxl.m58379a(sb2, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            zzyg.mo49911o("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (zzvg | IOException e) {
            try {
                zzyg.mo49911o(e.getMessage());
                return;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            zzyi.m58475a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private static final boolean m58478c(int i) {
        return i >= 200 && i < 300;
    }
}
