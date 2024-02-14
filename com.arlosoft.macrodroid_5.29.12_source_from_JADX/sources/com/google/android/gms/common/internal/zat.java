package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3726a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Account f3727c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f3728d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final GoogleSignInAccount f3729f;

    @SafeParcelable.Constructor
    zat(@SafeParcelable.Param int i, @SafeParcelable.Param Account account, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f3726a = i;
        this.f3727c = account;
        this.f3728d = i2;
        this.f3729f = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3726a);
        SafeParcelWriter.m4584v(parcel, 2, this.f3727c, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f3728d);
        SafeParcelWriter.m4584v(parcel, 4, this.f3729f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
