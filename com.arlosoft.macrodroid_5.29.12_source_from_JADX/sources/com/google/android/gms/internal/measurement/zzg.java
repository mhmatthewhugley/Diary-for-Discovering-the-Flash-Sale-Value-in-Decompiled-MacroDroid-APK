package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzg {

    /* renamed from: a */
    public final zzg f41448a;

    /* renamed from: b */
    final zzax f41449b;

    /* renamed from: c */
    final Map f41450c = new HashMap();

    /* renamed from: d */
    final Map f41451d = new HashMap();

    public zzg(zzg zzg, zzax zzax) {
        this.f41448a = zzg;
        this.f41449b = zzax;
    }

    /* renamed from: a */
    public final zzg mo51054a() {
        return new zzg(this, this.f41449b);
    }

    /* renamed from: b */
    public final zzap mo51055b(zzap zzap) {
        return this.f41449b.mo50762a(this, zzap);
    }

    /* renamed from: c */
    public final zzap mo51056c(zzae zzae) {
        zzap zzap = zzap.f41197i;
        Iterator o = zzae.mo50717o();
        while (o.hasNext()) {
            zzap = this.f41449b.mo50762a(this, zzae.mo50715m(((Integer) o.next()).intValue()));
            if (zzap instanceof zzag) {
                break;
            }
        }
        return zzap;
    }

    /* renamed from: d */
    public final zzap mo51057d(String str) {
        if (this.f41450c.containsKey(str)) {
            return (zzap) this.f41450c.get(str);
        }
        zzg zzg = this.f41448a;
        if (zzg != null) {
            return zzg.mo51057d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo51058e(String str, zzap zzap) {
        if (!this.f41451d.containsKey(str)) {
            if (zzap == null) {
                this.f41450c.remove(str);
            } else {
                this.f41450c.put(str, zzap);
            }
        }
    }

    /* renamed from: f */
    public final void mo51059f(String str, zzap zzap) {
        mo51058e(str, zzap);
        this.f41451d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo51060g(String str, zzap zzap) {
        zzg zzg;
        if (!this.f41450c.containsKey(str) && (zzg = this.f41448a) != null && zzg.mo51061h(str)) {
            this.f41448a.mo51060g(str, zzap);
        } else if (!this.f41451d.containsKey(str)) {
            if (zzap == null) {
                this.f41450c.remove(str);
            } else {
                this.f41450c.put(str, zzap);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo51061h(String str) {
        if (this.f41450c.containsKey(str)) {
            return true;
        }
        zzg zzg = this.f41448a;
        if (zzg != null) {
            return zzg.mo51061h(str);
        }
        return false;
    }
}
