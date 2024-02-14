package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzqm extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ zzqn f40339a;

    zzqm(zzqn zzqn) {
        this.f40339a = zzqn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzpz.f40325f.mo49715a(this.f40339a.f40341b);
            mac.init(this.f40339a.f40342c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
