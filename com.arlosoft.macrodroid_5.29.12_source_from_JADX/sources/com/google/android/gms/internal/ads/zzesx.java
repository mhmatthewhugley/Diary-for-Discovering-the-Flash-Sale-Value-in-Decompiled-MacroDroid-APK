package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzesx implements zzevd {

    /* renamed from: a */
    public final Bundle f34862a;

    public zzesx(Bundle bundle) {
        this.f34862a = bundle;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzfeq.m50020a(bundle, "device");
        a.putBundle("android_mem_info", this.f34862a);
        bundle.putBundle("device", a);
    }
}
