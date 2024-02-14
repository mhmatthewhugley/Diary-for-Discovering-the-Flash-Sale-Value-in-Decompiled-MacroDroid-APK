package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzvl extends zzvn implements Comparable {

    /* renamed from: A */
    private final int f38707A;

    /* renamed from: B */
    private final int f38708B;

    /* renamed from: C */
    private final int f38709C;

    /* renamed from: D */
    private final boolean f38710D;

    /* renamed from: g */
    private final int f38711g;

    /* renamed from: o */
    private final boolean f38712o;

    /* renamed from: p */
    private final boolean f38713p;

    /* renamed from: s */
    private final boolean f38714s;

    /* renamed from: z */
    private final int f38715z;

    public zzvl(int i, zzcp zzcp, int i2, zzvf zzvf, int i3, @Nullable String str) {
        super(i, zzcp, i2);
        zzfvn zzfvn;
        int i4;
        int i5 = 0;
        this.f38712o = zzvr.m55210r(i3, false);
        int i6 = this.f38719f.f24205d;
        int i7 = zzvf.f31571u;
        this.f38713p = 1 == (i6 & 1);
        this.f38714s = (i6 & 2) != 0;
        if (zzvf.f31569s.isEmpty()) {
            zzfvn = zzfvn.m51136z("");
        } else {
            zzfvn = zzvf.f31569s;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfvn.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzvr.m55204j(this.f38719f, (String) zzfvn.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.f38715z = i8;
        this.f38707A = i4;
        int i9 = this.f38719f.f24206e;
        int bitCount = Integer.bitCount(0);
        this.f38708B = bitCount;
        int i10 = this.f38719f.f24206e;
        this.f38710D = false;
        int j = zzvr.m55204j(this.f38719f, str, zzvr.m55207n(str) == null);
        this.f38709C = j;
        boolean z = i4 > 0 || (zzvf.f31569s.isEmpty() && bitCount > 0) || this.f38713p || (this.f38714s && j > 0);
        if (zzvr.m55210r(i3, zzvf.f38694N) && z) {
            i5 = 1;
        }
        this.f38711g = i5;
    }

    /* renamed from: b */
    public final int mo48281b() {
        return this.f38711g;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo48283d(zzvn zzvn) {
        zzvl zzvl = (zzvl) zzvn;
        return false;
    }

    /* renamed from: e */
    public final int compareTo(zzvl zzvl) {
        zzfwv zzfwv;
        zzfvc d = zzfvc.m51088i().mo46397d(this.f38712o, zzvl.f38712o).mo46396c(Integer.valueOf(this.f38715z), Integer.valueOf(zzvl.f38715z), zzfwv.m51208c().mo46509a()).mo46395b(this.f38707A, zzvl.f38707A).mo46395b(this.f38708B, zzvl.f38708B).mo46397d(this.f38713p, zzvl.f38713p);
        Boolean valueOf = Boolean.valueOf(this.f38714s);
        Boolean valueOf2 = Boolean.valueOf(zzvl.f38714s);
        if (this.f38707A == 0) {
            zzfwv = zzfwv.m51208c();
        } else {
            zzfwv = zzfwv.m51208c().mo46509a();
        }
        zzfvc b = d.mo46396c(valueOf, valueOf2, zzfwv).mo46395b(this.f38709C, zzvl.f38709C);
        if (this.f38708B == 0) {
            b = b.mo46398e(false, false);
        }
        return b.mo46394a();
    }
}
