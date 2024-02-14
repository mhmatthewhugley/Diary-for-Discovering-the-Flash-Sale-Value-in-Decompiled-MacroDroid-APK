package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfuu extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzfux f36445a;

    zzfuu(zzfux zzfux) {
        this.f36445a = zzfux;
    }

    public final void clear() {
        this.f36445a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f36445a.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfux zzfux = this.f36445a;
        Map n = zzfux.mo46381n();
        if (n != null) {
            return n.keySet().iterator();
        }
        return new zzfup(zzfux);
    }

    public final boolean remove(Object obj) {
        Map n = this.f36445a.mo46381n();
        if (n != null) {
            return n.keySet().remove(obj);
        }
        return this.f36445a.m51040B(obj) != zzfux.f36450A;
    }

    public final int size() {
        return this.f36445a.size();
    }
}
