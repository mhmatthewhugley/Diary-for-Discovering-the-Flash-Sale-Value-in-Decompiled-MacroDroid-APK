package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzge implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzaw f46881a;

    /* renamed from: c */
    final /* synthetic */ String f46882c;

    /* renamed from: d */
    final /* synthetic */ zzgj f46883d;

    zzge(zzgj zzgj, zzaw zzaw, String str) {
        this.f46883d = zzgj;
        this.f46881a = zzaw;
        this.f46882c = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzkt zzkt;
        zzky zzky;
        zzga zzga;
        zzgc zzgc;
        Bundle bundle;
        String str;
        zzh zzh;
        long j;
        String str2;
        zzas zzas;
        String str3;
        this.f46883d.f46896a.mo55524b();
        zzic d0 = this.f46883d.f46896a.mo55527d0();
        zzaw zzaw = this.f46881a;
        String str4 = this.f46882c;
        d0.mo55073e();
        zzfr.m65679r();
        Preconditions.m4488k(zzaw);
        Preconditions.m4484g(str4);
        if (!d0.f46899a.mo55219x().mo54919A(str4, zzdu.f46590U)) {
            d0.f46899a.mo55221z().mo55097o().mo55092b("Generating ScionPayload disabled. packageName", str4);
            return new byte[0];
        } else if ("_iap".equals(zzaw.f46479a) || "_iapx".equals(zzaw.f46479a)) {
            zzga B = zzgb.m59934B();
            d0.f47227b.mo55519W().mo54979e0();
            zzh R = d0.f47227b.mo55519W().mo54967R(str4);
            if (R == null) {
                d0.f46899a.mo55221z().mo55097o().mo55092b("Log and bundle not available. package_name", str4);
                bArr = new byte[0];
                zzkt = d0.f47227b;
            } else if (!R.mo55263J()) {
                d0.f46899a.mo55221z().mo55097o().mo55092b("Log and bundle disabled. package_name", str4);
                bArr = new byte[0];
                zzkt = d0.f47227b;
            } else {
                zzgc P1 = zzgd.m60024P1();
                P1.mo51114c0(1);
                P1.mo51107X("android");
                if (!TextUtils.isEmpty(R.mo55287d0())) {
                    P1.mo51133x(R.mo55287d0());
                }
                if (!TextUtils.isEmpty(R.mo55291f0())) {
                    P1.mo51136z((String) Preconditions.m4488k(R.mo55291f0()));
                }
                if (!TextUtils.isEmpty(R.mo55293g0())) {
                    P1.mo51066A((String) Preconditions.m4488k(R.mo55293g0()));
                }
                if (R.mo55265L() != -2147483648L) {
                    P1.mo51068B((int) R.mo55265L());
                }
                P1.mo51098S(R.mo55276W());
                P1.mo51085L(R.mo55274U());
                String i0 = R.mo55297i0();
                String b0 = R.mo55283b0();
                if (!TextUtils.isEmpty(i0)) {
                    P1.mo51096R(i0);
                } else if (!TextUtils.isEmpty(b0)) {
                    P1.mo51131v(b0);
                }
                zzai V = d0.f47227b.mo55518V(str4);
                P1.mo51078H(R.mo55273T());
                if (d0.f46899a.mo55212m() && d0.f46899a.mo55219x().mo54920C(P1.mo51126s0()) && V.mo54950i(zzah.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    P1.mo51083K((String) null);
                }
                P1.mo51076G(V.mo54948h());
                if (V.mo54950i(zzah.AD_STORAGE) && R.mo55262I()) {
                    Pair l = d0.f47227b.mo55529e0().mo55469l(R.mo55287d0(), V);
                    if (R.mo55262I() && !TextUtils.isEmpty((CharSequence) l.first)) {
                        try {
                            P1.mo51115d0(zzic.m65895b((String) l.first, Long.toString(zzaw.f46482f)));
                            Object obj = l.second;
                            if (obj != null) {
                                P1.mo51102U(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e) {
                            d0.f46899a.mo55221z().mo55097o().mo55092b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzkt = d0.f47227b;
                        } catch (Throwable th) {
                            d0.f47227b.mo55519W().mo54980f0();
                            throw th;
                        }
                    }
                }
                d0.f46899a.mo55220y().mo55243i();
                P1.mo51081J(Build.MODEL);
                d0.f46899a.mo55220y().mo55243i();
                P1.mo51104V(Build.VERSION.RELEASE);
                P1.mo51120j0((int) d0.f46899a.mo55220y().mo55002n());
                P1.mo51124p0(d0.f46899a.mo55220y().mo55003o());
                try {
                    if (V.mo54950i(zzah.ANALYTICS_STORAGE) && R.mo55289e0() != null) {
                        P1.mo51135y(zzic.m65895b((String) Preconditions.m4488k(R.mo55289e0()), Long.toString(zzaw.f46482f)));
                    }
                    if (!TextUtils.isEmpty(R.mo55295h0())) {
                        P1.mo51093P((String) Preconditions.m4488k(R.mo55295h0()));
                    }
                    String d02 = R.mo55287d0();
                    List c0 = d0.f47227b.mo55519W().mo54977c0(d02);
                    Iterator it = c0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzky = null;
                            break;
                        }
                        zzky = (zzky) it.next();
                        if ("_lte".equals(zzky.f47290c)) {
                            break;
                        }
                    }
                    if (zzky == null || zzky.f47292e == null) {
                        zzky zzky2 = new zzky(d02, "auto", "_lte", d0.f46899a.mo55201a().mo21950a(), 0L);
                        c0.add(zzky2);
                        d0.f47227b.mo55519W().mo54994v(zzky2);
                    }
                    zzkv g0 = d0.f47227b.mo55532g0();
                    g0.f46899a.mo55221z().mo55102t().mo55091a("Checking account type status for ad personalization signals");
                    if (g0.f46899a.mo55220y().mo55005q()) {
                        String d03 = R.mo55287d0();
                        Preconditions.m4488k(d03);
                        if (R.mo55262I() && g0.f47227b.mo55523a0().mo55149A(d03)) {
                            g0.f46899a.mo55221z().mo55097o().mo55091a("Turning off ad personalization due to account type");
                            Iterator it2 = c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((zzky) it2.next()).f47290c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c0.add(new zzky(d03, "auto", "_npa", g0.f46899a.mo55201a().mo21950a(), 1L));
                        }
                    }
                    zzgm[] zzgmArr = new zzgm[c0.size()];
                    for (int i = 0; i < c0.size(); i++) {
                        zzgl E = zzgm.m60197E();
                        E.mo51232z(((zzky) c0.get(i)).f47290c);
                        E.mo51225A(((zzky) c0.get(i)).f47291d);
                        d0.f47227b.mo55532g0().mo55561K(E, ((zzky) c0.get(i)).f47292e);
                        zzgmArr[i] = (zzgm) E.mo51441o();
                    }
                    P1.mo51080I0(Arrays.asList(zzgmArr));
                    zzei b = zzei.m65580b(zzaw);
                    d0.f46899a.mo55196N().mo55617x(b.f46693d, d0.f47227b.mo55519W().mo54966Q(str4));
                    d0.f46899a.mo55196N().mo55618y(b, d0.f46899a.mo55219x().mo54929l(str4));
                    Bundle bundle2 = b.f46693d;
                    bundle2.putLong("_c", 1);
                    d0.f46899a.mo55221z().mo55097o().mo55091a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzaw.f46481d);
                    if (d0.f46899a.mo55196N().mo55591T(P1.mo51126s0())) {
                        d0.f46899a.mo55196N().mo55574C(bundle2, "_dbg", 1L);
                        d0.f46899a.mo55196N().mo55574C(bundle2, "_r", 1L);
                    }
                    zzas V2 = d0.f47227b.mo55519W().mo54971V(str4, zzaw.f46479a);
                    if (V2 == null) {
                        zzgc = P1;
                        zzh = R;
                        zzga = B;
                        str = str4;
                        bundle = bundle2;
                        str2 = null;
                        zzas = new zzas(str4, zzaw.f46479a, 0, 0, 0, zzaw.f46482f, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        zzh = R;
                        zzga = B;
                        str = str4;
                        bundle = bundle2;
                        zzgc = P1;
                        str2 = null;
                        long j2 = V2.f46470f;
                        zzas = V2.mo55010c(zzaw.f46482f);
                        j = j2;
                    }
                    d0.f47227b.mo55519W().mo54987o(zzas);
                    zzar zzar = new zzar(d0.f46899a, zzaw.f46481d, str, zzaw.f46479a, zzaw.f46482f, j, bundle);
                    zzfs G = zzft.m59856G();
                    G.mo51008H(zzar.f46462d);
                    G.mo51004C(zzar.f46460b);
                    G.mo51007G(zzar.f46463e);
                    zzat zzat = new zzat(zzar.f46464f);
                    while (zzat.hasNext()) {
                        String a = zzat.next();
                        zzfw G2 = zzfx.m59896G();
                        G2.mo51034D(a);
                        Object p2 = zzar.f46464f.mo55019p2(a);
                        if (p2 != null) {
                            d0.f47227b.mo55532g0().mo55560J(G2, p2);
                            G.mo51017y(G2);
                        }
                    }
                    zzgc zzgc2 = zzgc;
                    zzgc2.mo51082J0(G);
                    com.google.android.gms.internal.measurement.zzge B2 = zzgg.m60137B();
                    zzfu B3 = zzfv.m59880B();
                    B3.mo51029t(zzas.f46467c);
                    B3.mo51030u(zzaw.f46479a);
                    B2.mo51197t(B3);
                    zzgc2.mo51111Z(B2);
                    zzgc2.mo51073D0(d0.f47227b.mo55516T().mo54914k(zzh.mo55287d0(), Collections.emptyList(), zzgc2.mo51134x0(), Long.valueOf(G.mo51015v()), Long.valueOf(G.mo51015v())));
                    if (G.mo51012M()) {
                        zzgc2.mo51119i0(G.mo51015v());
                        zzgc2.mo51087M(G.mo51015v());
                    }
                    long X = zzh.mo55277X();
                    int i2 = (X > 0 ? 1 : (X == 0 ? 0 : -1));
                    if (i2 != 0) {
                        zzgc2.mo51112a0(X);
                    }
                    long Z = zzh.mo55279Z();
                    if (Z != 0) {
                        zzgc2.mo51113b0(Z);
                    } else if (i2 != 0) {
                        zzgc2.mo51113b0(X);
                    }
                    String b2 = zzh.mo55282b();
                    zzpd.m61097b();
                    if (d0.f46899a.mo55219x().mo54919A(str2, zzdu.f46623n0)) {
                        str3 = str;
                        if (d0.f46899a.mo55219x().mo54919A(str3, zzdu.f46627p0) && b2 != null) {
                            zzgc2.mo51118g0(b2);
                        }
                    } else {
                        str3 = str;
                    }
                    zzh.mo55288e();
                    zzgc2.mo51070C((int) zzh.mo55278Y());
                    d0.f46899a.mo55219x().mo54932o();
                    zzgc2.mo51122m0(74029);
                    zzgc2.mo51121k0(d0.f46899a.mo55201a().mo21950a());
                    zzgc2.mo51117f0(true);
                    if (d0.f46899a.mo55219x().mo54919A(str2, zzdu.f46635t0)) {
                        d0.f47227b.mo55528e(zzgc2.mo51126s0(), zzgc2);
                    }
                    zzga zzga2 = zzga;
                    zzga2.mo51062t(zzgc2);
                    zzh zzh2 = zzh;
                    zzh2.mo55256C(zzgc2.mo51069B0());
                    zzh2.mo55315z(zzgc2.mo51067A0());
                    d0.f47227b.mo55519W().mo54986n(zzh2);
                    d0.f47227b.mo55519W().mo54985m();
                    d0.f47227b.mo55519W().mo54980f0();
                    try {
                        return d0.f47227b.mo55532g0().mo55563O(((zzgb) zzga2.mo51441o()).mo51306h());
                    } catch (IOException e2) {
                        d0.f46899a.mo55221z().mo55098p().mo55093c("Data loss. Failed to bundle and serialize. appId", zzeh.m65566x(str3), e2);
                        return str2;
                    }
                } catch (SecurityException e3) {
                    d0.f46899a.mo55221z().mo55097o().mo55092b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    zzkt = d0.f47227b;
                }
            }
            zzkt.mo55519W().mo54980f0();
            return bArr;
        } else {
            d0.f46899a.mo55221z().mo55097o().mo55093c("Generating a payload for this event is not available. package_name, event_name", str4, zzaw.f46479a);
            return null;
        }
    }
}
