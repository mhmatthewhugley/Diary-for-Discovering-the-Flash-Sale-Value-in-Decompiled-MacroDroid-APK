package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzcs f44568a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public DailySummariesConfig f44569c;

    private zzbe() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            return Objects.m4470a(this.f44568a, zzbe.f44568a) && Objects.m4470a(this.f44569c, zzbe.f44569c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44568a, this.f44569c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44568a.asBinder(), false);
        SafeParcelWriter.m4584v(parcel, 2, this.f44569c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzbe(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.nearby.exposurenotification.DailySummariesConfig r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzcs
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzcs r3 = (com.google.android.gms.internal.nearby.zzcs) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzcq r0 = new com.google.android.gms.internal.nearby.zzcq
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.f44568a = r3
            r2.f44569c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzbe.<init>(android.os.IBinder, com.google.android.gms.nearby.exposurenotification.DailySummariesConfig):void");
    }

    /* synthetic */ zzbe(zzbd zzbd) {
    }
}
