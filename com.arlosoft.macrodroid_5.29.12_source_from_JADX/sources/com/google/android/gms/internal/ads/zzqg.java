package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqg {

    /* renamed from: a */
    private long f38243a;

    /* renamed from: b */
    private long f38244b;

    /* renamed from: c */
    private boolean f38245c;

    zzqg() {
    }

    /* renamed from: d */
    private final long m54613d(long j) {
        return this.f38243a + Math.max(0, ((this.f38244b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public final long mo48059a(zzaf zzaf) {
        return m54613d((long) zzaf.f24227z);
    }

    /* renamed from: b */
    public final long mo48060b(zzaf zzaf, zzgi zzgi) {
        if (this.f38244b == 0) {
            this.f38243a = zzgi.f36863e;
        }
        if (this.f38245c) {
            return zzgi.f36863e;
        }
        ByteBuffer byteBuffer = zzgi.f36861c;
        Objects.requireNonNull(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int c = zzaac.m40903c(b);
        if (c == -1) {
            this.f38245c = true;
            this.f38244b = 0;
            this.f38243a = zzgi.f36863e;
            zzdw.m48255e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return zzgi.f36863e;
        }
        long d = m54613d((long) zzaf.f24227z);
        this.f38244b += (long) c;
        return d;
    }

    /* renamed from: c */
    public final void mo48061c() {
        this.f38243a = 0;
        this.f38244b = 0;
        this.f38245c = false;
    }
}
