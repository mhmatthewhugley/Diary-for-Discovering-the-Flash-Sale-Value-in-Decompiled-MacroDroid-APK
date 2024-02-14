package com.arlosoft.macrodroid.action;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.a4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2807a4 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DimScreenAction f7721a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f7722c;

    public /* synthetic */ C2807a4(DimScreenAction dimScreenAction, Spinner spinner) {
        this.f7721a = dimScreenAction;
        this.f7722c = spinner;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f7721a.m10395q3(this.f7722c, view, motionEvent);
    }
}
