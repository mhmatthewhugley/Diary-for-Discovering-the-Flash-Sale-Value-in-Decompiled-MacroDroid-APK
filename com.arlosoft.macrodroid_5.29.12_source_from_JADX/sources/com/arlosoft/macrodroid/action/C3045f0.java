package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3045f0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f8304a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8305c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8306d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8307f;

    public /* synthetic */ C3045f0(AndroidWearAction androidWearAction, AppCompatDialog appCompatDialog, EditText editText, EditText editText2) {
        this.f8304a = androidWearAction;
        this.f8305c = appCompatDialog;
        this.f8306d = editText;
        this.f8307f = editText2;
    }

    public final void onClick(View view) {
        this.f8304a.m9783h4(this.f8305c, this.f8306d, this.f8307f, view);
    }
}
