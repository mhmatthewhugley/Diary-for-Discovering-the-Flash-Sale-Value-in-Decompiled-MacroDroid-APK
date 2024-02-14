package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhr extends zzhn {
    public zzhr(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    /* renamed from: a2 */
    public final void mo56273a2(zzdn zzdn) {
        Status a = zzhf.m67093a(zzdn.f48252a);
        List<zzao> list = zzdn.f48253c;
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (zzao zzao : list) {
                hashMap.put(zzao.getName(), new zzac(zzao));
            }
        }
        mo56496t1(new zzad(a, hashMap));
    }
}
