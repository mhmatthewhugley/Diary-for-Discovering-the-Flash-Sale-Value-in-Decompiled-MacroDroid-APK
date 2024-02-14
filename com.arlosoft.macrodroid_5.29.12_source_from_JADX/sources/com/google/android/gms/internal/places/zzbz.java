package com.google.android.gms.internal.places;

final class zzbz implements zzch {

    /* renamed from: a */
    private zzch[] f45312a;

    zzbz(zzch... zzchArr) {
        this.f45312a = zzchArr;
    }

    /* renamed from: a */
    public final boolean mo53439a(Class<?> cls) {
        for (zzch a : this.f45312a) {
            if (a.mo53439a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final zzci mo53440b(Class<?> cls) {
        for (zzch zzch : this.f45312a) {
            if (zzch.mo53439a(cls)) {
                return zzch.mo53440b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
