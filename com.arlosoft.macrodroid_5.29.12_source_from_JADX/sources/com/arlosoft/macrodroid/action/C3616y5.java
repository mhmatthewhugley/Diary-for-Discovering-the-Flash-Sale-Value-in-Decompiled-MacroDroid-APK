package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.action.y5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3616y5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingActionButton f9610a;

    /* renamed from: b */
    public final /* synthetic */ FloatingButtonConfigureAction f9611b;

    /* renamed from: c */
    public final /* synthetic */ SeekBar f9612c;

    public /* synthetic */ C3616y5(FloatingActionButton floatingActionButton, FloatingButtonConfigureAction floatingButtonConfigureAction, SeekBar seekBar) {
        this.f9610a = floatingActionButton;
        this.f9611b = floatingButtonConfigureAction;
        this.f9612c = seekBar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FloatingButtonConfigureAction.m10726A3(this.f9610a, this.f9611b, this.f9612c, compoundButton, z);
    }
}
