package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new zzsh();
    @SafeParcelable.Field

    /* renamed from: a */
    private final zzaal f40389a;

    @SafeParcelable.Constructor
    public zzsg(@SafeParcelable.Param zzaal zzaal) {
        this.f40389a = zzaal;
    }

    /* renamed from: l2 */
    public final zzaal mo49814l2() {
        return this.f40389a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40389a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
