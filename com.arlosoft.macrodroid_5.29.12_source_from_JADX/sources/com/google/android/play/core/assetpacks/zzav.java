package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.zzi;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzav extends zzal {

    /* renamed from: d */
    private final List f51228d;

    /* renamed from: f */
    private final zzco f51229f;

    /* renamed from: g */
    private final zzeb f51230g;

    zzav(zzaw zzaw, zzi zzi, zzco zzco, zzeb zzeb, List list) {
        super(zzaw, zzi);
        this.f51229f = zzco;
        this.f51230g = zzeb;
        this.f51228d = list;
    }

    /* renamed from: db */
    public final void mo59599db(int i, Bundle bundle) {
        super.mo59599db(i, bundle);
        this.f51217a.mo60034e(AssetPackStates.m70470e(bundle, this.f51229f, this.f51230g, this.f51228d));
    }
}
