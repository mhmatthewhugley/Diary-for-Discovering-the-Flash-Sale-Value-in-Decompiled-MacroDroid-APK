package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class GoogleNowAuthState extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new zza();
    @SafeParcelable.Field

    /* renamed from: a */
    String f47924a;
    @SafeParcelable.Field

    /* renamed from: c */
    String f47925c;
    @SafeParcelable.Field

    /* renamed from: d */
    long f47926d;

    @SafeParcelable.Constructor
    GoogleNowAuthState(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param long j) {
        this.f47924a = str;
        this.f47925c = str2;
        this.f47926d = j;
    }

    @Nullable
    /* renamed from: l2 */
    public String mo56091l2() {
        return this.f47925c;
    }

    @Nullable
    /* renamed from: m2 */
    public String mo56092m2() {
        return this.f47924a;
    }

    /* renamed from: n2 */
    public long mo56093n2() {
        return this.f47926d;
    }

    @NonNull
    public String toString() {
        String str = this.f47924a;
        String str2 = this.f47925c;
        long j = this.f47926d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length());
        sb.append("mAuthCode = ");
        sb.append(str);
        sb.append("\nmAccessToken = ");
        sb.append(str2);
        sb.append("\nmNextAllowedTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo56092m2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo56091l2(), false);
        SafeParcelWriter.m4581s(parcel, 3, mo56093n2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
