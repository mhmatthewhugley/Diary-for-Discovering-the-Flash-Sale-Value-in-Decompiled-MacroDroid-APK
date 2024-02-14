package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztg> CREATOR = new zzth();
    @SafeParcelable.Field

    /* renamed from: a */
    private final UserProfileChangeRequest f40424a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40425c;

    @SafeParcelable.Constructor
    public zztg(@SafeParcelable.Param UserProfileChangeRequest userProfileChangeRequest, @SafeParcelable.Param String str) {
        this.f40424a = userProfileChangeRequest;
        this.f40425c = str;
    }

    /* renamed from: l2 */
    public final UserProfileChangeRequest mo49886l2() {
        return this.f40424a;
    }

    /* renamed from: m2 */
    public final String mo49887m2() {
        return this.f40425c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40424a, i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40425c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
