package com.google.android.gms.internal.nearby;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzc {

    /* renamed from: a */
    private static final ClassLoader f44585a = zzc.class.getClassLoader();

    private zzc() {
    }

    /* renamed from: a */
    public static Parcelable m62336a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static ArrayList m62337b(Parcel parcel) {
        return parcel.readArrayList(f44585a);
    }

    /* renamed from: c */
    public static void m62338c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m62339d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m62340e(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m62341f(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: g */
    public static boolean m62342g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
