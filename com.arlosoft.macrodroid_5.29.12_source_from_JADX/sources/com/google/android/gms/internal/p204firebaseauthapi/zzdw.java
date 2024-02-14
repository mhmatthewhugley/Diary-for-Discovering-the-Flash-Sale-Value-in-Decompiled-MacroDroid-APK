package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdw {

    /* renamed from: a */
    private static final Logger f39982a = Logger.getLogger(zzdw.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f39983b = new AtomicBoolean(false);

    private zzdw() {
    }

    /* renamed from: a */
    static Boolean m57154a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f39982a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m57155b() {
        return f39983b.get();
    }
}
