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
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzev extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzev> CREATOR = new zzew();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public IStatusCallback f44612a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private ExposureConfiguration f44613c;

    private zzev() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzev) {
            zzev zzev = (zzev) obj;
            return Objects.m4470a(this.f44612a, zzev.f44612a) && Objects.m4470a(this.f44613c, zzev.f44613c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44612a, this.f44613c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 3, this.f44612a.asBinder(), false);
        SafeParcelWriter.m4584v(parcel, 4, this.f44613c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzev(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param @Nullable ExposureConfiguration exposureConfiguration) {
        this.f44612a = IStatusCallback.Stub.m3785ia(iBinder);
        this.f44613c = exposureConfiguration;
    }

    /* synthetic */ zzev(zzeu zzeu) {
    }
}
