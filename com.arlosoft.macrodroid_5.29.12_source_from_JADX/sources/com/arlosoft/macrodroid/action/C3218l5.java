package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.l5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3218l5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationV21Action f8642a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8643c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8644d;

    public /* synthetic */ C3218l5(FileOperationV21Action fileOperationV21Action, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8642a = fileOperationV21Action;
        this.f8643c = appCompatDialog;
        this.f8644d = editText;
    }

    public final void onClick(View view) {
        this.f8642a.m10676D3(this.f8643c, this.f8644d, view);
    }
}
