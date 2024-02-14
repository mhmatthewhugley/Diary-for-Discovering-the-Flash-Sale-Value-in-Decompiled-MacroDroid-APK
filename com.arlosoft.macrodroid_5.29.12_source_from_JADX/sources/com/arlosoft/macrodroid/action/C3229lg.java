package com.arlosoft.macrodroid.action;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.lg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3229lg implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ SetBrightnessAction f8658a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f8659c;

    public /* synthetic */ C3229lg(SetBrightnessAction setBrightnessAction, Spinner spinner) {
        this.f8658a = setBrightnessAction;
        this.f8659c = spinner;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8658a.m12362w3(this.f8659c, view, motionEvent);
    }
}
