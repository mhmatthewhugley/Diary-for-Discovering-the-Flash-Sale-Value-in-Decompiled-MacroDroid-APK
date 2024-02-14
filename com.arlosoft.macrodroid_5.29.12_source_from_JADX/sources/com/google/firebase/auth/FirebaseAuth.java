package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzaal;
import com.google.android.gms.internal.p204firebaseauthapi.zzwy;
import com.google.android.gms.internal.p204firebaseauthapi.zzxc;
import com.google.android.gms.internal.p204firebaseauthapi.zzxh;
import com.google.android.gms.internal.p204firebaseauthapi.zzxr;
import com.google.android.gms.internal.p204firebaseauthapi.zzyp;
import com.google.android.gms.internal.p204firebaseauthapi.zzyz;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.internal.zzbm;
import com.google.firebase.auth.internal.zzf;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzw;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class FirebaseAuth implements InternalAuthProvider {

    /* renamed from: a */
    private FirebaseApp f4498a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List f4499b = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List f4500c = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f4501d = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzwy f4502e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public FirebaseUser f4503f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzw f4504g;

    /* renamed from: h */
    private final Object f4505h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f4506i;

    /* renamed from: j */
    private final Object f4507j = new Object();

    /* renamed from: k */
    private String f4508k;

    /* renamed from: l */
    private final zzbg f4509l;

    /* renamed from: m */
    private final zzbm f4510m;

    /* renamed from: n */
    private final zzf f4511n;

    /* renamed from: o */
    private final Provider f4512o;

    /* renamed from: p */
    private zzbi f4513p;

    /* renamed from: q */
    private zzbj f4514q = zzbj.m6227a();

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface AuthStateListener {
        /* renamed from: a */
        void mo22632a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface IdTokenListener {
        /* renamed from: a */
        void mo22633a(@NonNull FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(@NonNull FirebaseApp firebaseApp, @NonNull Provider provider) {
        zzzy b;
        zzwy zzwy = new zzwy(firebaseApp);
        zzbg zzbg = new zzbg(firebaseApp.mo61950l(), firebaseApp.mo61953q());
        zzbm c = zzbm.m6232c();
        zzf b2 = zzf.m6246b();
        this.f4498a = (FirebaseApp) Preconditions.m4488k(firebaseApp);
        this.f4502e = (zzwy) Preconditions.m4488k(zzwy);
        zzbg zzbg2 = (zzbg) Preconditions.m4488k(zzbg);
        this.f4509l = zzbg2;
        this.f4504g = new zzw();
        zzbm zzbm = (zzbm) Preconditions.m4488k(c);
        this.f4510m = zzbm;
        this.f4511n = (zzf) Preconditions.m4488k(b2);
        this.f4512o = provider;
        FirebaseUser a = zzbg2.mo22766a();
        this.f4503f = a;
        if (!(a == null || (b = zzbg2.mo22767b(a)) == null)) {
            m5986F(this, this.f4503f, b, false, false);
        }
        zzbm.mo22778e(this);
    }

    /* renamed from: D */
    public static void m5984D(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            String r2 = firebaseUser.mo22654r2();
            StringBuilder sb = new StringBuilder();
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(r2);
            sb.append(" ).");
        }
        firebaseAuth.f4514q.execute(new zzm(firebaseAuth));
    }

    /* renamed from: E */
    public static void m5985E(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            String r2 = firebaseUser.mo22654r2();
            StringBuilder sb = new StringBuilder();
            sb.append("Notifying id token listeners about user ( ");
            sb.append(r2);
            sb.append(" ).");
        }
        firebaseAuth.f4514q.execute(new zzl(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.mo22642B2() : null)));
    }

    @VisibleForTesting
    /* renamed from: F */
    static void m5986F(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzzy zzzy, boolean z, boolean z2) {
        boolean z3;
        Preconditions.m4488k(firebaseUser);
        Preconditions.m4488k(zzzy);
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = firebaseAuth.f4503f != null && firebaseUser.mo22654r2().equals(firebaseAuth.f4503f.mo22654r2());
        if (z6 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.f4503f;
            if (firebaseUser2 == null) {
                z3 = true;
            } else {
                boolean z7 = !firebaseUser2.mo22641A2().mo50147m2().equals(zzzy.mo50147m2());
                if (!z6 || z7) {
                    z4 = true;
                }
                z3 = true ^ z6;
                z5 = z4;
            }
            Preconditions.m4488k(firebaseUser);
            FirebaseUser firebaseUser3 = firebaseAuth.f4503f;
            if (firebaseUser3 == null) {
                firebaseAuth.f4503f = firebaseUser;
            } else {
                firebaseUser3.mo22662z2(firebaseUser.mo22652p2());
                if (!firebaseUser.mo22655s2()) {
                    firebaseAuth.f4503f.mo22661y2();
                }
                firebaseAuth.f4503f.mo22646F2(firebaseUser.mo22648m2().mo22668a());
            }
            if (z) {
                firebaseAuth.f4509l.mo22769d(firebaseAuth.f4503f);
            }
            if (z5) {
                FirebaseUser firebaseUser4 = firebaseAuth.f4503f;
                if (firebaseUser4 != null) {
                    firebaseUser4.mo22645E2(zzzy);
                }
                m5985E(firebaseAuth, firebaseAuth.f4503f);
            }
            if (z3) {
                m5984D(firebaseAuth, firebaseAuth.f4503f);
            }
            if (z) {
                firebaseAuth.f4509l.mo22770e(firebaseUser, zzzy);
            }
            FirebaseUser firebaseUser5 = firebaseAuth.f4503f;
            if (firebaseUser5 != null) {
                m5993X(firebaseAuth).mo22773e(firebaseUser5.mo22641A2());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks m5987J(@Nullable String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (!this.f4504g.mo22821d() || str == null || !str.equals(this.f4504g.mo22818a())) ? onVerificationStateChangedCallbacks : new zzq(this, onVerificationStateChangedCallbacks);
    }

    /* renamed from: K */
    private final boolean m5988K(String str) {
        ActionCodeUrl c = ActionCodeUrl.m5954c(str);
        return c != null && !TextUtils.equals(this.f4508k, c.mo22574d());
    }

    /* renamed from: X */
    public static zzbi m5993X(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f4513p == null) {
            firebaseAuth.f4513p = new zzbi((FirebaseApp) Preconditions.m4488k(firebaseAuth.f4498a));
        }
        return firebaseAuth.f4513p;
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.m74383m().mo61949j(FirebaseAuth.class);
    }

    /* renamed from: B */
    public final void mo22593B() {
        Preconditions.m4488k(this.f4509l);
        FirebaseUser firebaseUser = this.f4503f;
        if (firebaseUser != null) {
            zzbg zzbg = this.f4509l;
            Preconditions.m4488k(firebaseUser);
            zzbg.mo22768c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo22654r2()}));
            this.f4503f = null;
        }
        this.f4509l.mo22768c("com.google.firebase.auth.FIREBASE_USER");
        m5985E(this, (FirebaseUser) null);
        m5984D(this, (FirebaseUser) null);
    }

    /* renamed from: C */
    public final void mo22594C(FirebaseUser firebaseUser, zzzy zzzy, boolean z) {
        m5986F(this, firebaseUser, zzzy, true, false);
    }

    /* renamed from: G */
    public final void mo22595G(@NonNull PhoneAuthOptions phoneAuthOptions) {
        String str;
        if (phoneAuthOptions.mo22695l()) {
            FirebaseAuth c = phoneAuthOptions.mo22686c();
            if (((zzag) Preconditions.m4488k(phoneAuthOptions.mo22687d())).mo22741p2()) {
                str = Preconditions.m4484g(phoneAuthOptions.mo22692i());
            } else {
                str = Preconditions.m4484g(((PhoneMultiFactorInfo) Preconditions.m4488k(phoneAuthOptions.mo22690g())).mo22709o2());
            }
            if (phoneAuthOptions.mo22688e() == null || !zzyp.m58489d(str, phoneAuthOptions.mo22689f(), (Activity) Preconditions.m4488k(phoneAuthOptions.mo22685b()), phoneAuthOptions.mo22693j())) {
                c.f4511n.mo22786a(c, phoneAuthOptions.mo22692i(), (Activity) Preconditions.m4488k(phoneAuthOptions.mo22685b()), c.mo22597I()).mo23702c(new zzp(c, phoneAuthOptions));
                return;
            }
            return;
        }
        FirebaseAuth c2 = phoneAuthOptions.mo22686c();
        String g = Preconditions.m4484g(phoneAuthOptions.mo22692i());
        long longValue = phoneAuthOptions.mo22691h().longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks f = phoneAuthOptions.mo22689f();
        Activity activity = (Activity) Preconditions.m4488k(phoneAuthOptions.mo22685b());
        Executor j = phoneAuthOptions.mo22693j();
        boolean z = phoneAuthOptions.mo22688e() != null;
        if (z || !zzyp.m58489d(g, f, activity, j)) {
            c2.f4511n.mo22786a(c2, g, activity, c2.mo22597I()).mo23702c(new zzo(c2, g, longValue, timeUnit, f, activity, j, z));
        }
    }

    /* renamed from: H */
    public final void mo22596H(@NonNull String str, long j, @NonNull TimeUnit timeUnit, @NonNull PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @NonNull Activity activity, @NonNull Executor executor, boolean z, @Nullable String str2, @Nullable String str3) {
        long j2 = j;
        long convert = TimeUnit.SECONDS.convert(j, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str4 = str;
        this.f4502e.mo49954j(this.f4498a, new zzaal(str, convert, z, this.f4506i, this.f4508k, str2, mo22597I(), str3), m5987J(str, onVerificationStateChangedCallbacks), activity, executor);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: I */
    public final boolean mo22597I() {
        return zzxh.m58377a(mo22612f().mo61950l());
    }

    @NonNull
    /* renamed from: L */
    public final Task mo22598L(@Nullable FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.m66666e(zzxc.m58359a(new Status(17495)));
        }
        zzzy A2 = firebaseUser.mo22641A2();
        if (!A2.mo50152r2() || z) {
            return this.f4502e.mo49958n(this.f4498a, firebaseUser, A2.mo50148n2(), new zzn(this));
        }
        return Tasks.m66667f(zzay.m6194a(A2.mo50147m2()));
    }

    @NonNull
    /* renamed from: M */
    public final Task mo22599M(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        Preconditions.m4488k(authCredential);
        Preconditions.m4488k(firebaseUser);
        return this.f4502e.mo49959o(this.f4498a, firebaseUser, authCredential.mo22577m2(), new zzt(this));
    }

    @NonNull
    /* renamed from: N */
    public final Task mo22600N(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        Preconditions.m4488k(firebaseUser);
        Preconditions.m4488k(authCredential);
        AuthCredential m2 = authCredential.mo22577m2();
        if (m2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) m2;
            if ("password".equals(emailAuthCredential.mo22581n2())) {
                return this.f4502e.mo49962r(this.f4498a, firebaseUser, emailAuthCredential.mo22584q2(), Preconditions.m4484g(emailAuthCredential.mo22585r2()), firebaseUser.mo22653q2(), new zzt(this));
            } else if (m5988K(Preconditions.m4484g(emailAuthCredential.mo22586s2()))) {
                return Tasks.m66666e(zzxc.m58359a(new Status(17072)));
            } else {
                return this.f4502e.mo49961q(this.f4498a, firebaseUser, emailAuthCredential, new zzt(this));
            }
        } else if (m2 instanceof PhoneAuthCredential) {
            return this.f4502e.mo49963s(this.f4498a, firebaseUser, (PhoneAuthCredential) m2, this.f4508k, new zzt(this));
        } else {
            return this.f4502e.mo49960p(this.f4498a, firebaseUser, m2, firebaseUser.mo22653q2(), new zzt(this));
        }
    }

    @NonNull
    /* renamed from: O */
    public final Task mo22601O(@Nullable ActionCodeSettings actionCodeSettings, @NonNull String str) {
        Preconditions.m4484g(str);
        if (this.f4506i != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.m5930s2();
            }
            actionCodeSettings.mo22563w2(this.f4506i);
        }
        return this.f4502e.mo49964t(this.f4498a, actionCodeSettings, str);
    }

    @NonNull
    /* renamed from: P */
    public final Task mo22602P(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider, @NonNull FirebaseUser firebaseUser) {
        Preconditions.m4488k(activity);
        Preconditions.m4488k(federatedAuthProvider);
        Preconditions.m4488k(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f4510m.mo22783j(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.m66666e(zzxc.m58359a(new Status(17057)));
        }
        this.f4510m.mo22781h(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.mo22591a(activity);
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: Q */
    public final Task mo22603Q(@NonNull FirebaseUser firebaseUser, @NonNull UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.m4488k(firebaseUser);
        Preconditions.m4488k(userProfileChangeRequest);
        return this.f4502e.mo49952g(this.f4498a, firebaseUser, userProfileChangeRequest, new zzt(this));
    }

    @NonNull
    /* renamed from: R */
    public final Task mo22604R(@NonNull String str, @NonNull String str2, @Nullable ActionCodeSettings actionCodeSettings) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.m5930s2();
        }
        String str3 = this.f4506i;
        if (str3 != null) {
            actionCodeSettings.mo22563w2(str3);
        }
        return this.f4502e.mo49953h(str, str2, actionCodeSettings);
    }

    @VisibleForTesting
    /* renamed from: W */
    public final synchronized zzbi mo22605W() {
        return m5993X(this);
    }

    @NonNull
    /* renamed from: Y */
    public final Provider mo22606Y() {
        return this.f4512o;
    }

    @NonNull
    /* renamed from: a */
    public final Task mo22607a(boolean z) {
        return mo22598L(this.f4503f, z);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo22608b(@NonNull com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        Preconditions.m4488k(idTokenListener);
        this.f4500c.add(idTokenListener);
        mo22605W().mo22772d(this.f4500c.size());
    }

    @NonNull
    /* renamed from: c */
    public Task<ActionCodeResult> mo22609c(@NonNull String str) {
        Preconditions.m4484g(str);
        return this.f4502e.mo49955k(this.f4498a, str, this.f4508k);
    }

    @NonNull
    /* renamed from: d */
    public Task<AuthResult> mo22610d(@NonNull String str, @NonNull String str2) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        return this.f4502e.mo49956l(this.f4498a, str, str2, this.f4508k, new zzs(this));
    }

    @NonNull
    /* renamed from: e */
    public Task<SignInMethodQueryResult> mo22611e(@NonNull String str) {
        Preconditions.m4484g(str);
        return this.f4502e.mo49957m(this.f4498a, str, this.f4508k);
    }

    @NonNull
    /* renamed from: f */
    public FirebaseApp mo22612f() {
        return this.f4498a;
    }

    @Nullable
    /* renamed from: g */
    public FirebaseUser mo22613g() {
        return this.f4503f;
    }

    @Nullable
    public final String getUid() {
        FirebaseUser firebaseUser = this.f4503f;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.mo22654r2();
    }

    @NonNull
    /* renamed from: h */
    public FirebaseAuthSettings mo22615h() {
        return this.f4504g;
    }

    @Nullable
    /* renamed from: i */
    public String mo22616i() {
        String str;
        synchronized (this.f4505h) {
            str = this.f4506i;
        }
        return str;
    }

    @Nullable
    /* renamed from: j */
    public Task<AuthResult> mo22617j() {
        return this.f4510m.mo22775a();
    }

    @Nullable
    /* renamed from: k */
    public String mo22618k() {
        String str;
        synchronized (this.f4507j) {
            str = this.f4508k;
        }
        return str;
    }

    /* renamed from: l */
    public boolean mo22619l(@NonNull String str) {
        return EmailAuthCredential.m5964v2(str);
    }

    @NonNull
    /* renamed from: m */
    public Task<Void> mo22620m(@NonNull String str) {
        Preconditions.m4484g(str);
        return mo22621n(str, (ActionCodeSettings) null);
    }

    @NonNull
    /* renamed from: n */
    public Task<Void> mo22621n(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        Preconditions.m4484g(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.m5930s2();
        }
        String str2 = this.f4506i;
        if (str2 != null) {
            actionCodeSettings.mo22563w2(str2);
        }
        actionCodeSettings.mo22565x2(1);
        return this.f4502e.mo49965u(this.f4498a, str, actionCodeSettings, this.f4508k);
    }

    @NonNull
    /* renamed from: o */
    public Task<Void> mo22622o(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(actionCodeSettings);
        if (actionCodeSettings.mo22554l2()) {
            String str2 = this.f4506i;
            if (str2 != null) {
                actionCodeSettings.mo22563w2(str2);
            }
            return this.f4502e.mo49966v(this.f4498a, str, actionCodeSettings, this.f4508k);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    @NonNull
    /* renamed from: p */
    public Task<Void> mo22623p(@Nullable String str) {
        return this.f4502e.mo49967w(str);
    }

    /* renamed from: q */
    public void mo22624q(@NonNull String str) {
        Preconditions.m4484g(str);
        synchronized (this.f4507j) {
            this.f4508k = str;
        }
    }

    @NonNull
    /* renamed from: r */
    public Task<AuthResult> mo22625r() {
        FirebaseUser firebaseUser = this.f4503f;
        if (firebaseUser == null || !firebaseUser.mo22655s2()) {
            return this.f4502e.mo49968x(this.f4498a, new zzs(this), this.f4508k);
        }
        zzx zzx = (zzx) this.f4503f;
        zzx.mo22830N2(false);
        return Tasks.m66667f(new zzr(zzx));
    }

    @NonNull
    /* renamed from: s */
    public Task<AuthResult> mo22626s(@NonNull AuthCredential authCredential) {
        Preconditions.m4488k(authCredential);
        AuthCredential m2 = authCredential.mo22577m2();
        if (m2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) m2;
            if (!emailAuthCredential.mo22587t2()) {
                return this.f4502e.mo49947b(this.f4498a, emailAuthCredential.mo22584q2(), Preconditions.m4484g(emailAuthCredential.mo22585r2()), this.f4508k, new zzs(this));
            }
            if (m5988K(Preconditions.m4484g(emailAuthCredential.mo22586s2()))) {
                return Tasks.m66666e(zzxc.m58359a(new Status(17072)));
            }
            return this.f4502e.mo49948c(this.f4498a, emailAuthCredential, new zzs(this));
        } else if (!(m2 instanceof PhoneAuthCredential)) {
            return this.f4502e.mo49969y(this.f4498a, m2, this.f4508k, new zzs(this));
        } else {
            return this.f4502e.mo49949d(this.f4498a, (PhoneAuthCredential) m2, this.f4508k, new zzs(this));
        }
    }

    @NonNull
    /* renamed from: t */
    public Task<AuthResult> mo22627t(@NonNull String str, @NonNull String str2) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        return this.f4502e.mo49947b(this.f4498a, str, str2, this.f4508k, new zzs(this));
    }

    /* renamed from: u */
    public void mo22628u() {
        mo22593B();
        zzbi zzbi = this.f4513p;
        if (zzbi != null) {
            zzbi.mo22771c();
        }
    }

    @NonNull
    /* renamed from: v */
    public Task<AuthResult> mo22629v(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Preconditions.m4488k(federatedAuthProvider);
        Preconditions.m4488k(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f4510m.mo22782i(activity, taskCompletionSource, this)) {
            return Tasks.m66666e(zzxc.m58359a(new Status(17057)));
        }
        this.f4510m.mo22780g(activity.getApplicationContext(), this);
        federatedAuthProvider.mo22592b(activity);
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: w */
    public void mo22630w() {
        synchronized (this.f4505h) {
            this.f4506i = zzxr.m58409a();
        }
    }

    /* renamed from: x */
    public void mo22631x(@NonNull String str, int i) {
        Preconditions.m4484g(str);
        boolean z = false;
        if (i >= 0 && i <= 65535) {
            z = true;
        }
        Preconditions.m4479b(z, "Port number must be in the range 0-65535");
        zzyz.m58518f(this.f4498a, str, i);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.mo61949j(FirebaseAuth.class);
    }
}
