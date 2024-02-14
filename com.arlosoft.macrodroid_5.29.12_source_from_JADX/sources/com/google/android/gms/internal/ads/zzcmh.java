package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmh implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f28989a;

    zzcmh(JsResult jsResult) {
        this.f28989a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f28989a.cancel();
    }
}
