package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f32686a;

    /* renamed from: c */
    public final /* synthetic */ int f32687c;

    /* renamed from: d */
    public final /* synthetic */ zzdq f32688d;

    public /* synthetic */ zzdp(CopyOnWriteArraySet copyOnWriteArraySet, int i, zzdq zzdq) {
        this.f32686a = copyOnWriteArraySet;
        this.f32687c = i;
        this.f32688d = zzdq;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f32686a;
        int i = this.f32687c;
        zzdq zzdq = this.f32688d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzds) it.next()).mo44946a(i, zzdq);
        }
    }
}
