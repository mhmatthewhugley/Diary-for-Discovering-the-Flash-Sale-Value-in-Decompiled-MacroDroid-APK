package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfyt extends zzfyg {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public zzfys f36596G;

    zzfyt(zzfvi zzfvi, boolean z, Executor executor, Callable callable) {
        super(zzfvi, z, false);
        this.f36596G = new zzfyr(this, callable, executor);
        mo46594Q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo46592O(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo46593P() {
        zzfys zzfys = this.f36596G;
        if (zzfys != null) {
            zzfys.mo46610i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo46597T(int i) {
        super.mo46597T(i);
        if (i == 1) {
            this.f36596G = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo46561t() {
        zzfys zzfys = this.f36596G;
        if (zzfys != null) {
            zzfys.mo46633g();
        }
    }
}
