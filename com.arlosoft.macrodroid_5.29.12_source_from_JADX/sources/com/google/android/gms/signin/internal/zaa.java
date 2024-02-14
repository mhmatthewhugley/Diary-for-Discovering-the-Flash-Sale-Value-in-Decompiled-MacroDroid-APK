package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47952a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f47953c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private Intent f47954d;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.f47953c == 0) {
            return Status.f3138p;
        }
        return Status.f3134B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47952a);
        SafeParcelWriter.m4576n(parcel, 2, this.f47953c);
        SafeParcelWriter.m4584v(parcel, 3, this.f47954d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable Intent intent) {
        this.f47952a = i;
        this.f47953c = i2;
        this.f47954d = intent;
    }
}
