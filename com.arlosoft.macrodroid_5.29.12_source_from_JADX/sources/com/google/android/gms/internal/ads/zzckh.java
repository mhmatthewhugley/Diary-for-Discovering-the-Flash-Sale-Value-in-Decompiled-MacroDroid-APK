package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckh implements zzazm {

    /* renamed from: a */
    private final zzazm f28756a;

    /* renamed from: b */
    private final long f28757b;

    /* renamed from: c */
    private final zzazm f28758c;

    /* renamed from: d */
    private long f28759d;

    /* renamed from: e */
    private Uri f28760e;

    zzckh(zzazm zzazm, int i, zzazm zzazm2) {
        this.f28756a = zzazm;
        this.f28757b = (long) i;
        this.f28758c = zzazm2;
    }

    /* renamed from: a */
    public final Uri mo42281a() {
        return this.f28760e;
    }

    /* renamed from: d */
    public final void mo42282d() throws IOException {
        this.f28756a.mo42282d();
        this.f28758c.mo42282d();
    }

    /* renamed from: e */
    public final int mo42283e(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f28759d;
        long j2 = this.f28757b;
        if (j < j2) {
            int e = this.f28756a.mo42283e(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f28759d + ((long) e);
            this.f28759d = j3;
            i3 = e;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f28757b) {
            return i3;
        }
        int e2 = this.f28758c.mo42283e(bArr, i + i3, i2 - i3);
        this.f28759d += (long) e2;
        return i3 + e2;
    }

    /* renamed from: f */
    public final long mo42284f(zzazo zzazo) throws IOException {
        zzazo zzazo2;
        zzazo zzazo3 = zzazo;
        this.f28760e = zzazo3.f26354a;
        long j = zzazo3.f26356c;
        long j2 = this.f28757b;
        zzazo zzazo4 = null;
        if (j >= j2) {
            zzazo2 = null;
        } else {
            long j3 = zzazo3.f26357d;
            zzazo2 = new zzazo(zzazo3.f26354a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = zzazo3.f26357d;
        if (j4 == -1 || zzazo3.f26356c + j4 > this.f28757b) {
            long max = Math.max(this.f28757b, zzazo3.f26356c);
            long j5 = zzazo3.f26357d;
            zzazo4 = new zzazo(zzazo3.f26354a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (zzazo3.f26356c + j5) - this.f28757b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long f = zzazo2 != null ? this.f28756a.mo42284f(zzazo2) : 0;
        if (zzazo4 != null) {
            j6 = this.f28758c.mo42284f(zzazo4);
        }
        this.f28759d = zzazo3.f26356c;
        if (j6 == -1) {
            return -1;
        }
        return f + j6;
    }
}
