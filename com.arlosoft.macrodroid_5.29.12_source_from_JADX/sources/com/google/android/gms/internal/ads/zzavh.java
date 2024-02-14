package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzavh {

    /* renamed from: a */
    public final int f25737a = 1;

    /* renamed from: b */
    public final byte[] f25738b;

    public zzavh(int i, byte[] bArr) {
        this.f25738b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzavh.class == obj.getClass() && Arrays.equals(this.f25738b, ((zzavh) obj).f25738b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25738b) + 31;
    }
}
