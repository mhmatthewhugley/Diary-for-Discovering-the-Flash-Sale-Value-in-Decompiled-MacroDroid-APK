package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.constraint.o3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4300o3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSinceBootConstraint f10928a;

    /* renamed from: c */
    public final /* synthetic */ NumberPicker f10929c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f10930d;

    /* renamed from: f */
    public final /* synthetic */ NumberPicker f10931f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f10932g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f10933o;

    public /* synthetic */ C4300o3(TimeSinceBootConstraint timeSinceBootConstraint, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f10928a = timeSinceBootConstraint;
        this.f10929c = numberPicker;
        this.f10930d = numberPicker2;
        this.f10931f = numberPicker3;
        this.f10932g = radioButton;
        this.f10933o = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10928a.m17117k3(this.f10929c, this.f10930d, this.f10931f, this.f10932g, this.f10933o, view);
    }
}
