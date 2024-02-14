package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzefb implements zzfii {

    /* renamed from: a */
    private final Map f33873a = new HashMap();

    /* renamed from: c */
    private final Map f33874c = new HashMap();

    /* renamed from: d */
    private final zzfiq f33875d;

    public zzefb(Set set, zzfiq zzfiq) {
        this.f33875d = zzfiq;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzefa zzefa = (zzefa) it.next();
            this.f33873a.put(zzefa.f33871b, zzefa.f33870a);
            this.f33874c.put(zzefa.f33872c, zzefa.f33870a);
        }
    }

    /* renamed from: a */
    public final void mo45028a(zzfib zzfib, String str) {
        this.f33875d.mo45775d("task.".concat(String.valueOf(str)));
        if (this.f33873a.containsKey(zzfib)) {
            this.f33875d.mo45775d("label.".concat(String.valueOf((String) this.f33873a.get(zzfib))));
        }
    }

    /* renamed from: b */
    public final void mo45029b(zzfib zzfib, String str) {
    }

    /* renamed from: c */
    public final void mo45030c(zzfib zzfib, String str) {
        this.f33875d.mo45776e("task.".concat(String.valueOf(str)), "s.");
        if (this.f33874c.containsKey(zzfib)) {
            this.f33875d.mo45776e("label.".concat(String.valueOf((String) this.f33874c.get(zzfib))), "s.");
        }
    }

    /* renamed from: e */
    public final void mo45031e(zzfib zzfib, String str, Throwable th) {
        this.f33875d.mo45776e("task.".concat(String.valueOf(str)), "f.");
        if (this.f33874c.containsKey(zzfib)) {
            this.f33875d.mo45776e("label.".concat(String.valueOf((String) this.f33874c.get(zzfib))), "f.");
        }
    }
}
