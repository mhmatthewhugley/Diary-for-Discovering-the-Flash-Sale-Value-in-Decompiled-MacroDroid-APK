package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
public class GeoDataClient extends GoogleApi<PlacesOptions> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoundsMode {
    }
}
