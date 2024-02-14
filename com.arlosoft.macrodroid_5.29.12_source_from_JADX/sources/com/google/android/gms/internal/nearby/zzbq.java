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
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzdf f44577a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public String f44578c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zzdg f44579d;

    private zzbq() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbq) {
            zzbq zzbq = (zzbq) obj;
            return Objects.m4470a(this.f44579d, zzbq.f44579d) && Objects.m4470a(this.f44577a, zzbq.f44577a) && Objects.m4470a(this.f44578c, zzbq.f44578c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44579d, this.f44577a, this.f44578c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzdg zzdg = this.f44579d;
        if (zzdg == null) {
            iBinder = null;
        } else {
            iBinder = zzdg.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4575m(parcel, 2, this.f44577a.asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44578c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzbq(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzdg
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzdg r1 = (com.google.android.gms.internal.nearby.zzdg) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzdg r1 = new com.google.android.gms.internal.nearby.zzdg
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzdf
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzdf r0 = (com.google.android.gms.internal.nearby.zzdf) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzdd r0 = new com.google.android.gms.internal.nearby.zzdd
            r0.<init>(r5)
        L_0x002d:
            r3.<init>()
            r3.f44579d = r1
            r3.f44577a = r0
            r3.f44578c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzbq.<init>(android.os.IBinder, android.os.IBinder, java.lang.String):void");
    }

    /* synthetic */ zzbq(zzbp zzbp) {
    }
}
