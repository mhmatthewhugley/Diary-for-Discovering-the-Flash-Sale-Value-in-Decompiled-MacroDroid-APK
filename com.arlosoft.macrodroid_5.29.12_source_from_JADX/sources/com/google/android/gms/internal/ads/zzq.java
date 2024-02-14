package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzq {

    /* renamed from: f */
    public static final zzn f38205f = zzp.f38118a;

    /* renamed from: a */
    public final int f38206a;

    /* renamed from: b */
    public final int f38207b;

    /* renamed from: c */
    public final int f38208c;
    @Nullable

    /* renamed from: d */
    public final byte[] f38209d;

    /* renamed from: e */
    private int f38210e;

    public zzq(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f38206a = i;
        this.f38207b = i2;
        this.f38208c = i3;
        this.f38209d = bArr;
    }

    /* renamed from: a */
    public static int m54582a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: b */
    public static int m54583b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzq = (zzq) obj;
            return this.f38206a == zzq.f38206a && this.f38207b == zzq.f38207b && this.f38208c == zzq.f38208c && Arrays.equals(this.f38209d, zzq.f38209d);
        }
    }

    public final int hashCode() {
        int i = this.f38210e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f38206a + 527) * 31) + this.f38207b) * 31) + this.f38208c) * 31) + Arrays.hashCode(this.f38209d);
        this.f38210e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f38206a;
        int i2 = this.f38207b;
        int i3 = this.f38208c;
        boolean z = this.f38209d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}
