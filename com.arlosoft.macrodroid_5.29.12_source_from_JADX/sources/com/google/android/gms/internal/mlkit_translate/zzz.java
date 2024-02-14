package com.google.android.gms.internal.mlkit_translate;

import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzz extends zzp {
    public zzz() {
        super(4);
    }

    /* renamed from: d */
    public final zzz mo52517d(Object obj) {
        Objects.requireNonNull(obj);
        super.mo52394b(obj);
        return this;
    }

    /* renamed from: e */
    public final zzaa mo52518e() {
        int i = this.f44388b;
        if (i == 0) {
            return zzaj.f43103z;
        }
        if (i != 1) {
            zzaa m = zzaa.m61556q(i, this.f44387a);
            this.f44388b = m.size();
            this.f44389c = true;
            return m;
        }
        Object obj = this.f44387a[0];
        obj.getClass();
        return new zzal(obj);
    }
}
