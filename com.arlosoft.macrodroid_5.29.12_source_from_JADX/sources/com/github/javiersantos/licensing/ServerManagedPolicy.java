package com.github.javiersantos.licensing;

import android.util.Log;
import com.github.javiersantos.licensing.util.URIQueryDecoder;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class ServerManagedPolicy implements Policy {

    /* renamed from: a */
    private long f16246a;

    /* renamed from: b */
    private long f16247b;

    /* renamed from: c */
    private long f16248c;

    /* renamed from: d */
    private long f16249d;

    /* renamed from: e */
    private long f16250e;

    /* renamed from: f */
    private int f16251f;

    /* renamed from: g */
    private PreferenceObfuscator f16252g;

    /* renamed from: c */
    private Map<String, String> m26174c(String str) {
        HashMap hashMap = new HashMap();
        try {
            URIQueryDecoder.m26192a(new URI("?" + str), hashMap);
        } catch (URISyntaxException unused) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    /* renamed from: d */
    private void m26175d(int i) {
        this.f16250e = System.currentTimeMillis();
        this.f16251f = i;
        this.f16252g.mo34336b("lastResponse", Integer.toString(i));
    }

    /* renamed from: e */
    private void m26176e(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            l = 0L;
            str = "0";
        }
        this.f16248c = l.longValue();
        this.f16252g.mo34336b("maxRetries", str);
    }

    /* renamed from: f */
    private void m26177f(long j) {
        this.f16249d = j;
        this.f16252g.mo34336b("retryCount", Long.toString(j));
    }

    /* renamed from: g */
    private void m26178g(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            l = 0L;
            str = "0";
        }
        this.f16247b = l.longValue();
        this.f16252g.mo34336b("retryUntil", str);
    }

    /* renamed from: h */
    private void m26179h(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            l = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(l.longValue());
        }
        this.f16246a = l.longValue();
        this.f16252g.mo34336b("validityTimestamp", str);
    }

    /* renamed from: a */
    public boolean mo34316a() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f16251f;
        if (i == 2954) {
            if (currentTimeMillis <= this.f16246a) {
                return true;
            }
        } else if (i == 3144 && currentTimeMillis < this.f16250e + 60000) {
            if (currentTimeMillis <= this.f16247b || this.f16249d <= this.f16248c) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void mo34317b(int i, ResponseData responseData) {
        if (i != 3144) {
            m26177f(0);
        } else {
            m26177f(this.f16249d + 1);
        }
        if (i == 2954) {
            Map<String, String> c = m26174c(responseData.f16245g);
            this.f16251f = i;
            m26179h(c.get("VT"));
            m26178g(c.get("GT"));
            m26176e(c.get("GR"));
        } else if (i == 435) {
            m26179h("0");
            m26178g("0");
            m26176e("0");
        }
        m26175d(i);
        this.f16252g.mo34335a();
    }
}
