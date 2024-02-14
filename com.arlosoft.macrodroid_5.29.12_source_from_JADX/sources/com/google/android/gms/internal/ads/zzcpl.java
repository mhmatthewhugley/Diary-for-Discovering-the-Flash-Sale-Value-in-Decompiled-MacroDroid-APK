package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcpl implements zzgxi {

    /* renamed from: a */
    private final zzgxv f29194a;

    /* renamed from: b */
    private final zzgxv f29195b;

    public zzcpl(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f29194a = zzgxv;
        this.f29195b = zzgxv2;
    }

    /* renamed from: a */
    public final zzcbn zzb() {
        Context a = ((zzcos) this.f29194a).mo44226a();
        zzfjw zzfjw = (zzfjw) this.f29195b.zzb();
        zzbuk b = zzt.m2895h().mo42997b(a, zzcgv.m45239l2(), zzfjw);
        zzbue zzbue = zzbuh.f27784b;
        b.mo43000a("google.afma.request.getAdDictionary", zzbue, zzbue);
        return new zzcbm(a, zzt.m2895h().mo42997b(a, zzcgv.m45239l2(), zzfjw).mo43000a("google.afma.sdkConstants.getSdkConstants", zzbue, zzbue));
    }
}
