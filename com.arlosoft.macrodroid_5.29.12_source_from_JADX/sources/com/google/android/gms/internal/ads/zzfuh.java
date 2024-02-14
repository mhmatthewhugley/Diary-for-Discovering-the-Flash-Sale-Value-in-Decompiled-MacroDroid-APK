package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfuh extends zzfuf implements List {

    /* renamed from: o */
    final /* synthetic */ zzfui f36428o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfuh(zzfui zzfui, Object obj, List list, zzfuf zzfuf) {
        super(zzfui, obj, list, zzfuf);
        this.f36428o = zzfui;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f36423c.isEmpty();
        ((List) this.f36423c).add(i, obj);
        zzfui.m51003k(this.f36428o);
        if (isEmpty) {
            mo46286c();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f36423c).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        zzfui.m51005m(this.f36428o, this.f36423c.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo46286c();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f36423c).get(i);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f36423c).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f36423c).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new zzfug(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f36423c).remove(i);
        zzfui.m51004l(this.f36428o);
        mo46290d();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f36423c).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        zzfui zzfui = this.f36428o;
        Object obj = this.f36422a;
        List subList = ((List) this.f36423c).subList(i, i2);
        zzfuf zzfuf = this.f36424d;
        if (zzfuf == null) {
            zzfuf = this;
        }
        return zzfui.mo46322p(obj, subList, zzfuf);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfug(this, i);
    }
}
