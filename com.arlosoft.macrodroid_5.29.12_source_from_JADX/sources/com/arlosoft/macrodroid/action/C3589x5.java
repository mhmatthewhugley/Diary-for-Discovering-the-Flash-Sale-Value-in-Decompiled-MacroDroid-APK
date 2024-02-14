package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.action.x5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3589x5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingActionButton f9537a;

    /* renamed from: b */
    public final /* synthetic */ FloatingButtonConfigureAction f9538b;

    public /* synthetic */ C3589x5(FloatingActionButton floatingActionButton, FloatingButtonConfigureAction floatingButtonConfigureAction) {
        this.f9537a = floatingActionButton;
        this.f9538b = floatingButtonConfigureAction;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FloatingButtonConfigureAction.m10754x3(this.f9537a, this.f9538b, compoundButton, z);
    }
}
