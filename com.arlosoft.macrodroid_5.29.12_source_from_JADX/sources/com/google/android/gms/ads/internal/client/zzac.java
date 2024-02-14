package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzac extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1794b;

    /* renamed from: c */
    final /* synthetic */ zzbvk f1795c;

    zzac(zzau zzau, Context context, zzbvk zzbvk) {
        this.f1794b = context;
        this.f1795c = zzbvk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19859H8(ObjectWrapper.m5051g8(this.f1794b), this.f1795c, 223104000);
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        try {
            return ((zzcfj) zzcgt.m45236b(this.f1794b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzab.f1793a)).mo43456J0(ObjectWrapper.m5051g8(this.f1794b), this.f1795c, 223104000);
        } catch (RemoteException | zzcgs | NullPointerException unused) {
            return null;
        }
    }
}
