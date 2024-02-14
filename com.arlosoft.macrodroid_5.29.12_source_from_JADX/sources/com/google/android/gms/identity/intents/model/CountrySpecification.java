package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new zza();
    @SafeParcelable.Field

    /* renamed from: a */
    String f4070a;

    @SafeParcelable.Constructor
    public CountrySpecification(@SafeParcelable.Param @NonNull String str) {
        this.f4070a = str;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f4070a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
