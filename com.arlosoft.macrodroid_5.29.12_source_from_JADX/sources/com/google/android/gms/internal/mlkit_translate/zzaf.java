package com.google.android.gms.internal.mlkit_translate;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzaf extends zzaa {

    /* renamed from: d */
    private final transient zzy f43090d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient Object[] f43091f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient int f43092g;

    zzaf(zzy zzy, Object[] objArr, int i, int i2) {
        this.f43090d = zzy;
        this.f43091f = objArr;
        this.f43092g = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo52031c(Object[] objArr, int i) {
        return mo52026k().mo52031c(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f43090d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final zzam mo52023h() {
        return mo52026k().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo52026k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final zzv mo52027l() {
        return new zzae(this);
    }

    public final int size() {
        return this.f43092g;
    }
}
