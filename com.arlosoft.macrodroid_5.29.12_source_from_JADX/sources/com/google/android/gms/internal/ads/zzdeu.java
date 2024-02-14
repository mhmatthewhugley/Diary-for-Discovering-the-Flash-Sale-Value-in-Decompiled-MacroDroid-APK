package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdeu extends zzdij implements zzbop {

    /* renamed from: c */
    private final Bundle f32195c = new Bundle();

    public zzdeu(Set set) {
        super(set);
    }

    /* renamed from: M0 */
    public final synchronized Bundle mo44601M0() {
        return new Bundle(this.f32195c);
    }

    /* renamed from: h1 */
    public final synchronized void mo42868h1(String str, Bundle bundle) {
        this.f32195c.putAll(bundle);
        mo44631L0(zzdet.f32194a);
    }
}
