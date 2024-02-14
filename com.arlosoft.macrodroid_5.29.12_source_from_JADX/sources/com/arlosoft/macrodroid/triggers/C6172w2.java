package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.triggers.w2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6172w2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingButtonTrigger f14669a;

    /* renamed from: c */
    public final /* synthetic */ FloatingActionButton f14670c;

    /* renamed from: d */
    public final /* synthetic */ Activity f14671d;

    public /* synthetic */ C6172w2(FloatingButtonTrigger floatingButtonTrigger, FloatingActionButton floatingActionButton, Activity activity) {
        this.f14669a = floatingButtonTrigger;
        this.f14670c = floatingActionButton;
        this.f14671d = activity;
    }

    public final void onClick(View view) {
        this.f14669a.m22198H3(this.f14670c, this.f14671d, view);
    }
}
