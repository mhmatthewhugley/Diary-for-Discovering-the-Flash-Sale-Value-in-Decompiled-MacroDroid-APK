package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzr extends GmsClientSupervisor {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashMap f3778f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f3779g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f3780h;

    /* renamed from: i */
    private final zzq f3781i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ConnectionTracker f3782j;

    /* renamed from: k */
    private final long f3783k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f3784l;

    zzr(Context context, Looper looper) {
        zzq zzq = new zzq(this, (zzp) null);
        this.f3781i = zzq;
        this.f3779g = context.getApplicationContext();
        this.f3780h = new zzi(looper, zzq);
        this.f3782j = ConnectionTracker.m4827b();
        this.f3783k = 5000;
        this.f3784l = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo21698f(zzn zzn, ServiceConnection serviceConnection, String str) {
        Preconditions.m4489l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3778f) {
            zzo zzo = (zzo) this.f3778f.get(zzn);
            if (zzo == null) {
                String obj = zzn.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (zzo.mo21825h(serviceConnection)) {
                zzo.mo21823f(serviceConnection, str);
                if (zzo.mo21826i()) {
                    this.f3780h.sendMessageDelayed(this.f3780h.obtainMessage(0, zzn), this.f3783k);
                }
            } else {
                String obj2 = zzn.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo21700h(zzn zzn, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean j;
        Preconditions.m4489l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3778f) {
            zzo zzo = (zzo) this.f3778f.get(zzn);
            if (zzo == null) {
                zzo = new zzo(this, zzn);
                zzo.mo21821d(serviceConnection, serviceConnection, str);
                zzo.mo21822e(str, executor);
                this.f3778f.put(zzn, zzo);
            } else {
                this.f3780h.removeMessages(0, zzn);
                if (!zzo.mo21825h(serviceConnection)) {
                    zzo.mo21821d(serviceConnection, serviceConnection, str);
                    int a = zzo.mo21818a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(zzo.mo21819b(), zzo.mo21820c());
                    } else if (a == 2) {
                        zzo.mo21822e(str, executor);
                    }
                } else {
                    String obj = zzn.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = zzo.mo21827j();
        }
        return j;
    }
}
