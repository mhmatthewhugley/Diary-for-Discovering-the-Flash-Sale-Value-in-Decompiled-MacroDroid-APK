package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfd extends zzhn {

    /* renamed from: c */
    private final WeakReference f48286c;

    /* renamed from: d */
    private final WeakReference f48287d;

    zzfd(Map map, Object obj, BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
        this.f48286c = new WeakReference(map);
        this.f48287d = new WeakReference(obj);
    }

    /* renamed from: W9 */
    public final void mo56268W9(Status status) {
        Map map = (Map) this.f48286c.get();
        Object obj = this.f48287d.get();
        if (!(status.getStatus().mo21297q2() || map == null || obj == null)) {
            synchronized (map) {
                zzit zzit = (zzit) map.remove(obj);
                if (zzit != null) {
                    zzit.mo56519p();
                }
            }
        }
        mo56496t1(status);
    }
}
