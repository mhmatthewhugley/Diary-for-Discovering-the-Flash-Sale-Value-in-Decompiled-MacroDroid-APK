package com.google.android.gms.location.places;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.Freezable;

public interface Place extends Freezable<Place> {

    @KeepForSdk
    public interface ExtendedDetails {
    }

    CharSequence getName();
}
