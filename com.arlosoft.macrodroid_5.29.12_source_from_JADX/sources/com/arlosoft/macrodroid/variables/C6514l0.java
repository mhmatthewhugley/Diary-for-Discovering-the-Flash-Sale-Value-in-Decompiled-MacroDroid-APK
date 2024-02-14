package com.arlosoft.macrodroid.variables;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.MacroDroidVariable;

/* renamed from: com.arlosoft.macrodroid.variables.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6514l0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f15147a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f15148c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f15149d;

    /* renamed from: f */
    public final /* synthetic */ Context f15150f;

    /* renamed from: g */
    public final /* synthetic */ View.OnClickListener f15151g;

    public /* synthetic */ C6514l0(EditText editText, MacroDroidVariable macroDroidVariable, AppCompatDialog appCompatDialog, Context context, View.OnClickListener onClickListener) {
        this.f15147a = editText;
        this.f15148c = macroDroidVariable;
        this.f15149d = appCompatDialog;
        this.f15150f = context;
        this.f15151g = onClickListener;
    }

    public final void onClick(View view) {
        C6520o0.m24936q0(this.f15147a, this.f15148c, this.f15149d, this.f15150f, this.f15151g, view);
    }
}
