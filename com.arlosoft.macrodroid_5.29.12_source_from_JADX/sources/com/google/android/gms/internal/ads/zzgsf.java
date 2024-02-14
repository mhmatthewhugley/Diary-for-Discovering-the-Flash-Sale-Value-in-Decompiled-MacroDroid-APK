package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsf implements zzgsm {

    /* renamed from: a */
    private final zzgsm[] f37211a;

    zzgsf(zzgsm... zzgsmArr) {
        this.f37211a = zzgsmArr;
    }

    /* renamed from: a */
    public final zzgsl mo47298a(Class cls) {
        zzgsm[] zzgsmArr = this.f37211a;
        for (int i = 0; i < 2; i++) {
            zzgsm zzgsm = zzgsmArr[i];
            if (zzgsm.mo47299b(cls)) {
                return zzgsm.mo47298a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo47299b(Class cls) {
        zzgsm[] zzgsmArr = this.f37211a;
        for (int i = 0; i < 2; i++) {
            if (zzgsmArr[i].mo47299b(cls)) {
                return true;
            }
        }
        return false;
    }
}
