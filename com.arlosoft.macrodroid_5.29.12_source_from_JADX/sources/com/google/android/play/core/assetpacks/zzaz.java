package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzaz implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbb f51244a;

    /* renamed from: c */
    public final /* synthetic */ Bundle f51245c;

    /* renamed from: d */
    public final /* synthetic */ AssetPackState f51246d;

    public /* synthetic */ zzaz(zzbb zzbb, Bundle bundle, AssetPackState assetPackState) {
        this.f51244a = zzbb;
        this.f51245c = bundle;
        this.f51246d = assetPackState;
    }

    public final void run() {
        this.f51244a.mo59619g(this.f51245c, this.f51246d);
    }
}
