package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.g1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3074g1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearAppDataAction f8349a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8350c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8351d;

    public /* synthetic */ C3074g1(ClearAppDataAction clearAppDataAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8349a = clearAppDataAction;
        this.f8350c = appCompatDialog;
        this.f8351d = editText;
    }

    public final void onClick(View view) {
        this.f8349a.m9963v3(this.f8350c, this.f8351d, view);
    }
}
