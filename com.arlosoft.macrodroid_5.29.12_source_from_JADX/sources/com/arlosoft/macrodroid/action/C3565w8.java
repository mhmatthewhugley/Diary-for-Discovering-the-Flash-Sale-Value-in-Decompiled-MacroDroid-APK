package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.w8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3565w8 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LoopAction f9476a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9477c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f9478d;

    public /* synthetic */ C3565w8(LoopAction loopAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f9476a = loopAction;
        this.f9477c = editText;
        this.f9478d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9476a.m11334V3(this.f9477c, this.f9478d, view);
    }
}
