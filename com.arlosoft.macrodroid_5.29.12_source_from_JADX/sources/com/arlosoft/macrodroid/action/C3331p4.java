package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.p4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3331p4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ExportLogAction f8899a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8900c;

    /* renamed from: d */
    public final /* synthetic */ TextView f8901d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8902f;

    public /* synthetic */ C3331p4(ExportLogAction exportLogAction, EditText editText, TextView textView, AppCompatDialog appCompatDialog) {
        this.f8899a = exportLogAction;
        this.f8900c = editText;
        this.f8901d = textView;
        this.f8902f = appCompatDialog;
    }

    public final void onClick(View view) {
        ExportLogAction.m10600x3(this.f8899a, this.f8900c, this.f8901d, this.f8902f, view);
    }
}
