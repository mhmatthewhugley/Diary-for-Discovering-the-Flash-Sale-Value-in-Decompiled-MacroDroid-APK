package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.no */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3293no implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UIInteractionAction f8807a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8808c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f8809d;

    public /* synthetic */ C3293no(UIInteractionAction uIInteractionAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8807a = uIInteractionAction;
        this.f8808c = editText;
        this.f8809d = appCompatDialog;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13585v4(this.f8807a, this.f8808c, this.f8809d, view);
    }
}
