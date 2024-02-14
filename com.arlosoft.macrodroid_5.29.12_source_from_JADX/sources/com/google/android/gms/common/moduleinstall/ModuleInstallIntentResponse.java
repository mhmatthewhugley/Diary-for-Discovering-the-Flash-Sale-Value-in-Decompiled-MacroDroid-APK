package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zab();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final PendingIntent f3797a;

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallIntentResponse(@SafeParcelable.Param @Nullable PendingIntent pendingIntent) {
        this.f3797a = pendingIntent;
    }

    @Nullable
    /* renamed from: l2 */
    public PendingIntent mo21851l2() {
        return this.f3797a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo21851l2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
