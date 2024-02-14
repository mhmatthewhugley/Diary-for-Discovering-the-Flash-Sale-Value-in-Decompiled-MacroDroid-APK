package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    List<CountrySpecification> f4069a;

    /* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
    public final class Builder {
    }

    UserAddressRequest() {
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 2, this.f4069a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    UserAddressRequest(@SafeParcelable.Param List<CountrySpecification> list) {
        this.f4069a = list;
    }
}
