package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.triggers.ca */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5891ca implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f13986a;

    /* renamed from: c */
    public final /* synthetic */ WebHookTrigger f13987c;

    public /* synthetic */ C5891ca(TextView textView, WebHookTrigger webHookTrigger) {
        this.f13986a = textView;
        this.f13987c = webHookTrigger;
    }

    public final void onClick(View view) {
        WebHookTrigger.m23656l4(this.f13986a, this.f13987c, view);
    }
}
