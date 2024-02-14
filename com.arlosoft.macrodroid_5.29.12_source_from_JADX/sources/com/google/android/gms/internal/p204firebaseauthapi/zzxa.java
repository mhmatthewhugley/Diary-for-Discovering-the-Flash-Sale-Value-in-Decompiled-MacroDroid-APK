package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzxa {

    /* renamed from: a */
    private final zzwz f40577a;

    /* renamed from: b */
    private final Logger f40578b;

    public zzxa(zzwz zzwz, Logger logger) {
        this.f40577a = (zzwz) Preconditions.m4488k(zzwz);
        this.f40578b = (Logger) Preconditions.m4488k(logger);
    }

    /* renamed from: a */
    public final void mo49985a(String str) {
        try {
            this.f40577a.mo49983o(str);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo49986b(String str) {
        try {
            this.f40577a.mo49984t(str);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo49987c(zzzd zzzd) {
        try {
            this.f40577a.mo49974e(zzzd);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    /* renamed from: d */
    public final void mo49988d() {
        try {
            this.f40577a.mo49973d();
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    /* renamed from: e */
    public final void mo49989e(zztk zztk) {
        try {
            this.f40577a.mo49981l(zztk);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo49990f(zztm zztm) {
        try {
            this.f40577a.mo49979j(zztm);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo49991g(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f40577a.mo49972c(status, phoneAuthCredential);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: h */
    public void mo49992h(Status status) {
        try {
            this.f40577a.mo49976g(status);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo49993i(zzzy zzzy, zzzr zzzr) {
        try {
            this.f40577a.mo49971b(zzzy, zzzr);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    /* renamed from: j */
    public final void mo49994j(@Nullable zzaaj zzaaj) {
        try {
            this.f40577a.mo49970a(zzaaj);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    /* renamed from: k */
    public final void mo49995k() {
        try {
            this.f40577a.mo49978i();
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    /* renamed from: l */
    public final void mo49996l(String str) {
        try {
            this.f40577a.mo49982m0(str);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    /* renamed from: m */
    public final void mo49997m() {
        try {
            this.f40577a.mo49980k();
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    /* renamed from: n */
    public final void mo49998n(zzzy zzzy) {
        try {
            this.f40577a.mo49977h(zzzy);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    /* renamed from: o */
    public final void mo49999o(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f40577a.mo49975f(phoneAuthCredential);
        } catch (RemoteException e) {
            this.f40578b.mo21838b("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public zzxa(zzxa zzxa) {
        this(zzxa.f40577a, zzxa.f40578b);
    }
}
