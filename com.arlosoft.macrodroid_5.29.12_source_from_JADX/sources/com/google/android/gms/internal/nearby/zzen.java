package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public IStatusCallback f44607a;

    private zzen() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzen) {
            return Objects.m4470a(this.f44607a, ((zzen) obj).f44607a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44607a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44607a.asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzen(@SafeParcelable.Param IBinder iBinder) {
        this.f44607a = IStatusCallback.Stub.m3785ia(iBinder);
    }

    /* synthetic */ zzen(zzem zzem) {
    }
}