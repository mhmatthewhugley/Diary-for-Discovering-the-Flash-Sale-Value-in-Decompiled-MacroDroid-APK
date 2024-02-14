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
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new zzmp();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public zzkj f44923a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public String[] f44924c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public zzmb f44925d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f44926f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f44927g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private zznv f44928o;

    private zzmo() {
        this.f44927g = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmo) {
            zzmo zzmo = (zzmo) obj;
            return Objects.m4470a(this.f44923a, zzmo.f44923a) && Arrays.equals(this.f44924c, zzmo.f44924c) && Objects.m4470a(this.f44925d, zzmo.f44925d) && Objects.m4470a(Boolean.valueOf(this.f44926f), Boolean.valueOf(zzmo.f44926f)) && Objects.m4470a(Integer.valueOf(this.f44927g), Integer.valueOf(zzmo.f44927g)) && Objects.m4470a(this.f44928o, zzmo.f44928o);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44923a, Integer.valueOf(Arrays.hashCode(this.f44924c)), this.f44925d, Boolean.valueOf(this.f44926f), Integer.valueOf(this.f44927g), this.f44928o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzkj zzkj = this.f44923a;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 1, iBinder, false);
        SafeParcelWriter.m4587y(parcel, 2, this.f44924c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f44925d, i, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f44926f);
        SafeParcelWriter.m4576n(parcel, 5, this.f44927g);
        SafeParcelWriter.m4584v(parcel, 6, this.f44928o, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzmo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.internal.nearby.zzmb r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable com.google.android.gms.internal.nearby.zznv r8) {
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
            r2.f44923a = r3
            r2.f44924c = r4
            r2.f44925d = r5
            r2.f44926f = r6
            r2.f44927g = r7
            r2.f44928o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmo.<init>(android.os.IBinder, java.lang.String[], com.google.android.gms.internal.nearby.zzmb, boolean, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    /* synthetic */ zzmo(zzmn zzmn) {
        this.f44927g = 0;
    }
}
