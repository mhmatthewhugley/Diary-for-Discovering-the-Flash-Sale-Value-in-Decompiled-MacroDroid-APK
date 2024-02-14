package com.arlosoft.macrodroid.action;

import android.view.MotionEvent;
import android.view.View;
import com.arlosoft.macrodroid.action.SetVolumeAction;

/* renamed from: com.arlosoft.macrodroid.action.xi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3602xi implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ SetVolumeAction.C2669c f9585a;

    /* renamed from: c */
    public final /* synthetic */ SetVolumeAction.C2668b f9586c;

    public /* synthetic */ C3602xi(SetVolumeAction.C2669c cVar, SetVolumeAction.C2668b bVar) {
        this.f9585a = cVar;
        this.f9586c = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9585a.m12796i(this.f9586c, view, motionEvent);
    }
}
