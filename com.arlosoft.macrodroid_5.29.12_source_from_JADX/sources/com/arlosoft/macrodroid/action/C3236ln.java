package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ln */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3236ln implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ToastAction f8666a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8667c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8668d;

    public /* synthetic */ C3236ln(ToastAction toastAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8666a = toastAction;
        this.f8667c = activity;
        this.f8668d = eVar;
    }

    public final void onClick(View view) {
        this.f8666a.m13396F3(this.f8667c, this.f8668d, view);
    }
}
