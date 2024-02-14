package com.google.android.gms.internal.places;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzde extends zzdb {
    zzde(int i) {
        super(i, (zzde) null);
    }

    /* renamed from: b */
    public final void mo53554b() {
        if (!mo53553a()) {
            for (int i = 0; i < mo53563k(); i++) {
                Map.Entry d = mo53557d(i);
                if (((zzax) d.getKey()).mo53429B()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : mo53564l()) {
                if (((zzax) entry.getKey()).mo53429B()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo53554b();
    }
}
