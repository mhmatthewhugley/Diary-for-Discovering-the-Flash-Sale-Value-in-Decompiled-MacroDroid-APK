package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.b5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5874b5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListView f13943a;

    /* renamed from: c */
    public final /* synthetic */ MediaButtonV2Trigger f13944c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f13945d;

    public /* synthetic */ C5874b5(ListView listView, MediaButtonV2Trigger mediaButtonV2Trigger, AppCompatDialog appCompatDialog) {
        this.f13943a = listView;
        this.f13944c = mediaButtonV2Trigger;
        this.f13945d = appCompatDialog;
    }

    public final void onClick(View view) {
        MediaButtonV2Trigger.m22698k3(this.f13943a, this.f13944c, this.f13945d, view);
    }
}
