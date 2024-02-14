package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcy {

    /* renamed from: a */
    final long f26636a;

    /* renamed from: b */
    final String f26637b;

    /* renamed from: c */
    final int f26638c;

    zzbcy(long j, String str, int i) {
        this.f26636a = j;
        this.f26637b = str;
        this.f26638c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzbcy)) {
            zzbcy zzbcy = (zzbcy) obj;
            if (zzbcy.f26636a == this.f26636a && zzbcy.f26638c == this.f26638c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f26636a;
    }
}
