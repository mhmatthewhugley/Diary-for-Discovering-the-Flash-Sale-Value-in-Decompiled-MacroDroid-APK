package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfuw extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ zzfux f36449a;

    zzfuw(zzfux zzfux) {
        this.f36449a = zzfux;
    }

    public final void clear() {
        this.f36449a.clear();
    }

    public final Iterator iterator() {
        zzfux zzfux = this.f36449a;
        Map n = zzfux.mo46381n();
        if (n != null) {
            return n.values().iterator();
        }
        return new zzfur(zzfux);
    }

    public final int size() {
        return this.f36449a.size();
    }
}
