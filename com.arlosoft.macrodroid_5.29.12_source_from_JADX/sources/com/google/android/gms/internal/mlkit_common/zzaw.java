package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzaw extends zzas {

    /* renamed from: d */
    private final transient zzar f41954d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient Object[] f41955f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient int f41956g;

    zzaw(zzar zzar, Object[] objArr, int i, int i2) {
        this.f41954d = zzar;
        this.f41955f = objArr;
        this.f41956g = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo51730c(Object[] objArr, int i) {
        return mo51785j().mo51730c(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f41954d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final zzbb mo51735h() {
        return mo51785j().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo51785j().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final zzao mo51786k() {
        return new zzav(this);
    }

    public final int size() {
        return this.f41956g;
    }
}
