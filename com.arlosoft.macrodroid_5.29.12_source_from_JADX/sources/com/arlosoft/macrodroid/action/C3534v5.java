package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.action.v5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3534v5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingButtonConfigureAction f9402a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9403c;

    /* renamed from: d */
    public final /* synthetic */ FloatingActionButton f9404d;

    public /* synthetic */ C3534v5(FloatingButtonConfigureAction floatingButtonConfigureAction, Activity activity, FloatingActionButton floatingActionButton) {
        this.f9402a = floatingButtonConfigureAction;
        this.f9403c = activity;
        this.f9404d = floatingActionButton;
    }

    public final void onClick(View view) {
        FloatingButtonConfigureAction.m10755y3(this.f9402a, this.f9403c, this.f9404d, view);
    }
}
