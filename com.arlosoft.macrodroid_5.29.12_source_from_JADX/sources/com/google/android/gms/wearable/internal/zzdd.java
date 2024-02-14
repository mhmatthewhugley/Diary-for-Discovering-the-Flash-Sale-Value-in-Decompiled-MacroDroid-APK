package com.google.android.gms.wearable.internal;

import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdd extends DataBufferRef implements DataEvent {

    /* renamed from: f */
    private final int f48240f;

    public zzdd(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f48240f = i2;
    }

    /* renamed from: h */
    public final DataItem mo56343h() {
        return new zzdk(this.f3516a, this.f3517c, this.f48240f);
    }

    public final String toString() {
        String str = mo21556c("event_type") == 1 ? "changed" : mo21556c("event_type") == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String obj = mo56343h().toString();
        return "DataEventRef{ type=" + str + ", dataitem=" + obj + " }";
    }
}
