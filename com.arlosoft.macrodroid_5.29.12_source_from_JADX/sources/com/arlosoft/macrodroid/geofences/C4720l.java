package com.arlosoft.macrodroid.geofences;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.arlosoft.macrodroid.geofences.l */
/* compiled from: LocationHelper */
public class C4720l {
    /* renamed from: a */
    public static int m18287a(GoogleMap googleMap, LatLng latLng, float f) {
        Location location = new Location("");
        location.setLatitude(latLng.f46263a);
        location.setLongitude(latLng.f46264c);
        Location location2 = new Location("");
        location2.setLatitude(latLng.f46263a);
        location2.setLongitude(latLng.f46264c + 0.5d);
        double distanceTo = ((double) f) * (0.5d / ((double) location.distanceTo(location2)));
        Projection d = googleMap.mo54448d();
        return Math.abs(d.mo54531a(new LatLng(latLng.f46263a, latLng.f46264c + distanceTo)).x - d.mo54531a(latLng).x);
    }
}
