package com.google.android.gms.internal.nearby;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzsr extends zzsl {
    public zzsr() {
        super(4);
    }

    /* renamed from: c */
    public final zzsr mo53269c(Object obj) {
        Objects.requireNonNull(obj);
        super.mo53236a(obj);
        return this;
    }

    /* renamed from: d */
    public final zzss mo53270d() {
        int i = this.f45101b;
        if (i == 0) {
            return zzsw.f45115z;
        }
        if (i != 1) {
            zzss n = zzss.m63026q(i, this.f45100a);
            this.f45101b = n.size();
            this.f45102c = true;
            return n;
        }
        Object obj = this.f45100a[0];
        obj.getClass();
        return new zzsx(obj);
    }
}
