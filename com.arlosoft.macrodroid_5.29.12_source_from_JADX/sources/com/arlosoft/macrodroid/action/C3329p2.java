package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.p2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3329p2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CloseApplicationAction f8895a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8896c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8897d;

    public /* synthetic */ C3329p2(CloseApplicationAction closeApplicationAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f8895a = closeApplicationAction;
        this.f8896c = appCompatDialog;
        this.f8897d = editText;
    }

    public final void onClick(View view) {
        this.f8895a.m10122B3(this.f8896c, this.f8897d, view);
    }
}
