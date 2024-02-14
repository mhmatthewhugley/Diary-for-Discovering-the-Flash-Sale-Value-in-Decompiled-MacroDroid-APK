package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcgi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdr {

    /* renamed from: a */
    private final Date f1890a;

    /* renamed from: b */
    private final String f1891b;

    /* renamed from: c */
    private final List f1892c;

    /* renamed from: d */
    private final int f1893d;

    /* renamed from: e */
    private final Set f1894e;

    /* renamed from: f */
    private final Bundle f1895f;

    /* renamed from: g */
    private final Map f1896g;

    /* renamed from: h */
    private final String f1897h;

    /* renamed from: i */
    private final String f1898i;
    @Nullable

    /* renamed from: j */
    private final SearchAdRequest f1899j;

    /* renamed from: k */
    private final int f1900k;

    /* renamed from: l */
    private final Set f1901l;

    /* renamed from: m */
    private final Bundle f1902m;

    /* renamed from: n */
    private final Set f1903n;

    /* renamed from: o */
    private final boolean f1904o;

    /* renamed from: p */
    private final AdInfo f1905p;

    /* renamed from: q */
    private final String f1906q;

    /* renamed from: r */
    private final int f1907r;

    public zzdr(zzdq zzdq, @Nullable SearchAdRequest searchAdRequest) {
        this.f1890a = zzdq.f1879g;
        this.f1891b = zzdq.f1880h;
        this.f1892c = zzdq.f1881i;
        this.f1893d = zzdq.f1882j;
        this.f1894e = Collections.unmodifiableSet(zzdq.f1873a);
        this.f1895f = zzdq.f1874b;
        this.f1896g = Collections.unmodifiableMap(zzdq.f1875c);
        this.f1897h = zzdq.f1883k;
        this.f1898i = zzdq.f1884l;
        this.f1899j = searchAdRequest;
        this.f1900k = zzdq.f1885m;
        this.f1901l = Collections.unmodifiableSet(zzdq.f1876d);
        this.f1902m = zzdq.f1877e;
        this.f1903n = Collections.unmodifiableSet(zzdq.f1878f);
        this.f1904o = zzdq.f1886n;
        this.f1905p = zzdq.f1887o;
        this.f1906q = zzdq.f1888p;
        this.f1907r = zzdq.f1889q;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo20027a() {
        return this.f1893d;
    }

    /* renamed from: b */
    public final int mo20028b() {
        return this.f1907r;
    }

    /* renamed from: c */
    public final int mo20029c() {
        return this.f1900k;
    }

    /* renamed from: d */
    public final Bundle mo20030d() {
        return this.f1902m;
    }

    @Nullable
    /* renamed from: e */
    public final Bundle mo20031e(Class cls) {
        return this.f1895f.getBundle(cls.getName());
    }

    /* renamed from: f */
    public final Bundle mo20032f() {
        return this.f1895f;
    }

    @Nullable
    /* renamed from: g */
    public final AdInfo mo20033g() {
        return this.f1905p;
    }

    @Nullable
    /* renamed from: h */
    public final SearchAdRequest mo20034h() {
        return this.f1899j;
    }

    @Nullable
    /* renamed from: i */
    public final String mo20035i() {
        return this.f1906q;
    }

    /* renamed from: j */
    public final String mo20036j() {
        return this.f1891b;
    }

    /* renamed from: k */
    public final String mo20037k() {
        return this.f1897h;
    }

    /* renamed from: l */
    public final String mo20038l() {
        return this.f1898i;
    }

    @Deprecated
    /* renamed from: m */
    public final Date mo20039m() {
        return this.f1890a;
    }

    /* renamed from: n */
    public final List mo20040n() {
        return new ArrayList(this.f1892c);
    }

    /* renamed from: o */
    public final Set mo20041o() {
        return this.f1903n;
    }

    /* renamed from: p */
    public final Set mo20042p() {
        return this.f1894e;
    }

    @Deprecated
    /* renamed from: q */
    public final boolean mo20043q() {
        return this.f1904o;
    }

    /* renamed from: r */
    public final boolean mo20044r(Context context) {
        RequestConfiguration b = zzed.m2259e().mo20077b();
        zzaw.m1917b();
        String x = zzcgi.m45188x(context);
        return this.f1901l.contains(x) || b.mo19740d().contains(x);
    }
}
