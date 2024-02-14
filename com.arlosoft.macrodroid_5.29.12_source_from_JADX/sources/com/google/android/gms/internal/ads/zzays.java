package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzays {

    /* renamed from: a */
    public final int f26311a = 1;

    /* renamed from: b */
    private final zzasw[] f26312b;

    /* renamed from: c */
    private int f26313c;

    public zzays(zzasw... zzaswArr) {
        this.f26312b = zzaswArr;
    }

    /* renamed from: a */
    public final int mo42253a(zzasw zzasw) {
        for (int i = 0; i <= 0; i++) {
            if (zzasw == this.f26312b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzasw mo42254b(int i) {
        return this.f26312b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzays.class == obj.getClass() && Arrays.equals(this.f26312b, ((zzays) obj).f26312b);
    }

    public final int hashCode() {
        int i = this.f26313c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f26312b) + 527;
        this.f26313c = hashCode;
        return hashCode;
    }
}
