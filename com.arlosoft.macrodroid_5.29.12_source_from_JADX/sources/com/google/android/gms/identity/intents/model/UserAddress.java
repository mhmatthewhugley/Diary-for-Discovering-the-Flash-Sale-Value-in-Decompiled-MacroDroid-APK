package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: A */
    String f4071A;
    @SafeParcelable.Field

    /* renamed from: B */
    String f4072B;
    @SafeParcelable.Field

    /* renamed from: C */
    String f4073C;
    @SafeParcelable.Field

    /* renamed from: D */
    boolean f4074D;
    @SafeParcelable.Field

    /* renamed from: E */
    String f4075E;
    @SafeParcelable.Field

    /* renamed from: F */
    String f4076F;
    @SafeParcelable.Field

    /* renamed from: a */
    String f4077a;
    @SafeParcelable.Field

    /* renamed from: c */
    String f4078c;
    @SafeParcelable.Field

    /* renamed from: d */
    String f4079d;
    @SafeParcelable.Field

    /* renamed from: f */
    String f4080f;
    @SafeParcelable.Field

    /* renamed from: g */
    String f4081g;
    @SafeParcelable.Field

    /* renamed from: o */
    String f4082o;
    @SafeParcelable.Field

    /* renamed from: p */
    String f4083p;
    @SafeParcelable.Field

    /* renamed from: s */
    String f4084s;
    @SafeParcelable.Field

    /* renamed from: z */
    String f4085z;

    UserAddress() {
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f4077a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4078c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f4079d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f4080f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f4081g, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f4082o, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f4083p, false);
        SafeParcelWriter.m4586x(parcel, 9, this.f4084s, false);
        SafeParcelWriter.m4586x(parcel, 10, this.f4085z, false);
        SafeParcelWriter.m4586x(parcel, 11, this.f4071A, false);
        SafeParcelWriter.m4586x(parcel, 12, this.f4072B, false);
        SafeParcelWriter.m4586x(parcel, 13, this.f4073C, false);
        SafeParcelWriter.m4565c(parcel, 14, this.f4074D);
        SafeParcelWriter.m4586x(parcel, 15, this.f4075E, false);
        SafeParcelWriter.m4586x(parcel, 16, this.f4076F, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    UserAddress(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11, @SafeParcelable.Param String str12, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str13, @SafeParcelable.Param String str14) {
        this.f4077a = str;
        this.f4078c = str2;
        this.f4079d = str3;
        this.f4080f = str4;
        this.f4081g = str5;
        this.f4082o = str6;
        this.f4083p = str7;
        this.f4084s = str8;
        this.f4085z = str9;
        this.f4071A = str10;
        this.f4072B = str11;
        this.f4073C = str12;
        this.f4074D = z;
        this.f4075E = str13;
        this.f4076F = str14;
    }
}
