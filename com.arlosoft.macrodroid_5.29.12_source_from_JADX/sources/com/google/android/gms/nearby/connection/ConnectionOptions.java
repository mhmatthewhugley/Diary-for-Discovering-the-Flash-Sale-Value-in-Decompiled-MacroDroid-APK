package com.google.android.gms.nearby.connection;

import android.os.Parcel;
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
public final class ConnectionOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzj();
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: A */
    private boolean f47408A;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: B */
    private boolean f47409B;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: C */
    private boolean f47410C;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: D */
    private int f47411D;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: E */
    private int f47412E;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: F */
    private int[] f47413F;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: G */
    private int[] f47414G;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: H */
    private byte[] f47415H;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: I */
    private Strategy f47416I;
    @SafeParcelable.Field

    /* renamed from: J */
    private int f47417J;
    @SafeParcelable.Field

    /* renamed from: a */
    private boolean f47418a;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f47419c;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: d */
    private boolean f47420d;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f47421f;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f47422g;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: o */
    private boolean f47423o;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f47424p;
    @ShowFirstParty
    @SafeParcelable.Field

    /* renamed from: s */
    private boolean f47425s;
    @ShowFirstParty
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    private byte[] f47426z;

    @SafeParcelable.Reserved
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private final ConnectionOptions f47427a = new ConnectionOptions((zzi) null);
    }

    private ConnectionOptions() {
        this.f47418a = false;
        this.f47419c = true;
        this.f47420d = true;
        this.f47421f = true;
        this.f47422g = true;
        this.f47423o = true;
        this.f47424p = true;
        this.f47425s = true;
        this.f47408A = false;
        this.f47409B = true;
        this.f47410C = true;
        this.f47411D = 0;
        this.f47412E = 0;
        this.f47417J = 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            return Objects.m4470a(Boolean.valueOf(this.f47418a), Boolean.valueOf(connectionOptions.f47418a)) && Objects.m4470a(Boolean.valueOf(this.f47419c), Boolean.valueOf(connectionOptions.f47419c)) && Objects.m4470a(Boolean.valueOf(this.f47420d), Boolean.valueOf(connectionOptions.f47420d)) && Objects.m4470a(Boolean.valueOf(this.f47421f), Boolean.valueOf(connectionOptions.f47421f)) && Objects.m4470a(Boolean.valueOf(this.f47422g), Boolean.valueOf(connectionOptions.f47422g)) && Objects.m4470a(Boolean.valueOf(this.f47423o), Boolean.valueOf(connectionOptions.f47423o)) && Objects.m4470a(Boolean.valueOf(this.f47424p), Boolean.valueOf(connectionOptions.f47424p)) && Objects.m4470a(Boolean.valueOf(this.f47425s), Boolean.valueOf(connectionOptions.f47425s)) && Arrays.equals(this.f47426z, connectionOptions.f47426z) && Objects.m4470a(Boolean.valueOf(this.f47408A), Boolean.valueOf(connectionOptions.f47408A)) && Objects.m4470a(Boolean.valueOf(this.f47409B), Boolean.valueOf(connectionOptions.f47409B)) && Objects.m4470a(Boolean.valueOf(this.f47410C), Boolean.valueOf(connectionOptions.f47410C)) && Objects.m4470a(Integer.valueOf(this.f47411D), Integer.valueOf(connectionOptions.f47411D)) && Objects.m4470a(Integer.valueOf(this.f47412E), Integer.valueOf(connectionOptions.f47412E)) && Arrays.equals(this.f47413F, connectionOptions.f47413F) && Arrays.equals(this.f47414G, connectionOptions.f47414G) && Arrays.equals(this.f47415H, connectionOptions.f47415H) && Objects.m4470a(this.f47416I, connectionOptions.f47416I) && Objects.m4470a(Integer.valueOf(this.f47417J), Integer.valueOf(connectionOptions.f47417J));
        }
    }

    public int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f47418a), Boolean.valueOf(this.f47419c), Boolean.valueOf(this.f47420d), Boolean.valueOf(this.f47421f), Boolean.valueOf(this.f47422g), Boolean.valueOf(this.f47423o), Boolean.valueOf(this.f47424p), Boolean.valueOf(this.f47425s), Integer.valueOf(Arrays.hashCode(this.f47426z)), Boolean.valueOf(this.f47408A), Boolean.valueOf(this.f47409B), Boolean.valueOf(this.f47410C), Integer.valueOf(this.f47411D), Integer.valueOf(this.f47412E), Integer.valueOf(Arrays.hashCode(this.f47413F)), Integer.valueOf(Arrays.hashCode(this.f47414G)), Integer.valueOf(Arrays.hashCode(this.f47415H)), this.f47416I, Integer.valueOf(this.f47417J));
    }

    /* renamed from: l2 */
    public int mo55654l2() {
        return this.f47417J;
    }

    @Deprecated
    /* renamed from: m2 */
    public boolean mo55655m2() {
        return this.f47410C;
    }

    /* renamed from: n2 */
    public boolean mo55656n2() {
        return this.f47418a;
    }

    @NonNull
    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        objArr[0] = Boolean.valueOf(this.f47418a);
        objArr[1] = Boolean.valueOf(this.f47419c);
        objArr[2] = Boolean.valueOf(this.f47420d);
        objArr[3] = Boolean.valueOf(this.f47421f);
        objArr[4] = Boolean.valueOf(this.f47422g);
        objArr[5] = Boolean.valueOf(this.f47423o);
        objArr[6] = Boolean.valueOf(this.f47424p);
        objArr[7] = Boolean.valueOf(this.f47425s);
        byte[] bArr = this.f47426z;
        String str2 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = zzc.m66517b(bArr);
        }
        objArr[8] = str;
        objArr[9] = Boolean.valueOf(this.f47408A);
        objArr[10] = Boolean.valueOf(this.f47409B);
        objArr[11] = Boolean.valueOf(this.f47410C);
        byte[] bArr2 = this.f47415H;
        if (bArr2 != null) {
            str2 = zzc.m66517b(bArr2);
        }
        objArr[12] = str2;
        objArr[13] = this.f47416I;
        objArr[14] = Integer.valueOf(this.f47417J);
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s,deviceInfo: %s,strategy: %s,connectionType: %d}", objArr);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, mo55656n2());
        SafeParcelWriter.m4565c(parcel, 2, this.f47419c);
        SafeParcelWriter.m4565c(parcel, 3, this.f47420d);
        SafeParcelWriter.m4565c(parcel, 4, this.f47421f);
        SafeParcelWriter.m4565c(parcel, 5, this.f47422g);
        SafeParcelWriter.m4565c(parcel, 6, this.f47423o);
        SafeParcelWriter.m4565c(parcel, 7, this.f47424p);
        SafeParcelWriter.m4565c(parcel, 8, this.f47425s);
        SafeParcelWriter.m4569g(parcel, 9, this.f47426z, false);
        SafeParcelWriter.m4565c(parcel, 10, this.f47408A);
        SafeParcelWriter.m4565c(parcel, 11, this.f47409B);
        SafeParcelWriter.m4565c(parcel, 12, mo55655m2());
        SafeParcelWriter.m4576n(parcel, 13, this.f47411D);
        SafeParcelWriter.m4576n(parcel, 14, this.f47412E);
        SafeParcelWriter.m4577o(parcel, 15, this.f47413F, false);
        SafeParcelWriter.m4577o(parcel, 16, this.f47414G, false);
        SafeParcelWriter.m4569g(parcel, 17, this.f47415H, false);
        SafeParcelWriter.m4584v(parcel, 18, this.f47416I, i, false);
        SafeParcelWriter.m4576n(parcel, 19, mo55654l2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ ConnectionOptions(zzi zzi) {
        this.f47418a = false;
        this.f47419c = true;
        this.f47420d = true;
        this.f47421f = true;
        this.f47422g = true;
        this.f47423o = true;
        this.f47424p = true;
        this.f47425s = true;
        this.f47408A = false;
        this.f47409B = true;
        this.f47410C = true;
        this.f47411D = 0;
        this.f47412E = 0;
        this.f47417J = 0;
    }

    @SafeParcelable.Constructor
    ConnectionOptions(@SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @SafeParcelable.Param boolean z5, @SafeParcelable.Param boolean z6, @SafeParcelable.Param boolean z7, @SafeParcelable.Param boolean z8, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param boolean z9, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int[] iArr2, @SafeParcelable.Param @Nullable byte[] bArr2, @SafeParcelable.Param Strategy strategy, @SafeParcelable.Param int i3) {
        this.f47418a = z;
        this.f47419c = z2;
        this.f47420d = z3;
        this.f47421f = z4;
        this.f47422g = z5;
        this.f47423o = z6;
        this.f47424p = z7;
        this.f47425s = z8;
        this.f47426z = bArr;
        this.f47408A = z9;
        this.f47409B = z10;
        this.f47410C = z11;
        this.f47411D = i;
        this.f47412E = i2;
        this.f47413F = iArr;
        this.f47414G = iArr2;
        this.f47415H = bArr2;
        this.f47416I = strategy;
        this.f47417J = i3;
    }
}
