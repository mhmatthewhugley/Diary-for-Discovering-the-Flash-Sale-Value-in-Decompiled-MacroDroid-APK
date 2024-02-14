package com.arlosoft.macrodroid.triggers.activities;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TimePicker;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5831b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DayOfMonthConfigureActivity f13832a;

    /* renamed from: c */
    public final /* synthetic */ TimePicker f13833c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f13834d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f13835f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f13836g;

    public /* synthetic */ C5831b(DayOfMonthConfigureActivity dayOfMonthConfigureActivity, TimePicker timePicker, Spinner spinner, Spinner spinner2, CheckBox checkBox) {
        this.f13832a = dayOfMonthConfigureActivity;
        this.f13833c = timePicker;
        this.f13834d = spinner;
        this.f13835f = spinner2;
        this.f13836g = checkBox;
    }

    public final void onClick(View view) {
        this.f13832a.m23825N1(this.f13833c, this.f13834d, this.f13835f, this.f13836g, view);
    }
}
