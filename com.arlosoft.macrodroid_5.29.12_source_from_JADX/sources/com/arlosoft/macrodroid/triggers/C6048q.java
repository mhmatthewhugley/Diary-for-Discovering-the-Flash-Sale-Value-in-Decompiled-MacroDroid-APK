package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6048q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14304a;

    public /* synthetic */ C6048q(Macro macro) {
        this.f14304a = macro;
    }

    public final void run() {
        this.f14304a.invokeActions(this.f14304a.getTriggerContextInfo());
    }
}
