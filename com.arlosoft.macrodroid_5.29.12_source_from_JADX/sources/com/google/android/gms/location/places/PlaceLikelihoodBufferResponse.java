package com.google.android.gms.location.places;

import com.google.android.gms.common.api.DataBufferResponse;
import com.google.android.gms.common.internal.ShowFirstParty;

@Deprecated
public class PlaceLikelihoodBufferResponse extends DataBufferResponse<PlaceLikelihood, PlaceLikelihoodBuffer> {
    PlaceLikelihoodBufferResponse() {
    }

    @ShowFirstParty
    public String toString() {
        return ((PlaceLikelihoodBuffer) mo21278c()).toString();
    }
}
