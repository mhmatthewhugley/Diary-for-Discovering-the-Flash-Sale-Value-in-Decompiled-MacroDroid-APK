package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzf {

    /* renamed from: a */
    private final zzal f42300a = zzao.m61160k();

    /* renamed from: b */
    private Boolean f42301b;

    private zzf() {
    }

    /* renamed from: a */
    public final zzf mo51861a() {
        zzac.m61136d(this.f42301b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f42301b = Boolean.FALSE;
        return this;
    }

    /* renamed from: b */
    public final zzf mo51862b() {
        zzac.m61136d(this.f42301b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f42301b = Boolean.TRUE;
        return this;
    }

    /* renamed from: c */
    public final zzh mo51863c() {
        Objects.requireNonNull(this.f42301b, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.f42301b.booleanValue(), false, this.f42300a.mo51744e(), (zzg) null);
    }

    /* synthetic */ zzf(zze zze) {
    }
}
