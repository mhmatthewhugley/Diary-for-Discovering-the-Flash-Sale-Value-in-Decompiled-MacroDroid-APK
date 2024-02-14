package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzjx {

    /* renamed from: a */
    private final zzjw f37710a;

    /* renamed from: b */
    private final zzjv f37711b;

    /* renamed from: c */
    private final zzde f37712c;

    /* renamed from: d */
    private final zzcn f37713d;

    /* renamed from: e */
    private int f37714e;
    @Nullable

    /* renamed from: f */
    private Object f37715f;

    /* renamed from: g */
    private final Looper f37716g;

    /* renamed from: h */
    private final int f37717h;

    /* renamed from: i */
    private boolean f37718i;

    /* renamed from: j */
    private boolean f37719j;

    /* renamed from: k */
    private boolean f37720k;

    public zzjx(zzjv zzjv, zzjw zzjw, zzcn zzcn, int i, zzde zzde, Looper looper) {
        this.f37711b = zzjv;
        this.f37710a = zzjw;
        this.f37713d = zzcn;
        this.f37716g = looper;
        this.f37712c = zzde;
        this.f37717h = i;
    }

    /* renamed from: a */
    public final int mo47756a() {
        return this.f37714e;
    }

    /* renamed from: b */
    public final Looper mo47757b() {
        return this.f37716g;
    }

    /* renamed from: c */
    public final zzjw mo47758c() {
        return this.f37710a;
    }

    /* renamed from: d */
    public final zzjx mo47759d() {
        zzdd.m47212f(!this.f37718i);
        this.f37718i = true;
        this.f37711b.mo47682b(this);
        return this;
    }

    /* renamed from: e */
    public final zzjx mo47760e(@Nullable Object obj) {
        zzdd.m47212f(!this.f37718i);
        this.f37715f = obj;
        return this;
    }

    /* renamed from: f */
    public final zzjx mo47761f(int i) {
        zzdd.m47212f(!this.f37718i);
        this.f37714e = i;
        return this;
    }

    @Nullable
    /* renamed from: g */
    public final Object mo47762g() {
        return this.f37715f;
    }

    /* renamed from: h */
    public final synchronized void mo47763h(boolean z) {
        this.f37719j = z | this.f37719j;
        this.f37720k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean mo47764i(long j) throws InterruptedException, TimeoutException {
        zzdd.m47212f(this.f37718i);
        zzdd.m47212f(this.f37716g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.f37720k) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f37719j;
    }

    /* renamed from: j */
    public final synchronized boolean mo47765j() {
        return false;
    }
}
