package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzetb implements zzevd {

    /* renamed from: a */
    public final zzfdj f34867a;

    public zzetb(zzfdj zzfdj) {
        this.f34867a = zzfdj;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfdj zzfdj = this.f34867a;
        if (zzfdj != null) {
            bundle.putBoolean("render_in_browser", zzfdj.mo45599d());
            bundle.putBoolean("disable_ml", this.f34867a.mo45598c());
        }
    }
}
