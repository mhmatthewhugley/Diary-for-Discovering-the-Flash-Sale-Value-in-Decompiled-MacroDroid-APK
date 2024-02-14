package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f48434a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f48435c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zziv f48436d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f48437f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public final String f48438g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final Float f48439o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final zzs f48440p;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zziv zziv, @SafeParcelable.Param String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable Float f, @SafeParcelable.Param @Nullable zzs zzs) {
        this.f48434a = str;
        this.f48435c = str2;
        this.f48436d = zziv;
        this.f48437f = str3;
        this.f48438g = str4;
        this.f48439o = f;
        this.f48440p = zzs;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzo = (zzo) obj;
            return zzn.m67185a(this.f48434a, zzo.f48434a) && zzn.m67185a(this.f48435c, zzo.f48435c) && zzn.m67185a(this.f48436d, zzo.f48436d) && zzn.m67185a(this.f48437f, zzo.f48437f) && zzn.m67185a(this.f48438g, zzo.f48438g) && zzn.m67185a(this.f48439o, zzo.f48439o) && zzn.m67185a(this.f48440p, zzo.f48440p);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48434a, this.f48435c, this.f48436d, this.f48437f, this.f48438g, this.f48439o, this.f48440p});
    }

    public final String toString() {
        String str = this.f48435c;
        String str2 = this.f48437f;
        String str3 = this.f48438g;
        Float f = this.f48439o;
        String valueOf = String.valueOf(this.f48440p);
        String str4 = this.f48434a;
        String valueOf2 = String.valueOf(this.f48436d);
        return "AppParcelable{title='" + str + "', developerName='" + str2 + "', formattedPrice='" + str3 + "', starRating=" + f + ", wearDetails=" + valueOf + ", deepLinkUri='" + str4 + "', icon=" + valueOf2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f48434a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f48435c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f48436d, i, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f48437f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f48438g, false);
        SafeParcelWriter.m4574l(parcel, 6, this.f48439o, false);
        SafeParcelWriter.m4584v(parcel, 7, this.f48440p, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
