package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class RangingPosition {

    /* renamed from: a */
    private final RangingMeasurement f47841a;
    @Nullable

    /* renamed from: b */
    private final RangingMeasurement f47842b;
    @Nullable

    /* renamed from: c */
    private final RangingMeasurement f47843c;

    /* renamed from: d */
    private final long f47844d;

    public RangingPosition(@NonNull RangingMeasurement rangingMeasurement, @Nullable RangingMeasurement rangingMeasurement2, @Nullable RangingMeasurement rangingMeasurement3, long j) {
        this.f47841a = rangingMeasurement;
        this.f47842b = rangingMeasurement2;
        this.f47843c = rangingMeasurement3;
        this.f47844d = j;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        String format = String.format(locale, "elapsedRealtime (ms) %d | distance (m) %f", new Object[]{Long.valueOf(this.f47844d / 1000000), Float.valueOf(this.f47841a.mo56035a())});
        RangingMeasurement rangingMeasurement = this.f47842b;
        if (rangingMeasurement != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(locale, " | azimuth: %f", new Object[]{Float.valueOf(rangingMeasurement.mo56035a())})));
        }
        RangingMeasurement rangingMeasurement2 = this.f47843c;
        if (rangingMeasurement2 == null) {
            return format;
        }
        return String.valueOf(format).concat(String.valueOf(String.format(locale, " | elevation: %f", new Object[]{Float.valueOf(rangingMeasurement2.mo56035a())})));
    }
}
