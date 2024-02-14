package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import p216ba.C11113d;

/* renamed from: com.arlosoft.macrodroid.triggers.s9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6091s9 implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ WebHookTrigger f14416a;

    /* renamed from: c */
    public final /* synthetic */ TextView f14417c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f14418d;

    /* renamed from: f */
    public final /* synthetic */ ImageView f14419f;

    /* renamed from: g */
    public final /* synthetic */ Button f14420g;

    public /* synthetic */ C6091s9(WebHookTrigger webHookTrigger, TextView textView, ImageView imageView, ImageView imageView2, Button button) {
        this.f14416a = webHookTrigger;
        this.f14417c = textView;
        this.f14418d = imageView;
        this.f14419f = imageView2;
        this.f14420g = button;
    }

    public final void accept(Object obj) {
        WebHookTrigger.m23648h4(this.f14416a, this.f14417c, this.f14418d, this.f14419f, this.f14420g, (String) obj);
    }
}
