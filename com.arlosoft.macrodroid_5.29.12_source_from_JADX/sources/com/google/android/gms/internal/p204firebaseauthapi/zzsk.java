package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new zzsl();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f40391a;

    @SafeParcelable.Constructor
    public zzsk(@SafeParcelable.Param @Nullable String str) {
        this.f40391a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40391a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    public final String zza() {
        return this.f40391a;
    }
}
