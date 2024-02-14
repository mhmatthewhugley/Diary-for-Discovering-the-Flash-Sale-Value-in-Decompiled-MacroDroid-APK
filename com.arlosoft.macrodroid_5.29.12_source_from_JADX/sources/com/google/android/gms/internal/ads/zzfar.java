package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfar implements zzfsm {

    /* renamed from: a */
    final /* synthetic */ zzfav f35340a;

    zzfar(zzfav zzfav) {
        this.f35340a = zzfav;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcgp.m45227e("", (zzedj) obj);
        zze.m2645k("Failed to get a cache key, reverting to legacy flow.");
        zzfav zzfav = this.f35340a;
        zzfav.f35347d = new zzfau((zzcbc) null, zzfav.m49803e(), (zzfat) null);
        return this.f35340a.f35347d;
    }
}
