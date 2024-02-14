package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.jc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3169jc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction f8529a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8530c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8531d;

    public /* synthetic */ C3169jc(OptionDialogAction optionDialogAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8529a = optionDialogAction;
        this.f8530c = activity;
        this.f8531d = eVar;
    }

    public final void onClick(View view) {
        this.f8529a.m11737P3(this.f8530c, this.f8531d, view);
    }
}
