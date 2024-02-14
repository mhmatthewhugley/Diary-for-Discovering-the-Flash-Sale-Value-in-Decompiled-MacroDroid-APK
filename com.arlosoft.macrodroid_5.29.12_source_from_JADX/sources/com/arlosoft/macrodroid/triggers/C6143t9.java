package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.triggers.t9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6143t9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f14604a;

    /* renamed from: c */
    public final /* synthetic */ WebHookTrigger f14605c;

    public /* synthetic */ C6143t9(TextView textView, WebHookTrigger webHookTrigger) {
        this.f14604a = textView;
        this.f14605c = webHookTrigger;
    }

    public final void onClick(View view) {
        WebHookTrigger.m23658m4(this.f14604a, this.f14605c, view);
    }
}
