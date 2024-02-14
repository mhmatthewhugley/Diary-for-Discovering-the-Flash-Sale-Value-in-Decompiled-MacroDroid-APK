package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.co */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2983co implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UDPCommandAction f8158a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8159c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8160d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8161f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f8162g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f8163o;

    public /* synthetic */ C2983co(UDPCommandAction uDPCommandAction, EditText editText, EditText editText2, EditText editText3, Spinner spinner, AppCompatDialog appCompatDialog) {
        this.f8158a = uDPCommandAction;
        this.f8159c = editText;
        this.f8160d = editText2;
        this.f8161f = editText3;
        this.f8162g = spinner;
        this.f8163o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8158a.m13473t3(this.f8159c, this.f8160d, this.f8161f, this.f8162g, this.f8163o, view);
    }
}
