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
public final class zzmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmh();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44904a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public String f44905c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f44906d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private zznv f44907f;

    private zzmg() {
        this.f44906d = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmg) {
            zzmg zzmg = (zzmg) obj;
            return Objects.m4470a(this.f44904a, zzmg.f44904a) && Objects.m4470a(this.f44905c, zzmg.f44905c) && Objects.m4470a(Integer.valueOf(this.f44906d), Integer.valueOf(zzmg.f44906d)) && Objects.m4470a(this.f44907f, zzmg.f44907f);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44904a, this.f44905c, Integer.valueOf(this.f44906d), this.f44907f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44904a;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f44905c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f44906d);
        SafeParcelWriter.m4584v(parcel, 4, this.f44907f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzmg(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.internal.nearby.zznv r6) {
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
            r2.f44904a = r3
            r2.f44905c = r4
            r2.f44906d = r5
            r2.f44907f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmg.<init>(android.os.IBinder, java.lang.String, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    /* synthetic */ zzmg(zzmf zzmf) {
        this.f44906d = 0;
    }
}
