package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgt {

    /* renamed from: a */
    private final String f44674a;

    /* renamed from: b */
    private final long f44675b;

    zzgt(String str, long j) {
        this.f44674a = str;
        this.f44675b = j;
    }

    /* renamed from: a */
    public final String mo52731a() {
        return this.f44674a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgt = (zzgt) obj;
            return Objects.m4470a(this.f44674a, zzgt.f44674a) && Objects.m4470a(Long.valueOf(this.f44675b), Long.valueOf(zzgt.f44675b));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44674a, Long.valueOf(this.f44675b));
    }
}
