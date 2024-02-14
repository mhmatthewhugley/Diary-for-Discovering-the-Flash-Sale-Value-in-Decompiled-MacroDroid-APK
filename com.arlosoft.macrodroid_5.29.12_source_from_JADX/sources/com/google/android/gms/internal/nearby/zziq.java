package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zziq extends zzjh {

    /* renamed from: t */
    final /* synthetic */ String f44783t;

    /* renamed from: u */
    final /* synthetic */ byte[] f44784u;

    /* renamed from: v */
    final /* synthetic */ ListenerHolder f44785v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzgy zzgy = (zzgy) anyClient;
        String str = this.f44783t;
        byte[] bArr = this.f44784u;
        ListenerHolder listenerHolder = this.f44785v;
        zzfh zzfh = new zzfh();
        zzfh.mo52698e(new zzgv(this));
        zzfh.mo52697d(str);
        zzfh.mo52695b(bArr);
        zzfh.mo52694a(new zzgn(zzgy.mo21621D(), listenerHolder));
        ((zzkd) zzgy.mo21626I()).mo52783g8(zzfh.mo52699f());
    }
}
