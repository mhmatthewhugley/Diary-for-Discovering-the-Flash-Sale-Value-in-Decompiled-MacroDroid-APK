package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakz;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzcgi;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzax extends zzaks {

    /* renamed from: d */
    private final Context f2197d;

    private zzax(Context context, zzakr zzakr) {
        super(zzakr);
        this.f2197d = context;
    }

    /* renamed from: b */
    public static zzakg m2564b(Context context) {
        zzakg zzakg = new zzakg(new zzakz(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzale((zzald) null, (SSLSocketFactory) null)), 4);
        zzakg.mo41606d();
        return zzakg;
    }

    /* renamed from: a */
    public final zzajz mo20311a(zzakd zzakd) throws zzakm {
        if (zzakd.zza() == 0) {
            if (Pattern.matches((String) zzay.m1924c().mo42663b(zzbjc.f26840D3), zzakd.mo41590m())) {
                zzaw.m1917b();
                if (zzcgi.m45182r(this.f2197d, 13400000)) {
                    zzajz a = new zzbrp(this.f2197d).mo20311a(zzakd);
                    if (a != null) {
                        zze.m2645k("Got gmscore asset response: ".concat(String.valueOf(zzakd.mo41590m())));
                        return a;
                    }
                    zze.m2645k("Failed to get gmscore asset response: ".concat(String.valueOf(zzakd.mo41590m())));
                }
            }
        }
        return super.mo20311a(zzakd);
    }
}
