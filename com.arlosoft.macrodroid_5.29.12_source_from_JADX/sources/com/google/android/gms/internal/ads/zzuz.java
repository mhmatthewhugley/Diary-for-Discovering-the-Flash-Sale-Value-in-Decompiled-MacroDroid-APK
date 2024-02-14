package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzuz extends zzvn implements Comparable {

    /* renamed from: A */
    private final int f38652A;

    /* renamed from: B */
    private final int f38653B;

    /* renamed from: C */
    private final int f38654C;

    /* renamed from: D */
    private final boolean f38655D;

    /* renamed from: E */
    private final int f38656E;

    /* renamed from: F */
    private final int f38657F;

    /* renamed from: G */
    private final boolean f38658G;

    /* renamed from: H */
    private final int f38659H;

    /* renamed from: I */
    private final int f38660I;

    /* renamed from: J */
    private final int f38661J;

    /* renamed from: K */
    private final int f38662K;

    /* renamed from: L */
    private final boolean f38663L;

    /* renamed from: M */
    private final boolean f38664M;

    /* renamed from: g */
    private final int f38665g;

    /* renamed from: o */
    private final boolean f38666o;
    @Nullable

    /* renamed from: p */
    private final String f38667p = zzvr.m55207n(this.f38719f.f24204c);

    /* renamed from: s */
    private final zzvf f38668s;

    /* renamed from: z */
    private final boolean f38669z;

    public zzuz(int i, zzcp zzcp, int i2, zzvf zzvf, int i3, boolean z, zzfsy zzfsy) {
        super(i, zzcp, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.f38668s = zzvf;
        int i7 = 0;
        this.f38669z = zzvr.m55210r(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzvf.f31564n.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzvr.m55204j(this.f38719f, (String) zzvf.f31564n.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.f38653B = i8;
        this.f38652A = i5;
        int i9 = this.f38719f.f24206e;
        this.f38654C = Integer.bitCount(0);
        zzaf zzaf = this.f38719f;
        int i10 = zzaf.f24206e;
        this.f38655D = true;
        this.f38658G = 1 == (zzaf.f24205d & 1);
        this.f38659H = zzaf.f24226y;
        this.f38660I = zzaf.f24227z;
        this.f38661J = zzaf.f24209h;
        this.f38666o = zzfsy.mo45704a(zzaf);
        String[] G = zzen.m49132G();
        int i11 = 0;
        while (true) {
            if (i11 >= G.length) {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = zzvr.m55204j(this.f38719f, G[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.f38656E = i11;
        this.f38657F = i6;
        int i12 = 0;
        while (true) {
            if (i12 < zzvf.f31568r.size()) {
                String str = this.f38719f.f24213l;
                if (str != null && str.equals(zzvf.f31568r.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f38662K = i4;
        this.f38663L = (i3 & 128) == 128;
        this.f38664M = (i3 & 64) == 64;
        zzvf zzvf2 = this.f38668s;
        if (zzvr.m55210r(i3, zzvf2.f38694N) && ((z2 = this.f38666o) || zzvf2.f38688H)) {
            i7 = (!zzvr.m55210r(i3, false) || !z2 || this.f38719f.f24209h == -1 || (!zzvf2.f38696P && z)) ? 1 : 2;
        }
        this.f38665g = i7;
    }

    /* renamed from: b */
    public final int mo48281b() {
        return this.f38665g;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo48283d(zzvn zzvn) {
        String str;
        zzuz zzuz = (zzuz) zzvn;
        boolean z = this.f38668s.f38691K;
        zzaf zzaf = this.f38719f;
        int i = zzaf.f24226y;
        if (i == -1) {
            return false;
        }
        zzaf zzaf2 = zzuz.f38719f;
        if (i != zzaf2.f24226y || (str = zzaf.f24213l) == null || !TextUtils.equals(str, zzaf2.f24213l)) {
            return false;
        }
        boolean z2 = this.f38668s.f38690J;
        int i2 = this.f38719f.f24227z;
        return i2 != -1 && i2 == zzuz.f38719f.f24227z && this.f38663L == zzuz.f38663L && this.f38664M == zzuz.f38664M;
    }

    /* renamed from: e */
    public final int compareTo(zzuz zzuz) {
        zzfwv zzfwv;
        if (!this.f38666o || !this.f38669z) {
            zzfwv = zzvr.f38735k.mo46509a();
        } else {
            zzfwv = zzvr.f38735k;
        }
        zzfvc c = zzfvc.m51088i().mo46397d(this.f38669z, zzuz.f38669z).mo46396c(Integer.valueOf(this.f38653B), Integer.valueOf(zzuz.f38653B), zzfwv.m51208c().mo46509a()).mo46395b(this.f38652A, zzuz.f38652A).mo46395b(this.f38654C, zzuz.f38654C).mo46397d(this.f38658G, zzuz.f38658G).mo46397d(true, true).mo46396c(Integer.valueOf(this.f38656E), Integer.valueOf(zzuz.f38656E), zzfwv.m51208c().mo46509a()).mo46395b(this.f38657F, zzuz.f38657F).mo46397d(this.f38666o, zzuz.f38666o).mo46396c(Integer.valueOf(this.f38662K), Integer.valueOf(zzuz.f38662K), zzfwv.m51208c().mo46509a());
        Integer valueOf = Integer.valueOf(this.f38661J);
        Integer valueOf2 = Integer.valueOf(zzuz.f38661J);
        boolean z = this.f38668s.f31573w;
        zzfvc c2 = c.mo46396c(valueOf, valueOf2, zzvr.f38736l).mo46397d(this.f38663L, zzuz.f38663L).mo46397d(this.f38664M, zzuz.f38664M).mo46396c(Integer.valueOf(this.f38659H), Integer.valueOf(zzuz.f38659H), zzfwv).mo46396c(Integer.valueOf(this.f38660I), Integer.valueOf(zzuz.f38660I), zzfwv);
        Integer valueOf3 = Integer.valueOf(this.f38661J);
        Integer valueOf4 = Integer.valueOf(zzuz.f38661J);
        if (!zzen.m49181t(this.f38667p, zzuz.f38667p)) {
            zzfwv = zzvr.f38736l;
        }
        return c2.mo46396c(valueOf3, valueOf4, zzfwv).mo46394a();
    }
}
