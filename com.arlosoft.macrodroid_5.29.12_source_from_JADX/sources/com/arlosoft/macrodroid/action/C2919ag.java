package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.ag */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2919ag implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f7990a;

    /* renamed from: c */
    public final /* synthetic */ EditText f7991c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f7992d;

    public /* synthetic */ C2919ag(SetAlarmClockAction setAlarmClockAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f7990a = setAlarmClockAction;
        this.f7991c = editText;
        this.f7992d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f7990a.m12247D3(this.f7991c, this.f7992d, view);
    }
}
