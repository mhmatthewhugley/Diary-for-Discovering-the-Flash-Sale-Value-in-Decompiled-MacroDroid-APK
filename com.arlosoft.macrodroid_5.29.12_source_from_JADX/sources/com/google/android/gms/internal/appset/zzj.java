package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
final class zzj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzl f39080a;

    /* synthetic */ zzj(zzl zzl, zzi zzi) {
        this.f39080a = zzl;
    }

    public final void run() {
        long a = this.f39080a.mo48492a();
        if (a != -1 && DefaultClock.m4871d().mo21950a() > a) {
            zzl.m55615e(this.f39080a.f39082a);
        }
    }
}
