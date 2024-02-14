package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzry implements zzex {

    /* renamed from: a */
    private final zzex f38389a;

    /* renamed from: b */
    private final int f38390b;

    /* renamed from: c */
    private final zzrx f38391c;

    /* renamed from: d */
    private final byte[] f38392d;

    /* renamed from: e */
    private int f38393e;

    public zzry(zzex zzex, int i, zzrx zzrx) {
        zzdd.m47210d(i > 0);
        this.f38389a = zzex;
        this.f38390b = i;
        this.f38391c = zzrx;
        this.f38392d = new byte[1];
        this.f38393e = i;
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f38389a.mo43924a();
    }

    /* renamed from: b */
    public final Map mo43925b() {
        return this.f38389a.mo43925b();
    }

    /* renamed from: d */
    public final void mo43926d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f38393e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f38389a.mo43927e(this.f38392d, 0, 1) != -1) {
                int i5 = (this.f38392d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int e = this.f38389a.mo43927e(bArr2, i4, i6);
                        if (e != -1) {
                            i4 += e;
                            i6 -= e;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f38391c.mo48148c(new zzef(bArr2, i5));
                    }
                }
                i3 = this.f38390b;
                this.f38393e = i3;
            }
            return -1;
        }
        int e2 = this.f38389a.mo43927e(bArr, i, Math.min(i3, i2));
        if (e2 != -1) {
            this.f38393e -= e2;
        }
        return e2;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final void mo43952k(zzfz zzfz) {
        Objects.requireNonNull(zzfz);
        this.f38389a.mo43952k(zzfz);
    }
}
