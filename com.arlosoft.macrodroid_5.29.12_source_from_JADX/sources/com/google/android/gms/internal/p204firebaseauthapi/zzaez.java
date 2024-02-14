package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaez */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaez extends zzafj {
    zzaez(int i) {
        super(i, (zzafi) null);
    }

    /* renamed from: a */
    public final void mo49155a() {
        if (!mo49188j()) {
            for (int i = 0; i < mo49178b(); i++) {
                Map.Entry g = mo49185g(i);
                if (((zzacw) g.getKey()).mo49049a()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo49179c()) {
                if (((zzacw) entry.getKey()).mo49049a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo49155a();
    }
}
