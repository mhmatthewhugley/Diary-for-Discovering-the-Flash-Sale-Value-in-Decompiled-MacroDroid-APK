package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzclq implements zzex {

    /* renamed from: a */
    private final zzex f28908a;

    /* renamed from: b */
    private final long f28909b;

    /* renamed from: c */
    private final zzex f28910c;

    /* renamed from: d */
    private long f28911d;

    /* renamed from: e */
    private Uri f28912e;

    zzclq(zzex zzex, int i, zzex zzex2) {
        this.f28908a = zzex;
        this.f28909b = (long) i;
        this.f28910c = zzex2;
    }

    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f28912e;
    }

    /* renamed from: b */
    public final Map mo43925b() {
        return zzfvq.m51148d();
    }

    /* renamed from: d */
    public final void mo43926d() throws IOException {
        this.f28908a.mo43926d();
        this.f28910c.mo43926d();
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f28911d;
        long j2 = this.f28909b;
        if (j < j2) {
            int e = this.f28908a.mo43927e(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f28911d + ((long) e);
            this.f28911d = j3;
            i3 = e;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f28909b) {
            return i3;
        }
        int e2 = this.f28910c.mo43927e(bArr, i + i3, i2 - i3);
        this.f28911d += (long) e2;
        return i3 + e2;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws IOException {
        zzfc zzfc2;
        zzfc zzfc3 = zzfc;
        this.f28912e = zzfc3.f35396a;
        long j = zzfc3.f35401f;
        long j2 = this.f28909b;
        zzfc zzfc4 = null;
        if (j >= j2) {
            zzfc2 = null;
        } else {
            long j3 = zzfc3.f35402g;
            zzfc2 = new zzfc(zzfc3.f35396a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = zzfc3.f35402g;
        if (j4 == -1 || zzfc3.f35401f + j4 > this.f28909b) {
            long max = Math.max(this.f28909b, zzfc3.f35401f);
            long j5 = zzfc3.f35402g;
            zzfc4 = new zzfc(zzfc3.f35396a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (zzfc3.f35401f + j5) - this.f28909b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long g = zzfc2 != null ? this.f28908a.mo43928g(zzfc2) : 0;
        if (zzfc4 != null) {
            j6 = this.f28910c.mo43928g(zzfc4);
        }
        this.f28911d = zzfc3.f35401f;
        if (g == -1 || j6 == -1) {
            return -1;
        }
        return g + j6;
    }

    /* renamed from: k */
    public final void mo43952k(zzfz zzfz) {
    }
}
