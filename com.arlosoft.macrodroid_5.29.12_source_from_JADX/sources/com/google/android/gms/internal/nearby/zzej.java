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
public final class zzej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzej> CREATOR = new zzek();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public IStatusCallback f44604a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public boolean f44605c;

    private zzej() {
        this.f44605c = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzej) {
            zzej zzej = (zzej) obj;
            return Objects.m4470a(this.f44604a, zzej.f44604a) && Objects.m4470a(Boolean.valueOf(this.f44605c), Boolean.valueOf(zzej.f44605c));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44604a, Boolean.valueOf(this.f44605c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44604a.asBinder(), false);
        SafeParcelWriter.m4565c(parcel, 2, this.f44605c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzej(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z) {
        this.f44604a = IStatusCallback.Stub.m3785ia(iBinder);
        this.f44605c = z;
    }

    /* synthetic */ zzej(zzei zzei) {
        this.f44605c = false;
    }
}
