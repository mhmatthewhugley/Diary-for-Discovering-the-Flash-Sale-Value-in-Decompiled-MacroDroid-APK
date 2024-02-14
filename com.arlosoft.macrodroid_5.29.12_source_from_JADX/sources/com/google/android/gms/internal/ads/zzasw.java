package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.location.LocationRequestCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzasw implements Parcelable {
    public static final Parcelable.Creator<zzasw> CREATOR = new zzasv();

    /* renamed from: A */
    public final int f25504A;

    /* renamed from: B */
    public final int f25505B;

    /* renamed from: C */
    public final float f25506C;

    /* renamed from: D */
    public final int f25507D;

    /* renamed from: E */
    public final float f25508E;

    /* renamed from: F */
    public final int f25509F;

    /* renamed from: G */
    public final byte[] f25510G;

    /* renamed from: H */
    public final zzbau f25511H;

    /* renamed from: I */
    public final int f25512I;

    /* renamed from: J */
    public final int f25513J;

    /* renamed from: K */
    public final int f25514K;

    /* renamed from: L */
    public final int f25515L;

    /* renamed from: M */
    public final int f25516M;

    /* renamed from: N */
    public final long f25517N;

    /* renamed from: O */
    public final int f25518O;

    /* renamed from: P */
    public final String f25519P;

    /* renamed from: Q */
    public final int f25520Q;

    /* renamed from: R */
    private int f25521R;

    /* renamed from: a */
    public final String f25522a;

    /* renamed from: c */
    public final int f25523c;

    /* renamed from: d */
    public final String f25524d;

    /* renamed from: f */
    public final zzaxh f25525f;

    /* renamed from: g */
    public final String f25526g;

    /* renamed from: o */
    public final String f25527o;

    /* renamed from: p */
    public final int f25528p;

    /* renamed from: s */
    public final List f25529s;

    /* renamed from: z */
    public final zzauv f25530z;

    zzasw(Parcel parcel) {
        this.f25522a = parcel.readString();
        this.f25526g = parcel.readString();
        this.f25527o = parcel.readString();
        this.f25524d = parcel.readString();
        this.f25523c = parcel.readInt();
        this.f25528p = parcel.readInt();
        this.f25504A = parcel.readInt();
        this.f25505B = parcel.readInt();
        this.f25506C = parcel.readFloat();
        this.f25507D = parcel.readInt();
        this.f25508E = parcel.readFloat();
        this.f25510G = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f25509F = parcel.readInt();
        this.f25511H = (zzbau) parcel.readParcelable(zzbau.class.getClassLoader());
        this.f25512I = parcel.readInt();
        this.f25513J = parcel.readInt();
        this.f25514K = parcel.readInt();
        this.f25515L = parcel.readInt();
        this.f25516M = parcel.readInt();
        this.f25518O = parcel.readInt();
        this.f25519P = parcel.readString();
        this.f25520Q = parcel.readInt();
        this.f25517N = parcel.readLong();
        int readInt = parcel.readInt();
        this.f25529s = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f25529s.add(parcel.createByteArray());
        }
        this.f25530z = (zzauv) parcel.readParcelable(zzauv.class.getClassLoader());
        this.f25525f = (zzaxh) parcel.readParcelable(zzaxh.class.getClassLoader());
    }

    /* renamed from: g */
    public static zzasw m42370g(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzauv zzauv, int i5, String str4) {
        return m42371h(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List) null, zzauv, 0, str4, (zzaxh) null);
    }

    /* renamed from: h */
    public static zzasw m42371h(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzauv zzauv, int i8, String str4, zzaxh zzaxh) {
        return new zzasw(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbau) null, i3, i4, i5, -1, -1, i8, str4, -1, LocationRequestCompat.PASSIVE_INTERVAL, list, zzauv, (zzaxh) null);
    }

    /* renamed from: i */
    public static zzasw m42372i(String str, String str2, String str3, int i, List list, String str4, zzauv zzauv) {
        return new zzasw(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbau) null, -1, -1, -1, -1, -1, 0, str4, -1, LocationRequestCompat.PASSIVE_INTERVAL, list, zzauv, (zzaxh) null);
    }

    /* renamed from: j */
    public static zzasw m42373j(String str, String str2, String str3, int i, zzauv zzauv) {
        return new zzasw(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbau) null, -1, -1, -1, -1, -1, 0, (String) null, -1, LocationRequestCompat.PASSIVE_INTERVAL, (List) null, zzauv, (zzaxh) null);
    }

    /* renamed from: k */
    public static zzasw m42374k(String str, String str2, String str3, int i, int i2, String str4, int i3, zzauv zzauv, long j, List list) {
        return new zzasw(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbau) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzauv, (zzaxh) null);
    }

    /* renamed from: l */
    public static zzasw m42375l(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzbau zzbau, zzauv zzauv) {
        return new zzasw(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzbau, -1, -1, -1, -1, -1, 0, (String) null, -1, LocationRequestCompat.PASSIVE_INTERVAL, list, zzauv, (zzaxh) null);
    }

    /* renamed from: m */
    private static void m42376m(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public final int mo41965a() {
        int i;
        int i2 = this.f25504A;
        if (i2 == -1 || (i = this.f25505B) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final MediaFormat mo41966b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f25527o);
        String str = this.f25519P;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m42376m(mediaFormat, "max-input-size", this.f25528p);
        m42376m(mediaFormat, "width", this.f25504A);
        m42376m(mediaFormat, "height", this.f25505B);
        float f = this.f25506C;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m42376m(mediaFormat, "rotation-degrees", this.f25507D);
        m42376m(mediaFormat, "channel-count", this.f25512I);
        m42376m(mediaFormat, "sample-rate", this.f25513J);
        m42376m(mediaFormat, "encoder-delay", this.f25515L);
        m42376m(mediaFormat, "encoder-padding", this.f25516M);
        for (int i = 0; i < this.f25529s.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.f25529s.get(i)));
        }
        zzbau zzbau = this.f25511H;
        if (zzbau != null) {
            m42376m(mediaFormat, "color-transfer", zzbau.f26431d);
            m42376m(mediaFormat, "color-standard", zzbau.f26429a);
            m42376m(mediaFormat, "color-range", zzbau.f26430c);
            byte[] bArr = zzbau.f26432f;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    public final zzasw mo41967c(zzauv zzauv) {
        String str = this.f25522a;
        return new zzasw(str, this.f25526g, this.f25527o, this.f25524d, this.f25523c, this.f25528p, this.f25504A, this.f25505B, this.f25506C, this.f25507D, this.f25508E, this.f25510G, this.f25509F, this.f25511H, this.f25512I, this.f25513J, this.f25514K, this.f25515L, this.f25516M, this.f25518O, this.f25519P, this.f25520Q, this.f25517N, this.f25529s, zzauv, this.f25525f);
    }

    /* renamed from: d */
    public final zzasw mo41968d(int i, int i2) {
        String str = this.f25522a;
        return new zzasw(str, this.f25526g, this.f25527o, this.f25524d, this.f25523c, this.f25528p, this.f25504A, this.f25505B, this.f25506C, this.f25507D, this.f25508E, this.f25510G, this.f25509F, this.f25511H, this.f25512I, this.f25513J, this.f25514K, i, i2, this.f25518O, this.f25519P, this.f25520Q, this.f25517N, this.f25529s, this.f25530z, this.f25525f);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzasw mo41970e(int i) {
        String str = this.f25522a;
        return new zzasw(str, this.f25526g, this.f25527o, this.f25524d, this.f25523c, i, this.f25504A, this.f25505B, this.f25506C, this.f25507D, this.f25508E, this.f25510G, this.f25509F, this.f25511H, this.f25512I, this.f25513J, this.f25514K, this.f25515L, this.f25516M, this.f25518O, this.f25519P, this.f25520Q, this.f25517N, this.f25529s, this.f25530z, this.f25525f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzasw.class == obj.getClass()) {
            zzasw zzasw = (zzasw) obj;
            if (this.f25523c == zzasw.f25523c && this.f25528p == zzasw.f25528p && this.f25504A == zzasw.f25504A && this.f25505B == zzasw.f25505B && this.f25506C == zzasw.f25506C && this.f25507D == zzasw.f25507D && this.f25508E == zzasw.f25508E && this.f25509F == zzasw.f25509F && this.f25512I == zzasw.f25512I && this.f25513J == zzasw.f25513J && this.f25514K == zzasw.f25514K && this.f25515L == zzasw.f25515L && this.f25516M == zzasw.f25516M && this.f25517N == zzasw.f25517N && this.f25518O == zzasw.f25518O && zzbar.m42999o(this.f25522a, zzasw.f25522a) && zzbar.m42999o(this.f25519P, zzasw.f25519P) && this.f25520Q == zzasw.f25520Q && zzbar.m42999o(this.f25526g, zzasw.f25526g) && zzbar.m42999o(this.f25527o, zzasw.f25527o) && zzbar.m42999o(this.f25524d, zzasw.f25524d) && zzbar.m42999o(this.f25530z, zzasw.f25530z) && zzbar.m42999o(this.f25525f, zzasw.f25525f) && zzbar.m42999o(this.f25511H, zzasw.f25511H) && Arrays.equals(this.f25510G, zzasw.f25510G) && this.f25529s.size() == zzasw.f25529s.size()) {
                for (int i = 0; i < this.f25529s.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f25529s.get(i), (byte[]) zzasw.f25529s.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final zzasw mo41972f(zzaxh zzaxh) {
        String str = this.f25522a;
        return new zzasw(str, this.f25526g, this.f25527o, this.f25524d, this.f25523c, this.f25528p, this.f25504A, this.f25505B, this.f25506C, this.f25507D, this.f25508E, this.f25510G, this.f25509F, this.f25511H, this.f25512I, this.f25513J, this.f25514K, this.f25515L, this.f25516M, this.f25518O, this.f25519P, this.f25520Q, this.f25517N, this.f25529s, this.f25530z, zzaxh);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f25521R;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f25522a;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.f25526g;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.f25527o;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str4 = this.f25524d;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (((((((((((i11 + i4) * 31) + this.f25523c) * 31) + this.f25504A) * 31) + this.f25505B) * 31) + this.f25512I) * 31) + this.f25513J) * 31;
        String str5 = this.f25519P;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (((i12 + i5) * 31) + this.f25520Q) * 31;
        zzauv zzauv = this.f25530z;
        if (zzauv == null) {
            i6 = 0;
        } else {
            i6 = zzauv.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        zzaxh zzaxh = this.f25525f;
        if (zzaxh != null) {
            i8 = zzaxh.hashCode();
        }
        int i15 = i14 + i8;
        this.f25521R = i15;
        return i15;
    }

    public final String toString() {
        String str = this.f25522a;
        String str2 = this.f25526g;
        String str3 = this.f25527o;
        int i = this.f25523c;
        String str4 = this.f25519P;
        int i2 = this.f25504A;
        int i3 = this.f25505B;
        float f = this.f25506C;
        int i4 = this.f25512I;
        int i5 = this.f25513J;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i + ", " + str4 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25522a);
        parcel.writeString(this.f25526g);
        parcel.writeString(this.f25527o);
        parcel.writeString(this.f25524d);
        parcel.writeInt(this.f25523c);
        parcel.writeInt(this.f25528p);
        parcel.writeInt(this.f25504A);
        parcel.writeInt(this.f25505B);
        parcel.writeFloat(this.f25506C);
        parcel.writeInt(this.f25507D);
        parcel.writeFloat(this.f25508E);
        parcel.writeInt(this.f25510G != null ? 1 : 0);
        byte[] bArr = this.f25510G;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f25509F);
        parcel.writeParcelable(this.f25511H, i);
        parcel.writeInt(this.f25512I);
        parcel.writeInt(this.f25513J);
        parcel.writeInt(this.f25514K);
        parcel.writeInt(this.f25515L);
        parcel.writeInt(this.f25516M);
        parcel.writeInt(this.f25518O);
        parcel.writeString(this.f25519P);
        parcel.writeInt(this.f25520Q);
        parcel.writeLong(this.f25517N);
        int size = this.f25529s.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f25529s.get(i2));
        }
        parcel.writeParcelable(this.f25530z, 0);
        parcel.writeParcelable(this.f25525f, 0);
    }

    zzasw(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzbau zzbau, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzauv zzauv, zzaxh zzaxh) {
        this.f25522a = str;
        this.f25526g = str2;
        this.f25527o = str3;
        this.f25524d = str4;
        this.f25523c = i;
        this.f25528p = i2;
        this.f25504A = i3;
        this.f25505B = i4;
        this.f25506C = f;
        this.f25507D = i5;
        this.f25508E = f2;
        this.f25510G = bArr;
        this.f25509F = i6;
        this.f25511H = zzbau;
        this.f25512I = i7;
        this.f25513J = i8;
        this.f25514K = i9;
        this.f25515L = i10;
        this.f25516M = i11;
        this.f25518O = i12;
        this.f25519P = str5;
        this.f25520Q = i13;
        this.f25517N = j;
        this.f25529s = list == null ? Collections.emptyList() : list;
        this.f25530z = zzauv;
        this.f25525f = zzaxh;
    }
}
