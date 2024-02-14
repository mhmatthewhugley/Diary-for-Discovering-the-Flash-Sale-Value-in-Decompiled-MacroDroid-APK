package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.Map;

final class zzdj implements Iterator {

    /* renamed from: a */
    private int f45374a;

    /* renamed from: c */
    private boolean f45375c;

    /* renamed from: d */
    private Iterator f45376d;

    /* renamed from: f */
    private final /* synthetic */ zzdb f45377f;

    private zzdj(zzdb zzdb) {
        this.f45377f = zzdb;
        this.f45374a = -1;
    }

    /* renamed from: a */
    private final Iterator m63613a() {
        if (this.f45376d == null) {
            this.f45376d = this.f45377f.f45359d.entrySet().iterator();
        }
        return this.f45376d;
    }

    public final boolean hasNext() {
        if (this.f45374a + 1 < this.f45377f.f45358c.size() || (!this.f45377f.f45359d.isEmpty() && m63613a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f45375c = true;
        int i = this.f45374a + 1;
        this.f45374a = i;
        if (i < this.f45377f.f45358c.size()) {
            return (Map.Entry) this.f45377f.f45358c.get(this.f45374a);
        }
        return (Map.Entry) m63613a().next();
    }

    public final void remove() {
        if (this.f45375c) {
            this.f45375c = false;
            this.f45377f.m63542n();
            if (this.f45374a < this.f45377f.f45358c.size()) {
                zzdb zzdb = this.f45377f;
                int i = this.f45374a;
                this.f45374a = i - 1;
                Object unused = zzdb.m63537e(i);
                return;
            }
            m63613a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ zzdj(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
