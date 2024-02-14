package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaaq {

    /* renamed from: a */
    private final byte[] f23745a = new byte[10];

    /* renamed from: b */
    private boolean f23746b;

    /* renamed from: c */
    private int f23747c;

    /* renamed from: d */
    private long f23748d;

    /* renamed from: e */
    private int f23749e;

    /* renamed from: f */
    private int f23750f;

    /* renamed from: g */
    private int f23751g;

    /* renamed from: a */
    public final void mo41217a(zzaap zzaap, @Nullable zzaao zzaao) {
        if (this.f23747c > 0) {
            zzaap.mo41216f(this.f23748d, this.f23749e, this.f23750f, this.f23751g, zzaao);
            this.f23747c = 0;
        }
    }

    /* renamed from: b */
    public final void mo41218b() {
        this.f23746b = false;
        this.f23747c = 0;
    }

    /* renamed from: c */
    public final void mo41219c(zzaap zzaap, long j, int i, int i2, int i3, @Nullable zzaao zzaao) {
        if (this.f23751g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.f23746b) {
            int i4 = this.f23747c;
            int i5 = i4 + 1;
            this.f23747c = i5;
            if (i4 == 0) {
                this.f23748d = j;
                this.f23749e = i;
                this.f23750f = 0;
            }
            this.f23750f += i2;
            this.f23751g = i3;
            if (i5 >= 16) {
                mo41217a(zzaap, zzaao);
            }
        }
    }

    /* renamed from: d */
    public final void mo41220d(zzzj zzzj) throws IOException {
        if (!this.f23746b) {
            zzzj.mo48457n(this.f23745a, 0, 10);
            zzzj.mo48452h();
            byte[] bArr = this.f23745a;
            int i = zzyj.f38975g;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f23746b = true;
            }
        }
    }
}
