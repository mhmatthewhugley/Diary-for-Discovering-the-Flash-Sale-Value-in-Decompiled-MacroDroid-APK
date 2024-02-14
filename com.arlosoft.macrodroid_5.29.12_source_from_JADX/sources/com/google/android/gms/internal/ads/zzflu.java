package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzflu implements Runnable {

    /* renamed from: a */
    private final WebView f36076a;

    /* renamed from: c */
    final /* synthetic */ zzflv f36077c;

    zzflu(zzflv zzflv) {
        this.f36077c = zzflv;
        this.f36076a = zzflv.f36078d;
    }

    public final void run() {
        this.f36076a.destroy();
    }
}
