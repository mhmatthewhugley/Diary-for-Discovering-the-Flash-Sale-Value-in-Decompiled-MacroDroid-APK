package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgha {

    /* renamed from: a */
    private static final zzgpc f36832a;

    /* renamed from: b */
    private static final zzgge f36833b;

    /* renamed from: c */
    private static final zzggb f36834c;

    /* renamed from: d */
    private static final zzgfo f36835d;

    /* renamed from: e */
    private static final zzgfl f36836e;

    static {
        Class<zzggh> cls = zzggh.class;
        Class<zzggi> cls2 = zzggi.class;
        zzgpc a = zzgpc.m52501a("type.googleapis.com/google.crypto.tink.AesCmacKey".getBytes(StandardCharsets.US_ASCII));
        f36832a = a;
        f36833b = zzgge.m51857c(zzggw.f36828a, zzggv.class, cls2);
        f36834c = zzggb.m51854c(zzggx.f36829a, a, cls2);
        f36835d = zzgfo.m51827c(zzggy.f36830a, zzggr.class, cls);
        f36836e = zzgfl.m51824c(zzggz.f36831a, a, cls);
    }

    /* renamed from: a */
    public static void m51889a() throws GeneralSecurityException {
        zzgfy a = zzgfy.m51849a();
        a.mo46786e(f36833b);
        a.mo46785d(f36834c);
        a.mo46784c(f36835d);
        a.mo46783b(f36836e);
    }
}
