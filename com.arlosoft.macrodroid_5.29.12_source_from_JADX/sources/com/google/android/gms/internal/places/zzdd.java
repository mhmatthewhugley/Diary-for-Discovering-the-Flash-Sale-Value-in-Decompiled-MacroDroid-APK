package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzdd implements Iterator {

    /* renamed from: a */
    private int f45368a;

    /* renamed from: c */
    private Iterator f45369c;

    /* renamed from: d */
    private final /* synthetic */ zzdb f45370d;

    private zzdd(zzdb zzdb) {
        this.f45370d = zzdb;
        this.f45368a = zzdb.f45358c.size();
    }

    /* renamed from: a */
    private final Iterator m63609a() {
        if (this.f45369c == null) {
            this.f45369c = this.f45370d.f45362o.entrySet().iterator();
        }
        return this.f45369c;
    }

    public final boolean hasNext() {
        int i = this.f45368a;
        return (i > 0 && i <= this.f45370d.f45358c.size()) || m63609a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m63609a().hasNext()) {
            return (Map.Entry) m63609a().next();
        }
        List j = this.f45370d.f45358c;
        int i = this.f45368a - 1;
        this.f45368a = i;
        return (Map.Entry) j.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ zzdd(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
