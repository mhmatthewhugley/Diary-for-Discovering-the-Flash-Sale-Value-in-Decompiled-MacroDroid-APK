package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdv implements zzec {

    /* renamed from: a */
    private final zzec[] f40906a;

    zzdv(zzec... zzecArr) {
        this.f40906a = zzecArr;
    }

    /* renamed from: a */
    public final boolean mo50300a(Class<?> cls) {
        zzec[] zzecArr = this.f40906a;
        for (int i = 0; i < 2; i++) {
            if (zzecArr[i].mo50300a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final zzeb mo50301b(Class<?> cls) {
        zzec[] zzecArr = this.f40906a;
        for (int i = 0; i < 2; i++) {
            zzec zzec = zzecArr[i];
            if (zzec.mo50300a(cls)) {
                return zzec.mo50301b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
