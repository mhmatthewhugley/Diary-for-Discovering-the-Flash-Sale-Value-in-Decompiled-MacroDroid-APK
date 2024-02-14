package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzfj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfj> CREATOR = new zzfk();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44629a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public zzjs f44630c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public String f44631d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public byte[] f44632f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public zzkg f44633g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final int f44634o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private zznv f44635p;

    private zzfj() {
        this.f44634o = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfj) {
            zzfj zzfj = (zzfj) obj;
            return Objects.m4470a(this.f44629a, zzfj.f44629a) && Objects.m4470a(this.f44630c, zzfj.f44630c) && Objects.m4470a(this.f44631d, zzfj.f44631d) && Arrays.equals(this.f44632f, zzfj.f44632f) && Objects.m4470a(this.f44633g, zzfj.f44633g) && Objects.m4470a(Integer.valueOf(this.f44634o), Integer.valueOf(zzfj.f44634o)) && Objects.m4470a(this.f44635p, zzfj.f44635p);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44629a, this.f44630c, this.f44631d, Integer.valueOf(Arrays.hashCode(this.f44632f)), this.f44633g, Integer.valueOf(this.f44634o), this.f44635p);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44629a;
        IBinder iBinder3 = null;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        zzjs zzjs = this.f44630c;
        if (zzjs == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjs.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder2, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44631d, false);
        SafeParcelWriter.m4569g(parcel, 4, this.f44632f, false);
        zzkg zzkg = this.f44633g;
        if (zzkg != null) {
            iBinder3 = zzkg.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 5, iBinder3, false);
        SafeParcelWriter.m4576n(parcel, 6, this.f44634o);
        SafeParcelWriter.m4584v(parcel, 7, this.f44635p, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.internal.nearby.zznv r10) {
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
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjs
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjs r4 = (com.google.android.gms.internal.nearby.zzjs) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjq r4 = new com.google.android.gms.internal.nearby.zzjq
            r4.<init>(r5)
        L_0x002d:
            if (r8 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IPayloadListener"
            android.os.IInterface r5 = r8.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzkg
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzkg r0 = (com.google.android.gms.internal.nearby.zzkg) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzke r0 = new com.google.android.gms.internal.nearby.zzke
            r0.<init>(r8)
        L_0x0043:
            r3.<init>()
            r3.f44629a = r1
            r3.f44630c = r4
            r3.f44631d = r6
            r3.f44632f = r7
            r3.f44633g = r0
            r3.f44634o = r9
            r3.f44635p = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzfj.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, byte[], android.os.IBinder, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    /* synthetic */ zzfj(zzfi zzfi) {
        this.f44634o = 0;
    }
}
