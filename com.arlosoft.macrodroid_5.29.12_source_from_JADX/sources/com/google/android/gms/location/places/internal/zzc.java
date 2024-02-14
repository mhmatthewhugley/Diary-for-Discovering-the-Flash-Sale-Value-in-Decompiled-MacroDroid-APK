package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzc extends AbstractSafeParcelable implements AutocompletePrediction {

    /* renamed from: A */
    private static final List<zzb> f45996A = Collections.emptyList();
    public static final Parcelable.Creator<zzc> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45997a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f45998c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final List<Integer> f45999d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<zzb> f46000f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f46001g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f46002o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final List<zzb> f46003p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final String f46004s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final List<zzb> f46005z;

    @SafeParcelable.Constructor
    zzc(@SafeParcelable.Param String str, @SafeParcelable.Param List<Integer> list, @SafeParcelable.Param int i, @SafeParcelable.Param String str2, @SafeParcelable.Param List<zzb> list2, @SafeParcelable.Param String str3, @SafeParcelable.Param List<zzb> list3, @SafeParcelable.Param String str4, @SafeParcelable.Param List<zzb> list4) {
        this.f45998c = str;
        this.f45999d = list;
        this.f46001g = i;
        this.f45997a = str2;
        this.f46000f = list2;
        this.f46002o = str3;
        this.f46003p = list3;
        this.f46004s = str4;
        this.f46005z = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzc = (zzc) obj;
        return Objects.m4470a(this.f45998c, zzc.f45998c) && Objects.m4470a(this.f45999d, zzc.f45999d) && Objects.m4470a(Integer.valueOf(this.f46001g), Integer.valueOf(zzc.f46001g)) && Objects.m4470a(this.f45997a, zzc.f45997a) && Objects.m4470a(this.f46000f, zzc.f46000f) && Objects.m4470a(this.f46002o, zzc.f46002o) && Objects.m4470a(this.f46003p, zzc.f46003p) && Objects.m4470a(this.f46004s, zzc.f46004s) && Objects.m4470a(this.f46005z, zzc.f46005z);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45998c, this.f45999d, Integer.valueOf(this.f46001g), this.f45997a, this.f46000f, this.f46002o, this.f46003p, this.f46004s, this.f46005z);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("placeId", this.f45998c).mo21720a("placeTypes", this.f45999d).mo21720a("fullText", this.f45997a).mo21720a("fullTextMatchedSubstrings", this.f46000f).mo21720a("primaryText", this.f46002o).mo21720a("primaryTextMatchedSubstrings", this.f46003p).mo21720a("secondaryText", this.f46004s).mo21720a("secondaryTextMatchedSubstrings", this.f46005z).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f45997a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f45998c, false);
        SafeParcelWriter.m4578p(parcel, 3, this.f45999d, false);
        SafeParcelWriter.m4558B(parcel, 4, this.f46000f, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f46001g);
        SafeParcelWriter.m4586x(parcel, 6, this.f46002o, false);
        SafeParcelWriter.m4558B(parcel, 7, this.f46003p, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f46004s, false);
        SafeParcelWriter.m4558B(parcel, 9, this.f46005z, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
