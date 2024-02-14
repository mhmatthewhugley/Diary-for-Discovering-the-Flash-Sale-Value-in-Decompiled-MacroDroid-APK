package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f28994a;

    /* renamed from: c */
    final /* synthetic */ EditText f28995c;

    zzcmm(JsPromptResult jsPromptResult, EditText editText) {
        this.f28994a = jsPromptResult;
        this.f28995c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f28994a.confirm(this.f28995c.getText().toString());
    }
}
