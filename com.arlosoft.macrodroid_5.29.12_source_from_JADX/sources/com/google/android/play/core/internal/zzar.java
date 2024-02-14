package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzar implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ zzas f51670a;

    /* synthetic */ zzar(zzas zzas, zzaq zzaq) {
        this.f51670a = zzas;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f51670a.f51673b.mo59808d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzas zzas = this.f51670a;
        zzas.mo59818c().post(new zzao(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f51670a.f51673b.mo59808d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzas zzas = this.f51670a;
        zzas.mo59818c().post(new zzap(this));
    }
}
