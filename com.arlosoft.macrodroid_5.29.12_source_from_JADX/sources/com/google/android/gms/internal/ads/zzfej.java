package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfej {
    /* renamed from: a */
    public static zzq m50010a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfdl zzfdl = (zzfdl) it.next();
            if (zzfdl.f35563c) {
                arrayList.add(AdSize.f1682p);
            } else {
                arrayList.add(new AdSize(zzfdl.f35561a, zzfdl.f35562b));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    /* renamed from: b */
    public static zzfdl m50011b(List list, zzfdl zzfdl) {
        return (zzfdl) list.get(0);
    }

    /* renamed from: c */
    public static zzfdl m50012c(zzq zzq) {
        return zzq.f2033z ? new zzfdl(-3, 0, true) : new zzfdl(zzq.f2029g, zzq.f2026c, false);
    }
}
