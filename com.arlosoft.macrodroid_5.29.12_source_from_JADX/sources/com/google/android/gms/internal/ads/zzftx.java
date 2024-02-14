package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzftx implements Iterator {

    /* renamed from: a */
    Map.Entry f36410a;

    /* renamed from: c */
    final /* synthetic */ Iterator f36411c;

    /* renamed from: d */
    final /* synthetic */ zzfty f36412d;

    zzftx(zzfty zzfty, Iterator it) {
        this.f36412d = zzfty;
        this.f36411c = it;
    }

    public final boolean hasNext() {
        return this.f36411c.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f36411c.next();
        this.f36410a = entry;
        return entry.getKey();
    }

    public final void remove() {
        zzfsx.m50944i(this.f36410a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f36410a.getValue();
        this.f36411c.remove();
        zzfui.m51006n(this.f36412d.f36413c, collection.size());
        collection.clear();
        this.f36410a = null;
    }
}
