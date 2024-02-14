package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaaj implements zabf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zabi f3271a;

    /* renamed from: b */
    private boolean f3272b = false;

    public zaaj(zabi zabi) {
        this.f3271a = zabi;
    }

    /* renamed from: a */
    public final void mo21434a(@Nullable Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo21435b() {
    }

    /* renamed from: c */
    public final void mo21436c() {
        if (this.f3272b) {
            this.f3272b = false;
            this.f3271a.mo21462q(new zaai(this, this));
        }
    }

    /* renamed from: d */
    public final void mo21437d(ConnectionResult connectionResult, Api api, boolean z) {
    }

    /* renamed from: e */
    public final void mo21438e(int i) {
        this.f3271a.mo21461p((ConnectionResult) null);
        this.f3271a.f3353F.mo21453b(i, this.f3272b);
    }

    /* renamed from: f */
    public final BaseImplementation.ApiMethodImpl mo21439f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        mo21441h(apiMethodImpl);
        return apiMethodImpl;
    }

    /* renamed from: g */
    public final boolean mo21440g() {
        if (this.f3272b) {
            return false;
        }
        Set<zada> set = this.f3271a.f3352E.f3343w;
        if (set == null || set.isEmpty()) {
            this.f3271a.mo21461p((ConnectionResult) null);
            return true;
        }
        this.f3272b = true;
        for (zada h : set) {
            h.mo21515h();
        }
        return false;
    }

    /* renamed from: h */
    public final BaseImplementation.ApiMethodImpl mo21441h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.f3271a.f3352E.f3344x.mo21517a(apiMethodImpl);
            zabe zabe = this.f3271a.f3352E;
            Api.Client client = (Api.Client) zabe.f3335o.get(apiMethodImpl.mo21323v());
            Preconditions.m4489l(client, "Appropriate Api was not requested.");
            if (client.mo21196c() || !this.f3271a.f3360p.containsKey(apiMethodImpl.mo21323v())) {
                apiMethodImpl.mo21325x(client);
            } else {
                apiMethodImpl.mo21321b(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f3271a.mo21462q(new zaah(this, this));
        }
        return apiMethodImpl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo21442j() {
        if (this.f3272b) {
            this.f3272b = false;
            this.f3271a.f3352E.f3344x.mo21518b();
            mo21440g();
        }
    }
}
