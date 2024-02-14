package com.google.android.gms.wearable.internal;

import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdc implements DataEvent {

    /* renamed from: a */
    private final int f48238a;

    /* renamed from: c */
    private final DataItem f48239c;

    public final String toString() {
        int i = this.f48238a;
        String str = i == 1 ? "changed" : i == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String obj = this.f48239c.toString();
        return "DataEventEntity{ type=" + str + ", dataitem=" + obj + " }";
    }
}
