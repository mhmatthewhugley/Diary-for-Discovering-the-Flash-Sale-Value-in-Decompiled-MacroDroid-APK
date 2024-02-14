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
public final class zzqi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqi> CREATOR = new zzqj();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzpb f45030a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public zzpy f45031c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public zzoy f45032d;

    private zzqi() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqi) {
            zzqi zzqi = (zzqi) obj;
            return Objects.m4470a(this.f45030a, zzqi.f45030a) && Objects.m4470a(this.f45031c, zzqi.f45031c) && Objects.m4470a(this.f45032d, zzqi.f45032d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45030a, this.f45031c, this.f45032d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzpb zzpb = this.f45030a;
        if (zzpb == null) {
            iBinder = null;
        } else {
            iBinder = zzpb.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45031c, i, false);
        SafeParcelWriter.m4575m(parcel, 3, this.f45032d.asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzqi(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.internal.nearby.zzpy r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.uwb.internal.IResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzpb
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzpb r1 = (com.google.android.gms.internal.nearby.zzpb) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzoz r1 = new com.google.android.gms.internal.nearby.zzoz
            r1.<init>(r4)
        L_0x0017:
            if (r6 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback"
            android.os.IInterface r4 = r6.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzoy
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzoy r0 = (com.google.android.gms.internal.nearby.zzoy) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzow r0 = new com.google.android.gms.internal.nearby.zzow
            r0.<init>(r6)
        L_0x002d:
            r3.<init>()
            r3.f45030a = r1
            r3.f45031c = r5
            r3.f45032d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzqi.<init>(android.os.IBinder, com.google.android.gms.internal.nearby.zzpy, android.os.IBinder):void");
    }

    /* synthetic */ zzqi(zzqh zzqh) {
    }
}
