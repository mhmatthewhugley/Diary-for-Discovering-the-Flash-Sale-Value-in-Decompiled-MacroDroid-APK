package com.google.android.gms.internal.p202authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzd */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class zzd {

    /* renamed from: a */
    private static final ClassLoader f39102a = zzd.class.getClassLoader();

    private zzd() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m55631a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m55632b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static boolean m55633c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
