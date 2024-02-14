package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.triggers.j9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5974j9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WebHookTrigger f14134a;

    /* renamed from: c */
    public final /* synthetic */ TextView f14135c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f14136d;

    /* renamed from: f */
    public final /* synthetic */ ImageView f14137f;

    /* renamed from: g */
    public final /* synthetic */ Button f14138g;

    public /* synthetic */ C5974j9(WebHookTrigger webHookTrigger, TextView textView, ImageView imageView, ImageView imageView2, Button button) {
        this.f14134a = webHookTrigger;
        this.f14135c = textView;
        this.f14136d = imageView;
        this.f14137f = imageView2;
        this.f14138g = button;
    }

    public final void onClick(View view) {
        WebHookTrigger.m23646g4(this.f14134a, this.f14135c, this.f14136d, this.f14137f, this.f14138g, view);
    }
}
