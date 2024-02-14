package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Response;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    public LocationSettingsResponse(@NonNull LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
