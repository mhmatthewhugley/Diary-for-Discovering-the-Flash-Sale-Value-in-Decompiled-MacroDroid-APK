package com.arlosoft.macrodroid.logging.systemlog;

import androidx.lifecycle.Observer;
import androidx.paging.PagingData;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4888k implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SystemLogActivity f12273a;

    public /* synthetic */ C4888k(SystemLogActivity systemLogActivity) {
        this.f12273a = systemLogActivity;
    }

    public final void onChanged(Object obj) {
        SystemLogActivity.m18803o2(this.f12273a, (PagingData) obj);
    }
}
