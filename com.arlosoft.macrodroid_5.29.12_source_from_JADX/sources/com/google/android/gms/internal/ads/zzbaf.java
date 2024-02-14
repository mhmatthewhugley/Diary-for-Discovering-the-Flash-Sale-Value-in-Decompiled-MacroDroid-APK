package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbaf {

    /* renamed from: a */
    private int f26397a;

    /* renamed from: b */
    private long[] f26398b;

    public zzbaf() {
        this(32);
    }

    public zzbaf(int i) {
        this.f26398b = new long[32];
    }

    /* renamed from: a */
    public final int mo42311a() {
        return this.f26397a;
    }

    /* renamed from: b */
    public final long mo42312b(int i) {
        if (i >= 0 && i < this.f26397a) {
            return this.f26398b[i];
        }
        int i2 = this.f26397a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    /* renamed from: c */
    public final void mo42313c(long j) {
        int i = this.f26397a;
        long[] jArr = this.f26398b;
        if (i == jArr.length) {
            this.f26398b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f26398b;
        int i2 = this.f26397a;
        this.f26397a = i2 + 1;
        jArr2[i2] = j;
    }
}
