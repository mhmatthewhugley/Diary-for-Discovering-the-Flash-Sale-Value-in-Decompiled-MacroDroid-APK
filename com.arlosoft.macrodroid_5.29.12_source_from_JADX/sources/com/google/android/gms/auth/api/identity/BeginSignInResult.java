package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PendingIntent f2815a;

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param PendingIntent pendingIntent) {
        this.f2815a = (PendingIntent) Preconditions.m4488k(pendingIntent);
    }

    /* renamed from: l2 */
    public final PendingIntent mo20896l2() {
        return this.f2815a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo20896l2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
