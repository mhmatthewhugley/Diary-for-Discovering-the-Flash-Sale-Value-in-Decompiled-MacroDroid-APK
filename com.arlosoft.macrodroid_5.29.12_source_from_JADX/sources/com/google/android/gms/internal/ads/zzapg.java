package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapg extends zzano {

    /* renamed from: a */
    public Long f25250a;

    /* renamed from: b */
    public Long f25251b;

    /* renamed from: c */
    public Long f25252c;

    public zzapg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo41756b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f25250a);
        hashMap.put(1, this.f25251b);
        hashMap.put(2, this.f25252c);
        return hashMap;
    }

    public zzapg(String str) {
        HashMap a = zzano.m41979a(str);
        if (a != null) {
            this.f25250a = (Long) a.get(0);
            this.f25251b = (Long) a.get(1);
            this.f25252c = (Long) a.get(2);
        }
    }
}
