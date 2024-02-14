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
public final class AdvertisingOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: A */
    public boolean f47368A;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: B */
    public boolean f47369B;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: C */
    private boolean f47370C;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: D */
    public boolean f47371D;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: E */
    private boolean f47372E;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: F */
    private int f47373F;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: G */
    private int f47374G;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: H */
    private byte[] f47375H;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: I */
    private long f47376I;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: J */
    private zzu[] f47377J;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: K */
    private boolean f47378K;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: L */
    public boolean f47379L;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: M */
    public boolean f47380M;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: N */
    private boolean f47381N;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: O */
    public int[] f47382O;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: P */
    public int[] f47383P;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: Q */
    private boolean f47384Q;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: R */
    public int f47385R;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: S */
    private byte[] f47386S;
    @SafeParcelable.Field

    /* renamed from: T */
    private boolean f47387T;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: U */
    public int f47388U;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public Strategy f47389a;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f47390c;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f47391d;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: f */
    public boolean f47392f;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: g */
    public boolean f47393g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private byte[] f47394o;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: p */
    public boolean f47395p;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private ParcelUuid f47396s;
    /* access modifiers changed from: private */
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: z */
    public boolean f47397z;

    @SafeParcelable.Reserved
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private final AdvertisingOptions f47398a = new AdvertisingOptions((zza) null);

        @NonNull
        /* renamed from: a */
        public AdvertisingOptions mo55645a() {
            int[] v2 = this.f47398a.f47382O;
            boolean z = false;
            if (v2 != null && v2.length > 0) {
                this.f47398a.f47393g = false;
                this.f47398a.f47392f = false;
                this.f47398a.f47368A = false;
                this.f47398a.f47369B = false;
                this.f47398a.f47397z = false;
                this.f47398a.f47371D = false;
                for (int i : v2) {
                    if (i == 2) {
                        this.f47398a.f47392f = true;
                    } else if (i == 9) {
                        this.f47398a.f47371D = true;
                    } else if (i == 4) {
                        this.f47398a.f47393g = true;
                    } else if (i == 5) {
                        this.f47398a.f47397z = true;
                    } else if (i == 6) {
                        this.f47398a.f47369B = true;
                    } else if (i != 7) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal advertising medium ");
                        sb.append(i);
                    } else {
                        this.f47398a.f47368A = true;
                    }
                }
            }
            if (this.f47398a.f47383P != null && this.f47398a.f47383P.length > 0) {
                this.f47398a.f47380M = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f47398a.f47383P.length) {
                        break;
                    } else if (this.f47398a.f47383P[i2] == 9) {
                        this.f47398a.f47380M = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int i3 = 3;
            if (this.f47398a.f47385R == 0) {
                AdvertisingOptions advertisingOptions = this.f47398a;
                if (true == advertisingOptions.f47395p) {
                    i3 = 1;
                }
                advertisingOptions.f47385R = i3;
            } else {
                AdvertisingOptions advertisingOptions2 = this.f47398a;
                advertisingOptions2.f47395p = advertisingOptions2.f47385R != 3;
            }
            if (this.f47398a.f47388U != 0) {
                AdvertisingOptions advertisingOptions3 = this.f47398a;
                if (advertisingOptions3.f47388U == 1) {
                    z = true;
                }
                advertisingOptions3.f47379L = z;
            } else if (!this.f47398a.f47379L) {
                this.f47398a.f47388U = 2;
            }
            return this.f47398a;
        }

        @NonNull
        /* renamed from: b */
        public Builder mo55646b(@NonNull Strategy strategy) {
            this.f47398a.f47389a = strategy;
            return this;
        }
    }

    private AdvertisingOptions() {
        this.f47390c = true;
        this.f47391d = true;
        this.f47392f = true;
        this.f47393g = true;
        this.f47395p = false;
        this.f47397z = true;
        this.f47368A = true;
        this.f47369B = true;
        this.f47370C = false;
        this.f47371D = false;
        this.f47372E = false;
        this.f47373F = 0;
        this.f47374G = 0;
        this.f47376I = 0;
        this.f47378K = false;
        this.f47379L = true;
        this.f47380M = false;
        this.f47381N = true;
        this.f47384Q = true;
        this.f47385R = 0;
        this.f47387T = true;
        this.f47388U = 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            return Objects.m4470a(this.f47389a, advertisingOptions.f47389a) && Objects.m4470a(Boolean.valueOf(this.f47390c), Boolean.valueOf(advertisingOptions.f47390c)) && Objects.m4470a(Boolean.valueOf(this.f47391d), Boolean.valueOf(advertisingOptions.f47391d)) && Objects.m4470a(Boolean.valueOf(this.f47392f), Boolean.valueOf(advertisingOptions.f47392f)) && Objects.m4470a(Boolean.valueOf(this.f47393g), Boolean.valueOf(advertisingOptions.f47393g)) && Arrays.equals(this.f47394o, advertisingOptions.f47394o) && Objects.m4470a(Boolean.valueOf(this.f47395p), Boolean.valueOf(advertisingOptions.f47395p)) && Objects.m4470a(this.f47396s, advertisingOptions.f47396s) && Objects.m4470a(Boolean.valueOf(this.f47397z), Boolean.valueOf(advertisingOptions.f47397z)) && Objects.m4470a(Boolean.valueOf(this.f47368A), Boolean.valueOf(advertisingOptions.f47368A)) && Objects.m4470a(Boolean.valueOf(this.f47369B), Boolean.valueOf(advertisingOptions.f47369B)) && Objects.m4470a(Boolean.valueOf(this.f47370C), Boolean.valueOf(advertisingOptions.f47370C)) && Objects.m4470a(Boolean.valueOf(this.f47371D), Boolean.valueOf(advertisingOptions.f47371D)) && Objects.m4470a(Boolean.valueOf(this.f47372E), Boolean.valueOf(advertisingOptions.f47372E)) && Objects.m4470a(Integer.valueOf(this.f47373F), Integer.valueOf(advertisingOptions.f47373F)) && Objects.m4470a(Integer.valueOf(this.f47374G), Integer.valueOf(advertisingOptions.f47374G)) && Arrays.equals(this.f47375H, advertisingOptions.f47375H) && Objects.m4470a(Long.valueOf(this.f47376I), Long.valueOf(advertisingOptions.f47376I)) && Arrays.equals(this.f47377J, advertisingOptions.f47377J) && Objects.m4470a(Boolean.valueOf(this.f47378K), Boolean.valueOf(advertisingOptions.f47378K)) && Objects.m4470a(Boolean.valueOf(this.f47379L), Boolean.valueOf(advertisingOptions.f47379L)) && Objects.m4470a(Boolean.valueOf(this.f47380M), Boolean.valueOf(advertisingOptions.f47380M)) && Objects.m4470a(Boolean.valueOf(this.f47381N), Boolean.valueOf(advertisingOptions.f47381N)) && Arrays.equals(this.f47382O, advertisingOptions.f47382O) && Arrays.equals(this.f47383P, advertisingOptions.f47383P) && Objects.m4470a(Boolean.valueOf(this.f47384Q), Boolean.valueOf(advertisingOptions.f47384Q)) && Objects.m4470a(Integer.valueOf(this.f47385R), Integer.valueOf(advertisingOptions.f47385R)) && Objects.m4470a(this.f47386S, advertisingOptions.f47386S) && Objects.m4470a(Boolean.valueOf(this.f47387T), Boolean.valueOf(advertisingOptions.f47387T)) && Objects.m4470a(Integer.valueOf(this.f47388U), Integer.valueOf(advertisingOptions.f47388U));
        }
    }

    public int hashCode() {
        return Objects.m4471b(this.f47389a, Boolean.valueOf(this.f47390c), Boolean.valueOf(this.f47391d), Boolean.valueOf(this.f47392f), Boolean.valueOf(this.f47393g), Integer.valueOf(Arrays.hashCode(this.f47394o)), Boolean.valueOf(this.f47395p), this.f47396s, Boolean.valueOf(this.f47397z), Boolean.valueOf(this.f47368A), Boolean.valueOf(this.f47369B), Boolean.valueOf(this.f47370C), Boolean.valueOf(this.f47371D), Boolean.valueOf(this.f47372E), Integer.valueOf(this.f47373F), Integer.valueOf(this.f47374G), Integer.valueOf(Arrays.hashCode(this.f47375H)), Long.valueOf(this.f47376I), Integer.valueOf(Arrays.hashCode(this.f47377J)), Boolean.valueOf(this.f47378K), Boolean.valueOf(this.f47379L), Boolean.valueOf(this.f47380M), Boolean.valueOf(this.f47381N), Integer.valueOf(Arrays.hashCode(this.f47382O)), Integer.valueOf(Arrays.hashCode(this.f47383P)), Boolean.valueOf(this.f47384Q), Integer.valueOf(this.f47385R), this.f47386S, Boolean.valueOf(this.f47387T), Integer.valueOf(this.f47388U));
    }

    /* renamed from: l2 */
    public int mo55639l2() {
        return this.f47388U;
    }

    @Deprecated
    /* renamed from: m2 */
    public boolean mo55640m2() {
        return this.f47379L;
    }

    /* renamed from: n2 */
    public boolean mo55641n2() {
        return this.f47395p;
    }

    @NonNull
    /* renamed from: o2 */
    public Strategy mo55642o2() {
        return this.f47389a;
    }

    @NonNull
    public String toString() {
        String str;
        String str2;
        Locale locale = Locale.US;
        Object[] objArr = new Object[25];
        objArr[0] = this.f47389a;
        objArr[1] = Boolean.valueOf(this.f47390c);
        objArr[2] = Boolean.valueOf(this.f47391d);
        objArr[3] = Boolean.valueOf(this.f47392f);
        objArr[4] = Boolean.valueOf(this.f47393g);
        byte[] bArr = this.f47394o;
        String str3 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = zzc.m66517b(bArr);
        }
        objArr[5] = str;
        objArr[6] = Boolean.valueOf(this.f47395p);
        objArr[7] = this.f47396s;
        objArr[8] = Boolean.valueOf(this.f47397z);
        objArr[9] = Boolean.valueOf(this.f47368A);
        objArr[10] = Boolean.valueOf(this.f47369B);
        objArr[11] = Boolean.valueOf(this.f47370C);
        objArr[12] = Boolean.valueOf(this.f47371D);
        objArr[13] = Boolean.valueOf(this.f47372E);
        objArr[14] = Integer.valueOf(this.f47373F);
        objArr[15] = Integer.valueOf(this.f47374G);
        byte[] bArr2 = this.f47375H;
        if (bArr2 == null) {
            str2 = "null";
        } else {
            str2 = zzc.m66517b(bArr2);
        }
        objArr[16] = str2;
        objArr[17] = Long.valueOf(this.f47376I);
        objArr[18] = Arrays.toString(this.f47377J);
        objArr[19] = Boolean.valueOf(this.f47378K);
        objArr[20] = Boolean.valueOf(this.f47379L);
        objArr[21] = Boolean.valueOf(this.f47381N);
        byte[] bArr3 = this.f47386S;
        if (bArr3 != null) {
            str3 = zzc.m66517b(bArr3);
        }
        objArr[22] = str3;
        objArr[23] = Boolean.valueOf(this.f47387T);
        objArr[24] = Integer.valueOf(this.f47388U);
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s,useStableIdentifiers: %s,deviceInfo: %s,allowGattConnections: %s,connectionType: %d}", objArr);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo55642o2(), i, false);
        SafeParcelWriter.m4565c(parcel, 2, this.f47390c);
        SafeParcelWriter.m4565c(parcel, 3, this.f47391d);
        SafeParcelWriter.m4565c(parcel, 4, this.f47392f);
        SafeParcelWriter.m4565c(parcel, 5, this.f47393g);
        SafeParcelWriter.m4569g(parcel, 6, this.f47394o, false);
        SafeParcelWriter.m4565c(parcel, 7, mo55641n2());
        SafeParcelWriter.m4584v(parcel, 8, this.f47396s, i, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f47397z);
        SafeParcelWriter.m4565c(parcel, 10, this.f47368A);
        SafeParcelWriter.m4565c(parcel, 11, this.f47369B);
        SafeParcelWriter.m4565c(parcel, 12, this.f47370C);
        SafeParcelWriter.m4565c(parcel, 13, this.f47371D);
        SafeParcelWriter.m4565c(parcel, 14, this.f47372E);
        SafeParcelWriter.m4576n(parcel, 15, this.f47373F);
        SafeParcelWriter.m4576n(parcel, 16, this.f47374G);
        SafeParcelWriter.m4569g(parcel, 17, this.f47375H, false);
        SafeParcelWriter.m4581s(parcel, 18, this.f47376I);
        SafeParcelWriter.m4557A(parcel, 19, this.f47377J, i, false);
        SafeParcelWriter.m4565c(parcel, 20, this.f47378K);
        SafeParcelWriter.m4565c(parcel, 21, mo55640m2());
        SafeParcelWriter.m4565c(parcel, 22, this.f47380M);
        SafeParcelWriter.m4565c(parcel, 23, this.f47381N);
        SafeParcelWriter.m4577o(parcel, 24, this.f47382O, false);
        SafeParcelWriter.m4577o(parcel, 25, this.f47383P, false);
        SafeParcelWriter.m4565c(parcel, 26, this.f47384Q);
        SafeParcelWriter.m4576n(parcel, 27, this.f47385R);
        SafeParcelWriter.m4569g(parcel, 28, this.f47386S, false);
        SafeParcelWriter.m4565c(parcel, 29, this.f47387T);
        SafeParcelWriter.m4576n(parcel, 30, mo55639l2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ AdvertisingOptions(zza zza) {
        this.f47390c = true;
        this.f47391d = true;
        this.f47392f = true;
        this.f47393g = true;
        this.f47395p = false;
        this.f47397z = true;
        this.f47368A = true;
        this.f47369B = true;
        this.f47370C = false;
        this.f47371D = false;
        this.f47372E = false;
        this.f47373F = 0;
        this.f47374G = 0;
        this.f47376I = 0;
        this.f47378K = false;
        this.f47379L = true;
        this.f47380M = false;
        this.f47381N = true;
        this.f47384Q = true;
        this.f47385R = 0;
        this.f47387T = true;
        this.f47388U = 0;
    }

    @SafeParcelable.Constructor
    AdvertisingOptions(@SafeParcelable.Param Strategy strategy, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param boolean z5, @SafeParcelable.Param @Nullable ParcelUuid parcelUuid, @SafeParcelable.Param boolean z6, @SafeParcelable.Param boolean z7, @SafeParcelable.Param boolean z8, @SafeParcelable.Param boolean z9, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable byte[] bArr2, @SafeParcelable.Param long j, @SafeParcelable.Param zzu[] zzuArr, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int[] iArr2, @SafeParcelable.Param boolean z16, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable byte[] bArr3, @SafeParcelable.Param boolean z17, @SafeParcelable.Param int i4) {
        this.f47389a = strategy;
        this.f47390c = z;
        this.f47391d = z2;
        this.f47392f = z3;
        this.f47393g = z4;
        this.f47394o = bArr;
        this.f47395p = z5;
        this.f47396s = parcelUuid;
        this.f47397z = z6;
        this.f47368A = z7;
        this.f47369B = z8;
        this.f47370C = z9;
        this.f47371D = z10;
        this.f47372E = z11;
        this.f47373F = i;
        this.f47374G = i2;
        this.f47375H = bArr2;
        this.f47376I = j;
        this.f47377J = zzuArr;
        this.f47378K = z12;
        this.f47379L = z13;
        this.f47380M = z14;
        this.f47381N = z15;
        this.f47382O = iArr;
        this.f47383P = iArr2;
        this.f47384Q = z16;
        this.f47385R = i3;
        this.f47386S = bArr3;
        this.f47387T = z17;
        this.f47388U = i4;
    }
}
