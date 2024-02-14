package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.if */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3144if implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8494a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8495c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8496d;

    public /* synthetic */ C3144if(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8494a = sendIntentAction;
        this.f8495c = activity;
        this.f8496d = editText;
    }

    public final void onClick(View view) {
        this.f8494a.m12169x3(this.f8495c, this.f8496d, view);
    }
}
