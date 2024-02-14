package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgs extends zzgp {

    /* renamed from: a */
    final /* synthetic */ String f44672a;

    /* renamed from: b */
    final /* synthetic */ PayloadTransferUpdate f44673b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgs(zzgu zzgu, String str, PayloadTransferUpdate payloadTransferUpdate) {
        super((zzgo) null);
        this.f44672a = str;
        this.f44673b = payloadTransferUpdate;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        String str = this.f44672a;
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder(this.f44673b);
        builder.mo55700c(2);
        ((PayloadCallback) obj).mo37371b(str, builder.mo55698a());
    }
}
