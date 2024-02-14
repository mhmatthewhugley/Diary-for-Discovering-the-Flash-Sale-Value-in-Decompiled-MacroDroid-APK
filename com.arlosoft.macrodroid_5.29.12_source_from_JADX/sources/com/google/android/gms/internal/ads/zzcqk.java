package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcqk implements zzeyi {

    /* renamed from: a */
    private final zzcpw f30104a;

    /* renamed from: b */
    private Context f30105b;

    /* renamed from: c */
    private String f30106c;

    /* synthetic */ zzcqk(zzcpw zzcpw, zzcqj zzcqj) {
        this.f30104a = zzcpw;
    }

    /* renamed from: a */
    public final zzeyj mo44272a() {
        zzgxq.m53659c(this.f30105b, Context.class);
        zzgxq.m53659c(this.f30106c, String.class);
        return new zzcqm(this.f30104a, this.f30105b, this.f30106c, (zzcql) null);
    }

    /* renamed from: b */
    public final /* synthetic */ zzeyi mo44273b(Context context) {
        Objects.requireNonNull(context);
        this.f30105b = context;
        return this;
    }

    /* renamed from: o */
    public final /* synthetic */ zzeyi mo44274o(String str) {
        Objects.requireNonNull(str);
        this.f30106c = str;
        return this;
    }
}
