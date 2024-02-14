package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzin extends zzjf {

    /* renamed from: t */
    final /* synthetic */ String f44772t;

    /* renamed from: u */
    final /* synthetic */ long f44773u;

    /* renamed from: v */
    final /* synthetic */ ListenerHolder f44774v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        String str = this.f44772t;
        long j = this.f44773u;
        ListenerHolder listenerHolder = this.f44774v;
        AdvertisingOptions.Builder builder = new AdvertisingOptions.Builder();
        builder.mo55646b(Strategy.f47473d);
        AdvertisingOptions a = builder.mo55645a();
        zzmq zzmq = new zzmq();
        zzmq.mo52980g(new zzgx(this));
        zzmq.mo52978e(str);
        zzmq.mo52981h("__LEGACY_SERVICE_ID__");
        zzmq.mo52976c(j);
        zzmq.mo52974a(new zzfz(listenerHolder));
        zzmq.mo52979f(a);
        ((zzkd) ((zzgy) anyClient).mo21626I()).mo52777Lb(zzmq.mo52982i());
    }
}
