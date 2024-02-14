package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.melnykov.fab.FloatingActionButton;

/* renamed from: com.arlosoft.macrodroid.triggers.z2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6208z2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingButtonTrigger f14756a;

    /* renamed from: b */
    public final /* synthetic */ FloatingActionButton f14757b;

    /* renamed from: c */
    public final /* synthetic */ SeekBar f14758c;

    public /* synthetic */ C6208z2(FloatingButtonTrigger floatingButtonTrigger, FloatingActionButton floatingActionButton, SeekBar seekBar) {
        this.f14756a = floatingButtonTrigger;
        this.f14757b = floatingActionButton;
        this.f14758c = seekBar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14756a.m22199I3(this.f14757b, this.f14758c, compoundButton, z);
    }
}
