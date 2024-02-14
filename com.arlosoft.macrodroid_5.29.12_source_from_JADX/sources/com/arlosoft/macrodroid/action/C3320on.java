package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.arlosoft.macrodroid.action.on */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3320on implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ToastAction f8875a;

    /* renamed from: c */
    public final /* synthetic */ MaterialCardView f8876c;

    /* renamed from: d */
    public final /* synthetic */ MaterialCardView f8877d;

    /* renamed from: f */
    public final /* synthetic */ Activity f8878f;

    public /* synthetic */ C3320on(ToastAction toastAction, MaterialCardView materialCardView, MaterialCardView materialCardView2, Activity activity) {
        this.f8875a = toastAction;
        this.f8876c = materialCardView;
        this.f8877d = materialCardView2;
        this.f8878f = activity;
    }

    public final void onClick(View view) {
        this.f8875a.m13415z3(this.f8876c, this.f8877d, this.f8878f, view);
    }
}
