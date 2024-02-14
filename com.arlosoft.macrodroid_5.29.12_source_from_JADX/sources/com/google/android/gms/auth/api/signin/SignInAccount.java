package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: a */
    private String f2908a;
    @SafeParcelable.Field

    /* renamed from: c */
    private GoogleSignInAccount f2909c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d */
    private String f2910d;

    @SafeParcelable.Constructor
    SignInAccount(@SafeParcelable.Param String str, @SafeParcelable.Param GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param String str2) {
        this.f2909c = googleSignInAccount;
        this.f2908a = Preconditions.m4485h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f2910d = Preconditions.m4485h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: K1 */
    public final GoogleSignInAccount mo21001K1() {
        return this.f2909c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 4, this.f2908a, false);
        SafeParcelWriter.m4584v(parcel, 7, this.f2909c, i, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f2910d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
