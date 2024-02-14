package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.up */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3527up implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9387a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9388c;

    /* renamed from: d */
    public final /* synthetic */ UIInteractionAction f9389d;

    /* renamed from: f */
    public final /* synthetic */ int f9390f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f9391g;

    public /* synthetic */ C3527up(EditText editText, EditText editText2, UIInteractionAction uIInteractionAction, int i, AppCompatDialog appCompatDialog) {
        this.f9387a = editText;
        this.f9388c = editText2;
        this.f9389d = uIInteractionAction;
        this.f9390f = i;
        this.f9391g = appCompatDialog;
    }

    public final void onClick(View view) {
        UIInteractionAction.m13546a5(this.f9387a, this.f9388c, this.f9389d, this.f9390f, this.f9391g, view);
    }
}
