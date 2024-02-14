package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzta */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzta extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzta> CREATOR = new zztb();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40419a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40420c;

    @SafeParcelable.Constructor
    public zzta(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f40419a = str;
        this.f40420c = str2;
    }

    /* renamed from: l2 */
    public final String mo49872l2() {
        return this.f40420c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40419a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40420c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f40419a;
    }
}
