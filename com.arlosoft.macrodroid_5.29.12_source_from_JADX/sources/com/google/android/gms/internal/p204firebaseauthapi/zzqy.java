package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqy> CREATOR = new zzqz();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40352a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f40353c;

    @SafeParcelable.Constructor
    public zzqy(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2) {
        this.f40352a = str;
        this.f40353c = str2;
    }

    /* renamed from: l2 */
    public final String mo49727l2() {
        return this.f40353c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40352a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40353c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40352a;
    }
}
