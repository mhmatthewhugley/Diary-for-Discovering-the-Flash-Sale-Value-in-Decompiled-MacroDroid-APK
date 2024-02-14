package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagf implements zzzi {

    /* renamed from: d */
    public static final zzzp f24398d = zzage.f24397b;

    /* renamed from: a */
    private zzzl f24399a;

    /* renamed from: b */
    private zzagn f24400b;

    /* renamed from: c */
    private boolean f24401c;

    /* renamed from: b */
    private final boolean m41322b(zzzj zzzj) throws IOException {
        zzagh zzagh = new zzagh();
        if (zzagh.mo41458b(zzzj, true) && (zzagh.f24407a & 2) == 2) {
            int min = Math.min(zzagh.f24411e, 8);
            zzef zzef = new zzef(min);
            ((zzyy) zzzj).mo48454j(zzef.mo45232h(), 0, min, false);
            zzef.mo45230f(0);
            if (zzef.mo45233i() >= 5 && zzef.mo45243s() == 127 && zzef.mo45217A() == 1179402563) {
                this.f24400b = new zzagd();
            } else {
                zzef.mo45230f(0);
                try {
                    if (zzaav.m40956d(1, zzef, true)) {
                        this.f24400b = new zzagp();
                    }
                } catch (zzbu unused) {
                }
                zzef.mo45230f(0);
                if (zzagj.m41339j(zzef)) {
                    this.f24400b = new zzagj();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        try {
            return m41322b(zzzj);
        } catch (zzbu unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24399a = zzzl;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        zzagn zzagn = this.f24400b;
        if (zzagn != null) {
            zzagn.mo41465i(j, j2);
        }
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        zzdd.m47208b(this.f24399a);
        if (this.f24400b == null) {
            if (m41322b(zzzj)) {
                zzzj.mo48452h();
            } else {
                throw zzbu.m44135a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f24401c) {
            zzaap k = this.f24399a.mo41256k(0, 1);
            this.f24399a.mo41255j0();
            this.f24400b.mo41463g(this.f24399a, k);
            this.f24401c = true;
        }
        return this.f24400b.mo41460d(zzzj, zzaai);
    }
}
