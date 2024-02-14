package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    Bundle f3760a;
    @SafeParcelable.Field

    /* renamed from: c */
    Feature[] f3761c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f3762d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    ConnectionTelemetryConfiguration f3763f;

    public zzj() {
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f3760a = bundle;
        this.f3761c = featureArr;
        this.f3762d = i;
        this.f3763f = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 1, this.f3760a, false);
        SafeParcelWriter.m4557A(parcel, 2, this.f3761c, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f3762d);
        SafeParcelWriter.m4584v(parcel, 4, this.f3763f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
