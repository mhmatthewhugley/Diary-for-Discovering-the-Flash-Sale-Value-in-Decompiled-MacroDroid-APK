package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.location.zzbe;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public interface Geofence {

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {

        /* renamed from: a */
        private String f45807a = null;
        @TransitionTypes

        /* renamed from: b */
        private int f45808b = 0;

        /* renamed from: c */
        private long f45809c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f45810d = -1;

        /* renamed from: e */
        private double f45811e;

        /* renamed from: f */
        private double f45812f;

        /* renamed from: g */
        private float f45813g;

        /* renamed from: h */
        private int f45814h = 0;

        /* renamed from: i */
        private int f45815i = -1;

        @NonNull
        /* renamed from: a */
        public Geofence mo54155a() {
            String str = this.f45807a;
            if (str != null) {
                int i = this.f45808b;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) == 0 || this.f45815i >= 0) {
                    long j = this.f45809c;
                    if (j == Long.MIN_VALUE) {
                        throw new IllegalArgumentException("Expiration not set.");
                    } else if (this.f45810d != -1) {
                        int i2 = this.f45814h;
                        if (i2 >= 0) {
                            return new zzbe(str, i, 1, this.f45811e, this.f45812f, this.f45813g, j, i2, this.f45815i);
                        }
                        throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                    } else {
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                } else {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        @NonNull
        /* renamed from: b */
        public Builder mo54156b(@FloatRange(from = -90.0d, mo592to = 90.0d) double d, @FloatRange(from = -180.0d, mo592to = 180.0d) double d2, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
            boolean z = false;
            boolean z2 = d >= -90.0d && d <= 90.0d;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            Preconditions.m4479b(z2, sb.toString());
            boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            Preconditions.m4479b(z3, sb2.toString());
            if (f > 0.0f) {
                z = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            Preconditions.m4479b(z, sb3.toString());
            this.f45810d = 1;
            this.f45811e = d;
            this.f45812f = d2;
            this.f45813g = f;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo54157c(long j) {
            if (j < 0) {
                this.f45809c = -1;
            } else {
                this.f45809c = DefaultClock.m4871d().mo21952c() + j;
            }
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder mo54158d(@IntRange(from = 0) int i) {
            this.f45814h = i;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo54159e(@NonNull String str) {
            this.f45807a = (String) Preconditions.m4489l(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        /* renamed from: f */
        public Builder mo54160f(@TransitionTypes int i) {
            this.f45808b = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface GeofenceTransition {
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface TransitionTypes {
    }

    @NonNull
    /* renamed from: f */
    String mo50588f();
}
