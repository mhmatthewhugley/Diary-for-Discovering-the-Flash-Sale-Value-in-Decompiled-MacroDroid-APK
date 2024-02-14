package com.arlosoft.macrodroid.action;

import android.view.ViewGroup;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.action.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3240m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f8673a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f8674b;

    public /* synthetic */ C3240m(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f8673a = viewGroup;
        this.f8674b = viewGroup2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AddCalendarEntryAction.m9690y3(this.f8673a, this.f8674b, compoundButton, z);
    }
}
