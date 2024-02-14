package com.github.javiersantos.licensing;

import android.util.Log;
import com.github.javiersantos.licensing.util.URIQueryDecoder;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class APKExpansionPolicy implements Policy {

    /* renamed from: a */
    private long f16203a;

    /* renamed from: b */
    private long f16204b;

    /* renamed from: c */
    private long f16205c;

    /* renamed from: d */
    private long f16206d;

    /* renamed from: e */
    private long f16207e;

    /* renamed from: f */
    private int f16208f;

    /* renamed from: g */
    private PreferenceObfuscator f16209g;

    /* renamed from: h */
    private Vector<String> f16210h;

    /* renamed from: i */
    private Vector<String> f16211i;

    /* renamed from: j */
    private Vector<Long> f16212j;

    /* renamed from: c */
    private Map<String, String> m26130c(String str) {
        HashMap hashMap = new HashMap();
        try {
            URIQueryDecoder.m26192a(new URI("?" + str), hashMap);
        } catch (URISyntaxException unused) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    /* renamed from: g */
    private void m26131g(int i) {
        this.f16207e = System.currentTimeMillis();
        this.f16208f = i;
        this.f16209g.mo34336b("lastResponse", Integer.toString(i));
    }

    /* renamed from: h */
    private void m26132h(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
            l = 0L;
            str = "0";
        }
        this.f16205c = l.longValue();
        this.f16209g.mo34336b("maxRetries", str);
    }

    /* renamed from: i */
    private void m26133i(long j) {
        this.f16206d = j;
        this.f16209g.mo34336b("retryCount", Long.toString(j));
    }

    /* renamed from: j */
    private void m26134j(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
            l = 0L;
            str = "0";
        }
        this.f16204b = l.longValue();
        this.f16209g.mo34336b("retryUntil", str);
    }

    /* renamed from: k */
    private void m26135k(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            l = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(l.longValue());
        }
        this.f16203a = l.longValue();
        this.f16209g.mo34336b("validityTimestamp", str);
    }

    /* renamed from: a */
    public boolean mo34316a() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f16208f;
        if (i == 2954) {
            if (currentTimeMillis <= this.f16203a) {
                return true;
            }
        } else if (i == 3144 && currentTimeMillis < this.f16207e + 60000) {
            if (currentTimeMillis <= this.f16204b || this.f16206d <= this.f16205c) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void mo34317b(int i, ResponseData responseData) {
        if (i != 3144) {
            m26133i(0);
        } else {
            m26133i(this.f16206d + 1);
        }
        if (i == 2954) {
            Map<String, String> c = m26130c(responseData.f16245g);
            this.f16208f = i;
            m26135k(Long.toString(System.currentTimeMillis() + 60000));
            for (String next : c.keySet()) {
                if (next.equals("VT")) {
                    m26135k(c.get(next));
                } else if (next.equals("GT")) {
                    m26134j(c.get(next));
                } else if (next.equals("GR")) {
                    m26132h(c.get(next));
                } else if (next.startsWith("FILE_URL")) {
                    mo34320f(Integer.parseInt(next.substring(8)) - 1, c.get(next));
                } else if (next.startsWith("FILE_NAME")) {
                    mo34318d(Integer.parseInt(next.substring(9)) - 1, c.get(next));
                } else if (next.startsWith("FILE_SIZE")) {
                    mo34319e(Integer.parseInt(next.substring(9)) - 1, Long.parseLong(c.get(next)));
                }
            }
        } else if (i == 435) {
            m26135k("0");
            m26134j("0");
            m26132h("0");
        }
        m26131g(i);
        this.f16209g.mo34335a();
    }

    /* renamed from: d */
    public void mo34318d(int i, String str) {
        if (i >= this.f16211i.size()) {
            this.f16211i.setSize(i + 1);
        }
        this.f16211i.set(i, str);
    }

    /* renamed from: e */
    public void mo34319e(int i, long j) {
        if (i >= this.f16212j.size()) {
            this.f16212j.setSize(i + 1);
        }
        this.f16212j.set(i, Long.valueOf(j));
    }

    /* renamed from: f */
    public void mo34320f(int i, String str) {
        if (i >= this.f16210h.size()) {
            this.f16210h.setSize(i + 1);
        }
        this.f16210h.set(i, str);
    }
}
