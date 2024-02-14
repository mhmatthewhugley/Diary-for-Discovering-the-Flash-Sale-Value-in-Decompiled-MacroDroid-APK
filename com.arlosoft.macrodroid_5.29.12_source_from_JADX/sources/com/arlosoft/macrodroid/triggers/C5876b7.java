package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.b7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5876b7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ScreenContentTrigger f13947a;

    /* renamed from: c */
    public final /* synthetic */ EditText f13948c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f13949d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f13950f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f13951g;

    public /* synthetic */ C5876b7(ScreenContentTrigger screenContentTrigger, EditText editText, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog) {
        this.f13947a = screenContentTrigger;
        this.f13948c = editText;
        this.f13949d = checkBox;
        this.f13950f = checkBox2;
        this.f13951g = appCompatDialog;
    }

    public final void onClick(View view) {
        ScreenContentTrigger.m23083A3(this.f13947a, this.f13948c, this.f13949d, this.f13950f, this.f13951g, view);
    }
}
