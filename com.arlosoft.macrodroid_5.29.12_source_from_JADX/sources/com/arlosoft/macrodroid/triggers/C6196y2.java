package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.triggers.y2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6196y2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingButtonTrigger f14729a;

    /* renamed from: b */
    public final /* synthetic */ FloatingActionButton f14730b;

    public /* synthetic */ C6196y2(FloatingButtonTrigger floatingButtonTrigger, FloatingActionButton floatingActionButton) {
        this.f14729a = floatingButtonTrigger;
        this.f14730b = floatingActionButton;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14729a.m22196F3(this.f14730b, compoundButton, z);
    }
}
