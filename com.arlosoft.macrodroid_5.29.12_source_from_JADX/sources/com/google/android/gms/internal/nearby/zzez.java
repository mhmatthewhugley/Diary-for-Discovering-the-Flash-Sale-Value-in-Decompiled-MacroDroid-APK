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
public final class zzez extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzez> CREATOR = new zzfa();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public IStatusCallback f44615a;

    private zzez() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzez) {
            return Objects.m4470a(this.f44615a, ((zzez) obj).f44615a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44615a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44615a.asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzez(@SafeParcelable.Param IBinder iBinder) {
        this.f44615a = IStatusCallback.Stub.m3785ia(iBinder);
    }

    /* synthetic */ zzez(zzey zzey) {
    }
}
