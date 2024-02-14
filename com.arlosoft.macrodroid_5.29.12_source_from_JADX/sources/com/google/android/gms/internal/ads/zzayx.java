package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzayx {

    /* renamed from: a */
    protected final zzays f26318a;

    /* renamed from: b */
    protected final int[] f26319b;

    /* renamed from: c */
    private final zzasw[] f26320c = new zzasw[1];

    /* renamed from: d */
    private int f26321d;

    public zzayx(zzays zzays, int... iArr) {
        Objects.requireNonNull(zzays);
        this.f26318a = zzays;
        for (int i = 0; i <= 0; i++) {
            this.f26320c[i] = zzays.mo42254b(iArr[i]);
        }
        Arrays.sort(this.f26320c, new zzayw((zzayv) null));
        this.f26319b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f26319b[i2] = zzays.mo42253a(this.f26320c[i2]);
        }
    }

    /* renamed from: a */
    public final int mo42262a(int i) {
        return this.f26319b[0];
    }

    /* renamed from: b */
    public final int mo42263b() {
        int length = this.f26319b.length;
        return 1;
    }

    /* renamed from: c */
    public final zzasw mo42264c(int i) {
        return this.f26320c[i];
    }

    /* renamed from: d */
    public final zzays mo42265d() {
        return this.f26318a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzayx zzayx = (zzayx) obj;
            return this.f26318a == zzayx.f26318a && Arrays.equals(this.f26319b, zzayx.f26319b);
        }
    }

    public final int hashCode() {
        int i = this.f26321d;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f26318a) * 31) + Arrays.hashCode(this.f26319b);
        this.f26321d = identityHashCode;
        return identityHashCode;
    }
}
