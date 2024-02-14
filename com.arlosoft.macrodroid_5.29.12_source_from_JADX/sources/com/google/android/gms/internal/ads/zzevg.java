package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzevg implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f35002a;

    /* renamed from: c */
    public final /* synthetic */ Object f35003c;

    public /* synthetic */ zzevg(List list, Object obj) {
        this.f35002a = list;
        this.f35003c = obj;
    }

    public final Object call() {
        List<zzfzp> list = this.f35002a;
        Object obj = this.f35003c;
        for (zzfzp zzfzp : list) {
            zzevd zzevd = (zzevd) zzfzp.get();
            if (zzevd != null) {
                zzevd.mo45422d(obj);
            }
        }
        return obj;
    }
}
