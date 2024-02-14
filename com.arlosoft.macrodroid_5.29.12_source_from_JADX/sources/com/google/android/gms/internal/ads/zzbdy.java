package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdy> CREATOR = new zzbdz();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private ParcelFileDescriptor f26674a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f26675c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f26676d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final long f26677f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f26678g;

    public zzbdy() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    /* renamed from: l2 */
    public final synchronized long mo42519l2() {
        return this.f26677f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public final synchronized ParcelFileDescriptor mo42520m2() {
        return this.f26674a;
    }

    @Nullable
    /* renamed from: n2 */
    public final synchronized InputStream mo42521n2() {
        if (this.f26674a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f26674a);
        this.f26674a = null;
        return autoCloseInputStream;
    }

    /* renamed from: o2 */
    public final synchronized boolean mo42522o2() {
        return this.f26675c;
    }

    /* renamed from: p2 */
    public final synchronized boolean mo42523p2() {
        return this.f26674a != null;
    }

    /* renamed from: q2 */
    public final synchronized boolean mo42524q2() {
        return this.f26676d;
    }

    /* renamed from: r2 */
    public final synchronized boolean mo42525r2() {
        return this.f26678g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, mo42520m2(), i, false);
        SafeParcelWriter.m4565c(parcel, 3, mo42522o2());
        SafeParcelWriter.m4565c(parcel, 4, mo42524q2());
        SafeParcelWriter.m4581s(parcel, 5, mo42519l2());
        SafeParcelWriter.m4565c(parcel, 6, mo42525r2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzbdy(@SafeParcelable.Param @Nullable ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z3) {
        this.f26674a = parcelFileDescriptor;
        this.f26675c = z;
        this.f26676d = z2;
        this.f26677f = j;
        this.f26678g = z3;
    }
}
