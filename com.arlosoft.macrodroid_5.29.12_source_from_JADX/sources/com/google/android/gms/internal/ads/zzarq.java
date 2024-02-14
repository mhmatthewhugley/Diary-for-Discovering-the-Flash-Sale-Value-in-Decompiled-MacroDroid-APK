package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzarq implements Callable {

    /* renamed from: a */
    protected final String f25383a = getClass().getSimpleName();

    /* renamed from: c */
    protected final zzaqe f25384c;

    /* renamed from: d */
    protected final String f25385d;

    /* renamed from: f */
    protected final String f25386f;

    /* renamed from: g */
    protected final zzamk f25387g;

    /* renamed from: o */
    protected Method f25388o;

    /* renamed from: p */
    protected final int f25389p;

    /* renamed from: s */
    protected final int f25390s;

    public zzarq(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        this.f25384c = zzaqe;
        this.f25385d = str;
        this.f25386f = str2;
        this.f25387g = zzamk;
        this.f25389p = i;
        this.f25390s = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41843a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void mo41845b() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.f25384c.mo41813j(this.f25385d, this.f25386f);
            this.f25388o = j;
            if (j == null) {
                return null;
            }
            mo41843a();
            zzaoz d = this.f25384c.mo41808d();
            if (!(d == null || (i = this.f25389p) == Integer.MIN_VALUE)) {
                d.mo41766c(this.f25390s, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo41845b();
        return null;
    }
}
