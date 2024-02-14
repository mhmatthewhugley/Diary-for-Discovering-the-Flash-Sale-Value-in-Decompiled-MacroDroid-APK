package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxb {

    /* renamed from: c */
    private static final Logger f40579c = new Logger("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    private final zzvf f40580a;

    /* renamed from: b */
    private final zzyv f40581b;

    zzxb(FirebaseApp firebaseApp) {
        Preconditions.m4488k(firebaseApp);
        Context l = firebaseApp.mo61950l();
        Preconditions.m4488k(l);
        this.f40580a = new zzvf(new zzxp(firebaseApp, zzxo.m58381a(), (zzym) null, (zzxj) null, (zzxk) null));
        this.f40581b = new zzyv(l);
    }

    /* renamed from: g */
    private static boolean m58326g(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        f40579c.mo21844h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    /* renamed from: A */
    public final void mo50000A(zzsk zzsk, zzwz zzwz) {
        Preconditions.m4488k(zzsk);
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49927P(zzsk.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: B */
    public final void mo50001B(zzsm zzsm, zzwz zzwz) {
        Preconditions.m4488k(zzsm);
        Preconditions.m4488k(zzsm.mo49826l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49928a(zzsm.mo49826l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: C */
    public final void mo50002C(zzso zzso, zzwz zzwz) {
        Preconditions.m4488k(zzso);
        Preconditions.m4484g(zzso.mo49830l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49929b(new zzabb(zzso.mo49830l2(), zzso.zza()), new zzxa(zzwz, f40579c));
    }

    /* renamed from: D */
    public final void mo50003D(zzsq zzsq, zzwz zzwz) {
        Preconditions.m4488k(zzsq);
        Preconditions.m4484g(zzsq.zza());
        Preconditions.m4484g(zzsq.mo49835l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49930c(zzsq.zza(), zzsq.mo49835l2(), zzsq.mo49836m2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: E */
    public final void mo50004E(zzss zzss, zzwz zzwz) {
        Preconditions.m4488k(zzss);
        Preconditions.m4488k(zzss.mo49841l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49931d(zzss.mo49841l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: F */
    public final void mo50005F(zzsu zzsu, zzwz zzwz) {
        Preconditions.m4488k(zzwz);
        Preconditions.m4488k(zzsu);
        this.f40580a.mo49932e(zzyl.m58481a((PhoneAuthCredential) Preconditions.m4488k(zzsu.mo49845l2())), new zzxa(zzwz, f40579c));
    }

    /* renamed from: G */
    public final void mo50006G(zzsw zzsw, zzwz zzwz) {
        Preconditions.m4488k(zzsw);
        Preconditions.m4488k(zzwz);
        String o2 = zzsw.mo49852o2();
        zzxa zzxa = new zzxa(zzwz, f40579c);
        if (this.f40581b.mo50084l(o2)) {
            if (zzsw.mo49855r2()) {
                this.f40581b.mo50082j(o2);
            } else {
                this.f40581b.mo50081i(zzxa, o2);
                return;
            }
        }
        long l2 = zzsw.mo49849l2();
        boolean s2 = zzsw.mo49856s2();
        zzaas a = zzaas.m56051a(zzsw.mo49850m2(), zzsw.mo49852o2(), zzsw.mo49851n2(), zzsw.mo49853p2(), zzsw.mo49854q2());
        if (m58326g(l2, s2)) {
            a.mo48800c(new zzza(this.f40581b.mo50079c()));
        }
        this.f40581b.mo50083k(o2, zzxa, l2, s2);
        this.f40580a.mo49933f(a, new zzys(this.f40581b, zzxa, o2));
    }

    /* renamed from: a */
    public final void mo50007a(zzsy zzsy, zzwz zzwz) {
        Preconditions.m4488k(zzsy);
        Preconditions.m4488k(zzwz);
        String n2 = zzsy.mo49861m2().mo22708n2();
        zzxa zzxa = new zzxa(zzwz, f40579c);
        if (this.f40581b.mo50084l(n2)) {
            if (zzsy.mo49866r2()) {
                this.f40581b.mo50082j(n2);
            } else {
                this.f40581b.mo50081i(zzxa, n2);
                return;
            }
        }
        long l2 = zzsy.mo49860l2();
        boolean s2 = zzsy.mo49867s2();
        zzaau a = zzaau.m56056a(zzsy.mo49863o2(), zzsy.mo49861m2().mo22709o2(), zzsy.mo49861m2().mo22708n2(), zzsy.mo49862n2(), zzsy.mo49864p2(), zzsy.mo49865q2());
        if (m58326g(l2, s2)) {
            a.mo48803c(new zzza(this.f40581b.mo50079c()));
        }
        this.f40581b.mo50083k(n2, zzxa, l2, s2);
        this.f40580a.mo49934g(a, new zzys(this.f40581b, zzxa, n2));
    }

    /* renamed from: b */
    public final void mo50008b(zzta zzta, zzwz zzwz) {
        Preconditions.m4488k(zzta);
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49935h(zzta.zza(), zzta.mo49872l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: c */
    public final void mo50009c(zztc zztc, zzwz zzwz) {
        Preconditions.m4488k(zztc);
        Preconditions.m4484g(zztc.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49936i(zztc.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: d */
    public final void mo50010d(zzte zzte, zzwz zzwz) {
        Preconditions.m4488k(zzte);
        Preconditions.m4484g(zzte.mo49881l2());
        Preconditions.m4484g(zzte.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49937j(zzte.mo49881l2(), zzte.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: e */
    public final void mo50011e(zztg zztg, zzwz zzwz) {
        Preconditions.m4488k(zztg);
        Preconditions.m4484g(zztg.mo49887m2());
        Preconditions.m4488k(zztg.mo49886l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49938k(zztg.mo49887m2(), zztg.mo49886l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: f */
    public final void mo50012f(zzti zzti, zzwz zzwz) {
        Preconditions.m4488k(zzti);
        this.f40580a.mo49939l(zzzv.m58570b(zzti.mo49891l2(), zzti.mo49892m2(), zzti.mo49893n2()), new zzxa(zzwz, f40579c));
    }

    /* renamed from: h */
    public final void mo50013h(zzqy zzqy, zzwz zzwz) {
        Preconditions.m4488k(zzqy);
        Preconditions.m4484g(zzqy.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49940w(zzqy.zza(), zzqy.mo49727l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: i */
    public final void mo50014i(zzra zzra, zzwz zzwz) {
        Preconditions.m4488k(zzra);
        Preconditions.m4484g(zzra.zza());
        Preconditions.m4484g(zzra.mo49732l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49941x(zzra.zza(), zzra.mo49732l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: j */
    public final void mo50015j(zzrc zzrc, zzwz zzwz) {
        Preconditions.m4488k(zzrc);
        Preconditions.m4484g(zzrc.zza());
        Preconditions.m4484g(zzrc.mo49737l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49942y(zzrc.zza(), zzrc.mo49737l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: k */
    public final void mo50016k(zzre zzre, zzwz zzwz) {
        Preconditions.m4488k(zzre);
        Preconditions.m4484g(zzre.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49943z(zzre.zza(), zzre.mo49742l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: l */
    public final void mo50017l(zzrg zzrg, zzwz zzwz) {
        Preconditions.m4488k(zzrg);
        Preconditions.m4484g(zzrg.zza());
        Preconditions.m4484g(zzrg.mo49747l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49912A(zzrg.zza(), zzrg.mo49747l2(), zzrg.mo49748m2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: m */
    public final void mo50018m(zzri zzri, zzwz zzwz) {
        Preconditions.m4488k(zzri);
        Preconditions.m4484g(zzri.zza());
        Preconditions.m4484g(zzri.mo49753l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49913B(zzri.zza(), zzri.mo49753l2(), zzri.mo49754m2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: n */
    public final void mo50019n(zzrk zzrk, zzwz zzwz) {
        Preconditions.m4488k(zzrk);
        Preconditions.m4484g(zzrk.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49914C(zzrk.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: o */
    public final void mo50020o(zzrm zzrm, zzwz zzwz) {
        Preconditions.m4488k(zzrm);
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49915D(zzzi.m58538a(zzrm.mo49764m2(), (String) Preconditions.m4488k(zzrm.mo49763l2().mo22681t2()), (String) Preconditions.m4488k(zzrm.mo49763l2().mo22677n2()), zzrm.mo49765n2()), zzrm.mo49764m2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: p */
    public final void mo50021p(zzro zzro, zzwz zzwz) {
        Preconditions.m4488k(zzro);
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49916E(zzzk.m58543a(zzro.mo49770m2(), (String) Preconditions.m4488k(zzro.mo49769l2().mo22681t2()), (String) Preconditions.m4488k(zzro.mo49769l2().mo22677n2())), new zzxa(zzwz, f40579c));
    }

    /* renamed from: q */
    public final void mo50022q(zzrq zzrq, zzwz zzwz) {
        Preconditions.m4488k(zzrq);
        Preconditions.m4488k(zzwz);
        Preconditions.m4484g(zzrq.zza());
        this.f40580a.mo49917F(zzrq.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: r */
    public final void mo50023r(zzrs zzrs, zzwz zzwz) {
        Preconditions.m4488k(zzrs);
        Preconditions.m4484g(zzrs.zza());
        this.f40580a.mo49918G(zzrs.zza(), zzrs.mo49778l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: s */
    public final void mo50024s(zzru zzru, zzwz zzwz) {
        Preconditions.m4488k(zzru);
        Preconditions.m4484g(zzru.mo49783l2());
        Preconditions.m4484g(zzru.mo49784m2());
        Preconditions.m4484g(zzru.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49919H(zzru.mo49783l2(), zzru.mo49784m2(), zzru.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: t */
    public final void mo50025t(zzrw zzrw, zzwz zzwz) {
        Preconditions.m4488k(zzrw);
        Preconditions.m4484g(zzrw.mo49790m2());
        Preconditions.m4488k(zzrw.mo49789l2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49920I(zzrw.mo49790m2(), zzrw.mo49789l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: u */
    public final void mo50026u(zzry zzry, zzwz zzwz) {
        Preconditions.m4488k(zzwz);
        Preconditions.m4488k(zzry);
        this.f40580a.mo49921J(Preconditions.m4484g(zzry.mo49795m2()), zzyl.m58481a((PhoneAuthCredential) Preconditions.m4488k(zzry.mo49794l2())), new zzxa(zzwz, f40579c));
    }

    /* renamed from: v */
    public final void mo50027v(zzsa zzsa, zzwz zzwz) {
        Preconditions.m4488k(zzsa);
        Preconditions.m4484g(zzsa.zza());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49922K(zzsa.zza(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: w */
    public final void mo50028w(@NonNull zzsc zzsc, zzwz zzwz) {
        Preconditions.m4488k(zzsc);
        Preconditions.m4484g(zzsc.mo49804m2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49923L(zzsc.mo49804m2(), zzsc.mo49803l2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: x */
    public final void mo50029x(@NonNull zzse zzse, zzwz zzwz) {
        Preconditions.m4488k(zzse);
        Preconditions.m4484g(zzse.mo49809m2());
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49924M(zzse.mo49809m2(), zzse.mo49808l2(), zzse.mo49810n2(), new zzxa(zzwz, f40579c));
    }

    /* renamed from: y */
    public final void mo50030y(zzsg zzsg, zzwz zzwz) {
        Preconditions.m4488k(zzwz);
        Preconditions.m4488k(zzsg);
        zzaal zzaal = (zzaal) Preconditions.m4488k(zzsg.mo49814l2());
        String m2 = zzaal.mo48769m2();
        zzxa zzxa = new zzxa(zzwz, f40579c);
        if (this.f40581b.mo50084l(m2)) {
            if (zzaal.mo48771o2()) {
                this.f40581b.mo50082j(m2);
            } else {
                this.f40581b.mo50081i(zzxa, m2);
                return;
            }
        }
        long zzb = zzaal.zzb();
        boolean p2 = zzaal.mo48772p2();
        if (m58326g(zzb, p2)) {
            zzaal.mo48770n2(new zzza(this.f40581b.mo50079c()));
        }
        this.f40581b.mo50083k(m2, zzxa, zzb, p2);
        this.f40580a.mo49925N(zzaal, new zzys(this.f40581b, zzxa, m2));
    }

    /* renamed from: z */
    public final void mo50031z(zzsi zzsi, zzwz zzwz) {
        Preconditions.m4488k(zzsi);
        Preconditions.m4488k(zzwz);
        this.f40580a.mo49926O(zzsi.zza(), new zzxa(zzwz, f40579c));
    }
}
