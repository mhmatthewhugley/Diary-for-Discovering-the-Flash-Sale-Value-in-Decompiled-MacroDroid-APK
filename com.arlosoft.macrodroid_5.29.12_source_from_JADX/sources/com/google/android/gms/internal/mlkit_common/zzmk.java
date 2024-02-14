package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzmk implements zzmp {
    @VisibleForTesting

    /* renamed from: a */
    final List f43030a;

    public zzmk(Context context, zzmj zzmj) {
        ArrayList arrayList = new ArrayList();
        this.f43030a = arrayList;
        if (zzmj.mo51975c()) {
            arrayList.add(new zzmy(context, zzmj));
        }
    }

    /* renamed from: a */
    public final void mo52002a(zzmh zzmh) {
        for (zzmp a : this.f43030a) {
            a.mo52002a(zzmh);
        }
    }
}
