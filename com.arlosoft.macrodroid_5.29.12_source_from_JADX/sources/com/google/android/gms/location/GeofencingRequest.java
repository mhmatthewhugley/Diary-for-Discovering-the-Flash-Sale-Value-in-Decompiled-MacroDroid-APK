package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class GeofencingRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<zzbe> f45820a;
    @InitialTrigger
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45821c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f45822d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final String f45823f;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {

        /* renamed from: a */
        private final List<zzbe> f45824a = new ArrayList();
        @InitialTrigger

        /* renamed from: b */
        private int f45825b = 5;

        /* renamed from: c */
        private String f45826c = "";

        @NonNull
        /* renamed from: a */
        public Builder mo54172a(@NonNull Geofence geofence) {
            Preconditions.m4489l(geofence, "geofence can't be null.");
            Preconditions.m4479b(geofence instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f45824a.add((zzbe) geofence);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public GeofencingRequest mo54173b() {
            Preconditions.m4479b(!this.f45824a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f45824a, this.f45825b, this.f45826c, (String) null);
        }

        @NonNull
        /* renamed from: c */
        public Builder mo54174c(@InitialTrigger int i) {
            this.f45825b = i & 7;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param List<zzbe> list, @InitialTrigger @SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2) {
        this.f45820a = list;
        this.f45821c = i;
        this.f45822d = str;
        this.f45823f = str2;
    }

    @InitialTrigger
    /* renamed from: l2 */
    public int mo54168l2() {
        return this.f45821c;
    }

    @NonNull
    /* renamed from: m2 */
    public final GeofencingRequest mo54169m2(@Nullable String str) {
        return new GeofencingRequest(this.f45820a, this.f45821c, this.f45822d, str);
    }

    @NonNull
    public String toString() {
        return "GeofencingRequest[geofences=" + this.f45820a + ", initialTrigger=" + this.f45821c + ", tag=" + this.f45822d + ", attributionTag=" + this.f45823f + "]";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f45820a, false);
        SafeParcelWriter.m4576n(parcel, 2, mo54168l2());
        SafeParcelWriter.m4586x(parcel, 3, this.f45822d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f45823f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
