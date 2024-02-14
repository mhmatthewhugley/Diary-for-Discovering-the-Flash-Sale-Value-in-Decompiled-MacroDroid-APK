package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaao {

    /* renamed from: a */
    public final int f23741a;

    /* renamed from: b */
    public final byte[] f23742b;

    /* renamed from: c */
    public final int f23743c;

    /* renamed from: d */
    public final int f23744d;

    public zzaao(int i, byte[] bArr, int i2, int i3) {
        this.f23741a = i;
        this.f23742b = bArr;
        this.f23743c = i2;
        this.f23744d = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaao.class == obj.getClass()) {
            zzaao zzaao = (zzaao) obj;
            return this.f23741a == zzaao.f23741a && this.f23743c == zzaao.f23743c && this.f23744d == zzaao.f23744d && Arrays.equals(this.f23742b, zzaao.f23742b);
        }
    }

    public final int hashCode() {
        return (((((this.f23741a * 31) + Arrays.hashCode(this.f23742b)) * 31) + this.f23743c) * 31) + this.f23744d;
    }
}
