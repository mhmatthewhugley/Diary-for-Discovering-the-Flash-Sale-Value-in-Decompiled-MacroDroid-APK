package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zzd();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    private String f48067A;
    @SafeParcelable.Field

    /* renamed from: B */
    private int f48068B;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: C */
    private List f48069C;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f48070a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f48071c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f48072d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f48073f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f48074g;
    @SafeParcelable.Field

    /* renamed from: o */
    private volatile boolean f48075o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private volatile String f48076p;
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f48077s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    private String f48078z;

    @SafeParcelable.Constructor
    ConnectionConfiguration(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param boolean z3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable List list) {
        this.f48070a = str;
        this.f48071c = str2;
        this.f48072d = i;
        this.f48073f = i2;
        this.f48074g = z;
        this.f48075o = z2;
        this.f48076p = str3;
        this.f48077s = z3;
        this.f48078z = str4;
        this.f48067A = str5;
        this.f48068B = i3;
        this.f48069C = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (!Objects.m4470a(this.f48070a, connectionConfiguration.f48070a) || !Objects.m4470a(this.f48071c, connectionConfiguration.f48071c) || !Objects.m4470a(Integer.valueOf(this.f48072d), Integer.valueOf(connectionConfiguration.f48072d)) || !Objects.m4470a(Integer.valueOf(this.f48073f), Integer.valueOf(connectionConfiguration.f48073f)) || !Objects.m4470a(Boolean.valueOf(this.f48074g), Boolean.valueOf(connectionConfiguration.f48074g)) || !Objects.m4470a(Boolean.valueOf(this.f48077s), Boolean.valueOf(connectionConfiguration.f48077s))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f48070a, this.f48071c, Integer.valueOf(this.f48072d), Integer.valueOf(this.f48073f), Boolean.valueOf(this.f48074g), Boolean.valueOf(this.f48077s));
    }

    @NonNull
    public final String toString() {
        return "ConnectionConfiguration[ " + "Name=" + this.f48070a + ", Address=" + this.f48071c + ", Type=" + this.f48072d + ", Role=" + this.f48073f + ", Enabled=" + this.f48074g + ", IsConnected=" + this.f48075o + ", PeerNodeId=" + this.f48076p + ", BtlePriority=" + this.f48077s + ", NodeId=" + this.f48078z + ", PackageName=" + this.f48067A + ", ConnectionRetryStrategy=" + this.f48068B + ", allowedConfigPackages=" + this.f48069C + "]";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48070a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f48071c, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f48072d);
        SafeParcelWriter.m4576n(parcel, 5, this.f48073f);
        SafeParcelWriter.m4565c(parcel, 6, this.f48074g);
        SafeParcelWriter.m4565c(parcel, 7, this.f48075o);
        SafeParcelWriter.m4586x(parcel, 8, this.f48076p, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f48077s);
        SafeParcelWriter.m4586x(parcel, 10, this.f48078z, false);
        SafeParcelWriter.m4586x(parcel, 11, this.f48067A, false);
        SafeParcelWriter.m4576n(parcel, 12, this.f48068B);
        SafeParcelWriter.m4588z(parcel, 13, this.f48069C, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
