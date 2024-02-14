package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.action.OptionDialogAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.action.tc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3478tc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction.C2570e f9274a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9275c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9276d;

    public /* synthetic */ C3478tc(OptionDialogAction.C2570e eVar, Activity activity, ActionBlock actionBlock) {
        this.f9274a = eVar;
        this.f9275c = activity;
        this.f9276d = actionBlock;
    }

    public final void onClick(View view) {
        this.f9274a.m11774b(this.f9275c, this.f9276d, view);
    }
}
