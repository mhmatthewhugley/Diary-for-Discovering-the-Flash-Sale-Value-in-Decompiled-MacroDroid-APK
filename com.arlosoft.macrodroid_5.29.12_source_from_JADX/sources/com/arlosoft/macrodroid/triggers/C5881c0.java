package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.triggers.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5881c0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f13958a;

    public /* synthetic */ C5881c0(Macro macro) {
        this.f13958a = macro;
    }

    public final void run() {
        this.f13958a.invokeActions(this.f13958a.getTriggerContextInfo());
    }
}
