package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.f4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5921f4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IntentReceivedTrigger f14035a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14036c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14037d;

    /* renamed from: f */
    public final /* synthetic */ LinearLayout f14038f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f14039g;

    public /* synthetic */ C5921f4(IntentReceivedTrigger intentReceivedTrigger, EditText editText, CheckBox checkBox, LinearLayout linearLayout, AppCompatDialog appCompatDialog) {
        this.f14035a = intentReceivedTrigger;
        this.f14036c = editText;
        this.f14037d = checkBox;
        this.f14038f = linearLayout;
        this.f14039g = appCompatDialog;
    }

    public final void onClick(View view) {
        IntentReceivedTrigger.m22449z3(this.f14035a, this.f14036c, this.f14037d, this.f14038f, this.f14039g, view);
    }
}
