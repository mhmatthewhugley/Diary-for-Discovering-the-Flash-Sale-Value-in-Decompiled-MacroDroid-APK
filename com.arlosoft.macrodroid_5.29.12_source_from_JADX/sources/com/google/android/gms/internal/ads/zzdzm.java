package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdzm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzdzs f33440a;

    /* renamed from: c */
    public final /* synthetic */ zzbrx f33441c;

    public /* synthetic */ zzdzm(zzdzs zzdzs, zzbrx zzbrx) {
        this.f33440a = zzdzs;
        this.f33441c = zzbrx;
    }

    public final void run() {
        zzdzs zzdzs = this.f33440a;
        try {
            this.f33441c.mo20076j5(zzdzs.mo45097g());
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
