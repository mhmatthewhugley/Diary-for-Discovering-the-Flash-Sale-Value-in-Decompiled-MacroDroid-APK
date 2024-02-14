package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcx {

    /* renamed from: e */
    public static final zzn f31762e = zzcw.f31724a;

    /* renamed from: a */
    public final int f31763a = 1;

    /* renamed from: b */
    private final zzcp f31764b;

    /* renamed from: c */
    private final int[] f31765c;

    /* renamed from: d */
    private final boolean[] f31766d;

    public zzcx(zzcp zzcp, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzcp.f29179a;
        this.f31764b = zzcp;
        this.f31765c = (int[]) iArr.clone();
        this.f31766d = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final int mo44445a() {
        return this.f31764b.f29181c;
    }

    /* renamed from: b */
    public final zzaf mo44446b(int i) {
        return this.f31764b.mo44231b(i);
    }

    /* renamed from: c */
    public final boolean mo44447c() {
        for (boolean z : this.f31766d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo44448d(int i) {
        return this.f31766d[i];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcx = (zzcx) obj;
            return this.f31764b.equals(zzcx.f31764b) && Arrays.equals(this.f31765c, zzcx.f31765c) && Arrays.equals(this.f31766d, zzcx.f31766d);
        }
    }

    public final int hashCode() {
        return (((this.f31764b.hashCode() * 961) + Arrays.hashCode(this.f31765c)) * 31) + Arrays.hashCode(this.f31766d);
    }
}
