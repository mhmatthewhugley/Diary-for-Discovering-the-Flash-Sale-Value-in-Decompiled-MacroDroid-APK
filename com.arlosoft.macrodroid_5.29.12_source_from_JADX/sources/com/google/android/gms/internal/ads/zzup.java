package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzup implements zzvt {

    /* renamed from: a */
    protected final zzcp f38634a;

    /* renamed from: b */
    protected final int f38635b;

    /* renamed from: c */
    protected final int[] f38636c;

    /* renamed from: d */
    private final zzaf[] f38637d;

    /* renamed from: e */
    private int f38638e;

    public zzup(zzcp zzcp, int[] iArr, int i) {
        int length = iArr.length;
        zzdd.m47212f(length > 0);
        Objects.requireNonNull(zzcp);
        this.f38634a = zzcp;
        this.f38635b = length;
        this.f38637d = new zzaf[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f38637d[i2] = zzcp.mo44231b(iArr[i2]);
        }
        Arrays.sort(this.f38637d, zzuo.f38633a);
        this.f38636c = new int[this.f38635b];
        for (int i3 = 0; i3 < this.f38635b; i3++) {
            this.f38636c[i3] = zzcp.mo44230a(this.f38637d[i3]);
        }
    }

    /* renamed from: B */
    public final int mo48180B(int i) {
        for (int i2 = 0; i2 < this.f38635b; i2++) {
            if (this.f38636c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public final zzaf mo48181G(int i) {
        return this.f38637d[i];
    }

    /* renamed from: a */
    public final int mo48182a() {
        return this.f38636c.length;
    }

    /* renamed from: b */
    public final zzcp mo48183b() {
        return this.f38634a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzup zzup = (zzup) obj;
            return this.f38634a == zzup.f38634a && Arrays.equals(this.f38636c, zzup.f38636c);
        }
    }

    public final int hashCode() {
        int i = this.f38638e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f38634a) * 31) + Arrays.hashCode(this.f38636c);
        this.f38638e = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: v */
    public final int mo48186v(int i) {
        return this.f38636c[0];
    }
}
