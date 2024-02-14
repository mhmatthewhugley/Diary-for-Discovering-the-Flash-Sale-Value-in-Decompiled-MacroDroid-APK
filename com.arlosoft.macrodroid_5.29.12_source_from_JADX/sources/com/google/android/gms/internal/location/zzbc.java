package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzaz;
import com.google.android.gms.location.zzba;
import com.google.android.gms.location.zzbd;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    @SafeParcelable.Field

    /* renamed from: a */
    final int f41112a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    final zzba f41113c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    final zzbd f41114d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    final PendingIntent f41115f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    final zzba f41116g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    final zzai f41117o;

    @SafeParcelable.Constructor
    zzbc(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zzba zzba, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param @Nullable PendingIntent pendingIntent, @SafeParcelable.Param @Nullable IBinder iBinder2, @SafeParcelable.Param @Nullable IBinder iBinder3) {
        zzbd zzbd;
        zzba zzba2;
        this.f41112a = i;
        this.f41113c = zzba;
        zzai zzai = null;
        if (iBinder == null) {
            zzbd = null;
        } else {
            zzbd = com.google.android.gms.location.zzbc.m64857t1(iBinder);
        }
        this.f41114d = zzbd;
        this.f41115f = pendingIntent;
        if (iBinder2 == null) {
            zzba2 = null;
        } else {
            zzba2 = zzaz.m64852t1(iBinder2);
        }
        this.f41116g = zzba2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder3);
            }
        }
        this.f41117o = zzai;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m59256l2(com.google.android.gms.location.zzbd r8, @androidx.annotation.Nullable com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r1 = 2
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m59256l2(com.google.android.gms.location.zzbd, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m59257m2(com.google.android.gms.internal.location.zzba r8, android.app.PendingIntent r9, @androidx.annotation.Nullable com.google.android.gms.internal.location.zzai r10) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            r1 = 1
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m59257m2(com.google.android.gms.internal.location.zzba, android.app.PendingIntent, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m59258n2(com.google.android.gms.location.zzba r8, @androidx.annotation.Nullable com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m59258n2(com.google.android.gms.location.zzba, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f41112a);
        SafeParcelWriter.m4584v(parcel, 2, this.f41113c, i, false);
        zzbd zzbd = this.f41114d;
        IBinder iBinder3 = null;
        if (zzbd == null) {
            iBinder = null;
        } else {
            iBinder = zzbd.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 3, iBinder, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f41115f, i, false);
        zzba zzba = this.f41116g;
        if (zzba == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzba.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 5, iBinder2, false);
        zzai zzai = this.f41117o;
        if (zzai != null) {
            iBinder3 = zzai.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 6, iBinder3, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
