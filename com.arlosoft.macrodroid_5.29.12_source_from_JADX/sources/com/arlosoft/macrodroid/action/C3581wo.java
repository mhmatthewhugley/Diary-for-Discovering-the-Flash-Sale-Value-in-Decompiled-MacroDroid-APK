package com.arlosoft.macrodroid.action;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.wo */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3581wo implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9516a;

    public /* synthetic */ C3581wo(EditText editText) {
        this.f9516a = editText;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return UIInteractionAction.m13559h4(this.f9516a, view, i, keyEvent);
    }
}
