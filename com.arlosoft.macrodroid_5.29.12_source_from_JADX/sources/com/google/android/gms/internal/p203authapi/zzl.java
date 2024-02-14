package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzl */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzl extends zzh {

    /* renamed from: a */
    private final /* synthetic */ zzi f39153a;

    zzl(zzi zzi) {
        this.f39153a = zzi;
    }

    /* renamed from: O3 */
    public final void mo48520O3(Status status, Credential credential) {
        this.f39153a.mo21329l(new zzg(status, credential));
    }

    /* renamed from: e1 */
    public final void mo48521e1(Status status) {
        this.f39153a.mo21329l(zzg.m55713a(status));
    }
}
