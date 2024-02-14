package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.arlosoft.macrodroid.utils.C6409o;

/* renamed from: com.arlosoft.macrodroid.utils.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6406n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C6409o f15021a;

    /* renamed from: c */
    public final /* synthetic */ EditText f15022c;

    /* renamed from: d */
    public final /* synthetic */ String f15023d;

    /* renamed from: f */
    public final /* synthetic */ C6409o.C6412c f15024f;

    /* renamed from: g */
    public final /* synthetic */ Dialog f15025g;

    /* renamed from: o */
    public final /* synthetic */ Activity f15026o;

    public /* synthetic */ C6406n(C6409o oVar, EditText editText, String str, C6409o.C6412c cVar, Dialog dialog, Activity activity) {
        this.f15021a = oVar;
        this.f15022c = editText;
        this.f15023d = str;
        this.f15024f = cVar;
        this.f15025g = dialog;
        this.f15026o = activity;
    }

    public final void onClick(View view) {
        this.f15021a.m24677p(this.f15022c, this.f15023d, this.f15024f, this.f15025g, this.f15026o, view);
    }
}
