package com.google.android.gms.internal.nearby;

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
public final class zzoj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoj> CREATOR = new zzok();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzpe f44996a;

    private zzoj() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzoj) {
            return Objects.m4470a(this.f44996a, ((zzoj) obj).f44996a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44996a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, this.f44996a.asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzoj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param android.os.IBinder r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzpe
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzpe r3 = (com.google.android.gms.internal.nearby.zzpe) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzpc r0 = new com.google.android.gms.internal.nearby.zzpc
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.f44996a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzoj.<init>(android.os.IBinder):void");
    }

    /* synthetic */ zzoj(zzoi zzoi) {
    }
}
