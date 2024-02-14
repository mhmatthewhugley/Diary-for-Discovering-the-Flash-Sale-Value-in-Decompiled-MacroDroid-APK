package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3856a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final StringToIntConverter f3857c;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param int i, @SafeParcelable.Param StringToIntConverter stringToIntConverter) {
        this.f3856a = i;
        this.f3857c = stringToIntConverter;
    }

    /* renamed from: l2 */
    public static zaa m4791l2(FastJsonResponse.FieldConverter fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: m2 */
    public final FastJsonResponse.FieldConverter mo21889m2() {
        StringToIntConverter stringToIntConverter = this.f3857c;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3856a);
        SafeParcelWriter.m4584v(parcel, 2, this.f3857c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f3856a = 1;
        this.f3857c = stringToIntConverter;
    }
}
