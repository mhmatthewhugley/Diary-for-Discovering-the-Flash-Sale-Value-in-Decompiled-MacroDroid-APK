package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhl implements zzla {

    /* renamed from: a */
    final /* synthetic */ zzhx f47000a;

    zzhl(zzhx zzhx) {
        this.f47000a = zzhx;
    }

    /* renamed from: a */
    public final void mo55327a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f47000a.mo55374r("auto", "_err", bundle, str);
        } else {
            this.f47000a.mo55372p("auto", "_err", bundle);
        }
    }
}
