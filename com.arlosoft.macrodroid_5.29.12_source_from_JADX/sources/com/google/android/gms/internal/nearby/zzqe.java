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
public final class zzqe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqe> CREATOR = new zzqf();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzpb f45027a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public zzqq f45028c;

    private zzqe() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqe) {
            zzqe zzqe = (zzqe) obj;
            return Objects.m4470a(this.f45027a, zzqe.f45027a) && Objects.m4470a(this.f45028c, zzqe.f45028c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45027a, this.f45028c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzpb zzpb = this.f45027a;
        if (zzpb == null) {
            iBinder = null;
        } else {
            iBinder = zzpb.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45028c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzqe(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.internal.nearby.zzqq r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.uwb.internal.IResultListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzpb
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzpb r3 = (com.google.android.gms.internal.nearby.zzpb) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzoz r0 = new com.google.android.gms.internal.nearby.zzoz
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.f45027a = r3
            r2.f45028c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzqe.<init>(android.os.IBinder, com.google.android.gms.internal.nearby.zzqq):void");
    }

    /* synthetic */ zzqe(zzqd zzqd) {
    }
}
