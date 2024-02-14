package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.WebHookTrigger;
import java.util.Map;

/* renamed from: com.arlosoft.macrodroid.triggers.ka */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5987ka implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map f14160a;

    /* renamed from: c */
    public final /* synthetic */ Macro f14161c;

    public /* synthetic */ C5987ka(Map map, Macro macro) {
        this.f14160a = map;
        this.f14161c = macro;
    }

    public final void run() {
        WebHookTrigger.C5778b.m23699c(this.f14160a, this.f14161c);
    }
}
