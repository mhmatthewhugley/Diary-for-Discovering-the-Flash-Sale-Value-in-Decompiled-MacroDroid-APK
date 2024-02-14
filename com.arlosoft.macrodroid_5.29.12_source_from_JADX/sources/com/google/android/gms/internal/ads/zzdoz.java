package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdoz {

    /* renamed from: a */
    zzbnf f32679a;

    /* renamed from: b */
    zzbnc f32680b;

    /* renamed from: c */
    zzbns f32681c;

    /* renamed from: d */
    zzbnp f32682d;

    /* renamed from: e */
    zzbsl f32683e;

    /* renamed from: f */
    final SimpleArrayMap f32684f = new SimpleArrayMap();

    /* renamed from: g */
    final SimpleArrayMap f32685g = new SimpleArrayMap();

    /* renamed from: a */
    public final zzdoz mo44854a(zzbnc zzbnc) {
        this.f32680b = zzbnc;
        return this;
    }

    /* renamed from: b */
    public final zzdoz mo44855b(zzbnf zzbnf) {
        this.f32679a = zzbnf;
        return this;
    }

    /* renamed from: c */
    public final zzdoz mo44856c(String str, zzbnl zzbnl, @Nullable zzbni zzbni) {
        this.f32684f.put(str, zzbnl);
        if (zzbni != null) {
            this.f32685g.put(str, zzbni);
        }
        return this;
    }

    /* renamed from: d */
    public final zzdoz mo44857d(zzbsl zzbsl) {
        this.f32683e = zzbsl;
        return this;
    }

    /* renamed from: e */
    public final zzdoz mo44858e(zzbnp zzbnp) {
        this.f32682d = zzbnp;
        return this;
    }

    /* renamed from: f */
    public final zzdoz mo44859f(zzbns zzbns) {
        this.f32681c = zzbns;
        return this;
    }

    /* renamed from: g */
    public final zzdpb mo44860g() {
        return new zzdpb(this);
    }
}
