package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3735a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f3736c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f3737d;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: f */
    private final Scope[] f3738f;

    @SafeParcelable.Constructor
    zax(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable Scope[] scopeArr) {
        this.f3735a = i;
        this.f3736c = i2;
        this.f3737d = i3;
        this.f3738f = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3735a);
        SafeParcelWriter.m4576n(parcel, 2, this.f3736c);
        SafeParcelWriter.m4576n(parcel, 3, this.f3737d);
        SafeParcelWriter.m4557A(parcel, 4, this.f3738f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
