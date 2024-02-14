package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<LocationRequest> f45849a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f45850c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f45851d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private zzbj f45852f;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f45853a = new ArrayList<>();

        /* renamed from: b */
        private boolean f45854b = false;

        /* renamed from: c */
        private boolean f45855c = false;
    }

    @SafeParcelable.Constructor
    LocationSettingsRequest(@SafeParcelable.Param List<LocationRequest> list, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable zzbj zzbj) {
        this.f45849a = list;
        this.f45850c = z;
        this.f45851d = z2;
        this.f45852f = zzbj;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, Collections.unmodifiableList(this.f45849a), false);
        SafeParcelWriter.m4565c(parcel, 2, this.f45850c);
        SafeParcelWriter.m4565c(parcel, 3, this.f45851d);
        SafeParcelWriter.m4584v(parcel, 5, this.f45852f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
