package com.arlosoft.macrodroid.logging.systemlog;

import android.view.Menu;
import androidx.appcompat.widget.SearchView;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4887j implements SearchView.OnCloseListener {

    /* renamed from: a */
    public final /* synthetic */ SystemLogActivity f12271a;

    /* renamed from: b */
    public final /* synthetic */ Menu f12272b;

    public /* synthetic */ C4887j(SystemLogActivity systemLogActivity, Menu menu) {
        this.f12271a = systemLogActivity;
        this.f12272b = menu;
    }

    public final boolean onClose() {
        return SystemLogActivity.m18774A2(this.f12271a, this.f12272b);
    }
}
