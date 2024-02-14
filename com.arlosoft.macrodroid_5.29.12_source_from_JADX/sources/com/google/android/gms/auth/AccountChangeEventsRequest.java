package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2645a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f2646c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d */
    private String f2647d;
    @SafeParcelable.Field

    /* renamed from: f */
    private Account f2648f;

    @SafeParcelable.Constructor
    AccountChangeEventsRequest(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param Account account) {
        this.f2645a = i;
        this.f2646c = i2;
        this.f2647d = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f2648f = account;
        } else {
            this.f2648f = new Account(str, "com.google");
        }
    }

    @Deprecated
    /* renamed from: l2 */
    public AccountChangeEventsRequest mo20751l2(String str) {
        this.f2647d = str;
        return this;
    }

    /* renamed from: m2 */
    public AccountChangeEventsRequest mo20752m2(int i) {
        this.f2646c = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2645a);
        SafeParcelWriter.m4576n(parcel, 2, this.f2646c);
        SafeParcelWriter.m4586x(parcel, 3, this.f2647d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f2648f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f2645a = 1;
    }
}
