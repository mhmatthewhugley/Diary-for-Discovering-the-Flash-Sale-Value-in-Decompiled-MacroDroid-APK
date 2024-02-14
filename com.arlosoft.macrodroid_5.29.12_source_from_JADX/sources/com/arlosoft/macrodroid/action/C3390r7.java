package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.r7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3390r7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ KillBackgroundAppAction f9019a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9020c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9021d;

    public /* synthetic */ C3390r7(KillBackgroundAppAction killBackgroundAppAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f9019a = killBackgroundAppAction;
        this.f9020c = appCompatDialog;
        this.f9021d = editText;
    }

    public final void onClick(View view) {
        this.f9019a.m11160u3(this.f9020c, this.f9021d, view);
    }
}
