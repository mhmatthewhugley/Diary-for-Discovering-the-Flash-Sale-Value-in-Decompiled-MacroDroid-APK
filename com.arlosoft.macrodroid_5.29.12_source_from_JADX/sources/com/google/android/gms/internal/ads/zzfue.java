package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfue implements Iterator {

    /* renamed from: a */
    final Iterator f36419a;

    /* renamed from: c */
    final Collection f36420c;

    /* renamed from: d */
    final /* synthetic */ zzfuf f36421d;

    zzfue(zzfuf zzfuf) {
        Iterator it;
        this.f36421d = zzfuf;
        Collection collection = zzfuf.f36423c;
        this.f36420c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f36419a = it;
    }

    zzfue(zzfuf zzfuf, Iterator it) {
        this.f36421d = zzfuf;
        this.f36420c = zzfuf.f36423c;
        this.f36419a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46280a() {
        this.f36421d.zzb();
        if (this.f36421d.f36423c != this.f36420c) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo46280a();
        return this.f36419a.hasNext();
    }

    public final Object next() {
        mo46280a();
        return this.f36419a.next();
    }

    public final void remove() {
        this.f36419a.remove();
        zzfui.m51004l(this.f36421d.f36426g);
        this.f36421d.mo46290d();
    }
}
