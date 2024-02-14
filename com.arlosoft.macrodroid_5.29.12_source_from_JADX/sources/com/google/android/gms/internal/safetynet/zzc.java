package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class zzc {

    /* renamed from: a */
    private static final ClassLoader f45492a = zzc.class.getClassLoader();

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m63954a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m63955b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static boolean m63956c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
