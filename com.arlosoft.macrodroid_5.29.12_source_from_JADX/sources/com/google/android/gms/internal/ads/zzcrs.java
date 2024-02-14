package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcrs implements zzfbp {

    /* renamed from: a */
    private final zzcpw f30943a;

    /* renamed from: b */
    private Context f30944b;

    /* renamed from: c */
    private String f30945c;

    /* renamed from: d */
    private zzq f30946d;

    /* synthetic */ zzcrs(zzcpw zzcpw, zzcrr zzcrr) {
        this.f30943a = zzcpw;
    }

    /* renamed from: a */
    public final /* synthetic */ zzfbp mo44337a(zzq zzq) {
        Objects.requireNonNull(zzq);
        this.f30946d = zzq;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ zzfbp mo44338b(Context context) {
        Objects.requireNonNull(context);
        this.f30944b = context;
        return this;
    }

    /* renamed from: d */
    public final zzfbq mo44339d() {
        zzgxq.m53659c(this.f30944b, Context.class);
        zzgxq.m53659c(this.f30945c, String.class);
        zzgxq.m53659c(this.f30946d, zzq.class);
        return new zzcru(this.f30943a, this.f30944b, this.f30945c, this.f30946d, (zzcrt) null);
    }

    /* renamed from: t */
    public final /* synthetic */ zzfbp mo44340t(String str) {
        Objects.requireNonNull(str);
        this.f30945c = str;
        return this;
    }
}
