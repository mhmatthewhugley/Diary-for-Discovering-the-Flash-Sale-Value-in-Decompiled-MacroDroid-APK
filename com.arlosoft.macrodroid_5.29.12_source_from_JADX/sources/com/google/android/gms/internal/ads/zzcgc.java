package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcgc implements zzbcj {

    /* renamed from: a */
    private final Object f28408a = new Object();

    /* renamed from: b */
    private final zzg f28409b;

    /* renamed from: c */
    private final zzcga f28410c;
    @VisibleForTesting

    /* renamed from: d */
    final zzcfz f28411d;
    @VisibleForTesting

    /* renamed from: e */
    final HashSet f28412e = new HashSet();
    @VisibleForTesting

    /* renamed from: f */
    final HashSet f28413f = new HashSet();

    /* renamed from: g */
    private boolean f28414g = false;

    public zzcgc(String str, zzg zzg) {
        this.f28411d = new zzcfz(str, zzg);
        this.f28409b = zzg;
        this.f28410c = new zzcga();
    }

    /* renamed from: O */
    public final void mo42459O(boolean z) {
        long a = zzt.m2889b().mo21950a();
        if (z) {
            if (a - this.f28409b.mo20363d() > ((Long) zzay.m1924c().mo42663b(zzbjc.f26937N0)).longValue()) {
                this.f28411d.f28399d = -1;
            } else {
                this.f28411d.f28399d = this.f28409b.mo20357a();
            }
            this.f28414g = true;
            return;
        }
        this.f28409b.mo20372h0(a);
        this.f28409b.mo20389s0(this.f28411d.f28399d);
    }

    /* renamed from: a */
    public final zzcfr mo43535a(Clock clock, String str) {
        return new zzcfr(clock, this, this.f28410c.mo43531a(), str);
    }

    /* renamed from: b */
    public final void mo43536b(zzcfr zzcfr) {
        synchronized (this.f28408a) {
            this.f28412e.add(zzcfr);
        }
    }

    /* renamed from: c */
    public final void mo43537c() {
        synchronized (this.f28408a) {
            this.f28411d.mo43507b();
        }
    }

    /* renamed from: d */
    public final void mo43538d() {
        synchronized (this.f28408a) {
            this.f28411d.mo43508c();
        }
    }

    /* renamed from: e */
    public final void mo43539e() {
        synchronized (this.f28408a) {
            this.f28411d.mo43509d();
        }
    }

    /* renamed from: f */
    public final void mo43540f() {
        synchronized (this.f28408a) {
            this.f28411d.mo43510e();
        }
    }

    /* renamed from: g */
    public final void mo43541g(zzl zzl, long j) {
        synchronized (this.f28408a) {
            this.f28411d.mo43511f(zzl, j);
        }
    }

    /* renamed from: h */
    public final void mo43542h(HashSet hashSet) {
        synchronized (this.f28408a) {
            this.f28412e.addAll(hashSet);
        }
    }

    /* renamed from: i */
    public final boolean mo43543i() {
        return this.f28414g;
    }

    /* renamed from: j */
    public final Bundle mo43544j(Context context, zzffk zzffk) {
        HashSet hashSet = new HashSet();
        synchronized (this.f28408a) {
            hashSet.addAll(this.f28412e);
            this.f28412e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f28411d.mo43506a(context, this.f28410c.mo43532b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f28413f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzcfr) it2.next()).mo43466a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzffk.mo45676b(hashSet);
            return bundle;
        }
        zzcgb zzcgb = (zzcgb) it.next();
        throw null;
    }
}
