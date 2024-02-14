package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new zzb();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract PendingIntent mo59923a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo59924b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo59923a(), 0);
        parcel.writeInt(mo59924b() ? 1 : 0);
    }
}
