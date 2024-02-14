package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsy implements zzbpu {
    @Nullable

    /* renamed from: a */
    private final zzbni f33015a;

    /* renamed from: b */
    private final zzdtn f33016b;

    /* renamed from: c */
    private final zzgxc f33017c;

    public zzdsy(zzdpb zzdpb, zzdoq zzdoq, zzdtn zzdtn, zzgxc zzgxc) {
        this.f33015a = zzdpb.mo44864c(zzdoq.mo44826g0());
        this.f33016b = zzdtn;
        this.f33017c = zzgxc;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f33015a.mo42822Db((zzbmy) this.f33017c.zzb(), str);
        } catch (RemoteException e) {
            zzcgp.m45230h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    /* renamed from: b */
    public final void mo44964b() {
        if (this.f33015a != null) {
            this.f33016b.mo44980i("/nativeAdCustomClick", this);
        }
    }
}
