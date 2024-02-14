package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.arlosoft.macrodroid.action.c6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2965c6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingTextAction f8093a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8094c;

    /* renamed from: d */
    public final /* synthetic */ MaterialCardView f8095d;

    /* renamed from: f */
    public final /* synthetic */ MaterialCardView f8096f;

    /* renamed from: g */
    public final /* synthetic */ TextView f8097g;

    public /* synthetic */ C2965c6(FloatingTextAction floatingTextAction, Activity activity, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
        this.f8093a = floatingTextAction;
        this.f8094c = activity;
        this.f8095d = materialCardView;
        this.f8096f = materialCardView2;
        this.f8097g = textView;
    }

    public final void onClick(View view) {
        FloatingTextAction.m10770B3(this.f8093a, this.f8094c, this.f8095d, this.f8096f, this.f8097g, view);
    }
}
