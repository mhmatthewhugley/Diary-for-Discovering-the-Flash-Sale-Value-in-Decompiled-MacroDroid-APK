package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmk implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f28992a;

    zzcmk(JsPromptResult jsPromptResult) {
        this.f28992a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f28992a.cancel();
    }
}
