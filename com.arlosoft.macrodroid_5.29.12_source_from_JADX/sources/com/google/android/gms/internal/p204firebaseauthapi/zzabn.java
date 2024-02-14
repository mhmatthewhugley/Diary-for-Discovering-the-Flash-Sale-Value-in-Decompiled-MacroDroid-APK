package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzabn extends AbstractList implements zzadk {

    /* renamed from: a */
    private boolean f39622a = true;

    zzabn() {
    }

    /* renamed from: a */
    public final boolean mo48862a() {
        return this.f39622a;
    }

    public void add(int i, Object obj) {
        mo48867c();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo48867c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48867c() {
        if (!this.f39622a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo48867c();
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
        mo48867c();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        mo48867c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo48867c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo48867c();
        return super.set(i, obj);
    }

    public final void zzb() {
        this.f39622a = false;
    }

    public boolean add(Object obj) {
        mo48867c();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo48867c();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo48867c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
