package com.arlosoft.macrodroid.triggers.services;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.services.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6131j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14575a;

    public /* synthetic */ C6131j(Macro macro) {
        this.f14575a = macro;
    }

    public final void run() {
        this.f14575a.invokeActions(this.f14575a.getTriggerContextInfo());
    }
}
