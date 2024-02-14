package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @VisibleForTesting

    /* renamed from: f */
    static final List<ClientIdentity> f41145f = Collections.emptyList();

    /* renamed from: g */
    static final zzs f41146g = new zzs();
    @SafeParcelable.Field

    /* renamed from: a */
    final zzs f41147a;
    @SafeParcelable.Field

    /* renamed from: c */
    final List<ClientIdentity> f41148c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final String f41149d;

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param zzs zzs, @SafeParcelable.Param List<ClientIdentity> list, @SafeParcelable.Param String str) {
        this.f41147a = zzs;
        this.f41148c = list;
        this.f41149d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!Objects.m4470a(this.f41147a, zzj.f41147a) || !Objects.m4470a(this.f41148c, zzj.f41148c) || !Objects.m4470a(this.f41149d, zzj.f41149d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41147a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f41147a);
        String valueOf2 = String.valueOf(this.f41148c);
        String str = this.f41149d;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f41147a, i, false);
        SafeParcelWriter.m4558B(parcel, 2, this.f41148c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f41149d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
