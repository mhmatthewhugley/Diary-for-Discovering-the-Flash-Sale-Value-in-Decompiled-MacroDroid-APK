package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.mo */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3265mo implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UIInteractionAction f8725a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8726c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8727d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8728f;

    public /* synthetic */ C3265mo(UIInteractionAction uIInteractionAction, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f8725a = uIInteractionAction;
        this.f8726c = editText;
        this.f8727d = radioButton;
        this.f8728f = appCompatDialog;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13542Y4(this.f8725a, this.f8726c, this.f8727d, this.f8728f, view);
    }
}
