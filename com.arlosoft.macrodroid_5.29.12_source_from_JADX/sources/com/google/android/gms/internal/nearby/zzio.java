package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzio extends zzjh {

    /* renamed from: t */
    final /* synthetic */ String f44775t;

    /* renamed from: u */
    final /* synthetic */ long f44776u;

    /* renamed from: v */
    final /* synthetic */ ListenerHolder f44777v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        String str = this.f44775t;
        long j = this.f44776u;
        ListenerHolder listenerHolder = this.f44777v;
        DiscoveryOptions.Builder builder = new DiscoveryOptions.Builder();
        builder.mo55677b(Strategy.f47473d);
        DiscoveryOptions a = builder.mo55676a();
        zzmu zzmu = new zzmu();
        zzmu.mo52991d(new zzgv(this));
        zzmu.mo52992e(str);
        zzmu.mo52989b(j);
        zzmu.mo52988a(new zzgj(listenerHolder));
        zzmu.mo52990c(a);
        ((zzkd) ((zzgy) anyClient).mo21626I()).mo52778Mb(zzmu.mo52993f());
    }
}
