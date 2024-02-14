package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfrx implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ zzfry f36314a;

    /* synthetic */ zzfrx(zzfry zzfry, zzfrw zzfrw) {
        this.f36314a = zzfry;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f36314a.f36317b.mo46143d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzfry zzfry = this.f36314a;
        zzfry.mo46152c().post(new zzfru(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f36314a.f36317b.mo46143d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzfry zzfry = this.f36314a;
        zzfry.mo46152c().post(new zzfrv(this));
    }
}
