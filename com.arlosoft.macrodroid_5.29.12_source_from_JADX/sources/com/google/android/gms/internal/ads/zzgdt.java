package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgdt {

    /* renamed from: a */
    private static final Logger f36709a = Logger.getLogger(zzgdt.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f36710b = new AtomicBoolean(false);

    private zzgdt() {
    }

    /* renamed from: a */
    static Boolean m51729a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f36709a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m51730b() {
        return f36710b.get();
    }
}
