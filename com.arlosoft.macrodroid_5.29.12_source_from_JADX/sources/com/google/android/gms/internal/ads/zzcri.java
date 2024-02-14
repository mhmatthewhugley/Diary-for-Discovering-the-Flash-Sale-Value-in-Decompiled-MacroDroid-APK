package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcri implements zzdyy {

    /* renamed from: a */
    private final zzcpw f30616a;

    /* renamed from: b */
    private Context f30617b;

    /* renamed from: c */
    private zzbqr f30618c;

    /* synthetic */ zzcri(zzcpw zzcpw, zzcrh zzcrh) {
        this.f30616a = zzcpw;
    }

    /* renamed from: a */
    public final zzdyz mo44318a() {
        zzgxq.m53659c(this.f30617b, Context.class);
        zzgxq.m53659c(this.f30618c, zzbqr.class);
        return new zzcrk(this.f30616a, this.f30617b, this.f30618c, (zzcrj) null);
    }

    /* renamed from: b */
    public final /* synthetic */ zzdyy mo44319b(Context context) {
        Objects.requireNonNull(context);
        this.f30617b = context;
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ zzdyy mo44320c(zzbqr zzbqr) {
        Objects.requireNonNull(zzbqr);
        this.f30618c = zzbqr;
        return this;
    }
}
