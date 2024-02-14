package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgxa {
    /* renamed from: b */
    public static zzgxa m53636b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgwv(cls.getSimpleName());
        }
        return new zzgwx(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo47584a(String str);
}
