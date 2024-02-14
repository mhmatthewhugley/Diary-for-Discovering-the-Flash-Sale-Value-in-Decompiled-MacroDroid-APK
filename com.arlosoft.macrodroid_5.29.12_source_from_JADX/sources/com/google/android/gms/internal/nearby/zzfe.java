package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzfe implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ GoogleApi f44618a;

    /* renamed from: b */
    final /* synthetic */ ListenerHolder.ListenerKey f44619b;

    /* renamed from: c */
    final /* synthetic */ boolean f44620c;

    /* renamed from: d */
    final /* synthetic */ zzfg f44621d;

    zzfe(zzfg zzfg, GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, boolean z) {
        this.f44621d = zzfg;
        this.f44618a = googleApi;
        this.f44619b = listenerKey;
        this.f44620c = z;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        synchronized (this.f44621d) {
            if (exc instanceof ApiException) {
                int b = ((ApiException) exc).mo21210b();
                if (b == 8001 || b == 8002) {
                    if (this.f44620c) {
                        this.f44621d.f44626b.remove(this.f44619b);
                    }
                }
            }
            this.f44621d.mo52693g(this.f44618a, this.f44619b);
        }
    }
}
