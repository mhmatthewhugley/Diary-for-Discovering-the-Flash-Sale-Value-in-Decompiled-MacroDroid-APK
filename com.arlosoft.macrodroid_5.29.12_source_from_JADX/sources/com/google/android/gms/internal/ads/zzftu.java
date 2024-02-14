package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzftu implements Iterator {

    /* renamed from: a */
    final Iterator f36400a;

    /* renamed from: c */
    Collection f36401c;

    /* renamed from: d */
    final /* synthetic */ zzftv f36402d;

    zzftu(zzftv zzftv) {
        this.f36402d = zzftv;
        this.f36400a = zzftv.f36403f.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f36400a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f36400a.next();
        this.f36401c = (Collection) entry.getValue();
        return this.f36402d.mo46210c(entry);
    }

    public final void remove() {
        zzfsx.m50944i(this.f36401c != null, "no calls to next() since the last call to remove()");
        this.f36400a.remove();
        zzfui.m51006n(this.f36402d.f36404g, this.f36401c.size());
        this.f36401c.clear();
        this.f36401c = null;
    }
}
