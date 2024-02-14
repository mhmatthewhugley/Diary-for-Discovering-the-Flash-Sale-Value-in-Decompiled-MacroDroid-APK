package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfvu extends zzftq {

    /* renamed from: d */
    final /* synthetic */ Iterator f36486d;

    /* renamed from: f */
    final /* synthetic */ zzfsy f36487f;

    zzfvu(Iterator it, zzfsy zzfsy) {
        this.f36486d = it;
        this.f36487f = zzfsy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo46195a() {
        while (this.f36486d.hasNext()) {
            Object next = this.f36486d.next();
            if (this.f36487f.mo45704a(next)) {
                return next;
            }
        }
        mo46196b();
        return null;
    }
}
