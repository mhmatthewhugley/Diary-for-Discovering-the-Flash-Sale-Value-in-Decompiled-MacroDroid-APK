package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfty extends zzfwf {

    /* renamed from: c */
    final /* synthetic */ zzfui f36413c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfty(zzfui zzfui, Map map) {
        super(map);
        this.f36413c = zzfui;
    }

    public final void clear() {
        zzfvx.m51176b(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.f36493a.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f36493a.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f36493a.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzftx(this, this.f36493a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f36493a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfui.m51006n(this.f36413c, size);
        return size > 0;
    }
}
