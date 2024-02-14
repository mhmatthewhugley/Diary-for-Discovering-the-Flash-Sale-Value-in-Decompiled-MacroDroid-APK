package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f47955a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f47956c;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param List list, @SafeParcelable.Param @Nullable String str) {
        this.f47955a = list;
        this.f47956c = str;
    }

    public final Status getStatus() {
        if (this.f47956c != null) {
            return Status.f3138p;
        }
        return Status.f3134B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4588z(parcel, 1, this.f47955a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f47956c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
