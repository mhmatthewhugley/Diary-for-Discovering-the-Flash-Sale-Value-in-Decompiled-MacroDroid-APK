package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrw> CREATOR = new zzrx();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40378a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final zzaay f40379c;

    @SafeParcelable.Constructor
    public zzrw(@SafeParcelable.Param String str, @SafeParcelable.Param zzaay zzaay) {
        this.f40378a = str;
        this.f40379c = zzaay;
    }

    /* renamed from: l2 */
    public final zzaay mo49789l2() {
        return this.f40379c;
    }

    /* renamed from: m2 */
    public final String mo49790m2() {
        return this.f40378a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40378a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f40379c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
