package com.arlosoft.macrodroid.action;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.x8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3592x8 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ LoopAction f9543a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f9544c;

    public /* synthetic */ C3592x8(LoopAction loopAction, Spinner spinner) {
        this.f9543a = loopAction;
        this.f9544c = spinner;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9543a.m11333U3(this.f9544c, view, motionEvent);
    }
}
