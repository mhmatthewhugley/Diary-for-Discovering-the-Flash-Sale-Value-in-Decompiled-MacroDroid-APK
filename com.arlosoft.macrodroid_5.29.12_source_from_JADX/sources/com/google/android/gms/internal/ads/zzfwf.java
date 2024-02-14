package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfwf extends zzfxh {

    /* renamed from: a */
    final Map f36493a;

    zzfwf(Map map) {
        Objects.requireNonNull(map);
        this.f36493a = map;
    }

    public void clear() {
        this.f36493a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f36493a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f36493a.isEmpty();
    }

    public Iterator iterator() {
        return new zzfwc(this.f36493a.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f36493a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f36493a.size();
    }
}
