package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzld implements zzlk {

    /* renamed from: a */
    private final zzlk[] f41664a;

    zzld(zzlk... zzlkArr) {
        this.f41664a = zzlkArr;
    }

    /* renamed from: a */
    public final zzlj mo51436a(Class cls) {
        zzlk[] zzlkArr = this.f41664a;
        for (int i = 0; i < 2; i++) {
            zzlk zzlk = zzlkArr[i];
            if (zzlk.mo51437b(cls)) {
                return zzlk.mo51436a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo51437b(Class cls) {
        zzlk[] zzlkArr = this.f41664a;
        for (int i = 0; i < 2; i++) {
            if (zzlkArr[i].mo51437b(cls)) {
                return true;
            }
        }
        return false;
    }
}
