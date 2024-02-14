package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
abstract class zzdu implements Runnable {

    /* renamed from: a */
    final long f41402a;

    /* renamed from: c */
    final long f41403c;

    /* renamed from: d */
    final boolean f41404d;

    /* renamed from: f */
    final /* synthetic */ zzef f41405f;

    zzdu(zzef zzef, boolean z) {
        this.f41405f = zzef;
        this.f41402a = zzef.f41428b.mo21950a();
        this.f41403c = zzef.f41428b.mo21952c();
        this.f41404d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo50838a() throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50839b() {
    }

    public final void run() {
        if (this.f41405f.f41433g) {
            mo50839b();
            return;
        }
        try {
            mo50838a();
        } catch (Exception e) {
            this.f41405f.m59625k(e, false, this.f41404d);
            mo50839b();
        }
    }
}
