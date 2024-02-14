package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5806a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f13760a;

    public /* synthetic */ C5806a0(Macro macro) {
        this.f13760a = macro;
    }

    public final void run() {
        this.f13760a.invokeActions(this.f13760a.getTriggerContextInfo());
    }
}
