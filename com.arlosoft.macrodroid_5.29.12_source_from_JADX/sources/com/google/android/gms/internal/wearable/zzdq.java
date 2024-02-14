package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdq extends zzea {
    zzdq(int i) {
        super(i, (zzdz) null);
    }

    /* renamed from: a */
    public final void mo54008a() {
        if (!mo54040j()) {
            for (int i = 0; i < mo54030b(); i++) {
                Map.Entry g = mo54037g(i);
                if (((zzbn) g.getKey()).mo53916a()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo54031c()) {
                if (((zzbn) entry.getKey()).mo53916a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo54008a();
    }
}
