package com.google.android.gms.internal.mlkit_translate;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzcd extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzci f43173a;

    zzcd(zzci zzci) {
        this.f43173a = zzci;
    }

    public final void clear() {
        this.f43173a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f43173a.mo52154b((Map.Entry) obj) != null;
    }

    public final Iterator iterator() {
        return new zzcc(this);
    }

    public final boolean remove(Object obj) {
        zzch b;
        if (!(obj instanceof Map.Entry) || (b = this.f43173a.mo52154b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f43173a.mo52159e(b, true);
        return true;
    }

    public final int size() {
        return this.f43173a.zzc;
    }
}
