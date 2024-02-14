package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

/* renamed from: com.arlosoft.macrodroid.triggers.d4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5897d4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f13993a;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f13994c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f13995d;

    public /* synthetic */ C5897d4(LinearLayout linearLayout, ViewGroup viewGroup, CheckBox checkBox) {
        this.f13993a = linearLayout;
        this.f13994c = viewGroup;
        this.f13995d = checkBox;
    }

    public final void onClick(View view) {
        IntentReceivedTrigger.m22444p3(this.f13993a, this.f13994c, this.f13995d, view);
    }
}
