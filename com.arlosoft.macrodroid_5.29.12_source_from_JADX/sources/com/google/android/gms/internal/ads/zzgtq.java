package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtq implements Iterator {

    /* renamed from: a */
    private int f37272a = -1;

    /* renamed from: c */
    private boolean f37273c;

    /* renamed from: d */
    private Iterator f37274d;

    /* renamed from: f */
    final /* synthetic */ zzgtu f37275f;

    /* synthetic */ zzgtq(zzgtu zzgtu, zzgtp zzgtp) {
        this.f37275f = zzgtu;
    }

    /* renamed from: a */
    private final Iterator m53319a() {
        if (this.f37274d == null) {
            this.f37274d = this.f37275f.f37279d.entrySet().iterator();
        }
        return this.f37274d;
    }

    public final boolean hasNext() {
        if (this.f37272a + 1 >= this.f37275f.f37278c.size()) {
            return !this.f37275f.f37279d.isEmpty() && m53319a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f37273c = true;
        int i = this.f37272a + 1;
        this.f37272a = i;
        if (i < this.f37275f.f37278c.size()) {
            return (Map.Entry) this.f37275f.f37278c.get(this.f37272a);
        }
        return (Map.Entry) m53319a().next();
    }

    public final void remove() {
        if (this.f37273c) {
            this.f37273c = false;
            this.f37275f.m53327n();
            if (this.f37272a < this.f37275f.f37278c.size()) {
                zzgtu zzgtu = this.f37275f;
                int i = this.f37272a;
                this.f37272a = i - 1;
                Object unused = zzgtu.m53325l(i);
                return;
            }
            m53319a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
