package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zztf extends zzth {

    /* renamed from: f */
    private final zzth f45135f;

    /* renamed from: g */
    private final String f45136g = ":";

    zztf(zzth zzth, String str, int i) {
        this.f45135f = zzth;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53295a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzth zzth = this.f45135f;
        String str = this.f45136g;
        Objects.requireNonNull(appendable);
        zzth.mo53295a(new zzta(2, appendable, str), bArr, 0, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo53296b(int i) {
        int b = this.f45135f.mo53296b(i);
        return b + (this.f45136g.length() * zztj.m63066a(Math.max(0, b - 1), 2, RoundingMode.FLOOR));
    }

    /* renamed from: c */
    public final zzth mo53297c(String str, int i) {
        throw null;
    }

    public final String toString() {
        return this.f45135f + ".withSeparator(\"" + this.f45136g + "\", 2)";
    }
}
