package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.mc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3253mc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OptionDialogAction f8695a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8696c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8697d;

    public /* synthetic */ C3253mc(OptionDialogAction optionDialogAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8695a = optionDialogAction;
        this.f8696c = activity;
        this.f8697d = eVar;
    }

    public final void onClick(View view) {
        this.f8695a.m11727F3(this.f8696c, this.f8697d, view);
    }
}
