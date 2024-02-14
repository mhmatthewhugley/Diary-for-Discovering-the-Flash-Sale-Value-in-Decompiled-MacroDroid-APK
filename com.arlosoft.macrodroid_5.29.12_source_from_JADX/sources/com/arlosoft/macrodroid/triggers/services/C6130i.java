package com.arlosoft.macrodroid.triggers.services;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.services.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6130i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14574a;

    public /* synthetic */ C6130i(Macro macro) {
        this.f14574a = macro;
    }

    public final void run() {
        this.f14574a.invokeActions(this.f14574a.getTriggerContextInfo());
    }
}
