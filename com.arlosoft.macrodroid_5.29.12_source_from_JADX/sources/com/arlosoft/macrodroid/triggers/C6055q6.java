package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.q6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6055q6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14319a;

    public /* synthetic */ C6055q6(Macro macro) {
        this.f14319a = macro;
    }

    public final void run() {
        this.f14319a.invokeActions(this.f14319a.getTriggerContextInfo());
    }
}
