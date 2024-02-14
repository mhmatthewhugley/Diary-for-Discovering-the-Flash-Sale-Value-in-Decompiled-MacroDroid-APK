package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqc implements zzpr {
    @Nullable

    /* renamed from: a */
    private Provider f44451a;

    /* renamed from: b */
    private final Provider f44452b;

    /* renamed from: c */
    private final zzpl f44453c;

    public zzqc(Context context, zzpl zzpl) {
        this.f44453c = zzpl;
        CCTDestination cCTDestination = CCTDestination.f1116g;
        TransportRuntime.m1273f(context);
        TransportFactory g = TransportRuntime.m1271c().mo19465g(cCTDestination);
        if (cCTDestination.mo19276a().contains(Encoding.m954b("json"))) {
            this.f44451a = new Lazy(new zzpz(g));
        }
        this.f44452b = new Lazy(new zzqa(g));
    }

    @VisibleForTesting
    /* renamed from: b */
    static Event m62196b(zzpl zzpl, zzpj zzpj) {
        return Event.m957e(zzpj.mo52431a(zzpl.mo52407a(), false));
    }

    /* renamed from: a */
    public final void mo52436a(zzpj zzpj) {
        if (this.f44453c.mo52407a() == 0) {
            Provider provider = this.f44451a;
            if (provider != null) {
                ((Transport) provider.get()).mo19273b(m62196b(this.f44453c, zzpj));
                return;
            }
            return;
        }
        ((Transport) this.f44452b.get()).mo19273b(m62196b(this.f44453c, zzpj));
    }
}
