package com.google.android.gms.location.places;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.location.places.internal.zzd;

@Deprecated
public class AutocompletePredictionBuffer extends AbstractDataBuffer<AutocompletePrediction> implements Result {
    public AutocompletePredictionBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: c */
    public AutocompletePrediction get(int i) {
        return new zzd(this.f3506a, i);
    }

    public Status getStatus() {
        return PlacesStatusCodes.m64717b(this.f3506a.mo21571p2());
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a(NotificationCompat.CATEGORY_STATUS, getStatus()).toString();
    }
}
