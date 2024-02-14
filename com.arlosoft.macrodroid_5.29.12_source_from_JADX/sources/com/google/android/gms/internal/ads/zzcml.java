package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcml implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f28993a;

    zzcml(JsPromptResult jsPromptResult) {
        this.f28993a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f28993a.cancel();
    }
}
