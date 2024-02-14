package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapw extends zzano {

    /* renamed from: a */
    public Long f25272a;

    /* renamed from: b */
    public Boolean f25273b;

    /* renamed from: c */
    public Boolean f25274c;

    public zzapw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo41756b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f25272a);
        hashMap.put(1, this.f25273b);
        hashMap.put(2, this.f25274c);
        return hashMap;
    }

    public zzapw(String str) {
        HashMap a = zzano.m41979a(str);
        if (a != null) {
            this.f25272a = (Long) a.get(0);
            this.f25273b = (Boolean) a.get(1);
            this.f25274c = (Boolean) a.get(2);
        }
    }
}
