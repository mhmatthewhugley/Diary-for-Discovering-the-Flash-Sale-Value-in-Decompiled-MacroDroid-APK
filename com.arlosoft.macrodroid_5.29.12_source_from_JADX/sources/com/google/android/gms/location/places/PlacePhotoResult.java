package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public class PlacePhotoResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<PlacePhotoResult> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Status f45916a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final BitmapTeleporter f45917c;

    /* renamed from: d */
    private final Bitmap f45918d;

    @SafeParcelable.Constructor
    public PlacePhotoResult(@SafeParcelable.Param Status status, @SafeParcelable.Param BitmapTeleporter bitmapTeleporter) {
        this.f45916a = status;
        this.f45917c = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            this.f45918d = bitmapTeleporter.mo21549l2();
        } else {
            this.f45918d = null;
        }
    }

    public Status getStatus() {
        return this.f45916a;
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a(NotificationCompat.CATEGORY_STATUS, this.f45916a).mo21720a("bitmap", this.f45918d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45917c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
