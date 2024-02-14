package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2639a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f2640c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f2641d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f2642f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f2643g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f2644o;

    @SafeParcelable.Constructor
    AccountChangeEvent(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param String str, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param String str2) {
        this.f2639a = i;
        this.f2640c = j;
        this.f2641d = (String) Preconditions.m4488k(str);
        this.f2642f = i2;
        this.f2643g = i3;
        this.f2644o = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f2639a == accountChangeEvent.f2639a && this.f2640c == accountChangeEvent.f2640c && Objects.m4470a(this.f2641d, accountChangeEvent.f2641d) && this.f2642f == accountChangeEvent.f2642f && this.f2643g == accountChangeEvent.f2643g && Objects.m4470a(this.f2644o, accountChangeEvent.f2644o);
        }
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f2639a), Long.valueOf(this.f2640c), this.f2641d, Integer.valueOf(this.f2642f), Integer.valueOf(this.f2643g), this.f2644o);
    }

    public String toString() {
        int i = this.f2642f;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f2641d;
        String str3 = this.f2644o;
        int i2 = this.f2643g;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2639a);
        SafeParcelWriter.m4581s(parcel, 2, this.f2640c);
        SafeParcelWriter.m4586x(parcel, 3, this.f2641d, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f2642f);
        SafeParcelWriter.m4576n(parcel, 5, this.f2643g);
        SafeParcelWriter.m4586x(parcel, 6, this.f2644o, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
