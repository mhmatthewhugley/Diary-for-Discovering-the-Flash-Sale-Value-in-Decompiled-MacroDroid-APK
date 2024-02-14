package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.k5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3190k5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationV21Action f8580a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8581c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8582d;

    public /* synthetic */ C3190k5(FileOperationV21Action fileOperationV21Action, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8580a = fileOperationV21Action;
        this.f8581c = appCompatDialog;
        this.f8582d = editText;
    }

    public final void onClick(View view) {
        this.f8580a.m10682J3(this.f8581c, this.f8582d, view);
    }
}
