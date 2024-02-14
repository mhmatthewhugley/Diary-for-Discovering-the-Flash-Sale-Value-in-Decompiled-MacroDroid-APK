package com.arlosoft.macrodroid.action;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.do */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3012do implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ UDPCommandAction f8212a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f8213c;

    public /* synthetic */ C3012do(UDPCommandAction uDPCommandAction, Spinner spinner) {
        this.f8212a = uDPCommandAction;
        this.f8213c = spinner;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8212a.m13472s3(this.f8213c, view, motionEvent);
    }
}
