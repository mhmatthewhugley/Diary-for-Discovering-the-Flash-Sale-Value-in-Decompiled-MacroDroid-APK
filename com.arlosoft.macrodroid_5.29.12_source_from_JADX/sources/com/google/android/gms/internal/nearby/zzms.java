package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzms extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzms> CREATOR = new zzmt();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkm f44930a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public zzjp f44931c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public String f44932d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public String f44933f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public long f44934g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: o */
    public AdvertisingOptions f44935o;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public zzjv f44936p;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public byte[] f44937s;

    private zzms() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzms = (zzms) obj;
            return Objects.m4470a(this.f44930a, zzms.f44930a) && Objects.m4470a(this.f44931c, zzms.f44931c) && Objects.m4470a(this.f44932d, zzms.f44932d) && Objects.m4470a(this.f44933f, zzms.f44933f) && Objects.m4470a(Long.valueOf(this.f44934g), Long.valueOf(zzms.f44934g)) && Objects.m4470a(this.f44935o, zzms.f44935o) && Objects.m4470a(this.f44936p, zzms.f44936p) && Arrays.equals(this.f44937s, zzms.f44937s);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44930a, this.f44931c, this.f44932d, this.f44933f, Long.valueOf(this.f44934g), this.f44935o, this.f44936p, Integer.valueOf(Arrays.hashCode(this.f44937s)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkm zzkm = this.f44930a;
        IBinder iBinder3 = null;
        if (zzkm == null) {
            iBinder = null;
        } else {
            iBinder = zzkm.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        zzjp zzjp = this.f44931c;
        if (zzjp == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjp.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder2, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44932d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f44933f, false);
        SafeParcelWriter.m4581s(parcel, 5, this.f44934g);
        SafeParcelWriter.m4584v(parcel, 6, this.f44935o, i, false);
        zzjv zzjv = this.f44936p;
        if (zzjv != null) {
            iBinder3 = zzjv.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 7, iBinder3, false);
        SafeParcelWriter.m4569g(parcel, 8, this.f44937s, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzms(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param long r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.nearby.connection.AdvertisingOptions r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable byte[] r12) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzkm
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzkm r1 = (com.google.android.gms.internal.nearby.zzkm) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkk r1 = new com.google.android.gms.internal.nearby.zzkk
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001b
            r4 = r0
            goto L_0x002d
        L_0x001b:
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjp
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjp r4 = (com.google.android.gms.internal.nearby.zzjp) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjn r4 = new com.google.android.gms.internal.nearby.zzjn
            r4.<init>(r5)
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r5 = r11.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzjv
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzjv r0 = (com.google.android.gms.internal.nearby.zzjv) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzjt r0 = new com.google.android.gms.internal.nearby.zzjt
            r0.<init>(r11)
        L_0x0043:
            r3.<init>()
            r3.f44930a = r1
            r3.f44931c = r4
            r3.f44932d = r6
            r3.f44933f = r7
            r3.f44934g = r8
            r3.f44935o = r10
            r3.f44936p = r0
            r3.f44937s = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzms.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, long, com.google.android.gms.nearby.connection.AdvertisingOptions, android.os.IBinder, byte[]):void");
    }

    /* synthetic */ zzms(zzmr zzmr) {
    }
}
