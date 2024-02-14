package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.action.m7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3248m7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ KeepAwakeAction f8683a;

    /* renamed from: c */
    public final /* synthetic */ NumberPicker f8684c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f8685d;

    /* renamed from: f */
    public final /* synthetic */ NumberPicker f8686f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f8687g;

    /* renamed from: o */
    public final /* synthetic */ Spinner f8688o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f8689p;

    public /* synthetic */ C3248m7(KeepAwakeAction keepAwakeAction, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog) {
        this.f8683a = keepAwakeAction;
        this.f8684c = numberPicker;
        this.f8685d = numberPicker2;
        this.f8686f = numberPicker3;
        this.f8687g = spinner;
        this.f8688o = spinner2;
        this.f8689p = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8683a.m11135s3(this.f8684c, this.f8685d, this.f8686f, this.f8687g, this.f8688o, this.f8689p, view);
    }
}
