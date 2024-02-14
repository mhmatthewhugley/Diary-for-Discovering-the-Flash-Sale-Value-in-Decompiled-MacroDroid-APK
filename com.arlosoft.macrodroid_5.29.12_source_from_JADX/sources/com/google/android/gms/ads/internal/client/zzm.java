package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzm {

    /* renamed from: a */
    private Bundle f2006a = new Bundle();

    /* renamed from: b */
    private List f2007b = new ArrayList();

    /* renamed from: c */
    private boolean f2008c = false;

    /* renamed from: d */
    private int f2009d = -1;

    /* renamed from: e */
    private final Bundle f2010e = new Bundle();

    /* renamed from: f */
    private final Bundle f2011f = new Bundle();

    /* renamed from: g */
    private final List f2012g = new ArrayList();

    /* renamed from: h */
    private int f2013h = -1;

    /* renamed from: i */
    private String f2014i = null;

    /* renamed from: j */
    private final List f2015j = new ArrayList();

    /* renamed from: k */
    private int f2016k = 60000;

    /* renamed from: a */
    public final zzl mo20149a() {
        return new zzl(8, -1, this.f2006a, -1, this.f2007b, this.f2008c, this.f2009d, false, (String) null, (zzfb) null, (Location) null, (String) null, this.f2010e, this.f2011f, this.f2012g, (String) null, (String) null, false, (zzc) null, this.f2013h, this.f2014i, this.f2015j, this.f2016k, (String) null);
    }

    /* renamed from: b */
    public final zzm mo20150b(Bundle bundle) {
        this.f2006a = bundle;
        return this;
    }

    /* renamed from: c */
    public final zzm mo20151c(int i) {
        this.f2016k = i;
        return this;
    }

    /* renamed from: d */
    public final zzm mo20152d(boolean z) {
        this.f2008c = z;
        return this;
    }

    /* renamed from: e */
    public final zzm mo20153e(List list) {
        this.f2007b = list;
        return this;
    }

    /* renamed from: f */
    public final zzm mo20154f(String str) {
        this.f2014i = str;
        return this;
    }

    /* renamed from: g */
    public final zzm mo20155g(int i) {
        this.f2009d = i;
        return this;
    }

    /* renamed from: h */
    public final zzm mo20156h(int i) {
        this.f2013h = i;
        return this;
    }
}
