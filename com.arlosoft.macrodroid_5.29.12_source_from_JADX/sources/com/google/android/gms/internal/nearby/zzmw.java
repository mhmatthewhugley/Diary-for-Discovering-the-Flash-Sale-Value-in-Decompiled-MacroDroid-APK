package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzmw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmw> CREATOR = new zzmx();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44939a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public String f44940c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public long f44941d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public DiscoveryOptions f44942f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public zzkc f44943g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private zzjz f44944o;

    private zzmw() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmw) {
            zzmw zzmw = (zzmw) obj;
            return Objects.m4470a(this.f44939a, zzmw.f44939a) && Objects.m4470a(this.f44944o, zzmw.f44944o) && Objects.m4470a(this.f44940c, zzmw.f44940c) && Objects.m4470a(Long.valueOf(this.f44941d), Long.valueOf(zzmw.f44941d)) && Objects.m4470a(this.f44942f, zzmw.f44942f) && Objects.m4470a(this.f44943g, zzmw.f44943g);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44939a, this.f44944o, this.f44940c, Long.valueOf(this.f44941d), this.f44942f, this.f44943g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44939a;
        IBinder iBinder3 = null;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        zzjz zzjz = this.f44944o;
        if (zzjz == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjz.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder2, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44940c, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f44941d);
        SafeParcelWriter.m4584v(parcel, 5, this.f44942f, i, false);
        zzkc zzkc = this.f44943g;
        if (zzkc != null) {
            iBinder3 = zzkc.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 6, iBinder3, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzmw(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.nearby.connection.DiscoveryOptions r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r10) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzkj r1 = (com.google.android.gms.internal.nearby.zzkj) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkh r1 = new com.google.android.gms.internal.nearby.zzkh
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001b
            r4 = r0
            goto L_0x002d
        L_0x001b:
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjz
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjz r4 = (com.google.android.gms.internal.nearby.zzjz) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjz r4 = new com.google.android.gms.internal.nearby.zzjz
            r4.<init>(r5)
        L_0x002d:
            if (r10 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IDiscoveryListener"
            android.os.IInterface r5 = r10.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzkc
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzkc r0 = (com.google.android.gms.internal.nearby.zzkc) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzka r0 = new com.google.android.gms.internal.nearby.zzka
            r0.<init>(r10)
        L_0x0043:
            r3.<init>()
            r3.f44939a = r1
            r3.f44944o = r4
            r3.f44940c = r6
            r3.f44941d = r7
            r3.f44942f = r9
            r3.f44943g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmw.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, long, com.google.android.gms.nearby.connection.DiscoveryOptions, android.os.IBinder):void");
    }

    /* synthetic */ zzmw(zzmv zzmv) {
    }
}
