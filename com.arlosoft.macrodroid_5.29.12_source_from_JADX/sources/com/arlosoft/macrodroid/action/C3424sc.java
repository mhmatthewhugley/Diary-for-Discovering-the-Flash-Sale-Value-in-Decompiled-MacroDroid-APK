package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.action.OptionDialogAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.action.sc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3424sc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction.C2568d f9092a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9093c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9094d;

    public /* synthetic */ C3424sc(OptionDialogAction.C2568d dVar, Activity activity, ActionBlock actionBlock) {
        this.f9092a = dVar;
        this.f9093c = activity;
        this.f9094d = actionBlock;
    }

    public final void onClick(View view) {
        this.f9092a.m11771b(this.f9093c, this.f9094d, view);
    }
}
