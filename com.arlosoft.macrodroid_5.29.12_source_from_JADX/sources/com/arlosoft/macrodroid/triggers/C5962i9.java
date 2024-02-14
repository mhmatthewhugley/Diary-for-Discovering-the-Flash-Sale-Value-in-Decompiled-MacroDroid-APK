package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.i9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5962i9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f14115a;

    /* renamed from: c */
    public final /* synthetic */ TextView f14116c;

    /* renamed from: d */
    public final /* synthetic */ WebHookTrigger f14117d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14118f;

    public /* synthetic */ C5962i9(EditText editText, TextView textView, WebHookTrigger webHookTrigger, AppCompatDialog appCompatDialog) {
        this.f14115a = editText;
        this.f14116c = textView;
        this.f14117d = webHookTrigger;
        this.f14118f = appCompatDialog;
    }

    public final void onClick(View view) {
        WebHookTrigger.m23660n4(this.f14115a, this.f14116c, this.f14117d, this.f14118f, view);
    }
}
