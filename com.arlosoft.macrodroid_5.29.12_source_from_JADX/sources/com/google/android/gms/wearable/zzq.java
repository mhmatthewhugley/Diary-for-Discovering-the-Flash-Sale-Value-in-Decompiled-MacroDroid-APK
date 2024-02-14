package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DataHolder f48478a;

    /* renamed from: c */
    final /* synthetic */ zzaa f48479c;

    zzq(zzaa zzaa, DataHolder dataHolder) {
        this.f48479c = zzaa;
        this.f48478a = dataHolder;
    }

    public final void run() {
        DataEventBuffer dataEventBuffer = new DataEventBuffer(this.f48478a);
        try {
            this.f48479c.f48453c.mo56196e(dataEventBuffer);
        } finally {
            dataEventBuffer.release();
        }
    }
}
