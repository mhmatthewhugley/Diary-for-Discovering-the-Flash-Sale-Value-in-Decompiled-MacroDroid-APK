package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbuk {
    @VisibleForTesting

    /* renamed from: b */
    static final zzbb f27786b = new zzbui();
    @VisibleForTesting

    /* renamed from: c */
    static final zzbb f27787c = new zzbuj();

    /* renamed from: a */
    private final zzbtw f27788a;

    public zzbuk(Context context, zzcgv zzcgv, String str, zzfjw zzfjw) {
        this.f27788a = new zzbtw(context, zzcgv, str, f27786b, f27787c, zzfjw);
    }

    /* renamed from: a */
    public final zzbua mo43000a(String str, zzbud zzbud, zzbuc zzbuc) {
        return new zzbuo(this.f27788a, str, zzbud, zzbuc);
    }

    /* renamed from: b */
    public final zzbut mo43001b() {
        return new zzbut(this.f27788a);
    }
}
