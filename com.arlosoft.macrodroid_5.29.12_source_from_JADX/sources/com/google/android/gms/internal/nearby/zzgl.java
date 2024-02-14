package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Payload;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgl extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzli f44664a;

    /* renamed from: b */
    final /* synthetic */ zzgn f44665b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgl(zzgn zzgn, zzli zzli) {
        super((zzgo) null);
        this.f44665b = zzgn;
        this.f44664a = zzli;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        Connections.MessageListener messageListener = (Connections.MessageListener) obj;
        Payload a = zzmd.m62747a(this.f44665b.f44667a, this.f44664a.mo52872l2());
        if (a == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(this.f44664a.mo52872l2().zzb())}));
        } else if (a.mo55683g() == 1) {
            messageListener.mo55664a(this.f44664a.mo52873m2(), a.mo55678a(), this.f44664a.mo52869a());
        }
    }
}
