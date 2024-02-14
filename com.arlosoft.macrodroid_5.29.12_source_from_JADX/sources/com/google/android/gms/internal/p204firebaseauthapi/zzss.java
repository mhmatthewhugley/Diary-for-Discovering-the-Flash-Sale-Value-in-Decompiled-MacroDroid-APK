package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzss */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzss extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzss> CREATOR = new zzst();
    @SafeParcelable.Field

    /* renamed from: a */
    private final EmailAuthCredential f40398a;

    @SafeParcelable.Constructor
    public zzss(@SafeParcelable.Param EmailAuthCredential emailAuthCredential) {
        this.f40398a = emailAuthCredential;
    }

    /* renamed from: l2 */
    public final EmailAuthCredential mo49841l2() {
        return this.f40398a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f40398a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
