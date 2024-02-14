package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzao extends zzah {

    /* renamed from: c */
    final /* synthetic */ IBinder f51667c;

    /* renamed from: d */
    final /* synthetic */ zzar f51668d;

    zzao(zzar zzar, IBinder iBinder) {
        this.f51668d = zzar;
        this.f51667c = iBinder;
    }

    /* renamed from: a */
    public final void mo59556a() {
        zzas zzas = this.f51668d.f51670a;
        zzas.f51685n = (IInterface) zzas.f51680i.mo59555a(this.f51667c);
        zzas.m70820o(this.f51668d.f51670a);
        this.f51668d.f51670a.f51678g = false;
        for (Runnable run : this.f51668d.f51670a.f51675d) {
            run.run();
        }
        this.f51668d.f51670a.f51675d.clear();
    }
}
