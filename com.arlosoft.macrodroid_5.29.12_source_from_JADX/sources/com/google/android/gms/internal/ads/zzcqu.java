package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcqu implements zzezw {

    /* renamed from: a */
    private final zzcpw f30454a;

    /* renamed from: b */
    private Context f30455b;

    /* renamed from: c */
    private String f30456c;

    /* renamed from: d */
    private zzq f30457d;

    /* synthetic */ zzcqu(zzcpw zzcpw, zzcqt zzcqt) {
        this.f30454a = zzcpw;
    }

    /* renamed from: a */
    public final /* synthetic */ zzezw mo44297a(zzq zzq) {
        Objects.requireNonNull(zzq);
        this.f30457d = zzq;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ zzezw mo44298b(Context context) {
        Objects.requireNonNull(context);
        this.f30455b = context;
        return this;
    }

    /* renamed from: d */
    public final zzezx mo44299d() {
        zzgxq.m53659c(this.f30455b, Context.class);
        zzgxq.m53659c(this.f30456c, String.class);
        zzgxq.m53659c(this.f30457d, zzq.class);
        return new zzcqw(this.f30454a, this.f30455b, this.f30456c, this.f30457d, (zzcqv) null);
    }

    /* renamed from: t */
    public final /* synthetic */ zzezw mo44300t(String str) {
        Objects.requireNonNull(str);
        this.f30456c = str;
        return this;
    }
}
