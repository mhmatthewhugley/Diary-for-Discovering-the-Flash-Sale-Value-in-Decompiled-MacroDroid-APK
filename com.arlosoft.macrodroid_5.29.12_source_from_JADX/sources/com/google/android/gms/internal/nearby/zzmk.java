package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();
    @SafeParcelable.Field

    /* renamed from: A */
    private final int f44909A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    private zznv f44910B;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: C */
    private byte[] f44911C;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: D */
    private String f44912D;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44913a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public zzjs f44914c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public zzjy f44915d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public String f44916f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public String f44917g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public byte[] f44918o;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public zzjv f44919p;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public byte[] f44920s;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    public ConnectionOptions f44921z;

    private zzmk() {
        this.f44909A = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmk) {
            zzmk zzmk = (zzmk) obj;
            return Objects.m4470a(this.f44913a, zzmk.f44913a) && Objects.m4470a(this.f44914c, zzmk.f44914c) && Objects.m4470a(this.f44915d, zzmk.f44915d) && Objects.m4470a(this.f44916f, zzmk.f44916f) && Objects.m4470a(this.f44917g, zzmk.f44917g) && Arrays.equals(this.f44918o, zzmk.f44918o) && Objects.m4470a(this.f44919p, zzmk.f44919p) && Arrays.equals(this.f44920s, zzmk.f44920s) && Objects.m4470a(this.f44921z, zzmk.f44921z) && Objects.m4470a(Integer.valueOf(this.f44909A), Integer.valueOf(zzmk.f44909A)) && Objects.m4470a(this.f44910B, zzmk.f44910B) && Arrays.equals(this.f44911C, zzmk.f44911C) && Objects.m4470a(this.f44912D, zzmk.f44912D);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44913a, this.f44914c, this.f44915d, this.f44916f, this.f44917g, Integer.valueOf(Arrays.hashCode(this.f44918o)), this.f44919p, Integer.valueOf(Arrays.hashCode(this.f44920s)), this.f44921z, Integer.valueOf(this.f44909A), this.f44910B, Integer.valueOf(Arrays.hashCode(this.f44911C)), this.f44912D);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        IBinder iBinder3;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44913a;
        IBinder iBinder4 = null;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        zzjs zzjs = this.f44914c;
        if (zzjs == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjs.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder2, false);
        zzjy zzjy = this.f44915d;
        if (zzjy == null) {
            iBinder3 = null;
        } else {
            iBinder3 = zzjy.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 3, iBinder3, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f44916f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f44917g, false);
        SafeParcelWriter.m4569g(parcel, 6, this.f44918o, false);
        zzjv zzjv = this.f44919p;
        if (zzjv != null) {
            iBinder4 = zzjv.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 7, iBinder4, false);
        SafeParcelWriter.m4569g(parcel, 8, this.f44920s, false);
        SafeParcelWriter.m4584v(parcel, 9, this.f44921z, i, false);
        SafeParcelWriter.m4576n(parcel, 10, this.f44909A);
        SafeParcelWriter.m4584v(parcel, 11, this.f44910B, i, false);
        SafeParcelWriter.m4569g(parcel, 12, this.f44911C, false);
        SafeParcelWriter.m4586x(parcel, 13, this.f44912D, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzmk(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.String r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.nearby.connection.ConnectionOptions r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.internal.nearby.zznv r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.String r21) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = 0
            if (r1 != 0) goto L_0x000a
            r6 = r5
            goto L_0x001c
        L_0x000a:
            java.lang.String r6 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r6 = r9.queryLocalInterface(r6)
            boolean r7 = r6 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r7 == 0) goto L_0x0017
            com.google.android.gms.internal.nearby.zzkj r6 = (com.google.android.gms.internal.nearby.zzkj) r6
            goto L_0x001c
        L_0x0017:
            com.google.android.gms.internal.nearby.zzkh r6 = new com.google.android.gms.internal.nearby.zzkh
            r6.<init>(r9)
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r1 = r5
            goto L_0x0032
        L_0x0020:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.nearby.zzjs
            if (r7 == 0) goto L_0x002d
            com.google.android.gms.internal.nearby.zzjs r1 = (com.google.android.gms.internal.nearby.zzjs) r1
            goto L_0x0032
        L_0x002d:
            com.google.android.gms.internal.nearby.zzjq r1 = new com.google.android.gms.internal.nearby.zzjq
            r1.<init>(r10)
        L_0x0032:
            if (r3 != 0) goto L_0x0036
            r2 = r5
            goto L_0x0048
        L_0x0036:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener"
            android.os.IInterface r2 = r11.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.nearby.zzjy
            if (r7 == 0) goto L_0x0043
            com.google.android.gms.internal.nearby.zzjy r2 = (com.google.android.gms.internal.nearby.zzjy) r2
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.internal.nearby.zzjw r2 = new com.google.android.gms.internal.nearby.zzjw
            r2.<init>(r11)
        L_0x0048:
            if (r4 != 0) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            java.lang.String r3 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r3 = r15.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.nearby.zzjv
            if (r5 == 0) goto L_0x0059
            r5 = r3
            com.google.android.gms.internal.nearby.zzjv r5 = (com.google.android.gms.internal.nearby.zzjv) r5
            goto L_0x005e
        L_0x0059:
            com.google.android.gms.internal.nearby.zzjt r5 = new com.google.android.gms.internal.nearby.zzjt
            r5.<init>(r15)
        L_0x005e:
            r8.<init>()
            r0.f44913a = r6
            r0.f44914c = r1
            r0.f44915d = r2
            r1 = r12
            r0.f44916f = r1
            r1 = r13
            r0.f44917g = r1
            r1 = r14
            r0.f44918o = r1
            r0.f44919p = r5
            r1 = r16
            r0.f44920s = r1
            r1 = r17
            r0.f44921z = r1
            r1 = r18
            r0.f44909A = r1
            r1 = r19
            r0.f44910B = r1
            r1 = r20
            r0.f44911C = r1
            r1 = r21
            r0.f44912D = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmk.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, byte[], android.os.IBinder, byte[], com.google.android.gms.nearby.connection.ConnectionOptions, int, com.google.android.gms.internal.nearby.zznv, byte[], java.lang.String):void");
    }

    /* synthetic */ zzmk(zzmj zzmj) {
        this.f44909A = 0;
    }
}
