package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgt {

    /* renamed from: a */
    public final String f37251a;

    /* renamed from: b */
    public final zzaf f37252b;

    /* renamed from: c */
    public final zzaf f37253c;

    /* renamed from: d */
    public final int f37254d;

    /* renamed from: e */
    public final int f37255e;

    public zzgt(String str, zzaf zzaf, zzaf zzaf2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzdd.m47210d(z);
            zzdd.m47209c(str);
            this.f37251a = str;
            Objects.requireNonNull(zzaf);
            this.f37252b = zzaf;
            Objects.requireNonNull(zzaf2);
            this.f37253c = zzaf2;
            this.f37254d = i;
            this.f37255e = i2;
        }
        z = true;
        zzdd.m47210d(z);
        zzdd.m47209c(str);
        this.f37251a = str;
        Objects.requireNonNull(zzaf);
        this.f37252b = zzaf;
        Objects.requireNonNull(zzaf2);
        this.f37253c = zzaf2;
        this.f37254d = i;
        this.f37255e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgt.class == obj.getClass()) {
            zzgt zzgt = (zzgt) obj;
            return this.f37254d == zzgt.f37254d && this.f37255e == zzgt.f37255e && this.f37251a.equals(zzgt.f37251a) && this.f37252b.equals(zzgt.f37252b) && this.f37253c.equals(zzgt.f37253c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f37254d + 527) * 31) + this.f37255e) * 31) + this.f37251a.hashCode()) * 31) + this.f37252b.hashCode()) * 31) + this.f37253c.hashCode();
    }
}
