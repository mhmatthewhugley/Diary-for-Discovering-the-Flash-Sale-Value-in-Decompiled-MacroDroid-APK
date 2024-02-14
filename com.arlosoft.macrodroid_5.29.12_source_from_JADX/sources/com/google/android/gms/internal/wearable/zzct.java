package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzct implements zzda {

    /* renamed from: a */
    private final zzda[] f45663a;

    zzct(zzda... zzdaArr) {
        this.f45663a = zzdaArr;
    }

    /* renamed from: a */
    public final zzcz mo53932a(Class cls) {
        zzda[] zzdaArr = this.f45663a;
        for (int i = 0; i < 2; i++) {
            zzda zzda = zzdaArr[i];
            if (zzda.mo53933b(cls)) {
                return zzda.mo53932a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo53933b(Class cls) {
        zzda[] zzdaArr = this.f45663a;
        for (int i = 0; i < 2; i++) {
            if (zzdaArr[i].mo53933b(cls)) {
                return true;
            }
        }
        return false;
    }
}
