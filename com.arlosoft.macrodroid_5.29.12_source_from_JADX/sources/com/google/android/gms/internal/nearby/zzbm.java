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
public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzdb f44573a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public String f44574c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zzdc f44575d;

    private zzbm() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbm = (zzbm) obj;
            return Objects.m4470a(this.f44575d, zzbm.f44575d) && Objects.m4470a(this.f44573a, zzbm.f44573a) && Objects.m4470a(this.f44574c, zzbm.f44574c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44575d, this.f44573a, this.f44574c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzdc zzdc = this.f44575d;
        if (zzdc == null) {
            iBinder = null;
        } else {
            iBinder = zzdc.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4575m(parcel, 2, this.f44573a.asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44574c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzbm(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzdc
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzdc r1 = (com.google.android.gms.internal.nearby.zzdc) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzdc r1 = new com.google.android.gms.internal.nearby.zzdc
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzdb
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzdb r0 = (com.google.android.gms.internal.nearby.zzdb) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzcz r0 = new com.google.android.gms.internal.nearby.zzcz
            r0.<init>(r5)
        L_0x002d:
            r3.<init>()
            r3.f44575d = r1
            r3.f44573a = r0
            r3.f44574c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzbm.<init>(android.os.IBinder, android.os.IBinder, java.lang.String):void");
    }

    /* synthetic */ zzbm(zzbl zzbl) {
    }
}
