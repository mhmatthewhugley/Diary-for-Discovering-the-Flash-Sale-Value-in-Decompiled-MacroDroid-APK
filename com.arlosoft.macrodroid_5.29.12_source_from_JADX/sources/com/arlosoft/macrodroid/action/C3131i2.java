package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.i2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3131i2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardAction f8459a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8460c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8461d;

    public /* synthetic */ C3131i2(ClipboardAction clipboardAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8459a = clipboardAction;
        this.f8460c = appCompatDialog;
        this.f8461d = editText;
    }

    public final void onClick(View view) {
        this.f8459a.m10108n3(this.f8460c, this.f8461d, view);
    }
}
