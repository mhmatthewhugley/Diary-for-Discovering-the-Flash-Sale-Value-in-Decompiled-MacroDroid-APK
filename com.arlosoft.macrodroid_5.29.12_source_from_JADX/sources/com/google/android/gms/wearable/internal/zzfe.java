package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfe extends zzhn {

    /* renamed from: c */
    private final WeakReference f48288c;

    /* renamed from: d */
    private final WeakReference f48289d;

    zzfe(Map map, Object obj, BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
        this.f48288c = new WeakReference(map);
        this.f48289d = new WeakReference(obj);
    }

    /* renamed from: W9 */
    public final void mo56268W9(Status status) {
        Map map = (Map) this.f48288c.get();
        Object obj = this.f48289d.get();
        if (!(status.getStatus().mo21294n2() != 4002 || map == null || obj == null)) {
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
