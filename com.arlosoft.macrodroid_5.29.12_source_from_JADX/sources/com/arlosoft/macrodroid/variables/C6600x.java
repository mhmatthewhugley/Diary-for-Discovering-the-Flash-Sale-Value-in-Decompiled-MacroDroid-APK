package com.arlosoft.macrodroid.variables;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import kotlin.jvm.internal.C13684d0;

/* renamed from: com.arlosoft.macrodroid.variables.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6600x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidVariable f15313a;

    /* renamed from: c */
    public final /* synthetic */ EditText f15314c;

    /* renamed from: d */
    public final /* synthetic */ C13684d0 f15315d;

    /* renamed from: f */
    public final /* synthetic */ DictionaryKeys f15316f;

    /* renamed from: g */
    public final /* synthetic */ View.OnClickListener f15317g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f15318o;

    public /* synthetic */ C6600x(MacroDroidVariable macroDroidVariable, EditText editText, C13684d0 d0Var, DictionaryKeys dictionaryKeys, View.OnClickListener onClickListener, AppCompatDialog appCompatDialog) {
        this.f15313a = macroDroidVariable;
        this.f15314c = editText;
        this.f15315d = d0Var;
        this.f15316f = dictionaryKeys;
        this.f15317g = onClickListener;
        this.f15318o = appCompatDialog;
    }

    public final void onClick(View view) {
        C6520o0.m24940s0(this.f15313a, this.f15314c, this.f15315d, this.f15316f, this.f15317g, this.f15318o, view);
    }
}
