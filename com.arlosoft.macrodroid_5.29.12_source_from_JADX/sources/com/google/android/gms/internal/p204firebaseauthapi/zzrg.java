package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrg> CREATOR = new zzrh();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40360a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40361c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f40362d;

    @SafeParcelable.Constructor
    public zzrg(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param @Nullable String str3) {
        this.f40360a = str;
        this.f40361c = str2;
        this.f40362d = str3;
    }

    /* renamed from: l2 */
    public final String mo49747l2() {
        return this.f40361c;
    }

    @Nullable
    /* renamed from: m2 */
    public final String mo49748m2() {
        return this.f40362d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40360a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40361c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40362d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40360a;
    }
}
