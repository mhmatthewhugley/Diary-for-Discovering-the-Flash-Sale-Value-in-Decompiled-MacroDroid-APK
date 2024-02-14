package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzwf {

    /* renamed from: a */
    private final CopyOnWriteArrayList f38775a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo48333a(Handler handler, zzwg zzwg) {
        mo48335c(zzwg);
        this.f38775a.add(new zzwe(handler, zzwg));
    }

    /* renamed from: b */
    public final void mo48334b(int i, long j, long j2) {
        Iterator it = this.f38775a.iterator();
        while (it.hasNext()) {
            zzwe zzwe = (zzwe) it.next();
            if (!zzwe.f38774c) {
                zzwe.f38772a.post(new zzwd(zzwe, i, j, j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo48335c(zzwg zzwg) {
        Iterator it = this.f38775a.iterator();
        while (it.hasNext()) {
            zzwe zzwe = (zzwe) it.next();
            if (zzwe.f38773b == zzwg) {
                zzwe.mo48332c();
                this.f38775a.remove(zzwe);
            }
        }
    }
}
