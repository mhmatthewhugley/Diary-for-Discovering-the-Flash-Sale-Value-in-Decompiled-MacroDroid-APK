package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.triggers.q7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6056q7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopwatchTrigger f14320a;

    /* renamed from: c */
    public final /* synthetic */ String f14321c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f14322d;

    /* renamed from: f */
    public final /* synthetic */ NumberPicker f14323f;

    /* renamed from: g */
    public final /* synthetic */ NumberPicker f14324g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f14325o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f14326p;

    public /* synthetic */ C6056q7(StopwatchTrigger stopwatchTrigger, String str, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14320a = stopwatchTrigger;
        this.f14321c = str;
        this.f14322d = numberPicker;
        this.f14323f = numberPicker2;
        this.f14324g = numberPicker3;
        this.f14325o = checkBox;
        this.f14326p = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14320a.m23223B3(this.f14321c, this.f14322d, this.f14323f, this.f14324g, this.f14325o, this.f14326p, view);
    }
}
