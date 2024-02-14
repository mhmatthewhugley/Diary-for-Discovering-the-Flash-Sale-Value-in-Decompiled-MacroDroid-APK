package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2649a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final List<AccountChangeEvent> f2650c;

    @SafeParcelable.Constructor
    AccountChangeEventsResponse(@SafeParcelable.Param int i, @SafeParcelable.Param List<AccountChangeEvent> list) {
        this.f2649a = i;
        this.f2650c = (List) Preconditions.m4488k(list);
    }

    /* renamed from: l2 */
    public List<AccountChangeEvent> mo20754l2() {
        return this.f2650c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2649a);
        SafeParcelWriter.m4558B(parcel, 2, this.f2650c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
