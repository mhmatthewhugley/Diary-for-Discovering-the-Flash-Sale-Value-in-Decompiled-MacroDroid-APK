package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzazf {

    /* renamed from: a */
    private int f26342a;

    /* renamed from: b */
    private final zzayx[] f26343b;

    public zzazf(zzayx[] zzayxArr, byte... bArr) {
        this.f26343b = zzayxArr;
    }

    /* renamed from: a */
    public final zzayx mo42274a(int i) {
        return this.f26343b[i];
    }

    /* renamed from: b */
    public final zzayx[] mo42275b() {
        return (zzayx[]) this.f26343b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzazf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26343b, ((zzazf) obj).f26343b);
    }

    public final int hashCode() {
        int i = this.f26342a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f26343b) + 527;
        this.f26342a = hashCode;
        return hashCode;
    }
}
