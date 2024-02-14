package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzdy f44589a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private zzdv f44590c;

    private zzcg() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcg) {
            zzcg zzcg = (zzcg) obj;
            return Objects.m4470a(this.f44590c, zzcg.f44590c) && Objects.m4470a(this.f44589a, zzcg.f44589a);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44590c, this.f44589a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzdv zzdv = this.f44590c;
        if (zzdv == null) {
            iBinder = null;
        } else {
            iBinder = zzdv.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4575m(parcel, 2, this.f44589a.asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzcg(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyHistoryResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzdv
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzdv r1 = (com.google.android.gms.internal.nearby.zzdv) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzdv r1 = new com.google.android.gms.internal.nearby.zzdv
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzdy
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzdy r0 = (com.google.android.gms.internal.nearby.zzdy) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzdw r0 = new com.google.android.gms.internal.nearby.zzdw
            r0.<init>(r5)
        L_0x002d:
            r3.<init>()
            r3.f44590c = r1
            r3.f44589a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzcg.<init>(android.os.IBinder, android.os.IBinder):void");
    }

    /* synthetic */ zzcg(zzcf zzcf) {
    }
}
