package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagd extends zzagn {
    @Nullable

    /* renamed from: n */
    private zzzv f24395n;
    @Nullable

    /* renamed from: o */
    private zzagc f24396o;

    zzagd() {
    }

    /* renamed from: j */
    private static boolean m41317j(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41449a(zzef zzef) {
        if (!m41317j(zzef.mo45232h())) {
            return -1;
        }
        int i = (zzef.mo45232h()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = zzzr.m55547a(zzef, i);
            zzef.mo45230f(0);
            return (long) a;
        }
        zzef.mo45231g(4);
        zzef.mo45219C();
        int a2 = zzzr.m55547a(zzef, i);
        zzef.mo45230f(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41450b(boolean z) {
        super.mo41450b(z);
        if (z) {
            this.f24395n = null;
            this.f24396o = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo41451c(zzef zzef, long j, zzagk zzagk) {
        byte[] h = zzef.mo45232h();
        zzzv zzzv = this.f24395n;
        if (zzzv == null) {
            zzzv zzzv2 = new zzzv(h, 17);
            this.f24395n = zzzv2;
            zzagk.f24417a = zzzv2.mo48466c(Arrays.copyOfRange(h, 9, zzef.mo45236l()), (zzbq) null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            zzzu b = zzzs.m55552b(zzef);
            zzzv f = zzzv.mo48469f(b);
            this.f24395n = f;
            this.f24396o = new zzagc(f, b);
            return true;
        } else if (!m41317j(h)) {
            return true;
        } else {
            zzagc zzagc = this.f24396o;
            if (zzagc != null) {
                zzagc.mo41448d(j);
                zzagk.f24418b = this.f24396o;
            }
            Objects.requireNonNull(zzagk.f24417a);
            return false;
        }
    }
}
