package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzba extends AbstractSafeParcelable {

    /* renamed from: C */
    static final List<ClientIdentity> f41100C = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    String f41101A;
    @SafeParcelable.Field

    /* renamed from: B */
    long f41102B;
    @SafeParcelable.Field

    /* renamed from: a */
    final LocationRequest f41103a;
    @SafeParcelable.Field

    /* renamed from: c */
    final List<ClientIdentity> f41104c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final String f41105d;
    @SafeParcelable.Field

    /* renamed from: f */
    final boolean f41106f;
    @SafeParcelable.Field

    /* renamed from: g */
    final boolean f41107g;
    @SafeParcelable.Field

    /* renamed from: o */
    final boolean f41108o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    final String f41109p;
    @SafeParcelable.Field

    /* renamed from: s */
    final boolean f41110s;
    @SafeParcelable.Field

    /* renamed from: z */
    boolean f41111z;

    @SafeParcelable.Constructor
    zzba(@SafeParcelable.Param LocationRequest locationRequest, @SafeParcelable.Param List<ClientIdentity> list, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z4, @SafeParcelable.Param boolean z5, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param long j) {
        this.f41103a = locationRequest;
        this.f41104c = list;
        this.f41105d = str;
        this.f41106f = z;
        this.f41107g = z2;
        this.f41108o = z3;
        this.f41109p = str2;
        this.f41110s = z4;
        this.f41111z = z5;
        this.f41101A = str3;
        this.f41102B = j;
    }

    /* renamed from: l2 */
    public static zzba m59254l2(@Nullable String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, f41100C, (String) null, false, false, false, (String) null, false, false, (String) null, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzba) {
            zzba zzba = (zzba) obj;
            if (!Objects.m4470a(this.f41103a, zzba.f41103a) || !Objects.m4470a(this.f41104c, zzba.f41104c) || !Objects.m4470a(this.f41105d, zzba.f41105d) || this.f41106f != zzba.f41106f || this.f41107g != zzba.f41107g || this.f41108o != zzba.f41108o || !Objects.m4470a(this.f41109p, zzba.f41109p) || this.f41110s != zzba.f41110s || this.f41111z != zzba.f41111z || !Objects.m4470a(this.f41101A, zzba.f41101A)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41103a.hashCode();
    }

    /* renamed from: m2 */
    public final zzba mo50579m2(@Nullable String str) {
        this.f41101A = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41103a);
        if (this.f41105d != null) {
            sb.append(" tag=");
            sb.append(this.f41105d);
        }
        if (this.f41109p != null) {
            sb.append(" moduleId=");
            sb.append(this.f41109p);
        }
        if (this.f41101A != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f41101A);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f41106f);
        sb.append(" clients=");
        sb.append(this.f41104c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f41107g);
        if (this.f41108o) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f41110s) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f41111z) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f41103a, i, false);
        SafeParcelWriter.m4558B(parcel, 5, this.f41104c, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f41105d, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f41106f);
        SafeParcelWriter.m4565c(parcel, 8, this.f41107g);
        SafeParcelWriter.m4565c(parcel, 9, this.f41108o);
        SafeParcelWriter.m4586x(parcel, 10, this.f41109p, false);
        SafeParcelWriter.m4565c(parcel, 11, this.f41110s);
        SafeParcelWriter.m4565c(parcel, 12, this.f41111z);
        SafeParcelWriter.m4586x(parcel, 13, this.f41101A, false);
        SafeParcelWriter.m4581s(parcel, 14, this.f41102B);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
