package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzuu implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ zzuu f38646a = new zzuu();

    private /* synthetic */ zzuu() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        zzfvc i = zzfvc.m51088i();
        zzvo zzvo = zzvo.f38720a;
        zzfvc b = i.mo46396c((zzvq) Collections.max(list, zzvo), (zzvq) Collections.max(list2, zzvo), zzvo).mo46395b(list.size(), list2.size());
        zzvp zzvp = zzvp.f38721a;
        return b.mo46396c((zzvq) Collections.max(list, zzvp), (zzvq) Collections.max(list2, zzvp), zzvp).mo46394a();
    }
}
