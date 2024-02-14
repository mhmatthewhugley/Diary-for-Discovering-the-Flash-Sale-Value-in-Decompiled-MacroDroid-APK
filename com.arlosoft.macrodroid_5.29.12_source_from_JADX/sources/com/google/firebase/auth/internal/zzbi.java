package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbi {

    /* renamed from: a */
    private volatile int f4648a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzam f4649b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f4650c = false;

    public zzbi(FirebaseApp firebaseApp) {
        Context l = firebaseApp.mo61950l();
        zzam zzam = new zzam(firebaseApp);
        this.f4649b = zzam;
        BackgroundDetector.m3708c((Application) l.getApplicationContext());
        BackgroundDetector.m3707b().mo21307a(new zzbh(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m6223g() {
        return this.f4648a > 0 && !this.f4650c;
    }

    /* renamed from: c */
    public final void mo22771c() {
        this.f4649b.mo22746b();
    }

    /* renamed from: d */
    public final void mo22772d(int i) {
        if (i > 0 && this.f4648a == 0) {
            this.f4648a = i;
            if (m6223g()) {
                this.f4649b.mo22747c();
            }
        } else if (i == 0 && this.f4648a != 0) {
            this.f4649b.mo22746b();
        }
        this.f4648a = i;
    }

    /* renamed from: e */
    public final void mo22773e(zzzy zzzy) {
        if (zzzy != null) {
            long zzb = zzzy.zzb();
            if (zzb <= 0) {
                zzb = 3600;
            }
            long a = zzzy.mo50146a();
            zzam zzam = this.f4649b;
            zzam.f4598b = a + (zzb * 1000);
            zzam.f4599c = -1;
            if (m6223g()) {
                this.f4649b.mo22747c();
            }
        }
    }
}
