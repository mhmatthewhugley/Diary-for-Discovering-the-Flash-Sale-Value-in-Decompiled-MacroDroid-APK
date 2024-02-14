package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcrw implements zzfdd {

    /* renamed from: a */
    private final zzcpw f30956a;

    /* renamed from: b */
    private Context f30957b;

    /* renamed from: c */
    private String f30958c;

    /* synthetic */ zzcrw(zzcpw zzcpw, zzcrv zzcrv) {
        this.f30956a = zzcpw;
    }

    /* renamed from: a */
    public final zzfde mo44342a() {
        zzgxq.m53659c(this.f30957b, Context.class);
        return new zzcry(this.f30956a, this.f30957b, this.f30958c, (zzcrx) null);
    }

    /* renamed from: b */
    public final /* synthetic */ zzfdd mo44343b(Context context) {
        Objects.requireNonNull(context);
        this.f30957b = context;
        return this;
    }

    /* renamed from: o */
    public final /* synthetic */ zzfdd mo44344o(String str) {
        this.f30958c = str;
        return this;
    }
}
