package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhw extends zzhn {
    public zzhw(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    /* renamed from: J1 */
    public final void mo56257J1(zzeh zzeh) {
        ArrayList arrayList = new ArrayList();
        List list = zzeh.f48274c;
        if (list != null) {
            arrayList.addAll(list);
        }
        mo56496t1(new zzgb(zzhf.m67093a(zzeh.f48273a), arrayList));
    }
}
