package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzex implements Iterator<Map.Entry> {

    /* renamed from: a */
    private int f40956a = -1;

    /* renamed from: c */
    private boolean f40957c;

    /* renamed from: d */
    private Iterator<Map.Entry> f40958d;

    /* renamed from: f */
    final /* synthetic */ zzez f40959f;

    /* synthetic */ zzex(zzez zzez, zzes zzes) {
        this.f40959f = zzez;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m58993a() {
        if (this.f40958d == null) {
            this.f40958d = this.f40959f.f40963d.entrySet().iterator();
        }
        return this.f40958d;
    }

    public final boolean hasNext() {
        if (this.f40956a + 1 >= this.f40959f.f40962c.size()) {
            return !this.f40959f.f40963d.isEmpty() && m58993a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f40957c = true;
        int i = this.f40956a + 1;
        this.f40956a = i;
        if (i < this.f40959f.f40962c.size()) {
            return (Map.Entry) this.f40959f.f40962c.get(this.f40956a);
        }
        return m58993a().next();
    }

    public final void remove() {
        if (this.f40957c) {
            this.f40957c = false;
            this.f40959f.m59000m();
            if (this.f40956a < this.f40959f.f40962c.size()) {
                zzez zzez = this.f40959f;
                int i = this.f40956a;
                this.f40956a = i - 1;
                Object unused = zzez.m58998k(i);
                return;
            }
            m58993a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
