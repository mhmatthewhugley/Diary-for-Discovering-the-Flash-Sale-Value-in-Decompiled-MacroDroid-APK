package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfng implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting

    /* renamed from: a */
    protected final zzfoe f36152a;

    /* renamed from: c */
    private final String f36153c;

    /* renamed from: d */
    private final String f36154d;

    /* renamed from: f */
    private final LinkedBlockingQueue f36155f;

    /* renamed from: g */
    private final HandlerThread f36156g;

    /* renamed from: o */
    private final zzfmx f36157o;

    /* renamed from: p */
    private final long f36158p = System.currentTimeMillis();

    /* renamed from: s */
    private final int f36159s;

    public zzfng(Context context, int i, int i2, String str, String str2, String str3, zzfmx zzfmx) {
        this.f36153c = str;
        this.f36159s = i2;
        this.f36154d = str2;
        this.f36157o = zzfmx;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f36156g = handlerThread;
        handlerThread.start();
        zzfoe zzfoe = new zzfoe(context, handlerThread.getLooper(), this, this, 19621000);
        this.f36152a = zzfoe;
        this.f36155f = new LinkedBlockingQueue();
        zzfoe.mo21655v();
    }

    @VisibleForTesting
    /* renamed from: a */
    static zzfoq m50613a() {
        return new zzfoq((byte[]) null, 1);
    }

    /* renamed from: e */
    private final void m50614e(int i, long j, Exception exc) {
        this.f36157o.mo45982c(i, System.currentTimeMillis() - j, exc);
    }

    /* renamed from: A1 */
    public final void mo21661A1(ConnectionResult connectionResult) {
        try {
            m50614e(4012, this.f36158p, (Exception) null);
            this.f36155f.put(m50613a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final zzfoq mo46003b(int i) {
        zzfoq zzfoq;
        try {
            zzfoq = (zzfoq) this.f36155f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m50614e(2009, this.f36158p, e);
            zzfoq = null;
        }
        m50614e(3004, this.f36158p, (Exception) null);
        if (zzfoq != null) {
            if (zzfoq.f36213d == 7) {
                zzfmx.m50575g(3);
            } else {
                zzfmx.m50575g(2);
            }
        }
        return zzfoq == null ? m50613a() : zzfoq;
    }

    /* renamed from: c */
    public final void mo46004c() {
        zzfoe zzfoe = this.f36152a;
        if (zzfoe == null) {
            return;
        }
        if (zzfoe.mo21641c() || this.f36152a.mo21644f()) {
            this.f36152a.mo21640b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final zzfoj mo46005d() {
        try {
            return this.f36152a.mo46024o0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
        try {
            m50614e(4011, this.f36158p, (Exception) null);
            this.f36155f.put(m50613a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: y */
    public final void mo21660y(Bundle bundle) {
        zzfoj d = mo46005d();
        if (d != null) {
            try {
                zzfoq ia = d.mo46033ia(new zzfoo(1, this.f36159s, this.f36153c, this.f36154d));
                m50614e(5011, this.f36158p, (Exception) null);
                this.f36155f.put(ia);
            } catch (Throwable th) {
                mo46004c();
                this.f36156g.quit();
                throw th;
            }
            mo46004c();
            this.f36156g.quit();
        }
    }
}
