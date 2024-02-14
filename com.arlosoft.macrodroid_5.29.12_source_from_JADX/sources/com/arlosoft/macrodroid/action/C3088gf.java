package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.gf */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3088gf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8373a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8374c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8375d;

    public /* synthetic */ C3088gf(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8373a = sendIntentAction;
        this.f8374c = activity;
        this.f8375d = editText;
    }

    public final void onClick(View view) {
        this.f8373a.m12170y3(this.f8374c, this.f8375d, view);
    }
}
