package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmi implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f28990a;

    zzcmi(JsResult jsResult) {
        this.f28990a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f28990a.cancel();
    }
}
