package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgtk extends zzgtu {
    zzgtk(int i) {
        super(i, (zzgtt) null);
    }

    /* renamed from: a */
    public final void mo47434a() {
        if (!mo47466j()) {
            for (int i = 0; i < mo47456b(); i++) {
                Map.Entry g = mo47463g(i);
                if (((zzgqu) g.getKey()).mo47282a()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo47457c()) {
                if (((zzgqu) entry.getKey()).mo47282a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo47434a();
    }
}
