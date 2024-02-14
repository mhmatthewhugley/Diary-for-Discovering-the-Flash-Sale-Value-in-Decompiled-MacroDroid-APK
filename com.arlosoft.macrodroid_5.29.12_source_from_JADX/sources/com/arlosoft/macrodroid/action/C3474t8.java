package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.t8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3474t8 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LogAction f9259a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9260c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9261d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f9262f;

    public /* synthetic */ C3474t8(LogAction logAction, AppCompatDialog appCompatDialog, EditText editText, CheckBox checkBox) {
        this.f9259a = logAction;
        this.f9260c = appCompatDialog;
        this.f9261d = editText;
        this.f9262f = checkBox;
    }

    public final void onClick(View view) {
        this.f9259a.m11313o3(this.f9260c, this.f9261d, this.f9262f, view);
    }
}
