package com.arlosoft.macrodroid.triggers.activities;

import android.view.View;
import android.widget.CheckBox;
import com.ikovac.timepickerwithseconds.TimePicker;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5867z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimerTriggerConfigureActivity f13921a;

    /* renamed from: c */
    public final /* synthetic */ TimePicker f13922c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox[] f13923d;

    /* renamed from: f */
    public final /* synthetic */ CheckBox f13924f;

    public /* synthetic */ C5867z(TimerTriggerConfigureActivity timerTriggerConfigureActivity, TimePicker timePicker, CheckBox[] checkBoxArr, CheckBox checkBox) {
        this.f13921a = timerTriggerConfigureActivity;
        this.f13922c = timePicker;
        this.f13923d = checkBoxArr;
        this.f13924f = checkBox;
    }

    public final void onClick(View view) {
        this.f13921a.m23911P1(this.f13922c, this.f13923d, this.f13924f, view);
    }
}
