package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxp extends zzyh implements zzyy {

    /* renamed from: a */
    private zzxj f40597a;

    /* renamed from: b */
    private zzxk f40598b;

    /* renamed from: c */
    private zzym f40599c;

    /* renamed from: d */
    private final zzxo f40600d;

    /* renamed from: e */
    private final FirebaseApp f40601e;

    /* renamed from: f */
    private final String f40602f;
    @VisibleForTesting

    /* renamed from: g */
    zzxq f40603g;

    @VisibleForTesting
    zzxp(FirebaseApp firebaseApp, zzxo zzxo, zzym zzym, zzxj zzxj, zzxk zzxk) {
        this.f40601e = firebaseApp;
        String b = firebaseApp.mo61952p().mo61961b();
        this.f40602f = b;
        this.f40600d = (zzxo) Preconditions.m4488k(zzxo);
        m58384w((zzym) null, (zzxj) null, (zzxk) null);
        zzyz.m58517e(b, this);
    }

    @NonNull
    /* renamed from: v */
    private final zzxq m58383v() {
        if (this.f40603g == null) {
            FirebaseApp firebaseApp = this.f40601e;
            this.f40603g = new zzxq(firebaseApp.mo61950l(), firebaseApp, this.f40600d.mo50038b());
        }
        return this.f40603g;
    }

    /* renamed from: w */
    private final void m58384w(zzym zzym, zzxj zzxj, zzxk zzxk) {
        this.f40599c = null;
        this.f40597a = null;
        this.f40598b = null;
        String a = zzyw.m58509a("firebear.secureToken");
        if (TextUtils.isEmpty(a)) {
            a = zzyz.m58516d(this.f40602f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(a)));
        }
        if (this.f40599c == null) {
            this.f40599c = new zzym(a, m58383v());
        }
        String a2 = zzyw.m58509a("firebear.identityToolkit");
        if (TextUtils.isEmpty(a2)) {
            a2 = zzyz.m58514b(this.f40602f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(a2)));
        }
        if (this.f40597a == null) {
            this.f40597a = new zzxj(a2, m58383v());
        }
        String a3 = zzyw.m58509a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(a3)) {
            a3 = zzyz.m58515c(this.f40602f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(a3)));
        }
        if (this.f40598b == null) {
            this.f40598b = new zzxk(a3, m58383v());
        }
    }

    /* renamed from: a */
    public final void mo50039a(zzzc zzzc, zzyg zzyg) {
        Preconditions.m4488k(zzzc);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/createAuthUri", this.f40602f), zzzc, zzyg, zzzd.class, zzxj.f40595b);
    }

    /* renamed from: b */
    public final void mo50040b(zzzf zzzf, zzyg zzyg) {
        Preconditions.m4488k(zzzf);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/deleteAccount", this.f40602f), zzzf, zzyg, Void.class, zzxj.f40595b);
    }

    /* renamed from: c */
    public final void mo50041c(zzzg zzzg, zzyg zzyg) {
        Preconditions.m4488k(zzzg);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/emailLinkSignin", this.f40602f), zzzg, zzyg, zzzh.class, zzxj.f40595b);
    }

    /* renamed from: d */
    public final void mo50042d(zzzi zzzi, zzyg zzyg) {
        Preconditions.m4488k(zzzi);
        Preconditions.m4488k(zzyg);
        zzxk zzxk = this.f40598b;
        zzyj.m58476a(zzxk.mo50037a("/accounts/mfaEnrollment:finalize", this.f40602f), zzzi, zzyg, zzzj.class, zzxk.f40595b);
    }

    /* renamed from: e */
    public final void mo50043e(zzzk zzzk, zzyg zzyg) {
        Preconditions.m4488k(zzzk);
        Preconditions.m4488k(zzyg);
        zzxk zzxk = this.f40598b;
        zzyj.m58476a(zzxk.mo50037a("/accounts/mfaSignIn:finalize", this.f40602f), zzzk, zzyg, zzzl.class, zzxk.f40595b);
    }

    /* renamed from: f */
    public final void mo50044f(zzzn zzzn, zzyg zzyg) {
        Preconditions.m4488k(zzzn);
        Preconditions.m4488k(zzyg);
        zzym zzym = this.f40599c;
        zzyj.m58476a(zzym.mo50037a("/token", this.f40602f), zzzn, zzyg, zzzy.class, zzym.f40595b);
    }

    /* renamed from: g */
    public final void mo50045g() {
        m58384w((zzym) null, (zzxj) null, (zzxk) null);
    }

    /* renamed from: h */
    public final void mo50046h(zzzo zzzo, zzyg zzyg) {
        Preconditions.m4488k(zzzo);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/getAccountInfo", this.f40602f), zzzo, zzyg, zzzp.class, zzxj.f40595b);
    }

    /* renamed from: i */
    public final void mo50047i(zzzv zzzv, zzyg zzyg) {
        Preconditions.m4488k(zzzv);
        Preconditions.m4488k(zzyg);
        if (zzzv.mo50139a() != null) {
            m58383v().mo50062c(zzzv.mo50139a().mo22562v2());
        }
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/getOobConfirmationCode", this.f40602f), zzzv, zzyg, zzzw.class, zzxj.f40595b);
    }

    /* renamed from: j */
    public final void mo50048j(zzaai zzaai, zzyg zzyg) {
        Preconditions.m4488k(zzaai);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/resetPassword", this.f40602f), zzaai, zzyg, zzaaj.class, zzxj.f40595b);
    }

    /* renamed from: k */
    public final void mo50049k(zzaal zzaal, zzyg zzyg) {
        Preconditions.m4488k(zzaal);
        Preconditions.m4488k(zzyg);
        if (!TextUtils.isEmpty(zzaal.mo48768l2())) {
            m58383v().mo50062c(zzaal.mo48768l2());
        }
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/sendVerificationCode", this.f40602f), zzaal, zzyg, zzaan.class, zzxj.f40595b);
    }

    /* renamed from: l */
    public final void mo50050l(zzaao zzaao, zzyg zzyg) {
        Preconditions.m4488k(zzaao);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/setAccountInfo", this.f40602f), zzaao, zzyg, zzaap.class, zzxj.f40595b);
    }

    /* renamed from: m */
    public final void mo50051m(@Nullable String str, zzyg zzyg) {
        Preconditions.m4488k(zzyg);
        m58383v().mo50061b(str);
        ((zzuw) zzyg).f40516a.mo49997m();
    }

    /* renamed from: n */
    public final void mo50052n(zzaaq zzaaq, zzyg zzyg) {
        Preconditions.m4488k(zzaaq);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/signupNewUser", this.f40602f), zzaaq, zzyg, zzaar.class, zzxj.f40595b);
    }

    /* renamed from: o */
    public final void mo50053o(zzaas zzaas, zzyg zzyg) {
        Preconditions.m4488k(zzaas);
        Preconditions.m4488k(zzyg);
        if (!TextUtils.isEmpty(zzaas.mo48799b())) {
            m58383v().mo50062c(zzaas.mo48799b());
        }
        zzxk zzxk = this.f40598b;
        zzyj.m58476a(zzxk.mo50037a("/accounts/mfaEnrollment:start", this.f40602f), zzaas, zzyg, zzaat.class, zzxk.f40595b);
    }

    /* renamed from: p */
    public final void mo50054p(zzaau zzaau, zzyg zzyg) {
        Preconditions.m4488k(zzaau);
        Preconditions.m4488k(zzyg);
        if (!TextUtils.isEmpty(zzaau.mo48802b())) {
            m58383v().mo50062c(zzaau.mo48802b());
        }
        zzxk zzxk = this.f40598b;
        zzyj.m58476a(zzxk.mo50037a("/accounts/mfaSignIn:start", this.f40602f), zzaau, zzyg, zzaav.class, zzxk.f40595b);
    }

    /* renamed from: q */
    public final void mo50055q(zzaay zzaay, zzyg zzyg) {
        Preconditions.m4488k(zzaay);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/verifyAssertion", this.f40602f), zzaay, zzyg, zzaba.class, zzxj.f40595b);
    }

    /* renamed from: r */
    public final void mo50056r(zzabb zzabb, zzyg zzyg) {
        Preconditions.m4488k(zzabb);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/verifyCustomToken", this.f40602f), zzabb, zzyg, zzabc.class, zzxj.f40595b);
    }

    /* renamed from: s */
    public final void mo50057s(zzabe zzabe, zzyg zzyg) {
        Preconditions.m4488k(zzabe);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/verifyPassword", this.f40602f), zzabe, zzyg, zzabf.class, zzxj.f40595b);
    }

    /* renamed from: t */
    public final void mo50058t(zzabg zzabg, zzyg zzyg) {
        Preconditions.m4488k(zzabg);
        Preconditions.m4488k(zzyg);
        zzxj zzxj = this.f40597a;
        zzyj.m58476a(zzxj.mo50037a("/verifyPhoneNumber", this.f40602f), zzabg, zzyg, zzabh.class, zzxj.f40595b);
    }

    /* renamed from: u */
    public final void mo50059u(zzabi zzabi, zzyg zzyg) {
        Preconditions.m4488k(zzabi);
        Preconditions.m4488k(zzyg);
        zzxk zzxk = this.f40598b;
        zzyj.m58476a(zzxk.mo50037a("/accounts/mfaEnrollment:withdraw", this.f40602f), zzabi, zzyg, zzabj.class, zzxk.f40595b);
    }
}
