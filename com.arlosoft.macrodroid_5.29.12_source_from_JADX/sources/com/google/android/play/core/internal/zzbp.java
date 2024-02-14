package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbp implements zzaz {
    zzbp() {
    }

    /* renamed from: c */
    static void m70869c(ClassLoader classLoader, Set set) {
        zzbk.m70859c(classLoader, set, new zzbn());
    }

    /* renamed from: d */
    static boolean m70870d(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzbf.m70851e(classLoader, file, file2, z, new zzbh(), ClientCookie.PATH_ATTR, new zzbo());
    }

    /* renamed from: a */
    public final boolean mo59830a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m70870d(classLoader, file, file2, z);
    }

    /* renamed from: b */
    public final void mo59831b(ClassLoader classLoader, Set set) {
        m70869c(classLoader, set);
    }
}
