package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzery implements zzevd {

    /* renamed from: a */
    private final String f34813a;

    /* renamed from: b */
    private final String f34814b;

    /* renamed from: c */
    private final Bundle f34815c;

    /* synthetic */ zzery(String str, String str2, Bundle bundle, zzerx zzerx) {
        this.f34813a = str;
        this.f34814b = str2;
        this.f34815c = bundle;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f34813a);
        bundle.putString("fc_consent", this.f34814b);
        bundle.putBundle("iab_consent_info", this.f34815c);
    }
}
