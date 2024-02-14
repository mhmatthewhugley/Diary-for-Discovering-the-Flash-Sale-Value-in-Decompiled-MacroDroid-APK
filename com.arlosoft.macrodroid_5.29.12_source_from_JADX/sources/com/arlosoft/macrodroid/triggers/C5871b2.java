package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.b2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5871b2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallMissedTrigger f13932a;

    /* renamed from: c */
    public final /* synthetic */ EditText f13933c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f13934d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f13935f;

    public /* synthetic */ C5871b2(CallMissedTrigger callMissedTrigger, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f13932a = callMissedTrigger;
        this.f13933c = editText;
        this.f13934d = checkBox;
        this.f13935f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f13932a.m21906D3(this.f13933c, this.f13934d, this.f13935f, view);
    }
}
