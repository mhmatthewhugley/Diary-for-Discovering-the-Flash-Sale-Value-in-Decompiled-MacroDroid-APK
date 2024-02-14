package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f46987a;

    /* renamed from: c */
    final /* synthetic */ String f46988c;

    /* renamed from: d */
    final /* synthetic */ String f46989d;

    /* renamed from: f */
    final /* synthetic */ zzhx f46990f;

    zzhh(zzhx zzhx, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f46990f = zzhx;
        this.f46987a = atomicReference;
        this.f46988c = str2;
        this.f46989d = str3;
    }

    public final void run() {
        this.f46990f.f46899a.mo55194L().mo55451U(this.f46987a, (String) null, this.f46988c, this.f46989d);
    }
}
