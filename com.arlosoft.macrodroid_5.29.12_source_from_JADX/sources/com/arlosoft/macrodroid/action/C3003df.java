package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.df */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3003df implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8191a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8192c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8193d;

    public /* synthetic */ C3003df(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8191a = sendIntentAction;
        this.f8192c = activity;
        this.f8193d = editText;
    }

    public final void onClick(View view) {
        this.f8191a.m12165t3(this.f8192c, this.f8193d, view);
    }
}
