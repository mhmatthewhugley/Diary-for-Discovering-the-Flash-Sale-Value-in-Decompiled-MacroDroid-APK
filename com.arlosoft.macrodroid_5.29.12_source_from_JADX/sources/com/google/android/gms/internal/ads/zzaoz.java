package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaoz {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f25211c = new ConditionVariable();
    @VisibleForTesting

    /* renamed from: d */
    protected static volatile zzfoz f25212d = null;

    /* renamed from: e */
    private static volatile Random f25213e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzaqe f25214a;
    @VisibleForTesting

    /* renamed from: b */
    protected volatile Boolean f25215b;

    public zzaoz(zzaqe zzaqe) {
        this.f25214a = zzaqe;
        zzaqe.mo41814k().execute(new zzaoy(this));
    }

    /* renamed from: d */
    public static final int m42028d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return m42029e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m42029e() {
        if (f25213e == null) {
            synchronized (zzaoz.class) {
                if (f25213e == null) {
                    f25213e = new Random();
                }
            }
        }
        return f25213e;
    }

    /* renamed from: c */
    public final void mo41766c(int i, int i2, long j, String str, Exception exc) {
        try {
            f25211c.block();
            if (this.f25215b.booleanValue() && f25212d != null) {
                zzalw F = zzama.m41731F();
                F.mo41643n(this.f25214a.f25290a.getPackageName());
                F.mo41647x(j);
                if (str != null) {
                    F.mo41644o(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    F.mo41648y(stringWriter.toString());
                    F.mo41646v(exc.getClass().getName());
                }
                zzfoy a = f25212d.mo46064a(((zzama) F.mo47341h()).mo47050p());
                a.mo46061a(i);
                if (i2 != -1) {
                    a.mo46062b(i2);
                }
                a.mo46063c();
            }
        } catch (Exception unused) {
        }
    }
}
