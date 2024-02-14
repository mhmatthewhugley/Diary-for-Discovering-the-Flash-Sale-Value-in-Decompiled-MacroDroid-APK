package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Util;

public class GeoPoint implements Comparable<GeoPoint> {

    /* renamed from: a */
    private final double f5703a;

    /* renamed from: c */
    private final double f5704c;

    /* renamed from: b */
    public int compareTo(@NonNull GeoPoint geoPoint) {
        int d = Util.m76521d(this.f5703a, geoPoint.f5703a);
        return d == 0 ? Util.m76521d(this.f5704c, geoPoint.f5704c) : d;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        if (this.f5703a == geoPoint.f5703a && this.f5704c == geoPoint.f5704c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5703a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5704c);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @NonNull
    public String toString() {
        return "GeoPoint { latitude=" + this.f5703a + ", longitude=" + this.f5704c + " }";
    }
}
