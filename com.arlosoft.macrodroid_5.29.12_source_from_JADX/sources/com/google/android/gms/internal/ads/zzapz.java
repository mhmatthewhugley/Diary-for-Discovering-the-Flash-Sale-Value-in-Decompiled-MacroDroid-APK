package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapz extends zzano {

    /* renamed from: a */
    public Long f25282a;

    /* renamed from: b */
    public Long f25283b;

    public zzapz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo41756b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f25282a);
        hashMap.put(1, this.f25283b);
        return hashMap;
    }

    public zzapz(String str) {
        HashMap a = zzano.m41979a(str);
        if (a != null) {
            this.f25282a = (Long) a.get(0);
            this.f25283b = (Long) a.get(1);
        }
    }
}
