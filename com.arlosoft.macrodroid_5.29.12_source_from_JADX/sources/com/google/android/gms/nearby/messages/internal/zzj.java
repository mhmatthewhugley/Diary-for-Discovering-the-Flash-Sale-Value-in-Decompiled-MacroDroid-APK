package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f47824a;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: c */
    public final ClientAppContext f47825c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f47826d;

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param int i, @SafeParcelable.Param ClientAppContext clientAppContext, @SafeParcelable.Param int i2) {
        this.f47824a = i;
        this.f47825c = clientAppContext;
        this.f47826d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47824a);
        SafeParcelWriter.m4584v(parcel, 2, this.f47825c, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f47826d);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
