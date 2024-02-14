package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new zzsj();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f40390a;

    @SafeParcelable.Constructor
    public zzsi(@SafeParcelable.Param @Nullable String str) {
        this.f40390a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40390a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    public final String zza() {
        return this.f40390a;
    }
}
