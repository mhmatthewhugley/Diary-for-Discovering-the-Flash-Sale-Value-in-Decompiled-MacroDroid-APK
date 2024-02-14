package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.a1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2804a1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CancelActiveMacroAction f7714a;

    /* renamed from: c */
    public final /* synthetic */ EditText f7715c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f7716d;

    public /* synthetic */ C2804a1(CancelActiveMacroAction cancelActiveMacroAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f7714a = cancelActiveMacroAction;
        this.f7715c = editText;
        this.f7716d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f7714a.m9914s3(this.f7715c, this.f7716d, view);
    }
}
