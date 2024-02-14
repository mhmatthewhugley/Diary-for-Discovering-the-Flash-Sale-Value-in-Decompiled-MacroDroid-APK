package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnFailureListener;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzf implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ zzf f51599a = new zzf();

    private /* synthetic */ zzf() {
    }

    /* renamed from: c */
    public final void mo32241c(Exception exc) {
        zzl.f51608l.mo59809e(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
