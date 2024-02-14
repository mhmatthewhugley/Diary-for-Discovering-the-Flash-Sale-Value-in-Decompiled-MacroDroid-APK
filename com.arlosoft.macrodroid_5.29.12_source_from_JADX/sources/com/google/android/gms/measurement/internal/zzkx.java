package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzkx implements Parcelable.Creator {
    /* renamed from: a */
    static void m66117a(zzkw zzkw, Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, zzkw.f47281a);
        SafeParcelWriter.m4586x(parcel, 2, zzkw.f47282c, false);
        SafeParcelWriter.m4581s(parcel, 3, zzkw.f47283d);
        SafeParcelWriter.m4582t(parcel, 4, zzkw.f47284f, false);
        SafeParcelWriter.m4574l(parcel, 5, (Float) null, false);
        SafeParcelWriter.m4586x(parcel, 6, zzkw.f47285g, false);
        SafeParcelWriter.m4586x(parcel, 7, zzkw.f47286o, false);
        SafeParcelWriter.m4572j(parcel, 8, zzkw.f47287p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            switch (SafeParcelReader.m4553w(E)) {
                case 1:
                    i = SafeParcelReader.m4520G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 3:
                    j = SafeParcelReader.m4523J(parcel2, E);
                    break;
                case 4:
                    l = SafeParcelReader.m4524K(parcel2, E);
                    break;
                case 5:
                    f = SafeParcelReader.m4517D(parcel2, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.m4547q(parcel2, E);
                    break;
                case 8:
                    d = SafeParcelReader.m4515B(parcel2, E);
                    break;
                default:
                    SafeParcelReader.m4527N(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.m4552v(parcel2, O);
        return new zzkw(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkw[i];
    }
}
