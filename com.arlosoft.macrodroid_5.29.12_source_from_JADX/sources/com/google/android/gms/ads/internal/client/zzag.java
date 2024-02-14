package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.p027h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzag extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1800b;

    /* renamed from: c */
    final /* synthetic */ zzbvk f1801c;

    /* renamed from: d */
    final /* synthetic */ OnH5AdsEventListener f1802d;

    zzag(zzau zzau, Context context, zzbvk zzbvk, OnH5AdsEventListener onH5AdsEventListener) {
        this.f1800b = context;
        this.f1801c = zzbvk;
        this.f1802d = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public final /* synthetic */ Object mo19871a() {
        return new zzbrb();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19860K1(ObjectWrapper.m5051g8(this.f1800b), this.f1801c, 223104000, new zzbqo(this.f1802d));
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        try {
            return ((zzbqx) zzcgt.m45236b(this.f1800b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaf.f1799a)).mo42918f9(ObjectWrapper.m5051g8(this.f1800b), this.f1801c, 223104000, new zzbqo(this.f1802d));
        } catch (RemoteException | zzcgs | NullPointerException unused) {
            return null;
        }
    }
}
