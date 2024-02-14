package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzao extends zzai {

    /* renamed from: d */
    protected final List f41194d;

    /* renamed from: f */
    protected final List f41195f;

    /* renamed from: g */
    protected zzg f41196g;

    private zzao(zzao zzao) {
        super(zzao.f41190a);
        ArrayList arrayList = new ArrayList(zzao.f41194d.size());
        this.f41194d = arrayList;
        arrayList.addAll(zzao.f41194d);
        ArrayList arrayList2 = new ArrayList(zzao.f41195f.size());
        this.f41195f = arrayList2;
        arrayList2.addAll(zzao.f41195f);
        this.f41196g = zzao.f41196g;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        zzg a = this.f41196g.mo51054a();
        for (int i = 0; i < this.f41194d.size(); i++) {
            if (i < list.size()) {
                a.mo51058e((String) this.f41194d.get(i), zzg.mo51055b((zzap) list.get(i)));
            } else {
                a.mo51058e((String) this.f41194d.get(i), zzap.f41197i);
            }
        }
        for (zzap zzap : this.f41195f) {
            zzap b = a.mo51055b(zzap);
            if (b instanceof zzaq) {
                b = a.mo51055b(zzap);
            }
            if (b instanceof zzag) {
                return ((zzag) b).mo50728a();
            }
        }
        return zzap.f41197i;
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzg) {
        super(str);
        this.f41194d = new ArrayList();
        this.f41196g = zzg;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f41194d.add(((zzap) it.next()).mo50707g());
            }
        }
        this.f41195f = new ArrayList(list2);
    }
}
