package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6036p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f14271a;

    public /* synthetic */ C6036p(Macro macro) {
        this.f14271a = macro;
    }

    public final void run() {
        this.f14271a.invokeActions(this.f14271a.getTriggerContextInfo());
    }
}
