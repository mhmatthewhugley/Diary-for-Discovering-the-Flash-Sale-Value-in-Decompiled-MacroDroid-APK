package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzbg();

    /* renamed from: c */
    static final List<Location> f45841c = Collections.emptyList();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<Location> f45842a;

    @SafeParcelable.Constructor
    LocationResult(@SafeParcelable.Param List<Location> list) {
        this.f45842a = list;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f45842a.size() != this.f45842a.size()) {
            return false;
        }
        Iterator<Location> it = this.f45842a.iterator();
        for (Location time : locationResult.f45842a) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.f45842a) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    @NonNull
    /* renamed from: l2 */
    public Location mo54193l2() {
        int size = this.f45842a.size();
        if (size == 0) {
            return null;
        }
        return this.f45842a.get(size - 1);
    }

    @NonNull
    /* renamed from: m2 */
    public List<Location> mo54194m2() {
        return this.f45842a;
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.f45842a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, mo54194m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
