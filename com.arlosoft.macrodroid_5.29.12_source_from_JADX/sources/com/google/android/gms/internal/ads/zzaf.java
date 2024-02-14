package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaf {

    /* renamed from: G */
    private static final zzaf f24194G = new zzaf(new zzad());

    /* renamed from: H */
    public static final zzn f24195H = zzab.f23788a;

    /* renamed from: A */
    public final int f24196A;

    /* renamed from: B */
    public final int f24197B;

    /* renamed from: C */
    public final int f24198C;

    /* renamed from: D */
    public final int f24199D;

    /* renamed from: E */
    public final int f24200E;

    /* renamed from: F */
    private int f24201F;
    @Nullable

    /* renamed from: a */
    public final String f24202a;
    @Nullable

    /* renamed from: b */
    public final String f24203b;
    @Nullable

    /* renamed from: c */
    public final String f24204c;

    /* renamed from: d */
    public final int f24205d;

    /* renamed from: e */
    public final int f24206e;

    /* renamed from: f */
    public final int f24207f;

    /* renamed from: g */
    public final int f24208g;

    /* renamed from: h */
    public final int f24209h;
    @Nullable

    /* renamed from: i */
    public final String f24210i;
    @Nullable

    /* renamed from: j */
    public final zzbq f24211j;
    @Nullable

    /* renamed from: k */
    public final String f24212k;
    @Nullable

    /* renamed from: l */
    public final String f24213l;

    /* renamed from: m */
    public final int f24214m;

    /* renamed from: n */
    public final List f24215n;
    @Nullable

    /* renamed from: o */
    public final zzx f24216o;

    /* renamed from: p */
    public final long f24217p;

    /* renamed from: q */
    public final int f24218q;

    /* renamed from: r */
    public final int f24219r;

    /* renamed from: s */
    public final float f24220s;

    /* renamed from: t */
    public final int f24221t;

    /* renamed from: u */
    public final float f24222u;
    @Nullable

    /* renamed from: v */
    public final byte[] f24223v;

    /* renamed from: w */
    public final int f24224w;
    @Nullable

    /* renamed from: x */
    public final zzq f24225x;

    /* renamed from: y */
    public final int f24226y;

    /* renamed from: z */
    public final int f24227z;

    private zzaf(zzad zzad) {
        this.f24202a = zzad.f23958a;
        this.f24203b = zzad.f23959b;
        this.f24204c = zzen.m49177p(zzad.f23960c);
        this.f24205d = zzad.f23961d;
        int i = 0;
        this.f24206e = 0;
        int L = zzad.f23962e;
        this.f24207f = L;
        int T = zzad.f23963f;
        this.f24208g = T;
        this.f24209h = T != -1 ? T : L;
        this.f24210i = zzad.f23964g;
        this.f24211j = zzad.f23965h;
        this.f24212k = zzad.f23966i;
        this.f24213l = zzad.f23967j;
        this.f24214m = zzad.f23968k;
        this.f24215n = zzad.f23969l == null ? Collections.emptyList() : zzad.f23969l;
        zzx b0 = zzad.f23970m;
        this.f24216o = b0;
        this.f24217p = zzad.f23971n;
        this.f24218q = zzad.f23972o;
        this.f24219r = zzad.f23973p;
        this.f24220s = zzad.f23974q;
        this.f24221t = zzad.f23975r == -1 ? 0 : zzad.f23975r;
        this.f24222u = zzad.f23976s == -1.0f ? 1.0f : zzad.f23976s;
        this.f24223v = zzad.f23977t;
        this.f24224w = zzad.f23978u;
        this.f24225x = zzad.f23979v;
        this.f24226y = zzad.f23980w;
        this.f24227z = zzad.f23981x;
        this.f24196A = zzad.f23982y;
        this.f24197B = zzad.f23983z == -1 ? 0 : zzad.f23983z;
        this.f24198C = zzad.f23955A != -1 ? zzad.f23955A : i;
        this.f24199D = zzad.f23956B;
        this.f24200E = (zzad.f23957C != 0 || b0 == null) ? zzad.f23957C : 1;
    }

    /* renamed from: a */
    public final int mo41421a() {
        int i;
        int i2 = this.f24218q;
        if (i2 == -1 || (i = this.f24219r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final zzad mo41422b() {
        return new zzad(this, (zzac) null);
    }

    /* renamed from: c */
    public final zzaf mo41423c(int i) {
        zzad zzad = new zzad(this, (zzac) null);
        zzad.mo41319a(i);
        return new zzaf(zzad);
    }

    /* renamed from: d */
    public final boolean mo41424d(zzaf zzaf) {
        if (this.f24215n.size() != zzaf.f24215n.size()) {
            return false;
        }
        for (int i = 0; i < this.f24215n.size(); i++) {
            if (!Arrays.equals((byte[]) this.f24215n.get(i), (byte[]) zzaf.f24215n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzaf = (zzaf) obj;
            int i2 = this.f24201F;
            if ((i2 == 0 || (i = zzaf.f24201F) == 0 || i2 == i) && this.f24205d == zzaf.f24205d && this.f24207f == zzaf.f24207f && this.f24208g == zzaf.f24208g && this.f24214m == zzaf.f24214m && this.f24217p == zzaf.f24217p && this.f24218q == zzaf.f24218q && this.f24219r == zzaf.f24219r && this.f24221t == zzaf.f24221t && this.f24224w == zzaf.f24224w && this.f24226y == zzaf.f24226y && this.f24227z == zzaf.f24227z && this.f24196A == zzaf.f24196A && this.f24197B == zzaf.f24197B && this.f24198C == zzaf.f24198C && this.f24199D == zzaf.f24199D && this.f24200E == zzaf.f24200E && Float.compare(this.f24220s, zzaf.f24220s) == 0 && Float.compare(this.f24222u, zzaf.f24222u) == 0 && zzen.m49181t(this.f24202a, zzaf.f24202a) && zzen.m49181t(this.f24203b, zzaf.f24203b) && zzen.m49181t(this.f24210i, zzaf.f24210i) && zzen.m49181t(this.f24212k, zzaf.f24212k) && zzen.m49181t(this.f24213l, zzaf.f24213l) && zzen.m49181t(this.f24204c, zzaf.f24204c) && Arrays.equals(this.f24223v, zzaf.f24223v) && zzen.m49181t(this.f24211j, zzaf.f24211j) && zzen.m49181t(this.f24225x, zzaf.f24225x) && zzen.m49181t(this.f24216o, zzaf.f24216o) && mo41424d(zzaf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f24201F;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f24202a;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + 527) * 31;
        String str2 = this.f24203b;
        int hashCode = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24204c;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (((((((hashCode + i2) * 31) + this.f24205d) * 961) + this.f24207f) * 31) + this.f24208g) * 31;
        String str4 = this.f24210i;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        zzbq zzbq = this.f24211j;
        if (zzbq == null) {
            i4 = 0;
        } else {
            i4 = zzbq.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.f24212k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str6 = this.f24213l;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i12 + i7) * 31) + this.f24214m) * 31) + ((int) this.f24217p)) * 31) + this.f24218q) * 31) + this.f24219r) * 31) + Float.floatToIntBits(this.f24220s)) * 31) + this.f24221t) * 31) + Float.floatToIntBits(this.f24222u)) * 31) + this.f24224w) * 31) + this.f24226y) * 31) + this.f24227z) * 31) + this.f24196A) * 31) + this.f24197B) * 31) + this.f24198C) * 31) + this.f24199D) * 31) + this.f24200E;
        this.f24201F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.f24202a;
        String str2 = this.f24203b;
        String str3 = this.f24212k;
        String str4 = this.f24213l;
        String str5 = this.f24210i;
        int i = this.f24209h;
        String str6 = this.f24204c;
        int i2 = this.f24218q;
        int i3 = this.f24219r;
        float f = this.f24220s;
        int i4 = this.f24226y;
        int i5 = this.f24227z;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }
}
