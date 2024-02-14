package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzfb implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzfi f46766a;

    /* renamed from: c */
    public final /* synthetic */ String f46767c;

    public /* synthetic */ zzfb(zzfi zzfi, String str) {
        this.f46766a = zzfi;
        this.f46767c = str;
    }

    public final Object call() {
        zzfi zzfi = this.f46766a;
        String str = this.f46767c;
        zzh R = zzfi.f47227b.mo55519W().mo54967R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        zzfi.f46899a.mo55219x().mo54932o();
        hashMap.put("gmp_version", 74029L);
        if (R != null) {
            String g0 = R.mo55293g0();
            if (g0 != null) {
                hashMap.put("app_version", g0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo55265L()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo55274U()));
        }
        return hashMap;
    }
}
