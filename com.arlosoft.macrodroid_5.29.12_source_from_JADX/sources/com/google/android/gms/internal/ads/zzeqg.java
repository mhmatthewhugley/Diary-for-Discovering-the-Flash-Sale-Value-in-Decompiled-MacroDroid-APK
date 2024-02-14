package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqg implements zzevd {

    /* renamed from: a */
    private final Bundle f34705a;

    /* synthetic */ zzeqg(Bundle bundle, zzeqf zzeqf) {
        this.f34705a = bundle;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f34705a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f34705a);
        }
    }
}
