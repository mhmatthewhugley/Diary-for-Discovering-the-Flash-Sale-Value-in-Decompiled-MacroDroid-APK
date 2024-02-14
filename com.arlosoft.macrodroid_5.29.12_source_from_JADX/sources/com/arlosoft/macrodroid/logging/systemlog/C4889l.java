package com.arlosoft.macrodroid.logging.systemlog;

import androidx.lifecycle.Observer;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4889l implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SystemLogActivity f12274a;

    public /* synthetic */ C4889l(SystemLogActivity systemLogActivity) {
        this.f12274a = systemLogActivity;
    }

    public final void onChanged(Object obj) {
        SystemLogActivity.m18806r2(this.f12274a, (LogFilter) obj);
    }
}
