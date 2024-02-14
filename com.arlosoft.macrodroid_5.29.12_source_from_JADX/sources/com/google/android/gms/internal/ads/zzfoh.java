package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoh> CREATOR = new zzfoi();
    @SafeParcelable.VersionField

    /* renamed from: a */
    public final int f36190a;
    @SafeParcelable.Field

    /* renamed from: c */
    private zzana f36191c = null;

    /* renamed from: d */
    private byte[] f36192d;

    @SafeParcelable.Constructor
    zzfoh(@SafeParcelable.Param int i, @SafeParcelable.Param byte[] bArr) {
        this.f36190a = i;
        this.f36192d = bArr;
        zzb();
    }

    private final void zzb() {
        zzana zzana = this.f36191c;
        if (zzana == null && this.f36192d != null) {
            return;
        }
        if (zzana != null && this.f36192d == null) {
            return;
        }
        if (zzana != null && this.f36192d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzana == null && this.f36192d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: l2 */
    public final zzana mo46028l2() {
        if (this.f36191c == null) {
            try {
                this.f36191c = zzana.m41872A0(this.f36192d, zzgqq.m52900a());
                this.f36192d = null;
            } catch (zzgrq | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.f36191c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f36190a);
        byte[] bArr = this.f36192d;
        if (bArr == null) {
            bArr = this.f36191c.mo47050p();
        }
        SafeParcelWriter.m4569g(parcel, 2, bArr, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
