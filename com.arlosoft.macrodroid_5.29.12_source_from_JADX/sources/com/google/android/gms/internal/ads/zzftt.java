package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzftt extends zzfwe {

    /* renamed from: a */
    final /* synthetic */ zzftv f36399a;

    zzftt(zzftv zzftv) {
        this.f36399a = zzftv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map mo46202c() {
        return this.f36399a;
    }

    public final boolean contains(Object obj) {
        return zzfuo.m51032a(this.f36399a.f36403f.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzftu(this.f36399a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfui.m51008x(this.f36399a.f36404g, entry.getKey());
        return true;
    }
}
