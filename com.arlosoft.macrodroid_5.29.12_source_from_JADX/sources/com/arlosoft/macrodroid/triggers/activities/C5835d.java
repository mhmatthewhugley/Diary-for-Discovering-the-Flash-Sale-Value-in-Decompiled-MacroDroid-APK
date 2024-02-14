package com.arlosoft.macrodroid.triggers.activities;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TimePicker;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5835d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DayOfWeekConfigureActivity f13840a;

    /* renamed from: c */
    public final /* synthetic */ TimePicker f13841c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f13842d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f13843f;

    public /* synthetic */ C5835d(DayOfWeekConfigureActivity dayOfWeekConfigureActivity, TimePicker timePicker, Spinner spinner, CheckBox checkBox) {
        this.f13840a = dayOfWeekConfigureActivity;
        this.f13841c = timePicker;
        this.f13842d = spinner;
        this.f13843f = checkBox;
    }

    public final void onClick(View view) {
        this.f13840a.m23829N1(this.f13841c, this.f13842d, this.f13843f, view);
    }
}
