package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.k2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5979k2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14151a;

    public /* synthetic */ C5979k2(Macro macro) {
        this.f14151a = macro;
    }

    public final void run() {
        this.f14151a.invokeActions(this.f14151a.getTriggerContextInfo());
    }
}
