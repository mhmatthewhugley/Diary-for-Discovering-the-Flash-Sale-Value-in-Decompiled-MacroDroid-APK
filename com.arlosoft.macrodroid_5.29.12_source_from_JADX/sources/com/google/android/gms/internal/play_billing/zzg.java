package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public final class zzg {

    /* renamed from: a */
    private static final ClassLoader f45480a = zzg.class.getClassLoader();

    private zzg() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m63923a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m63924b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
