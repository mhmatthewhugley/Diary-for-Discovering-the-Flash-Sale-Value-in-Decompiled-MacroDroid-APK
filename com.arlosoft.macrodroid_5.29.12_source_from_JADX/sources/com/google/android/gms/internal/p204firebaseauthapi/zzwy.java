package com.google.android.gms.internal.p204firebaseauthapi;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzwy extends zzye {
    public zzwy(FirebaseApp firebaseApp) {
        this.f40645a = new zzxb(firebaseApp);
        this.f40646b = Executors.newCachedThreadPool();
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: i */
    static zzx m58269i(FirebaseApp firebaseApp, zzzr zzzr) {
        Preconditions.m4488k(firebaseApp);
        Preconditions.m4488k(zzzr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzzr, "firebase"));
        List B2 = zzzr.mo50113B2();
        if (B2 != null && !B2.isEmpty()) {
            for (int i = 0; i < B2.size(); i++) {
                arrayList.add(new zzt((zzaae) B2.get(i)));
            }
        }
        zzx zzx = new zzx(firebaseApp, arrayList);
        zzx.mo22831O2(new zzz(zzzr.zzb(), zzzr.mo50116l2()));
        zzx.mo22830N2(zzzr.mo50115D2());
        zzx.mo22829M2(zzzr.mo50118n2());
        zzx.mo22646F2(zzba.m6201b(zzzr.mo50112A2()));
        return zzx;
    }

    /* renamed from: b */
    public final Task mo49947b(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3, zzg zzg) {
        zzwj zzwj = new zzwj(str, str2, str3);
        zzwj.mo50068e(firebaseApp);
        zzwj.mo50066c(zzg);
        return mo50074a(zzwj);
    }

    /* renamed from: c */
    public final Task mo49948c(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, zzg zzg) {
        zzwk zzwk = new zzwk(emailAuthCredential);
        zzwk.mo50068e(firebaseApp);
        zzwk.mo50066c(zzg);
        return mo50074a(zzwk);
    }

    /* renamed from: d */
    public final Task mo49949d(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzg zzg) {
        zzyp.m58488c();
        zzwl zzwl = new zzwl(phoneAuthCredential, str);
        zzwl.mo50068e(firebaseApp);
        zzwl.mo50066c(zzg);
        return mo50074a(zzwl);
    }

    /* renamed from: e */
    public final Task mo49950e(zzag zzag, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzwm zzwm = new zzwm(zzag, str, str2, j, z, z2, str3, str4, z3);
        String str5 = str;
        zzwm.mo50070g(onVerificationStateChangedCallbacks, activity, executor, str);
        return mo50074a(zzwm);
    }

    /* renamed from: f */
    public final Task mo49951f(zzag zzag, PhoneMultiFactorInfo phoneMultiFactorInfo, @Nullable String str, long j, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable Activity activity) {
        zzwn zzwn = new zzwn(phoneMultiFactorInfo, Preconditions.m4484g(zzag.mo22740o2()), str, j, z, z2, str2, str3, z3);
        Activity activity2 = activity;
        zzwn.mo50070g(onVerificationStateChangedCallbacks, activity2, executor, phoneMultiFactorInfo.mo22709o2());
        return mo50074a(zzwn);
    }

    /* renamed from: g */
    public final Task mo49952g(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzbk zzbk) {
        zzwu zzwu = new zzwu(userProfileChangeRequest);
        zzwu.mo50068e(firebaseApp);
        zzwu.mo50069f(firebaseUser);
        zzwu.mo50066c(zzbk);
        zzwu.mo50067d(zzbk);
        return mo50074a(zzwu);
    }

    /* renamed from: h */
    public final Task mo49953h(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.mo22565x2(7);
        return mo50074a(new zzwv(str, str2, actionCodeSettings));
    }

    /* renamed from: j */
    public final void mo49954j(FirebaseApp firebaseApp, zzaal zzaal, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        zzwx zzwx = new zzwx(zzaal);
        zzwx.mo50068e(firebaseApp);
        zzwx.mo50070g(onVerificationStateChangedCallbacks, activity, executor, zzaal.mo48769m2());
        mo50074a(zzwx);
    }

    /* renamed from: k */
    public final Task mo49955k(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzvi zzvi = new zzvi(str, str2);
        zzvi.mo50068e(firebaseApp);
        return mo50074a(zzvi);
    }

    /* renamed from: l */
    public final Task mo49956l(FirebaseApp firebaseApp, String str, String str2, String str3, zzg zzg) {
        zzvk zzvk = new zzvk(str, str2, str3);
        zzvk.mo50068e(firebaseApp);
        zzvk.mo50066c(zzg);
        return mo50074a(zzvk);
    }

    /* renamed from: m */
    public final Task mo49957m(FirebaseApp firebaseApp, String str, @Nullable String str2) {
        zzvm zzvm = new zzvm(str, str2);
        zzvm.mo50068e(firebaseApp);
        return mo50074a(zzvm);
    }

    /* renamed from: n */
    public final Task mo49958n(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzvp zzvp = new zzvp(str);
        zzvp.mo50068e(firebaseApp);
        zzvp.mo50069f(firebaseUser);
        zzvp.mo50066c(zzbk);
        zzvp.mo50067d(zzbk);
        return mo50074a(zzvp);
    }

    /* renamed from: o */
    public final Task mo49959o(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzbk zzbk) {
        Preconditions.m4488k(firebaseApp);
        Preconditions.m4488k(authCredential);
        Preconditions.m4488k(firebaseUser);
        Preconditions.m4488k(zzbk);
        List D2 = firebaseUser.mo22644D2();
        if (D2 != null && D2.contains(authCredential.mo22576l2())) {
            return Tasks.m66666e(zzxc.m58359a(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.mo22587t2()) {
                zzvq zzvq = new zzvq(emailAuthCredential);
                zzvq.mo50068e(firebaseApp);
                zzvq.mo50069f(firebaseUser);
                zzvq.mo50066c(zzbk);
                zzvq.mo50067d(zzbk);
                return mo50074a(zzvq);
            }
            zzvt zzvt = new zzvt(emailAuthCredential);
            zzvt.mo50068e(firebaseApp);
            zzvt.mo50069f(firebaseUser);
            zzvt.mo50066c(zzbk);
            zzvt.mo50067d(zzbk);
            return mo50074a(zzvt);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzyp.m58488c();
            zzvs zzvs = new zzvs((PhoneAuthCredential) authCredential);
            zzvs.mo50068e(firebaseApp);
            zzvs.mo50069f(firebaseUser);
            zzvs.mo50066c(zzbk);
            zzvs.mo50067d(zzbk);
            return mo50074a(zzvs);
        } else {
            Preconditions.m4488k(firebaseApp);
            Preconditions.m4488k(authCredential);
            Preconditions.m4488k(firebaseUser);
            Preconditions.m4488k(zzbk);
            zzvr zzvr = new zzvr(authCredential);
            zzvr.mo50068e(firebaseApp);
            zzvr.mo50069f(firebaseUser);
            zzvr.mo50066c(zzbk);
            zzvr.mo50067d(zzbk);
            return mo50074a(zzvr);
        }
    }

    /* renamed from: p */
    public final Task mo49960p(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzbk zzbk) {
        zzvv zzvv = new zzvv(authCredential, str);
        zzvv.mo50068e(firebaseApp);
        zzvv.mo50069f(firebaseUser);
        zzvv.mo50066c(zzbk);
        zzvv.mo50067d(zzbk);
        return mo50074a(zzvv);
    }

    /* renamed from: q */
    public final Task mo49961q(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbk) {
        zzvx zzvx = new zzvx(emailAuthCredential);
        zzvx.mo50068e(firebaseApp);
        zzvx.mo50069f(firebaseUser);
        zzvx.mo50066c(zzbk);
        zzvx.mo50067d(zzbk);
        return mo50074a(zzvx);
    }

    /* renamed from: r */
    public final Task mo49962r(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, zzbk zzbk) {
        zzvz zzvz = new zzvz(str, str2, str3);
        zzvz.mo50068e(firebaseApp);
        zzvz.mo50069f(firebaseUser);
        zzvz.mo50066c(zzbk);
        zzvz.mo50067d(zzbk);
        return mo50074a(zzvz);
    }

    /* renamed from: s */
    public final Task mo49963s(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzbk zzbk) {
        zzyp.m58488c();
        zzwb zzwb = new zzwb(phoneAuthCredential, str);
        zzwb.mo50068e(firebaseApp);
        zzwb.mo50069f(firebaseUser);
        zzwb.mo50066c(zzbk);
        zzwb.mo50067d(zzbk);
        return mo50074a(zzwb);
    }

    /* renamed from: t */
    public final Task mo49964t(FirebaseApp firebaseApp, @Nullable ActionCodeSettings actionCodeSettings, String str) {
        zzwd zzwd = new zzwd(str, actionCodeSettings);
        zzwd.mo50068e(firebaseApp);
        return mo50074a(zzwd);
    }

    /* renamed from: u */
    public final Task mo49965u(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2) {
        actionCodeSettings.mo22565x2(1);
        zzwe zzwe = new zzwe(str, actionCodeSettings, str2, "sendPasswordResetEmail");
        zzwe.mo50068e(firebaseApp);
        return mo50074a(zzwe);
    }

    /* renamed from: v */
    public final Task mo49966v(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2) {
        actionCodeSettings.mo22565x2(6);
        zzwe zzwe = new zzwe(str, actionCodeSettings, str2, "sendSignInLinkToEmail");
        zzwe.mo50068e(firebaseApp);
        return mo50074a(zzwe);
    }

    @NonNull
    /* renamed from: w */
    public final Task mo49967w(@Nullable String str) {
        return mo50074a(new zzwf(str));
    }

    /* renamed from: x */
    public final Task mo49968x(FirebaseApp firebaseApp, zzg zzg, @Nullable String str) {
        zzwg zzwg = new zzwg(str);
        zzwg.mo50068e(firebaseApp);
        zzwg.mo50066c(zzg);
        return mo50074a(zzwg);
    }

    /* renamed from: y */
    public final Task mo49969y(FirebaseApp firebaseApp, AuthCredential authCredential, @Nullable String str, zzg zzg) {
        zzwh zzwh = new zzwh(authCredential, str);
        zzwh.mo50068e(firebaseApp);
        zzwh.mo50066c(zzg);
        return mo50074a(zzwh);
    }
}
