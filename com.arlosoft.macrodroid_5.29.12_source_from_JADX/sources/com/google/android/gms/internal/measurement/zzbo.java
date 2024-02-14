package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzbo {

    /* renamed from: a */
    private static final ClassLoader f41294a = zzbo.class.getClassLoader();

    private zzbo() {
    }

    /* renamed from: a */
    public static Parcelable m59530a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m59531b(Parcel parcel) {
        return parcel.readHashMap(f41294a);
    }

    /* renamed from: c */
    public static void m59532c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m59533d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m59534e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m59535f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: g */
    public static boolean m59536g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
