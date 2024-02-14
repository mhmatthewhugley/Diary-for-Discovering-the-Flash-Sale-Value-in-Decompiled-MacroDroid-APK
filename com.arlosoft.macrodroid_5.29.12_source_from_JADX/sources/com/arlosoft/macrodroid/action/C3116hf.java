package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.hf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3116hf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8434a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8435c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8436d;

    public /* synthetic */ C3116hf(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8434a = sendIntentAction;
        this.f8435c = activity;
        this.f8436d = editText;
    }

    public final void onClick(View view) {
        this.f8434a.m12168w3(this.f8435c, this.f8436d, view);
    }
}
