package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.kc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3197kc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction f8589a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8590c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8591d;

    public /* synthetic */ C3197kc(OptionDialogAction optionDialogAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8589a = optionDialogAction;
        this.f8590c = activity;
        this.f8591d = eVar;
    }

    public final void onClick(View view) {
        this.f8589a.m11728G3(this.f8590c, this.f8591d, view);
    }
}
