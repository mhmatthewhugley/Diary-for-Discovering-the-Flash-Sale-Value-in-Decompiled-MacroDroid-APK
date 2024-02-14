package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzko implements zzla {

    /* renamed from: a */
    final /* synthetic */ zzkt f47240a;

    zzko(zzkt zzkt) {
        this.f47240a = zzkt;
    }

    /* renamed from: a */
    public final void mo55327a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            zzkt zzkt = this.f47240a;
            if (zzkt.f47265l != null) {
                zzkt.f47265l.mo55221z().mo55098p().mo55092b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f47240a.mo55185B().mo55181x(new zzkn(this, str, "_err", bundle));
    }
}
