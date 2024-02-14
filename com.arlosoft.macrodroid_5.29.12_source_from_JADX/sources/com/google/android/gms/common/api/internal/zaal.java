package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    private final WeakReference f3274a;

    /* renamed from: b */
    private final Api f3275b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f3276c;

    public zaal(zaaw zaaw, Api api, boolean z) {
        this.f3274a = new WeakReference(zaaw);
        this.f3275b = api;
        this.f3276c = z;
    }

    /* renamed from: a */
    public final void mo21444a(@NonNull ConnectionResult connectionResult) {
        Lock z;
        zaaw zaaw = (zaaw) this.f3274a.get();
        if (zaaw != null) {
            Preconditions.m4494q(Looper.myLooper() == zaaw.f3289a.f3352E.mo21254k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaaw.f3290b.lock();
            try {
                if (!zaaw.m3981o(0)) {
                    z = zaaw.f3290b;
                } else {
                    if (!connectionResult.mo21137p2()) {
                        zaaw.m3979m(connectionResult, this.f3275b, this.f3276c);
                    }
                    if (zaaw.m3982p()) {
                        zaaw.m3980n();
                    }
                    z = zaaw.f3290b;
                }
                z.unlock();
            } catch (Throwable th) {
                zaaw.f3290b.unlock();
                throw th;
            }
        }
    }
}
