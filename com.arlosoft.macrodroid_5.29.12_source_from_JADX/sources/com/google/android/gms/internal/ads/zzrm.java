package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzrm implements zztz {

    /* renamed from: a */
    public final zztz f38360a;

    /* renamed from: b */
    private boolean f38361b;

    /* renamed from: c */
    final /* synthetic */ zzrn f38362c;

    public zzrm(zzrn zzrn, zztz zztz) {
        this.f38362c = zzrn;
        this.f38360a = zztz;
    }

    /* renamed from: a */
    public final int mo48123a(zzjg zzjg, zzgi zzgi, int i) {
        if (this.f38362c.mo48136j()) {
            return -3;
        }
        if (this.f38361b) {
            zzgi.mo46721c(4);
            return -4;
        }
        int a = this.f38360a.mo48123a(zzjg, zzgi, i);
        if (a == -5) {
            zzaf zzaf = zzjg.f37624a;
            Objects.requireNonNull(zzaf);
            int i2 = zzaf.f24197B;
            int i3 = 0;
            if (i2 == 0) {
                if (zzaf.f24198C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.f38362c.f38367g == Long.MIN_VALUE) {
                i3 = zzaf.f24198C;
            }
            zzad b = zzaf.mo41422b();
            b.mo41321c(i2);
            b.mo41323d(i3);
            zzjg.f37624a = b.mo41349y();
            return -5;
        }
        zzrn zzrn = this.f38362c;
        long j = zzrn.f38367g;
        if (j == Long.MIN_VALUE || ((a != -4 || zzgi.f36863e < j) && (a != -3 || zzrn.zzb() != Long.MIN_VALUE || zzgi.f36862d))) {
            return a;
        }
        zzgi.mo46720b();
        zzgi.mo46721c(4);
        this.f38361b = true;
        return -4;
    }

    /* renamed from: b */
    public final boolean mo48124b() {
        return !this.f38362c.mo48136j() && this.f38360a.mo48124b();
    }

    /* renamed from: c */
    public final int mo48125c(long j) {
        if (this.f38362c.mo48136j()) {
            return -3;
        }
        return this.f38360a.mo48125c(j);
    }

    /* renamed from: d */
    public final void mo48126d() throws IOException {
        this.f38360a.mo48126d();
    }

    /* renamed from: e */
    public final void mo48127e() {
        this.f38361b = false;
    }
}
