package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.un */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3525un implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TouchScreenAction f9381a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9382c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9383d;

    /* renamed from: f */
    public final /* synthetic */ EditText f9384f;

    public /* synthetic */ C3525un(TouchScreenAction touchScreenAction, AppCompatDialog appCompatDialog, EditText editText, EditText editText2) {
        this.f9381a = touchScreenAction;
        this.f9382c = appCompatDialog;
        this.f9383d = editText;
        this.f9384f = editText2;
    }

    public final void onClick(View view) {
        this.f9381a.m13433o3(this.f9382c, this.f9383d, this.f9384f, view);
    }
}
