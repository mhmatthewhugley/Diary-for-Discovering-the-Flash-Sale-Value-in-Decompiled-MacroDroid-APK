package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzpm implements zzpr {
    @VisibleForTesting

    /* renamed from: a */
    final List f44418a;

    public zzpm(Context context, zzpl zzpl) {
        ArrayList arrayList = new ArrayList();
        this.f44418a = arrayList;
        if (zzpl.mo52409c()) {
            arrayList.add(new zzqc(context, zzpl));
        }
    }

    /* renamed from: a */
    public final void mo52436a(zzpj zzpj) {
        for (zzpr a : this.f44418a) {
            a.mo52436a(zzpj);
        }
    }
}
