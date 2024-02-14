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
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzer extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzer> CREATOR = new zzes();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public IStatusCallback f44609a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public DiagnosisKeysDataMapping f44610c;

    private zzer() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzer) {
            zzer zzer = (zzer) obj;
            return Objects.m4470a(this.f44609a, zzer.f44609a) && Objects.m4470a(this.f44610c, zzer.f44610c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44609a, this.f44610c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44609a.asBinder(), false);
        SafeParcelWriter.m4584v(parcel, 2, this.f44610c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzer(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.f44609a = IStatusCallback.Stub.m3785ia(iBinder);
        this.f44610c = diagnosisKeysDataMapping;
    }

    /* synthetic */ zzer(zzeq zzeq) {
    }
}
