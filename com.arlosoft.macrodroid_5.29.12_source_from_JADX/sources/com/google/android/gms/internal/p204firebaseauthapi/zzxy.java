package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.internal.zzao;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzxy implements zzwz {

    /* renamed from: a */
    final /* synthetic */ zzyb f40617a;

    zzxy(zzyb zzyb) {
        this.f40617a = zzyb;
    }

    /* renamed from: m */
    private final void m58417m(zzxz zzxz) {
        this.f40617a.f40627h.execute(new zzxx(this, zzxz));
    }

    /* renamed from: n */
    private final void m58418n(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        zzyb.m58442j(this.f40617a, status);
        zzyb zzyb = this.f40617a;
        zzyb.f40634o = authCredential;
        zzyb.f40635p = str;
        zzyb.f40636q = str2;
        zzao zzao = zzyb.f40625f;
        if (zzao != null) {
            zzao.mo22750e0(status);
        }
        this.f40617a.mo50071k(status);
    }

    /* renamed from: a */
    public final void mo49970a(@Nullable zzaaj zzaaj) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 4;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40631l = zzaaj;
        zzyb.m58441i(zzyb);
    }

    /* renamed from: b */
    public final void mo49971b(zzzy zzzy, zzzr zzzr) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 2;
        Preconditions.m4494q(z, "Unexpected response type: " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40628i = zzzy;
        zzyb.f40629j = zzzr;
        zzyb.m58441i(zzyb);
    }

    /* renamed from: c */
    public final void mo49972c(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 2;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        m58418n(status, phoneAuthCredential, (String) null, (String) null);
    }

    /* renamed from: d */
    public final void mo49973d() throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 5;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb.m58441i(this.f40617a);
    }

    /* renamed from: e */
    public final void mo49974e(zzzd zzzd) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 3;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40630k = zzzd;
        zzyb.m58441i(zzyb);
    }

    /* renamed from: f */
    public final void mo49975f(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 8;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        this.f40617a.f40638s = true;
        m58417m(new zzxu(this, phoneAuthCredential));
    }

    /* renamed from: g */
    public final void mo49976g(Status status) throws RemoteException {
        String o2 = status.mo21295o2();
        if (o2 != null) {
            if (o2.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (o2.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (o2.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (o2.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (o2.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (o2.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (o2.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (o2.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (o2.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (o2.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzyb zzyb = this.f40617a;
        if (zzyb.f40620a == 8) {
            zzyb.f40638s = true;
            m58417m(new zzxw(this, status));
            return;
        }
        zzyb.m58442j(zzyb, status);
        this.f40617a.mo50071k(status);
    }

    /* renamed from: h */
    public final void mo49977h(zzzy zzzy) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        Preconditions.m4494q(z, "Unexpected response type: " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40628i = zzzy;
        zzyb.m58441i(zzyb);
    }

    /* renamed from: i */
    public final void mo49978i() throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 6;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb.m58441i(this.f40617a);
    }

    /* renamed from: j */
    public final void mo49979j(zztm zztm) {
        zzyb zzyb = this.f40617a;
        zzyb.f40637r = zztm;
        zzyb.mo50071k(zzai.m6170a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    /* renamed from: k */
    public final void mo49980k() throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 9;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb.m58441i(this.f40617a);
    }

    /* renamed from: l */
    public final void mo49981l(zztk zztk) {
        m58418n(zztk.mo49897l2(), zztk.mo49898m2(), zztk.mo49899n2(), zztk.mo49900o2());
    }

    /* renamed from: m0 */
    public final void mo49982m0(String str) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 7;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40632m = str;
        zzyb.m58441i(zzyb);
    }

    /* renamed from: o */
    public final void mo49983o(String str) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 8;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        zzyb zzyb = this.f40617a;
        zzyb.f40633n = str;
        zzyb.f40638s = true;
        m58417m(new zzxv(this, str));
    }

    /* renamed from: t */
    public final void mo49984t(String str) throws RemoteException {
        int i = this.f40617a.f40620a;
        boolean z = i == 8;
        Preconditions.m4494q(z, "Unexpected response type " + i);
        this.f40617a.f40633n = str;
        m58417m(new zzxt(this, str));
    }
}
