package com.arlosoft.macrodroid;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4828j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ConfigureNotificationBarActivity f12151a;

    /* renamed from: b */
    public final /* synthetic */ CheckBox f12152b;

    public /* synthetic */ C4828j(ConfigureNotificationBarActivity configureNotificationBarActivity, CheckBox checkBox) {
        this.f12151a = configureNotificationBarActivity;
        this.f12152b = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f12151a.m9408Y1(this.f12152b, compoundButton, z);
    }
}
