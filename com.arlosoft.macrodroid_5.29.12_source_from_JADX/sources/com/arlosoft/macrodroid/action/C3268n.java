package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

/* renamed from: com.arlosoft.macrodroid.action.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3268n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f8731a;

    /* renamed from: b */
    public final /* synthetic */ TimePicker f8732b;

    /* renamed from: c */
    public final /* synthetic */ TextView f8733c;

    public /* synthetic */ C3268n(LinearLayout linearLayout, TimePicker timePicker, TextView textView) {
        this.f8731a = linearLayout;
        this.f8732b = timePicker;
        this.f8733c = textView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AddCalendarEntryAction.m9689x3(this.f8731a, this.f8732b, this.f8733c, compoundButton, z);
    }
}
