package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    /* renamed from: c */
    public static final zzg f53863c = new zzg(1);

    /* renamed from: d */
    public static final zzg f53864d = new zzg(2);

    /* renamed from: f */
    public static final zzg f53865f = new zzg(3);
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f53866a;

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param int i) {
        this.f53866a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f53866a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
