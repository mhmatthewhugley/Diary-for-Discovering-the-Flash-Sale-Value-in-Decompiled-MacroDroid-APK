package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.action.OptionDialogAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.action.uc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3514uc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction.C2572f f9353a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9354c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9355d;

    public /* synthetic */ C3514uc(OptionDialogAction.C2572f fVar, Activity activity, ActionBlock actionBlock) {
        this.f9353a = fVar;
        this.f9354c = activity;
        this.f9355d = actionBlock;
    }

    public final void onClick(View view) {
        this.f9353a.m11777b(this.f9354c, this.f9355d, view);
    }
}
