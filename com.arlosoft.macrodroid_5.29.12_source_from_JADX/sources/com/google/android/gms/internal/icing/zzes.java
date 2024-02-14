package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzes extends zzez {
    zzes(int i) {
        super(i, (zzes) null);
    }

    /* renamed from: a */
    public final void mo50367a() {
        if (!mo50389b()) {
            for (int i = 0; i < mo50390c(); i++) {
                Map.Entry d = mo50393d(i);
                if (((zzct) d.getKey()).mo50291a()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : mo50394e()) {
                if (((zzct) entry.getKey()).mo50291a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo50367a();
    }
}
