package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzar;

@Deprecated
public class PlaceBuffer extends AbstractDataBuffer<Place> implements Result {

    /* renamed from: c */
    private final Status f45894c;

    /* renamed from: d */
    private final String f45895d;

    public PlaceBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.f45894c = PlacesStatusCodes.m64717b(dataHolder.mo21571p2());
        if (dataHolder.mo21570o2() != null) {
            this.f45895d = dataHolder.mo21570o2().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        } else {
            this.f45895d = null;
        }
    }

    /* renamed from: c */
    public Place get(int i) {
        return new zzar(this.f3506a, i);
    }

    public Status getStatus() {
        return this.f45894c;
    }
}
