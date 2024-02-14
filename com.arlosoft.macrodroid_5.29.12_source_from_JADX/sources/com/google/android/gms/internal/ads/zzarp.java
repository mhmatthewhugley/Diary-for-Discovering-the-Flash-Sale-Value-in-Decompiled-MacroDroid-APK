package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarp {

    /* renamed from: a */
    private final zzaqe f25377a;

    /* renamed from: b */
    private final String f25378b;

    /* renamed from: c */
    private final String f25379c;

    /* renamed from: d */
    private volatile Method f25380d = null;

    /* renamed from: e */
    private final Class[] f25381e;

    /* renamed from: f */
    private final CountDownLatch f25382f = new CountDownLatch(1);

    public zzarp(zzaqe zzaqe, String str, String str2, Class... clsArr) {
        this.f25377a = zzaqe;
        this.f25378b = str;
        this.f25379c = str2;
        this.f25381e = clsArr;
        zzaqe.mo41814k().submit(new zzaro(this));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m42185b(zzarp zzarp) {
        CountDownLatch countDownLatch;
        try {
            zzaqe zzaqe = zzarp.f25377a;
            Class loadClass = zzaqe.mo41812i().loadClass(zzarp.m42186c(zzaqe.mo41822u(), zzarp.f25378b));
            if (loadClass == null) {
                countDownLatch = zzarp.f25382f;
            } else {
                zzarp.f25380d = loadClass.getMethod(zzarp.m42186c(zzarp.f25377a.mo41822u(), zzarp.f25379c), zzarp.f25381e);
                if (zzarp.f25380d == null) {
                    countDownLatch = zzarp.f25382f;
                }
                countDownLatch = zzarp.f25382f;
            }
        } catch (zzapj | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzarp.f25382f;
        } catch (Throwable th) {
            zzarp.f25382f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m42186c(byte[] bArr, String str) throws zzapj, UnsupportedEncodingException {
        return new String(this.f25377a.mo41809e().mo41785b(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo41849a() {
        if (this.f25380d != null) {
            return this.f25380d;
        }
        try {
            if (!this.f25382f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f25380d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
