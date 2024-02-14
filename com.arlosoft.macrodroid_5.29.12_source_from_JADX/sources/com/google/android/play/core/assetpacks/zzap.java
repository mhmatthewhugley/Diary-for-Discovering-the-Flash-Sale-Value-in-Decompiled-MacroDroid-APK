package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzap extends zzal {

    /* renamed from: d */
    final /* synthetic */ zzaw f51220d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzap(zzaw zzaw, zzi zzi) {
        super(zzaw, zzi);
        this.f51220d = zzaw;
    }

    /* renamed from: U5 */
    public final void mo59597U5(Bundle bundle, Bundle bundle2) {
        super.mo59597U5(bundle, bundle2);
        if (!this.f51220d.f51238f.compareAndSet(true, false)) {
            zzaw.f51231g.mo59809e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f51220d.mo59608c();
        }
    }

    /* renamed from: g0 */
    public final void mo59600g0(Bundle bundle) {
        this.f51220d.f51237e.mo59822s(this.f51217a);
        int i = bundle.getInt("error_code");
        zzaw.f51231g.mo59806b("onError(%d)", Integer.valueOf(i));
        this.f51217a.mo60033d(new AssetPackException(i));
    }
}
