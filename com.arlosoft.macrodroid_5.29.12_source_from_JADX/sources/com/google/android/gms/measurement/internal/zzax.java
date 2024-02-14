package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzax implements Parcelable.Creator {
    /* renamed from: a */
    static void m65471a(zzaw zzaw, Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, zzaw.f46479a, false);
        SafeParcelWriter.m4584v(parcel, 3, zzaw.f46480c, i, false);
        SafeParcelWriter.m4586x(parcel, 4, zzaw.f46481d, false);
        SafeParcelWriter.m4581s(parcel, 5, zzaw.f46482f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m4528O(parcel);
        String str = null;
        zzau zzau = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m4518E(parcel);
            int w = SafeParcelReader.m4553w(E);
            if (w == 2) {
                str = SafeParcelReader.m4547q(parcel, E);
            } else if (w == 3) {
                zzau = (zzau) SafeParcelReader.m4546p(parcel, E, zzau.CREATOR);
            } else if (w == 4) {
                str2 = SafeParcelReader.m4547q(parcel, E);
            } else if (w != 5) {
                SafeParcelReader.m4527N(parcel, E);
            } else {
                j = SafeParcelReader.m4523J(parcel, E);
            }
        }
        SafeParcelReader.m4552v(parcel, O);
        return new zzaw(str, zzau, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
