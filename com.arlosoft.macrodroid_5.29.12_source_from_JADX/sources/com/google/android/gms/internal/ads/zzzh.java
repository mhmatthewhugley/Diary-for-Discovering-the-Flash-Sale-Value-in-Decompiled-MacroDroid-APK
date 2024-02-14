package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzh implements zzaap {

    /* renamed from: a */
    private final byte[] f39040a = new byte[4096];

    /* renamed from: a */
    public final /* synthetic */ int mo41211a(zzr zzr, int i, boolean z) {
        return zzaan.m40937a(this, zzr, i, z);
    }

    /* renamed from: b */
    public final int mo41212b(zzr zzr, int i, boolean z, int i2) throws IOException {
        int e = zzr.mo43927e(this.f39040a, 0, Math.min(4096, i));
        if (e != -1) {
            return e;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final void mo41213c(zzef zzef, int i, int i2) {
        zzef.mo45231g(i);
    }

    /* renamed from: d */
    public final void mo41214d(zzaf zzaf) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo41215e(zzef zzef, int i) {
        zzaan.m40938b(this, zzef, i);
    }

    /* renamed from: f */
    public final void mo41216f(long j, int i, int i2, int i3, @Nullable zzaao zzaao) {
    }
}
