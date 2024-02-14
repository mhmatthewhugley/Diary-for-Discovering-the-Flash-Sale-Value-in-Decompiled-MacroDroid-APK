package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.i2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5955i2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardChangeTrigger f14101a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f14102c;

    /* renamed from: d */
    public final /* synthetic */ Activity f14103d;

    /* renamed from: f */
    public final /* synthetic */ EditText f14104f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f14105g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f14106o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f14107p;

    public /* synthetic */ C5955i2(ClipboardChangeTrigger clipboardChangeTrigger, CheckBox checkBox, Activity activity, EditText editText, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog) {
        this.f14101a = clipboardChangeTrigger;
        this.f14102c = checkBox;
        this.f14103d = activity;
        this.f14104f = editText;
        this.f14105g = checkBox2;
        this.f14106o = checkBox3;
        this.f14107p = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14101a.m21985o3(this.f14102c, this.f14103d, this.f14104f, this.f14105g, this.f14106o, this.f14107p, view);
    }
}
