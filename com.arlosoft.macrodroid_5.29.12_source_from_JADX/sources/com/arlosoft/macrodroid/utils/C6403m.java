package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.utils.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6403m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C6409o f15012a;

    /* renamed from: c */
    public final /* synthetic */ EditText f15013c;

    /* renamed from: d */
    public final /* synthetic */ Activity f15014d;

    /* renamed from: f */
    public final /* synthetic */ String f15015f;

    /* renamed from: g */
    public final /* synthetic */ String f15016g;

    /* renamed from: o */
    public final /* synthetic */ Dialog f15017o;

    public /* synthetic */ C6403m(C6409o oVar, EditText editText, Activity activity, String str, String str2, Dialog dialog) {
        this.f15012a = oVar;
        this.f15013c = editText;
        this.f15014d = activity;
        this.f15015f = str;
        this.f15016g = str2;
        this.f15017o = dialog;
    }

    public final void onClick(View view) {
        this.f15012a.m24674m(this.f15013c, this.f15014d, this.f15015f, this.f15016g, this.f15017o, view);
    }
}
