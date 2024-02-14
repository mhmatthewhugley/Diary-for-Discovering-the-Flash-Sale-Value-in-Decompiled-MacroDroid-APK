package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.h4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5945h4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IntentReceivedTrigger f14081a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14082c;

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f14083d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f14084f;

    public /* synthetic */ C5945h4(IntentReceivedTrigger intentReceivedTrigger, AppCompatDialog appCompatDialog, LinearLayout linearLayout, CheckBox checkBox) {
        this.f14081a = intentReceivedTrigger;
        this.f14082c = appCompatDialog;
        this.f14083d = linearLayout;
        this.f14084f = checkBox;
    }

    public final void onClick(View view) {
        IntentReceivedTrigger.m22448y3(this.f14081a, this.f14082c, this.f14083d, this.f14084f, view);
    }
}
