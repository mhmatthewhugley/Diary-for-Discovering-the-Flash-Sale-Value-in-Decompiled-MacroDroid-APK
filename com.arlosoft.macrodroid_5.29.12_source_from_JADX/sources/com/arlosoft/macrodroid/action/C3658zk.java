package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.zk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3658zk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f9704a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9705c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9706d;

    public /* synthetic */ C3658zk(SpeakTextAction speakTextAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9704a = speakTextAction;
        this.f9705c = activity;
        this.f9706d = eVar;
    }

    public final void onClick(View view) {
        this.f9704a.m13091V3(this.f9705c, this.f9706d, view);
    }
}
