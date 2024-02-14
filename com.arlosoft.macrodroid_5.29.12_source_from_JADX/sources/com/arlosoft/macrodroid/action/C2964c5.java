package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.c5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2964c5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationAction f8090a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8091c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8092d;

    public /* synthetic */ C2964c5(FileOperationAction fileOperationAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8090a = fileOperationAction;
        this.f8091c = appCompatDialog;
        this.f8092d = editText;
    }

    public final void onClick(View view) {
        this.f8090a.m10659x3(this.f8091c, this.f8092d, view);
    }
}
