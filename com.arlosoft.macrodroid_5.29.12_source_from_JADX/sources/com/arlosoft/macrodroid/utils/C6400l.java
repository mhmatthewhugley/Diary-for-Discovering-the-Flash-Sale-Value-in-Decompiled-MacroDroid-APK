package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.utils.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6400l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C6409o f15006a;

    /* renamed from: c */
    public final /* synthetic */ EditText f15007c;

    /* renamed from: d */
    public final /* synthetic */ Activity f15008d;

    /* renamed from: f */
    public final /* synthetic */ Dialog f15009f;

    /* renamed from: g */
    public final /* synthetic */ String f15010g;

    public /* synthetic */ C6400l(C6409o oVar, EditText editText, Activity activity, Dialog dialog, String str) {
        this.f15006a = oVar;
        this.f15007c = editText;
        this.f15008d = activity;
        this.f15009f = dialog;
        this.f15010g = str;
    }

    public final void onClick(View view) {
        this.f15006a.m24679r(this.f15007c, this.f15008d, this.f15009f, this.f15010g, view);
    }
}
