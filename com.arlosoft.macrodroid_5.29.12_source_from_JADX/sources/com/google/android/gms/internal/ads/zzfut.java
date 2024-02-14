package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfut implements Iterator {

    /* renamed from: a */
    int f36441a;

    /* renamed from: c */
    int f36442c;

    /* renamed from: d */
    int f36443d = -1;

    /* renamed from: f */
    final /* synthetic */ zzfux f36444f;

    /* synthetic */ zzfut(zzfux zzfux, zzfup zzfup) {
        this.f36444f = zzfux;
        this.f36441a = zzfux.f36455g;
        this.f36442c = zzfux.mo46376g();
    }

    /* renamed from: b */
    private final void m51036b() {
        if (this.f36444f.f36455g != this.f36441a) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo46355a(int i);

    public final boolean hasNext() {
        return this.f36442c >= 0;
    }

    public final Object next() {
        m51036b();
        if (hasNext()) {
            int i = this.f36442c;
            this.f36443d = i;
            Object a = mo46355a(i);
            this.f36442c = this.f36444f.mo46378h(this.f36442c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m51036b();
        zzfsx.m50944i(this.f36443d >= 0, "no calls to next() since the last call to remove()");
        this.f36441a += 32;
        zzfux zzfux = this.f36444f;
        zzfux.remove(zzfux.m51049i(zzfux, this.f36443d));
        this.f36442c--;
        this.f36443d = -1;
    }
}
