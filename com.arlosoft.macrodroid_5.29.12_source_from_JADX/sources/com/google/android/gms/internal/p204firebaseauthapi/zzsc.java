package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new zzsd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40384a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final ActionCodeSettings f40385c;

    @SafeParcelable.Constructor
    public zzsc(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable ActionCodeSettings actionCodeSettings) {
        this.f40384a = str;
        this.f40385c = actionCodeSettings;
    }

    @Nullable
    /* renamed from: l2 */
    public final ActionCodeSettings mo49803l2() {
        return this.f40385c;
    }

    /* renamed from: m2 */
    public final String mo49804m2() {
        return this.f40384a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40384a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f40385c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
