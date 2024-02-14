package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzazk implements zzazm {

    /* renamed from: a */
    private final byte[] f26350a;

    /* renamed from: b */
    private Uri f26351b;

    /* renamed from: c */
    private int f26352c;

    /* renamed from: d */
    private int f26353d;

    public zzazk(byte[] bArr) {
        Objects.requireNonNull(bArr);
        zzbac.m42924c(bArr.length > 0);
        this.f26350a = bArr;
    }

    /* renamed from: a */
    public final Uri mo42281a() {
        return this.f26351b;
    }

    /* renamed from: d */
    public final void mo42282d() throws IOException {
        this.f26351b = null;
    }

    /* renamed from: e */
    public final int mo42283e(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f26353d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f26350a, this.f26352c, bArr, i, min);
        this.f26352c += min;
        this.f26353d -= min;
        return min;
    }

    /* renamed from: f */
    public final long mo42284f(zzazo zzazo) throws IOException {
        this.f26351b = zzazo.f26354a;
        long j = zzazo.f26356c;
        int i = (int) j;
        this.f26352c = i;
        long j2 = zzazo.f26357d;
        long j3 = -1;
        if (j2 == -1) {
            j2 = ((long) this.f26350a.length) - j;
        } else {
            j3 = j2;
        }
        int i2 = (int) j2;
        this.f26353d = i2;
        if (i2 > 0 && i + i2 <= this.f26350a.length) {
            return (long) i2;
        }
        int length = this.f26350a.length;
        throw new IOException("Unsatisfiable range: [" + i + ", " + j3 + "], length: " + length);
    }
}
