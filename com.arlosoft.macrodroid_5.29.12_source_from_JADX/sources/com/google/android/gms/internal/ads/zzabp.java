package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabp extends zzabu {

    /* renamed from: e */
    private static final int[] f23849e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f23850b;

    /* renamed from: c */
    private boolean f23851c;

    /* renamed from: d */
    private int f23852d;

    public zzabp(zzaap zzaap) {
        super(zzaap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo41245a(zzef zzef) throws zzabt {
        if (!this.f23850b) {
            int s = zzef.mo45243s();
            int i = s >> 4;
            this.f23852d = i;
            if (i == 2) {
                int i2 = f23849e[(s >> 2) & 3];
                zzad zzad = new zzad();
                zzad.mo41343s("audio/mpeg");
                zzad.mo41326e0(1);
                zzad.mo41344t(i2);
                this.f23874a.mo41214d(zzad.mo41349y());
                this.f23851c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzad zzad2 = new zzad();
                zzad2.mo41343s(str);
                zzad2.mo41326e0(1);
                zzad2.mo41344t(8000);
                this.f23874a.mo41214d(zzad2.mo41349y());
                this.f23851c = true;
            } else if (i != 10) {
                throw new zzabt("Audio format not supported: " + i);
            }
            this.f23850b = true;
        } else {
            zzef.mo45231g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41246b(zzef zzef, long j) throws zzbu {
        if (this.f23852d == 2) {
            int i = zzef.mo45233i();
            this.f23874a.mo41215e(zzef, i);
            this.f23874a.mo41216f(j, 1, i, 0, (zzaao) null);
            return true;
        }
        int s = zzef.mo45243s();
        if (s == 0 && !this.f23851c) {
            int i2 = zzef.mo45233i();
            byte[] bArr = new byte[i2];
            zzef.mo45226b(bArr, 0, i2);
            zzyf a = zzyg.m55423a(bArr);
            zzad zzad = new zzad();
            zzad.mo41343s("audio/mp4a-latm");
            zzad.mo41328f0(a.f38960c);
            zzad.mo41326e0(a.f38959b);
            zzad.mo41344t(a.f38958a);
            zzad.mo41333i(Collections.singletonList(bArr));
            this.f23874a.mo41214d(zzad.mo41349y());
            this.f23851c = true;
            return false;
        } else if (this.f23852d == 10 && s != 1) {
            return false;
        } else {
            int i3 = zzef.mo45233i();
            this.f23874a.mo41215e(zzef, i3);
            this.f23874a.mo41216f(j, 1, i3, 0, (zzaao) null);
            return true;
        }
    }
}
