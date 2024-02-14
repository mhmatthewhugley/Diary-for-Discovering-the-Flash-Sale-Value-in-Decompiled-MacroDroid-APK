package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.oo */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3321oo implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UIInteractionAction f8879a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8880c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f8881d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8882f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f8883g;

    public /* synthetic */ C3321oo(UIInteractionAction uIInteractionAction, RadioButton radioButton, CheckBox checkBox, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8879a = uIInteractionAction;
        this.f8880c = radioButton;
        this.f8881d = checkBox;
        this.f8882f = editText;
        this.f8883g = appCompatDialog;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13530S4(this.f8879a, this.f8880c, this.f8881d, this.f8882f, this.f8883g, view);
    }
}
