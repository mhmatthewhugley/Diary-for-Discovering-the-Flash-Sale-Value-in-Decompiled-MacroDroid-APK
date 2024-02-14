package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzc;
import java.util.Arrays;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzo();
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: A */
    private boolean f47434A;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: B */
    private int f47435B;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: C */
    private int f47436C;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: D */
    private byte[] f47437D;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: E */
    private long f47438E;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: F */
    public int[] f47439F;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: G */
    private boolean f47440G;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public Strategy f47441a;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f47442c;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: d */
    public boolean f47443d;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: f */
    public boolean f47444f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f47445g;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private ParcelUuid f47446o;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: p */
    public boolean f47447p;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: s */
    public boolean f47448s;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: z */
    public boolean f47449z;

    @SafeParcelable.Reserved
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private final DiscoveryOptions f47450a = new DiscoveryOptions((zzn) null);

        @NonNull
        /* renamed from: a */
        public DiscoveryOptions mo55676a() {
            int[] o2 = this.f47450a.f47439F;
            if (o2 != null && o2.length > 0) {
                this.f47450a.f47444f = false;
                this.f47450a.f47443d = false;
                this.f47450a.f47448s = false;
                this.f47450a.f47449z = false;
                this.f47450a.f47447p = false;
                for (int i : o2) {
                    if (i == 2) {
                        this.f47450a.f47443d = true;
                    } else if (i == 4) {
                        this.f47450a.f47444f = true;
                    } else if (i == 5) {
                        this.f47450a.f47447p = true;
                    } else if (i == 6) {
                        this.f47450a.f47449z = true;
                    } else if (i != 7) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal discovery medium ");
                        sb.append(i);
                    } else {
                        this.f47450a.f47448s = true;
                    }
                }
            }
            return this.f47450a;
        }

        @NonNull
        /* renamed from: b */
        public Builder mo55677b(@NonNull Strategy strategy) {
            this.f47450a.f47441a = strategy;
            return this;
        }
    }

    private DiscoveryOptions() {
        this.f47442c = false;
        this.f47443d = true;
        this.f47444f = true;
        this.f47445g = false;
        this.f47447p = true;
        this.f47448s = true;
        this.f47449z = true;
        this.f47434A = false;
        this.f47435B = 0;
        this.f47436C = 0;
        this.f47438E = 0;
        this.f47440G = true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            return Objects.m4470a(this.f47441a, discoveryOptions.f47441a) && Objects.m4470a(Boolean.valueOf(this.f47442c), Boolean.valueOf(discoveryOptions.f47442c)) && Objects.m4470a(Boolean.valueOf(this.f47443d), Boolean.valueOf(discoveryOptions.f47443d)) && Objects.m4470a(Boolean.valueOf(this.f47444f), Boolean.valueOf(discoveryOptions.f47444f)) && Objects.m4470a(Boolean.valueOf(this.f47445g), Boolean.valueOf(discoveryOptions.f47445g)) && Objects.m4470a(this.f47446o, discoveryOptions.f47446o) && Objects.m4470a(Boolean.valueOf(this.f47447p), Boolean.valueOf(discoveryOptions.f47447p)) && Objects.m4470a(Boolean.valueOf(this.f47448s), Boolean.valueOf(discoveryOptions.f47448s)) && Objects.m4470a(Boolean.valueOf(this.f47449z), Boolean.valueOf(discoveryOptions.f47449z)) && Objects.m4470a(Boolean.valueOf(this.f47434A), Boolean.valueOf(discoveryOptions.f47434A)) && Objects.m4470a(Integer.valueOf(this.f47435B), Integer.valueOf(discoveryOptions.f47435B)) && Objects.m4470a(Integer.valueOf(this.f47436C), Integer.valueOf(discoveryOptions.f47436C)) && Arrays.equals(this.f47437D, discoveryOptions.f47437D) && Objects.m4470a(Long.valueOf(this.f47438E), Long.valueOf(discoveryOptions.f47438E)) && Arrays.equals(this.f47439F, discoveryOptions.f47439F) && Objects.m4470a(Boolean.valueOf(this.f47440G), Boolean.valueOf(discoveryOptions.f47440G));
        }
    }

    public int hashCode() {
        return Objects.m4471b(this.f47441a, Boolean.valueOf(this.f47442c), Boolean.valueOf(this.f47443d), Boolean.valueOf(this.f47444f), Boolean.valueOf(this.f47445g), this.f47446o, Boolean.valueOf(this.f47447p), Boolean.valueOf(this.f47448s), Boolean.valueOf(this.f47449z), Boolean.valueOf(this.f47434A), Integer.valueOf(this.f47435B), Integer.valueOf(this.f47436C), Integer.valueOf(Arrays.hashCode(this.f47437D)), Long.valueOf(this.f47438E), Integer.valueOf(Arrays.hashCode(this.f47439F)), Boolean.valueOf(this.f47440G));
    }

    /* renamed from: l2 */
    public boolean mo55671l2() {
        return this.f47445g;
    }

    @NonNull
    /* renamed from: m2 */
    public Strategy mo55672m2() {
        return this.f47441a;
    }

    @ShowFirstParty
    /* renamed from: n2 */
    public final boolean mo55673n2() {
        return this.f47448s;
    }

    @NonNull
    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        objArr[0] = this.f47441a;
        objArr[1] = Boolean.valueOf(this.f47442c);
        objArr[2] = Boolean.valueOf(this.f47443d);
        objArr[3] = Boolean.valueOf(this.f47444f);
        objArr[4] = Boolean.valueOf(this.f47445g);
        objArr[5] = this.f47446o;
        objArr[6] = Boolean.valueOf(this.f47447p);
        objArr[7] = Boolean.valueOf(this.f47448s);
        objArr[8] = Boolean.valueOf(this.f47449z);
        objArr[9] = Boolean.valueOf(this.f47434A);
        objArr[10] = Integer.valueOf(this.f47435B);
        objArr[11] = Integer.valueOf(this.f47436C);
        byte[] bArr = this.f47437D;
        if (bArr == null) {
            str = "null";
        } else {
            str = zzc.m66517b(bArr);
        }
        objArr[12] = str;
        objArr[13] = Long.valueOf(this.f47438E);
        objArr[14] = Boolean.valueOf(this.f47440G);
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, allowGattConnections: %s}", objArr);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo55672m2(), i, false);
        SafeParcelWriter.m4565c(parcel, 2, this.f47442c);
        SafeParcelWriter.m4565c(parcel, 3, this.f47443d);
        SafeParcelWriter.m4565c(parcel, 4, this.f47444f);
        SafeParcelWriter.m4565c(parcel, 5, mo55671l2());
        SafeParcelWriter.m4584v(parcel, 6, this.f47446o, i, false);
        SafeParcelWriter.m4565c(parcel, 8, this.f47447p);
        SafeParcelWriter.m4565c(parcel, 9, this.f47448s);
        SafeParcelWriter.m4565c(parcel, 10, this.f47449z);
        SafeParcelWriter.m4565c(parcel, 11, this.f47434A);
        SafeParcelWriter.m4576n(parcel, 12, this.f47435B);
        SafeParcelWriter.m4576n(parcel, 13, this.f47436C);
        SafeParcelWriter.m4569g(parcel, 14, this.f47437D, false);
        SafeParcelWriter.m4581s(parcel, 15, this.f47438E);
        SafeParcelWriter.m4577o(parcel, 16, this.f47439F, false);
        SafeParcelWriter.m4565c(parcel, 17, this.f47440G);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ DiscoveryOptions(zzn zzn) {
        this.f47442c = false;
        this.f47443d = true;
        this.f47444f = true;
        this.f47445g = false;
        this.f47447p = true;
        this.f47448s = true;
        this.f47449z = true;
        this.f47434A = false;
        this.f47435B = 0;
        this.f47436C = 0;
        this.f47438E = 0;
        this.f47440G = true;
    }

    @SafeParcelable.Constructor
    DiscoveryOptions(@SafeParcelable.Param Strategy strategy, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param @Nullable ParcelUuid parcelUuid, @SafeParcelable.Param boolean z5, @SafeParcelable.Param boolean z6, @SafeParcelable.Param boolean z7, @SafeParcelable.Param boolean z8, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param long j, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param boolean z9) {
        this.f47440G = true;
        this.f47441a = strategy;
        this.f47442c = z;
        this.f47443d = z2;
        this.f47444f = z3;
        this.f47445g = z4;
        this.f47446o = parcelUuid;
        this.f47447p = z5;
        this.f47448s = z6;
        this.f47449z = z7;
        this.f47434A = z8;
        this.f47435B = i;
        this.f47436C = i2;
        this.f47437D = bArr;
        this.f47438E = j;
        this.f47439F = iArr;
    }
}
