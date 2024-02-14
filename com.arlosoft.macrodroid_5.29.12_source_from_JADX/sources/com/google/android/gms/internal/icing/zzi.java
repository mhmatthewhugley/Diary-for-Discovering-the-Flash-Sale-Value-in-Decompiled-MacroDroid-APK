package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    final String f41024a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    final String f41025c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final String f41026d;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3) {
        this.f41024a = str;
        this.f41025c = str2;
        this.f41026d = str3;
    }

    public final String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.f41024a, this.f41025c, this.f41026d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f41024a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f41025c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f41026d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
