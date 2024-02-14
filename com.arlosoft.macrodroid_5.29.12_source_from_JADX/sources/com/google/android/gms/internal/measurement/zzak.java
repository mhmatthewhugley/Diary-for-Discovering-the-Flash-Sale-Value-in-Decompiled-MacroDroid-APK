package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzak implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f41192a;

    zzak(Iterator it) {
        this.f41192a = it;
    }

    public final boolean hasNext() {
        return this.f41192a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f41192a.next());
    }
}
