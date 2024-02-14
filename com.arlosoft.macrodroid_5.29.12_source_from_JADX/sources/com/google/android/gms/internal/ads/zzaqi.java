package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqi extends zzano {

    /* renamed from: a */
    public Long f25320a;

    /* renamed from: b */
    public Long f25321b;

    /* renamed from: c */
    public Long f25322c;

    /* renamed from: d */
    public Long f25323d;

    /* renamed from: e */
    public Long f25324e;

    public zzaqi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo41756b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f25320a);
        hashMap.put(1, this.f25321b);
        hashMap.put(2, this.f25322c);
        hashMap.put(3, this.f25323d);
        hashMap.put(4, this.f25324e);
        return hashMap;
    }

    public zzaqi(String str) {
        HashMap a = zzano.m41979a(str);
        if (a != null) {
            this.f25320a = (Long) a.get(0);
            this.f25321b = (Long) a.get(1);
            this.f25322c = (Long) a.get(2);
            this.f25323d = (Long) a.get(3);
            this.f25324e = (Long) a.get(4);
        }
    }
}
