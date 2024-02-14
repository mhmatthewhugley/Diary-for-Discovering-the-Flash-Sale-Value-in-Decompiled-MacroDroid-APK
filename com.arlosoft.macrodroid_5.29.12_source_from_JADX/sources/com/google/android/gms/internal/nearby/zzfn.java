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
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzfn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfn> CREATOR = new zzfo();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44637a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public long f44638c;

    private zzfn() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfn) {
            zzfn zzfn = (zzfn) obj;
            return Objects.m4470a(this.f44637a, zzfn.f44637a) && Objects.m4470a(Long.valueOf(this.f44638c), Long.valueOf(zzfn.f44638c));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44637a, Long.valueOf(this.f44638c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44637a;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f44638c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfn(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param long r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzkj r3 = (com.google.android.gms.internal.nearby.zzkj) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkh r0 = new com.google.android.gms.internal.nearby.zzkh
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.f44637a = r3
            r2.f44638c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzfn.<init>(android.os.IBinder, long):void");
    }

    /* synthetic */ zzfn(zzfm zzfm) {
    }
}
