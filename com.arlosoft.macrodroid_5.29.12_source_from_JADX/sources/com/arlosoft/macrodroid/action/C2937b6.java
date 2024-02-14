package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.arlosoft.macrodroid.action.b6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2937b6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FloatingTextAction f8030a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8031c;

    /* renamed from: d */
    public final /* synthetic */ MaterialCardView f8032d;

    /* renamed from: f */
    public final /* synthetic */ MaterialCardView f8033f;

    /* renamed from: g */
    public final /* synthetic */ TextView f8034g;

    public /* synthetic */ C2937b6(FloatingTextAction floatingTextAction, Activity activity, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
        this.f8030a = floatingTextAction;
        this.f8031c = activity;
        this.f8032d = materialCardView;
        this.f8033f = materialCardView2;
        this.f8034g = textView;
    }

    public final void onClick(View view) {
        FloatingTextAction.m10769A3(this.f8030a, this.f8031c, this.f8032d, this.f8033f, this.f8034g, view);
    }
}
