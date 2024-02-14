package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import android.widget.SeekBar;
import com.arlosoft.macrodroid.action.MacroDroidDrawerAction;

/* renamed from: com.arlosoft.macrodroid.action.z8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3646z8 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroDroidDrawerAction f9680a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidDrawerAction.C2530c f9681c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f9682d;

    public /* synthetic */ C3646z8(MacroDroidDrawerAction macroDroidDrawerAction, MacroDroidDrawerAction.C2530c cVar, SeekBar seekBar) {
        this.f9680a = macroDroidDrawerAction;
        this.f9681c = cVar;
        this.f9682d = seekBar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9680a.m11380v3(this.f9681c, this.f9682d, dialogInterface, i);
    }
}
