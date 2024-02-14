package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.ff */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3060ff implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8331a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8332c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8333d;

    public /* synthetic */ C3060ff(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8331a = sendIntentAction;
        this.f8332c = activity;
        this.f8333d = editText;
    }

    public final void onClick(View view) {
        this.f8331a.m12166u3(this.f8332c, this.f8333d, view);
    }
}
