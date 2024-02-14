package com.google.android.gms.internal.mlkit_common;

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

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzmy implements zzmp {
    @Nullable

    /* renamed from: a */
    private Provider f43059a;

    /* renamed from: b */
    private final Provider f43060b;

    /* renamed from: c */
    private final zzmj f43061c;

    public zzmy(Context context, zzmj zzmj) {
        this.f43061c = zzmj;
        CCTDestination cCTDestination = CCTDestination.f1116g;
        TransportRuntime.m1273f(context);
        TransportFactory g = TransportRuntime.m1271c().mo19465g(cCTDestination);
        if (cCTDestination.mo19276a().contains(Encoding.m954b("json"))) {
            this.f43059a = new Lazy(new zzmv(g));
        }
        this.f43060b = new Lazy(new zzmw(g));
    }

    @VisibleForTesting
    /* renamed from: b */
    static Event m61535b(zzmj zzmj, zzmh zzmh) {
        return Event.m957e(zzmh.mo51997a(zzmj.mo51973a(), false));
    }

    /* renamed from: a */
    public final void mo52002a(zzmh zzmh) {
        if (this.f43061c.mo51973a() == 0) {
            Provider provider = this.f43059a;
            if (provider != null) {
                ((Transport) provider.get()).mo19273b(m61535b(this.f43061c, zzmh));
                return;
            }
            return;
        }
        ((Transport) this.f43060b.get()).mo19273b(m61535b(this.f43061c, zzmh));
    }
}
