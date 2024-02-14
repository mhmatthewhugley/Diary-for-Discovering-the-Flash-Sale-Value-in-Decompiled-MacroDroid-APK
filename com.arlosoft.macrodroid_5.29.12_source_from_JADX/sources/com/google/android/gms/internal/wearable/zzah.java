package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
abstract class zzah extends AbstractList implements zzcc {

    /* renamed from: a */
    private boolean f45532a = true;

    zzah() {
    }

    /* renamed from: a */
    public final boolean mo53802a() {
        return this.f45532a;
    }

    public void add(int i, Object obj) {
        mo53807c();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo53807c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo53807c() {
        if (!this.f45532a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo53807c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        mo53807c();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        mo53807c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo53807c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo53807c();
        return super.set(i, obj);
    }

    public final void zzb() {
        this.f45532a = false;
    }

    public boolean add(Object obj) {
        mo53807c();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo53807c();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo53807c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
