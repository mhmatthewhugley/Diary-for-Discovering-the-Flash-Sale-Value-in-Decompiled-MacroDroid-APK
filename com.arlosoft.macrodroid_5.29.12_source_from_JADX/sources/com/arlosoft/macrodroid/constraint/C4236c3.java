package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.constraint.c3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4236c3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchConstraint f10805a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f10806c;

    /* renamed from: d */
    public final /* synthetic */ List f10807d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f10808f;

    /* renamed from: g */
    public final /* synthetic */ NumberPicker f10809g;

    /* renamed from: o */
    public final /* synthetic */ NumberPicker f10810o;

    /* renamed from: p */
    public final /* synthetic */ NumberPicker f10811p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f10812s;

    public /* synthetic */ C4236c3(StopWatchConstraint stopWatchConstraint, Spinner spinner, List list, RadioButton radioButton, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, AppCompatDialog appCompatDialog) {
        this.f10805a = stopWatchConstraint;
        this.f10806c = spinner;
        this.f10807d = list;
        this.f10808f = radioButton;
        this.f10809g = numberPicker;
        this.f10810o = numberPicker2;
        this.f10811p = numberPicker3;
        this.f10812s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10805a.m17024k3(this.f10806c, this.f10807d, this.f10808f, this.f10809g, this.f10810o, this.f10811p, this.f10812s, view);
    }
}
