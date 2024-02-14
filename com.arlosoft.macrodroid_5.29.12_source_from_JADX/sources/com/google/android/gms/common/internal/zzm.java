package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzm implements Parcelable.Creator {
    /* renamed from: a */
    static void m4692a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, getServiceRequest.f3636a);
        SafeParcelWriter.m4576n(parcel, 2, getServiceRequest.f3637c);
        SafeParcelWriter.m4576n(parcel, 3, getServiceRequest.f3638d);
        SafeParcelWriter.m4586x(parcel, 4, getServiceRequest.f3639f, false);
        SafeParcelWriter.m4575m(parcel, 5, getServiceRequest.f3640g, false);
        SafeParcelWriter.m4557A(parcel, 6, getServiceRequest.f3641o, i, false);
        SafeParcelWriter.m4567e(parcel, 7, getServiceRequest.f3642p, false);
        SafeParcelWriter.m4584v(parcel, 8, getServiceRequest.f3643s, i, false);
        SafeParcelWriter.m4557A(parcel, 10, getServiceRequest.f3644z, i, false);
        SafeParcelWriter.m4557A(parcel, 11, getServiceRequest.f3631A, i, false);
        SafeParcelWriter.m4565c(parcel, 12, getServiceRequest.f3632B);
        SafeParcelWriter.m4576n(parcel, 13, getServiceRequest.f3633C);
        SafeParcelWriter.m4565c(parcel, 14, getServiceRequest.f3634D);
        SafeParcelWriter.m4586x(parcel, 15, getServiceRequest.zza(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        Scope[] scopeArr = GetServiceRequest.f3629F;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f3630G;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 3:
                    i3 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m4519F(parcel2, E);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m4550t(parcel2, E, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m4536f(parcel2, E);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m4546p(parcel2, E, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m4550t(parcel2, E, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m4550t(parcel2, E, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 13:
                    i4 = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 14:
                    z2 = SafeParcelReader.m4554x(parcel2, E);
                    break;
                case 15:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
