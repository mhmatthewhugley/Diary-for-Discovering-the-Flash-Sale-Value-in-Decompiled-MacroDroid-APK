package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdfo implements Runnable {

    /* renamed from: a */
    private final WeakReference f32215a;

    /* synthetic */ zzdfo(zzdfp zzdfp, zzdfn zzdfn) {
        this.f32215a = new WeakReference(zzdfp);
    }

    public final void run() {
        zzdfp zzdfp = (zzdfp) this.f32215a.get();
        if (zzdfp != null) {
            zzdfp.mo44631L0(zzdfm.f32214a);
        }
    }
}
