package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzesh implements zzevd {

    /* renamed from: a */
    public final String f34833a;

    /* renamed from: b */
    public final boolean f34834b;

    public zzesh(String str, boolean z) {
        this.f34833a = str;
        this.f34834b = z;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f34833a);
        if (this.f34834b) {
            bundle.putString("de", "1");
        }
    }
}
