package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzapl extends zzano {

    /* renamed from: a */
    public long f25258a = -1;

    /* renamed from: b */
    public long f25259b = -1;

    public zzapl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo41756b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f25258a));
        hashMap.put(1, Long.valueOf(this.f25259b));
        return hashMap;
    }

    public zzapl(String str) {
        HashMap a = zzano.m41979a(str);
        if (a != null) {
            this.f25258a = ((Long) a.get(0)).longValue();
            this.f25259b = ((Long) a.get(1)).longValue();
        }
    }
}
