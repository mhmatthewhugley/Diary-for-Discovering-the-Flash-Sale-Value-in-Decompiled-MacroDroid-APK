package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafh extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ zzafj f39830a;

    /* synthetic */ zzafh(zzafj zzafj, zzafg zzafg) {
        this.f39830a = zzafj;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f39830a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f39830a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f39830a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new zzaff(this.f39830a, (zzafe) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f39830a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f39830a.size();
    }
}
