package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzfpo implements zzfpt {

    /* renamed from: a */
    public final /* synthetic */ Network f36240a;

    /* renamed from: b */
    public final /* synthetic */ URL f36241b;

    public final URLConnection zza() {
        return this.f36240a.openConnection(this.f36241b);
    }
}
