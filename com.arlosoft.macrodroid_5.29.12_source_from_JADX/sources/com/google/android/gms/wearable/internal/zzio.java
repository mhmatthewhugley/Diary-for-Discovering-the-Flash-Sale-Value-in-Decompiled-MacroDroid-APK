package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEventBuffer;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzio implements ListenerHolder.Notifier {

    /* renamed from: a */
    final /* synthetic */ DataHolder f48402a;

    zzio(DataHolder dataHolder) {
        this.f48402a = dataHolder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        try {
            ((DataApi.DataListener) obj).mo56196e(new DataEventBuffer(this.f48402a));
        } finally {
            this.f48402a.close();
        }
    }

    /* renamed from: b */
    public final void mo21338b() {
        this.f48402a.close();
    }
}
