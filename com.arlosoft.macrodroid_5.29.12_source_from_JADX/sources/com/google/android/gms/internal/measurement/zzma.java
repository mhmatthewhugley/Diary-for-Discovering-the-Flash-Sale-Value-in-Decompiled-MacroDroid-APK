package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzma extends zzmk {
    zzma(int i) {
        super(i, (zzmj) null);
    }

    /* renamed from: a */
    public final void mo51523a() {
        if (!mo51555j()) {
            for (int i = 0; i < mo51545b(); i++) {
                Map.Entry g = mo51552g(i);
                if (((zzjv) g.getKey()).mo51420a()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo51546c()) {
                if (((zzjv) entry.getKey()).mo51420a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo51523a();
    }
}
