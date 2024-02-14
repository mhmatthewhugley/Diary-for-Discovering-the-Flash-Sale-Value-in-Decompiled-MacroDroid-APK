package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbo {

    /* renamed from: a */
    private static zzakg f2223a;

    /* renamed from: b */
    private static final Object f2224b = new Object();
    @Deprecated

    /* renamed from: c */
    public static final zzbj f2225c = new zzbg();

    public zzbo(Context context) {
        zzakg zzakg;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f2224b) {
            if (f2223a == null) {
                zzbjc.m43542c(context);
                if (!ClientLibraryUtils.m4857a()) {
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26830C3)).booleanValue()) {
                        zzakg = zzax.m2564b(context);
                        f2223a = zzakg;
                    }
                }
                zzakg = zzalk.m41705a(context, (zzakr) null);
                f2223a = zzakg;
            }
        }
    }

    /* renamed from: a */
    public final zzfzp mo20331a(String str) {
        zzchh zzchh = new zzchh();
        f2223a.mo41603a(new zzbn(str, (Map) null, zzchh));
        return zzchh;
    }

    /* renamed from: b */
    public final zzfzp mo20332b(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        String str2 = str;
        zzbl zzbl = new zzbl((zzbk) null);
        zzbh zzbh = new zzbh(this, str2, zzbl);
        zzcgo zzcgo = new zzcgo((String) null);
        zzbi zzbi = new zzbi(this, i, str, zzbl, zzbh, bArr, map, zzcgo);
        if (zzcgo.m45209l()) {
            try {
                zzcgo.mo43557d(str2, "GET", zzbi.mo20327n(), zzbi.mo20325E());
            } catch (zzajl e) {
                zzcgp.m45229g(e.getMessage());
            }
        }
        f2223a.mo41603a(zzbi);
        return zzbl;
    }
}
