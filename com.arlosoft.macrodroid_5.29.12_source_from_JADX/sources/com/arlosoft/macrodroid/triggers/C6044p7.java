package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.p7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6044p7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopwatchTrigger f14288a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14289c;

    /* renamed from: d */
    public final /* synthetic */ List f14290d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14291f;

    public /* synthetic */ C6044p7(StopwatchTrigger stopwatchTrigger, EditText editText, List list, AppCompatDialog appCompatDialog) {
        this.f14288a = stopwatchTrigger;
        this.f14289c = editText;
        this.f14290d = list;
        this.f14291f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14288a.m23241w3(this.f14289c, this.f14290d, this.f14291f, view);
    }
}
