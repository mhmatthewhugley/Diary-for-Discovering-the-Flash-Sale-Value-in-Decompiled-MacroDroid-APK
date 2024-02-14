package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.ef */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3031ef implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SendIntentAction f8253a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8254c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8255d;

    public /* synthetic */ C3031ef(SendIntentAction sendIntentAction, Activity activity, EditText editText) {
        this.f8253a = sendIntentAction;
        this.f8254c = activity;
        this.f8255d = editText;
    }

    public final void onClick(View view) {
        this.f8253a.m12167v3(this.f8254c, this.f8255d, view);
    }
}
