package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdx {

    /* renamed from: a */
    private int f33292a;

    /* renamed from: b */
    private long[] f33293b;

    public zzdx() {
        this(32);
    }

    public zzdx(int i) {
        this.f33293b = new long[32];
    }

    /* renamed from: a */
    public final int mo45033a() {
        return this.f33292a;
    }

    /* renamed from: b */
    public final long mo45034b(int i) {
        if (i >= 0 && i < this.f33292a) {
            return this.f33293b[i];
        }
        int i2 = this.f33292a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    /* renamed from: c */
    public final void mo45035c(long j) {
        int i = this.f33292a;
        long[] jArr = this.f33293b;
        if (i == jArr.length) {
            this.f33293b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f33293b;
        int i2 = this.f33292a;
        this.f33292a = i2 + 1;
        jArr2[i2] = j;
    }
}
