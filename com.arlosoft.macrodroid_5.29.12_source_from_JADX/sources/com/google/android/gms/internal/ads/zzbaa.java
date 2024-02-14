package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbaa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f26390a = zzbar.m42996l("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzazx f26391b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f26392c;

    public zzbaa(String str) {
    }

    /* renamed from: a */
    public final long mo42301a(zzazy zzazy, zzazw zzazw, int i) {
        Looper myLooper = Looper.myLooper();
        zzbac.m42926e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzazx(this, myLooper, zzazy, zzazw, i, elapsedRealtime).mo42298c(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void mo42302f() {
        this.f26391b.mo42296a(false);
    }

    /* renamed from: g */
    public final void mo42303g(int i) throws IOException {
        IOException iOException = this.f26392c;
        if (iOException == null) {
            zzazx zzazx = this.f26391b;
            if (zzazx != null) {
                zzazx.mo42297b(zzazx.f26382d);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo42304h(Runnable runnable) {
        zzazx zzazx = this.f26391b;
        if (zzazx != null) {
            zzazx.mo42296a(true);
        }
        this.f26390a.execute(runnable);
        this.f26390a.shutdown();
    }

    /* renamed from: i */
    public final boolean mo42305i() {
        return this.f26391b != null;
    }
}
