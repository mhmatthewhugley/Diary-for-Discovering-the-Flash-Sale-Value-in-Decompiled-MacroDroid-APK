package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Result f3436a;

    /* renamed from: c */
    final /* synthetic */ zada f3437c;

    zacy(zada zada, Result result) {
        this.f3437c = zada;
        this.f3436a = result;
    }

    @WorkerThread
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            ThreadLocal threadLocal = BasePendingResult.f3157p;
            threadLocal.set(Boolean.TRUE);
            PendingResult b = ((ResultTransform) Preconditions.m4488k(this.f3437c.f3440a)).mo21283b(this.f3436a);
            zada zada = this.f3437c;
            zada.f3447s.sendMessage(zada.f3447s.obtainMessage(0, b));
            threadLocal.set(Boolean.FALSE);
            zada.m4202n(this.f3436a);
            googleApiClient = (GoogleApiClient) this.f3437c.f3446p.get();
            if (googleApiClient == null) {
                return;
            }
        } catch (RuntimeException e) {
            zada zada2 = this.f3437c;
            zada2.f3447s.sendMessage(zada2.f3447s.obtainMessage(1, e));
            BasePendingResult.f3157p.set(Boolean.FALSE);
            zada.m4202n(this.f3436a);
            googleApiClient = (GoogleApiClient) this.f3437c.f3446p.get();
            if (googleApiClient == null) {
                return;
            }
        } catch (Throwable th) {
            BasePendingResult.f3157p.set(Boolean.FALSE);
            zada.m4202n(this.f3436a);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f3437c.f3446p.get();
            if (googleApiClient2 != null) {
                googleApiClient2.mo21263t(this.f3437c);
            }
            throw th;
        }
        googleApiClient.mo21263t(this.f3437c);
    }
}
