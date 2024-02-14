package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.zzah;

final class zzl extends ILocationSourceDelegate.zza {

    /* renamed from: a */
    private final /* synthetic */ LocationSource f46377a;

    /* renamed from: A8 */
    public final void mo54578A8(zzah zzah) {
        this.f46377a.mo54512a(new zzm(this, zzah));
    }

    public final void deactivate() {
        this.f46377a.deactivate();
    }
}
