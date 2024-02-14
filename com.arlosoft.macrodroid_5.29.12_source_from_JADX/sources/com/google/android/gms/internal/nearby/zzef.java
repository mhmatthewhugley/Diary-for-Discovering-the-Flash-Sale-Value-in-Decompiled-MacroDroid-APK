package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private List f44597a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public IStatusCallback f44598c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public List f44599d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public ExposureConfiguration f44600f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public String f44601g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public zzcv f44602o;

    private zzef() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzef) {
            zzef zzef = (zzef) obj;
            return Objects.m4470a(this.f44597a, zzef.f44597a) && Objects.m4470a(this.f44598c, zzef.f44598c) && Objects.m4470a(this.f44599d, zzef.f44599d) && Objects.m4470a(this.f44600f, zzef.f44600f) && Objects.m4470a(this.f44601g, zzef.f44601g) && Objects.m4470a(this.f44602o, zzef.f44602o);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44597a, this.f44598c, this.f44599d, this.f44600f, this.f44601g, this.f44602o);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f44597a, false);
        SafeParcelWriter.m4575m(parcel, 2, this.f44598c.asBinder(), false);
        SafeParcelWriter.m4558B(parcel, 3, this.f44599d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f44600f, i, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f44601g, false);
        zzcv zzcv = this.f44602o;
        if (zzcv == null) {
            iBinder = null;
        } else {
            iBinder = zzcv.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 6, iBinder, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ zzef(zzee zzee) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzef(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.util.List r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.util.List r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param com.google.android.gms.nearby.exposurenotification.ExposureConfiguration r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r8) {
        /*
            r2 = this;
            com.google.android.gms.common.api.internal.IStatusCallback r4 = com.google.android.gms.common.api.internal.IStatusCallback.Stub.m3785ia(r4)
            if (r8 != 0) goto L_0x0008
            r8 = 0
            goto L_0x001c
        L_0x0008:
            java.lang.String r0 = "com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzcv
            if (r1 == 0) goto L_0x0016
            r8 = r0
            com.google.android.gms.internal.nearby.zzcv r8 = (com.google.android.gms.internal.nearby.zzcv) r8
            goto L_0x001c
        L_0x0016:
            com.google.android.gms.internal.nearby.zzct r0 = new com.google.android.gms.internal.nearby.zzct
            r0.<init>(r8)
            r8 = r0
        L_0x001c:
            r2.<init>()
            r2.f44597a = r3
            r2.f44598c = r4
            r2.f44599d = r5
            r2.f44600f = r6
            r2.f44601g = r7
            r2.f44602o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzef.<init>(java.util.List, android.os.IBinder, java.util.List, com.google.android.gms.nearby.exposurenotification.ExposureConfiguration, java.lang.String, android.os.IBinder):void");
    }
}
