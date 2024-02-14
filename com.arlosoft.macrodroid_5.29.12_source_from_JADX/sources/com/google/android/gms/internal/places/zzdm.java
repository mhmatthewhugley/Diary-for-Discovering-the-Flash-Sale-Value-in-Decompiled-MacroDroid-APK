package com.google.android.gms.internal.places;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzdm extends AbstractSet {

    /* renamed from: a */
    private final /* synthetic */ zzdb f45381a;

    private zzdm(zzdb zzdb) {
        this.f45381a = zzdb;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f45381a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f45381a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f45381a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new zzdj(this.f45381a, (zzde) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f45381a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f45381a.size();
    }

    /* synthetic */ zzdm(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
