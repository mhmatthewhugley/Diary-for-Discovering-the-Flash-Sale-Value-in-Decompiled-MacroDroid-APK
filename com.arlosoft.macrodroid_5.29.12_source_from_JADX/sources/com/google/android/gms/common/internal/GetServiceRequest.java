package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* renamed from: F */
    static final Scope[] f3629F = new Scope[0];

    /* renamed from: G */
    static final Feature[] f3630G = new Feature[0];
    @SafeParcelable.Field

    /* renamed from: A */
    Feature[] f3631A;
    @SafeParcelable.Field

    /* renamed from: B */
    boolean f3632B;
    @SafeParcelable.Field

    /* renamed from: C */
    int f3633C;
    @SafeParcelable.Field

    /* renamed from: D */
    boolean f3634D;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: E */
    private String f3635E;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3636a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f3637c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f3638d;
    @SafeParcelable.Field

    /* renamed from: f */
    String f3639f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    IBinder f3640g;
    @SafeParcelable.Field

    /* renamed from: o */
    Scope[] f3641o;
    @SafeParcelable.Field

    /* renamed from: p */
    Bundle f3642p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    Account f3643s;
    @SafeParcelable.Field

    /* renamed from: z */
    Feature[] f3644z;

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param Scope[] scopeArr, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param @Nullable Account account, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param Feature[] featureArr2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i4, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str2) {
        scopeArr = scopeArr == null ? f3629F : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f3630G : featureArr;
        featureArr2 = featureArr2 == null ? f3630G : featureArr2;
        this.f3636a = i;
        this.f3637c = i2;
        this.f3638d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f3639f = "com.google.android.gms";
        } else {
            this.f3639f = str;
        }
        if (i < 2) {
            this.f3643s = iBinder != null ? AccountAccessor.m4339A1(IAccountAccessor.Stub.m4461t1(iBinder)) : null;
        } else {
            this.f3640g = iBinder;
            this.f3643s = account;
        }
        this.f3641o = scopeArr;
        this.f3642p = bundle;
        this.f3644z = featureArr;
        this.f3631A = featureArr2;
        this.f3632B = z;
        this.f3633C = i4;
        this.f3634D = z2;
        this.f3635E = str2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.m4692a(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f3635E;
    }
}
