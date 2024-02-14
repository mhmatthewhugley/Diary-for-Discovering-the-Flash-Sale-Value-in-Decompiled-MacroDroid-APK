package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzabu {

    /* renamed from: a */
    protected final zzaap f23874a;

    protected zzabu(zzaap zzaap) {
        this.f23874a = zzaap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo41245a(zzef zzef) throws zzbu;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo41246b(zzef zzef, long j) throws zzbu;

    /* renamed from: c */
    public final boolean mo41250c(zzef zzef, long j) throws zzbu {
        return mo41245a(zzef) && mo41246b(zzef, j);
    }
}
