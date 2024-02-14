package com.arlosoft.macrodroid.logging.systemlog;

import android.view.Menu;
import android.view.View;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4885h implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SystemLogActivity f12268a;

    /* renamed from: c */
    public final /* synthetic */ Menu f12269c;

    public /* synthetic */ C4885h(SystemLogActivity systemLogActivity, Menu menu) {
        this.f12268a = systemLogActivity;
        this.f12269c = menu;
    }

    public final void onFocusChange(View view, boolean z) {
        SystemLogActivity.m18775B2(this.f12268a, this.f12269c, view, z);
    }
}
