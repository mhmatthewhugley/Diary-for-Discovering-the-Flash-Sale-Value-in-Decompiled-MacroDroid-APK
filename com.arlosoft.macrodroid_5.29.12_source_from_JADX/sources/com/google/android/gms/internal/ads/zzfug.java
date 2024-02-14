package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfug extends zzfue implements ListIterator {

    /* renamed from: f */
    final /* synthetic */ zzfuh f36427f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfug(zzfuh zzfuh) {
        super(zzfuh);
        this.f36427f = zzfuh;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f36427f.isEmpty();
        mo46280a();
        ((ListIterator) this.f36419a).add(obj);
        zzfui.m51003k(this.f36427f.f36428o);
        if (isEmpty) {
            this.f36427f.mo46286c();
        }
    }

    public final boolean hasPrevious() {
        mo46280a();
        return ((ListIterator) this.f36419a).hasPrevious();
    }

    public final int nextIndex() {
        mo46280a();
        return ((ListIterator) this.f36419a).nextIndex();
    }

    public final Object previous() {
        mo46280a();
        return ((ListIterator) this.f36419a).previous();
    }

    public final int previousIndex() {
        mo46280a();
        return ((ListIterator) this.f36419a).previousIndex();
    }

    public final void set(Object obj) {
        mo46280a();
        ((ListIterator) this.f36419a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfug(zzfuh zzfuh, int i) {
        super(zzfuh, ((List) zzfuh.f36423c).listIterator(i));
        this.f36427f = zzfuh;
    }
}
