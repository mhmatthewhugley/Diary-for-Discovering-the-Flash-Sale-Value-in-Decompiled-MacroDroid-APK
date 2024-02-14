package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzre */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzre extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzre> CREATOR = new zzrf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40358a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f40359c;

    @SafeParcelable.Constructor
    public zzre(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2) {
        this.f40358a = str;
        this.f40359c = str2;
    }

    @Nullable
    /* renamed from: l2 */
    public final String mo49742l2() {
        return this.f40359c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40358a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40359c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40358a;
    }
}
