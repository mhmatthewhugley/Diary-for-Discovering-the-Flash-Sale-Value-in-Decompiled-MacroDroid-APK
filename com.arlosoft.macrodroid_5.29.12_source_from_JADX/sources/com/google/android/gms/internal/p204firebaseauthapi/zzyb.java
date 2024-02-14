package com.google.android.gms.internal.p204firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzao;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzyb implements zzyd {

    /* renamed from: a */
    protected final int f40620a;
    @VisibleForTesting

    /* renamed from: b */
    final zzxy f40621b = new zzxy(this);

    /* renamed from: c */
    protected FirebaseApp f40622c;

    /* renamed from: d */
    protected FirebaseUser f40623d;

    /* renamed from: e */
    protected Object f40624e;

    /* renamed from: f */
    protected zzao f40625f;

    /* renamed from: g */
    protected final List f40626g = new ArrayList();

    /* renamed from: h */
    protected Executor f40627h;

    /* renamed from: i */
    protected zzzy f40628i;

    /* renamed from: j */
    protected zzzr f40629j;

    /* renamed from: k */
    protected zzzd f40630k;

    /* renamed from: l */
    protected zzaaj f40631l;

    /* renamed from: m */
    protected String f40632m;

    /* renamed from: n */
    protected String f40633n;

    /* renamed from: o */
    protected AuthCredential f40634o;

    /* renamed from: p */
    protected String f40635p;

    /* renamed from: q */
    protected String f40636q;

    /* renamed from: r */
    protected zztm f40637r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f40638s;
    @VisibleForTesting

    /* renamed from: t */
    Object f40639t;
    @VisibleForTesting

    /* renamed from: u */
    Status f40640u;

    /* renamed from: v */
    protected zzya f40641v;

    public zzyb(int i) {
        this.f40620a = i;
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m58441i(zzyb zzyb) {
        zzyb.mo49945b();
        Preconditions.m4494q(zzyb.f40638s, "no success or failure set on method implementation");
    }

    /* renamed from: j */
    static /* bridge */ /* synthetic */ void m58442j(zzyb zzyb, Status status) {
        zzao zzao = zzyb.f40625f;
        if (zzao != null) {
            zzao.mo22750e0(status);
        }
    }

    /* renamed from: b */
    public abstract void mo49945b();

    /* renamed from: c */
    public final zzyb mo50066c(Object obj) {
        this.f40624e = Preconditions.m4489l(obj, "external callback cannot be null");
        return this;
    }

    /* renamed from: d */
    public final zzyb mo50067d(zzao zzao) {
        this.f40625f = (zzao) Preconditions.m4489l(zzao, "external failure callback cannot be null");
        return this;
    }

    /* renamed from: e */
    public final zzyb mo50068e(FirebaseApp firebaseApp) {
        this.f40622c = (FirebaseApp) Preconditions.m4489l(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    /* renamed from: f */
    public final zzyb mo50069f(FirebaseUser firebaseUser) {
        this.f40623d = (FirebaseUser) Preconditions.m4489l(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    /* renamed from: g */
    public final zzyb mo50070g(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks a = zzyp.m58486a(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.f40626g) {
            this.f40626g.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) Preconditions.m4488k(a));
        }
        if (activity != null) {
            zzxs.m58411l(activity, this.f40626g);
        }
        this.f40627h = (Executor) Preconditions.m4488k(executor);
        return this;
    }

    /* renamed from: k */
    public final void mo50071k(Status status) {
        this.f40638s = true;
        this.f40640u = status;
        this.f40641v.mo50065a((Object) null, status);
    }

    /* renamed from: l */
    public final void mo50072l(Object obj) {
        this.f40638s = true;
        this.f40639t = obj;
        this.f40641v.mo50065a(obj, (Status) null);
    }
}
