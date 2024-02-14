package com.google.android.gms.internal.ads;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcld implements zzfpt {

    /* renamed from: a */
    public final /* synthetic */ String f28833a;

    public /* synthetic */ zzcld(String str) {
        this.f28833a = str;
    }

    public final URLConnection zza() {
        String str = this.f28833a;
        int i = zzcle.f28836s;
        zzt.m2912y();
        int intValue = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27291x)).intValue();
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    zzcgo zzcgo = new zzcgo((String) null);
                    zzcgo.mo43556c(httpURLConnection, (byte[]) null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzcgo.mo43558e(httpURLConnection, responseCode);
                    if (responseCode / 100 != 3) {
                        return httpURLConnection;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            throw new IOException("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                            zzcgp.m45224b("Redirecting to ".concat(headerField));
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            throw new IOException("Unsupported scheme: ".concat(protocol));
                        }
                    } else {
                        throw new IOException("Missing Location header in redirect");
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
