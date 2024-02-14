package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzip extends zzjh {

    /* renamed from: t */
    final /* synthetic */ String f44778t;

    /* renamed from: u */
    final /* synthetic */ String f44779u;

    /* renamed from: v */
    final /* synthetic */ byte[] f44780v;

    /* renamed from: w */
    final /* synthetic */ ListenerHolder f44781w;

    /* renamed from: x */
    final /* synthetic */ ListenerHolder f44782x;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzgy zzgy = (zzgy) anyClient;
        String str = this.f44778t;
        String str2 = this.f44779u;
        byte[] bArr = this.f44780v;
        ListenerHolder listenerHolder = this.f44781w;
        ListenerHolder listenerHolder2 = this.f44782x;
        zzmi zzmi = new zzmi();
        zzmi.mo52958i(new zzgv(this));
        zzmi.mo52955f(str);
        zzmi.mo52957h(str2);
        zzmi.mo52954e(bArr);
        zzmi.mo52950a(new zzgn(zzgy.mo21621D(), listenerHolder2));
        zzmi.mo52952c(new zzgb(listenerHolder));
        ((zzkd) zzgy.mo21626I()).mo52775Jb(zzmi.mo52959j());
    }
}
