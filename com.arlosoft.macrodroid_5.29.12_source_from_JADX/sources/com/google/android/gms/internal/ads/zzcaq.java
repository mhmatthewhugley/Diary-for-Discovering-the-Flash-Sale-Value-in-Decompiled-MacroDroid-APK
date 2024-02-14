package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaq> CREATOR = new zzcar();
    @SafeParcelable.Field

    /* renamed from: a */
    public final boolean f28113a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final List f28114c;

    public zzcaq() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 2, this.f28113a);
        SafeParcelWriter.m4588z(parcel, 3, this.f28114c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzcaq(@SafeParcelable.Param boolean z, @SafeParcelable.Param List list) {
        this.f28113a = z;
        this.f28114c = list;
    }
}
