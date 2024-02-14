package com.arlosoft.macrodroid.action;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.action.uh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3519uh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetScreenTimeoutAction f9365a;

    /* renamed from: c */
    public final /* synthetic */ NumberPicker f9366c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f9367d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9368f;

    public /* synthetic */ C3519uh(SetScreenTimeoutAction setScreenTimeoutAction, NumberPicker numberPicker, NumberPicker numberPicker2, AppCompatDialog appCompatDialog) {
        this.f9365a = setScreenTimeoutAction;
        this.f9366c = numberPicker;
        this.f9367d = numberPicker2;
        this.f9368f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9365a.m12627m3(this.f9366c, this.f9367d, this.f9368f, view);
    }
}
