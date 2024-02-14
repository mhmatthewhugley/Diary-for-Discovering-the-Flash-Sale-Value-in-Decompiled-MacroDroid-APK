package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmg implements Iterator {

    /* renamed from: a */
    private int f41714a = -1;

    /* renamed from: c */
    private boolean f41715c;

    /* renamed from: d */
    private Iterator f41716d;

    /* renamed from: f */
    final /* synthetic */ zzmk f41717f;

    /* synthetic */ zzmg(zzmk zzmk, zzmf zzmf) {
        this.f41717f = zzmk;
    }

    /* renamed from: a */
    private final Iterator m60758a() {
        if (this.f41716d == null) {
            this.f41716d = this.f41717f.f41721d.entrySet().iterator();
        }
        return this.f41716d;
    }

    public final boolean hasNext() {
        if (this.f41714a + 1 >= this.f41717f.f41720c.size()) {
            return !this.f41717f.f41721d.isEmpty() && m60758a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f41715c = true;
        int i = this.f41714a + 1;
        this.f41714a = i;
        if (i < this.f41717f.f41720c.size()) {
            return (Map.Entry) this.f41717f.f41720c.get(this.f41714a);
        }
        return (Map.Entry) m60758a().next();
    }

    public final void remove() {
        if (this.f41715c) {
            this.f41715c = false;
            this.f41717f.m60766n();
            if (this.f41714a < this.f41717f.f41720c.size()) {
                zzmk zzmk = this.f41717f;
                int i = this.f41714a;
                this.f41714a = i - 1;
                Object unused = zzmk.m60764l(i);
                return;
            }
            m60758a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
