package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfyq extends zzfyg {

    /* renamed from: G */
    private List f36595G;

    zzfyq(zzfvi zzfvi, boolean z) {
        super(zzfvi, true, true);
        List list;
        if (zzfvi.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfwb.m51179a(zzfvi.size());
        }
        for (int i = 0; i < zzfvi.size(); i++) {
            list.add((Object) null);
        }
        this.f36595G = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo46592O(int i, Object obj) {
        List list = this.f36595G;
        if (list != null) {
            list.set(i, new zzfyp(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo46593P() {
        List list = this.f36595G;
        if (list != null) {
            mo46080f(mo46603U(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo46597T(int i) {
        super.mo46597T(i);
        this.f36595G = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public abstract Object mo46603U(List list);
}
