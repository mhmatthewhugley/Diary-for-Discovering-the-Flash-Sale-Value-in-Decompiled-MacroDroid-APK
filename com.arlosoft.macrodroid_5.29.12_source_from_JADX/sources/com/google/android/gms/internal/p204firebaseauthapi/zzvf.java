package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzvf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzyh f40533a;

    public zzvf(zzyh zzyh) {
        this.f40533a = (zzyh) Preconditions.m4488k(zzyh);
    }

    /* renamed from: m */
    private final void m58141m(String str, zzyg zzyg) {
        Preconditions.m4488k(zzyg);
        Preconditions.m4484g(str);
        zzzy l2 = zzzy.m58580l2(str);
        if (l2.mo50152r2()) {
            zzyg.mo49910c(l2);
            return;
        }
        this.f40533a.mo50044f(new zzzn(l2.mo50148n2()), new zzve(this, zzyg));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m58142n(zzzg zzzg, zzxa zzxa) {
        Preconditions.m4488k(zzzg);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50041c(zzzg, new zztr(this, zzxa));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m58143o(zzzy zzzy, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zze zze, zzxa zzxa, zzyf zzyf) {
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(zzyf);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50046h(new zzzo(zzzy.mo50147m2()), new zztu(this, zzyf, str2, str, bool, zze, zzxa, zzzy));
    }

    /* renamed from: p */
    private final void m58144p(zzzv zzzv, zzxa zzxa) {
        Preconditions.m4488k(zzzv);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50047i(zzzv, new zzux(this, zzxa));
    }

    /* renamed from: t */
    static /* bridge */ /* synthetic */ void m58148t(zzvf zzvf, zzaba zzaba, zzxa zzxa, zzyf zzyf) {
        Status status;
        if (zzaba.mo48833p()) {
            zze b = zzaba.mo48820b();
            String c = zzaba.mo48821c();
            String j = zzaba.mo48828j();
            if (zzaba.mo48831m()) {
                status = new Status(17012);
            } else {
                status = zzai.m6170a(zzaba.mo48822d());
            }
            zzxa.mo49989e(new zztk(status, b, c, j));
            return;
        }
        zzvf.m58143o(new zzzy(zzaba.mo48827i(), zzaba.mo48823e(), Long.valueOf(zzaba.mo48819a()), "Bearer"), zzaba.mo48826h(), zzaba.mo48825g(), Boolean.valueOf(zzaba.mo48832n()), zzaba.mo48820b(), zzxa, zzyf);
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m58149u(zzvf zzvf, zzxa zzxa, zzzy zzzy, zzaao zzaao, zzyf zzyf) {
        Preconditions.m4488k(zzxa);
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(zzaao);
        Preconditions.m4488k(zzyf);
        zzvf.f40533a.mo50046h(new zzzo(zzzy.mo50147m2()), new zzts(zzvf, zzyf, zzxa, zzzy, zzaao));
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m58150v(zzvf zzvf, zzxa zzxa, zzzy zzzy, zzzr zzzr, zzaao zzaao, zzyf zzyf) {
        Preconditions.m4488k(zzxa);
        Preconditions.m4488k(zzzy);
        Preconditions.m4488k(zzzr);
        Preconditions.m4488k(zzaao);
        Preconditions.m4488k(zzyf);
        zzvf.f40533a.mo50050l(zzaao, new zztt(zzvf, zzaao, zzzr, zzxa, zzzy, zzyf));
    }

    /* renamed from: A */
    public final void mo49912A(String str, String str2, @Nullable String str3, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50048j(new zzaai(str, str2, str3), new zztz(this, zzxa));
    }

    /* renamed from: B */
    public final void mo49913B(String str, String str2, @Nullable String str3, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50052n(new zzaaq(str, str2, (String) null, str3), new zzto(this, zzxa));
    }

    /* renamed from: C */
    public final void mo49914C(String str, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzuv(this, zzxa));
    }

    /* renamed from: D */
    public final void mo49915D(zzzi zzzi, String str, zzxa zzxa) {
        Preconditions.m4488k(zzzi);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzup(this, zzzi, zzxa));
    }

    /* renamed from: E */
    public final void mo49916E(zzzk zzzk, zzxa zzxa) {
        Preconditions.m4488k(zzzk);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50043e(zzzk, new zzuq(this, zzxa));
    }

    /* renamed from: F */
    public final void mo49917F(String str, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50044f(new zzzn(str), new zzty(this, zzxa));
    }

    /* renamed from: G */
    public final void mo49918G(String str, @Nullable String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50039a(new zzzc(str, str2), new zztv(this, zzxa));
    }

    /* renamed from: H */
    public final void mo49919H(String str, String str2, String str3, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4484g(str3);
        Preconditions.m4488k(zzxa);
        m58141m(str3, new zzuc(this, str, str2, zzxa));
    }

    /* renamed from: I */
    public final void mo49920I(String str, zzaay zzaay, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzaay);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzug(this, zzaay, zzxa));
    }

    /* renamed from: J */
    public final void mo49921J(String str, zzabg zzabg, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzabg);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzue(this, zzabg, zzxa));
    }

    /* renamed from: K */
    public final void mo49922K(String str, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzut(this, zzxa));
    }

    /* renamed from: L */
    public final void mo49923L(String str, @Nullable ActionCodeSettings actionCodeSettings, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        zzzv zzzv = new zzzv(4);
        zzzv.mo50143f(str);
        if (actionCodeSettings != null) {
            zzzv.mo50140c(actionCodeSettings);
        }
        m58144p(zzzv, zzxa);
    }

    /* renamed from: M */
    public final void mo49924M(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        zzzv zzzv = new zzzv(actionCodeSettings.zza());
        zzzv.mo50141d(str);
        zzzv.mo50140c(actionCodeSettings);
        zzzv.mo50142e(str2);
        this.f40533a.mo50047i(zzzv, new zztw(this, zzxa));
    }

    /* renamed from: N */
    public final void mo49925N(zzaal zzaal, zzxa zzxa) {
        Preconditions.m4484g(zzaal.mo48769m2());
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50049k(zzaal, new zzua(this, zzxa));
    }

    /* renamed from: O */
    public final void mo49926O(@Nullable String str, zzxa zzxa) {
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50051m(str, new zzuw(this, zzxa));
    }

    /* renamed from: P */
    public final void mo49927P(@Nullable String str, zzxa zzxa) {
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50052n(new zzaaq(str), new zzuz(this, zzxa));
    }

    /* renamed from: a */
    public final void mo49928a(zzaay zzaay, zzxa zzxa) {
        Preconditions.m4488k(zzaay);
        Preconditions.m4488k(zzxa);
        zzaay.mo48811n2(true);
        this.f40533a.mo50055q(zzaay, new zzuy(this, zzxa));
    }

    /* renamed from: b */
    public final void mo49929b(zzabb zzabb, zzxa zzxa) {
        Preconditions.m4488k(zzabb);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50056r(zzabb, new zzun(this, zzxa));
    }

    /* renamed from: c */
    public final void mo49930c(String str, String str2, @Nullable String str3, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50057s(new zzabe(str, str2, str3), new zztp(this, zzxa));
    }

    /* renamed from: d */
    public final void mo49931d(EmailAuthCredential emailAuthCredential, zzxa zzxa) {
        Preconditions.m4488k(emailAuthCredential);
        Preconditions.m4488k(zzxa);
        if (emailAuthCredential.mo22588u2()) {
            m58141m(emailAuthCredential.mo22583p2(), new zztq(this, emailAuthCredential, zzxa));
        } else {
            m58142n(new zzzg(emailAuthCredential, (String) null), zzxa);
        }
    }

    /* renamed from: e */
    public final void mo49932e(zzabg zzabg, zzxa zzxa) {
        Preconditions.m4488k(zzabg);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50058t(zzabg, new zzub(this, zzxa));
    }

    /* renamed from: f */
    public final void mo49933f(zzaas zzaas, zzxa zzxa) {
        Preconditions.m4488k(zzaas);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50053o(zzaas, new zzum(this, zzxa));
    }

    /* renamed from: g */
    public final void mo49934g(zzaau zzaau, zzxa zzxa) {
        Preconditions.m4488k(zzaau);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50054p(zzaau, new zzur(this, zzxa));
    }

    /* renamed from: h */
    public final void mo49935h(String str, String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzul(this, str2, zzxa));
    }

    /* renamed from: i */
    public final void mo49936i(String str, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzuh(this, zzxa));
    }

    /* renamed from: j */
    public final void mo49937j(String str, String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        m58141m(str2, new zzuj(this, str, zzxa));
    }

    /* renamed from: k */
    public final void mo49938k(String str, UserProfileChangeRequest userProfileChangeRequest, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(userProfileChangeRequest);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzva(this, userProfileChangeRequest, zzxa));
    }

    /* renamed from: l */
    public final void mo49939l(zzzv zzzv, zzxa zzxa) {
        m58144p(zzzv, zzxa);
    }

    /* renamed from: w */
    public final void mo49940w(String str, @Nullable String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        zzaao zzaao = new zzaao();
        zzaao.mo48782e(str);
        zzaao.mo48785h(str2);
        this.f40533a.mo50050l(zzaao, new zzvd(this, zzxa));
    }

    /* renamed from: x */
    public final void mo49941x(String str, String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzvb(this, str2, zzxa));
    }

    /* renamed from: y */
    public final void mo49942y(String str, String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(zzxa);
        m58141m(str, new zzvc(this, str2, zzxa));
    }

    /* renamed from: z */
    public final void mo49943z(String str, @Nullable String str2, zzxa zzxa) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzxa);
        this.f40533a.mo50048j(new zzaai(str, (String) null, str2), new zztx(this, zzxa));
    }
}
