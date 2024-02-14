package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: a */
    private final RootTelemetryConfiguration f3621a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f3622c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f3623d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final int[] f3624f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f3625g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final int[] f3626o;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param @NonNull RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable int[] iArr, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable int[] iArr2) {
        this.f3621a = rootTelemetryConfiguration;
        this.f3622c = z;
        this.f3623d = z2;
        this.f3624f = iArr;
        this.f3625g = i;
        this.f3626o = iArr2;
    }

    @KeepForSdk
    /* renamed from: l2 */
    public int mo21685l2() {
        return this.f3625g;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: m2 */
    public int[] mo21686m2() {
        return this.f3624f;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: n2 */
    public int[] mo21687n2() {
        return this.f3626o;
    }

    @KeepForSdk
    /* renamed from: o2 */
    public boolean mo21688o2() {
        return this.f3622c;
    }

    @KeepForSdk
    /* renamed from: p2 */
    public boolean mo21689p2() {
        return this.f3623d;
    }

    @NonNull
    /* renamed from: q2 */
    public final RootTelemetryConfiguration mo21690q2() {
        return this.f3621a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f3621a, i, false);
        SafeParcelWriter.m4565c(parcel, 2, mo21688o2());
        SafeParcelWriter.m4565c(parcel, 3, mo21689p2());
        SafeParcelWriter.m4577o(parcel, 4, mo21686m2(), false);
        SafeParcelWriter.m4576n(parcel, 5, mo21685l2());
        SafeParcelWriter.m4577o(parcel, 6, mo21687n2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
