package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdw implements Iterator {

    /* renamed from: a */
    private int f45712a = -1;

    /* renamed from: c */
    private boolean f45713c;

    /* renamed from: d */
    private Iterator f45714d;

    /* renamed from: f */
    final /* synthetic */ zzea f45715f;

    /* synthetic */ zzdw(zzea zzea, zzdv zzdv) {
        this.f45715f = zzea;
    }

    /* renamed from: a */
    private final Iterator m64410a() {
        if (this.f45714d == null) {
            this.f45714d = this.f45715f.f45719d.entrySet().iterator();
        }
        return this.f45714d;
    }

    public final boolean hasNext() {
        if (this.f45712a + 1 >= this.f45715f.f45718c.size()) {
            return !this.f45715f.f45719d.isEmpty() && m64410a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f45713c = true;
        int i = this.f45712a + 1;
        this.f45712a = i;
        if (i < this.f45715f.f45718c.size()) {
            return (Map.Entry) this.f45715f.f45718c.get(this.f45712a);
        }
        return (Map.Entry) m64410a().next();
    }

    public final void remove() {
        if (this.f45713c) {
            this.f45713c = false;
            this.f45715f.m64418n();
            if (this.f45712a < this.f45715f.f45718c.size()) {
                zzea zzea = this.f45715f;
                int i = this.f45712a;
                this.f45712a = i - 1;
                Object unused = zzea.m64416l(i);
                return;
            }
            m64410a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
