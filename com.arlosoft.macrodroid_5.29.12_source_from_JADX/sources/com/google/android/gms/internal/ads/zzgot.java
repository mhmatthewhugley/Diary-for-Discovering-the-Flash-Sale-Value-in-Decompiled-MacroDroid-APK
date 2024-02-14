package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgot extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ zzgou f36979a;

    zzgot(zzgou zzgou) {
        this.f36979a = zzgou;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzgog.f36965f.mo47033a(this.f36979a.f36981b);
            mac.init(this.f36979a.f36982c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
