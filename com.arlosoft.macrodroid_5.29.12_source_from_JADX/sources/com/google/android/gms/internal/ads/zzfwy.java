package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfwy extends zzfvs {

    /* renamed from: d */
    private final transient zzfvq f36505d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient Object[] f36506f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient int f36507g;

    zzfwy(zzfvq zzfvq, Object[] objArr, int i, int i2) {
        this.f36505d = zzfvq;
        this.f36506f = objArr;
        this.f36507g = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46413c(Object[] objArr, int i) {
        return mo46418h().mo46413c(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f36505d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final zzfxm mo46419i() {
        return mo46418h().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo46418h().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final zzfvn mo46476m() {
        return new zzfwx(this);
    }

    public final int size() {
        return this.f36507g;
    }
}
