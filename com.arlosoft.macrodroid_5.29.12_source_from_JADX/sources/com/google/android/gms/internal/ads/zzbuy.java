package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbuy extends zzcgu {

    /* renamed from: b */
    private final zzbux f27818b;

    public zzbuy(zzbux zzbux, @Nullable String str) {
        super(str);
        this.f27818b = zzbux;
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo20399o(String str) {
        zzcgp.m45224b("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzcgp.m45224b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.mo20399o(str);
    }
}
