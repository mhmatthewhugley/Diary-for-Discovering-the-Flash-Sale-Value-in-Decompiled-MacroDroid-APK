package com.google.android.gms.internal.p203authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.auth-api.zzz */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Credential f39158a;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param Credential credential) {
        this.f39158a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f39158a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
