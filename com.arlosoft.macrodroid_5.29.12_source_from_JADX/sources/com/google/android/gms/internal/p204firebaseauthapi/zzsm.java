package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new zzsn();
    @SafeParcelable.Field

    /* renamed from: a */
    private final zzaay f40392a;

    @SafeParcelable.Constructor
    public zzsm(@SafeParcelable.Param zzaay zzaay) {
        this.f40392a = zzaay;
    }

    /* renamed from: l2 */
    public final zzaay mo49826l2() {
        return this.f40392a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40392a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
