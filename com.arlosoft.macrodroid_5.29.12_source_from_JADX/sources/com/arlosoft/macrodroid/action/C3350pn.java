package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.arlosoft.macrodroid.action.pn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3350pn implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ToastAction f8928a;

    /* renamed from: c */
    public final /* synthetic */ MaterialCardView f8929c;

    /* renamed from: d */
    public final /* synthetic */ MaterialCardView f8930d;

    /* renamed from: f */
    public final /* synthetic */ ImageView f8931f;

    /* renamed from: g */
    public final /* synthetic */ Activity f8932g;

    public /* synthetic */ C3350pn(ToastAction toastAction, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, Activity activity) {
        this.f8928a = toastAction;
        this.f8929c = materialCardView;
        this.f8930d = materialCardView2;
        this.f8931f = imageView;
        this.f8932g = activity;
    }

    public final void onClick(View view) {
        this.f8928a.m13413x3(this.f8929c, this.f8930d, this.f8931f, this.f8932g, view);
    }
}
