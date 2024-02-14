package com.arlosoft.macrodroid.macro;

import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.variables.VariableValue;

/* renamed from: com.arlosoft.macrodroid.macro.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4918d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Macro f12365a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f12366c;

    /* renamed from: d */
    public final /* synthetic */ VariableValue f12367d;

    /* renamed from: f */
    public final /* synthetic */ VariableValue f12368f;

    public /* synthetic */ C4918d(Macro macro, MacroDroidVariable macroDroidVariable, VariableValue variableValue, VariableValue variableValue2) {
        this.f12365a = macro;
        this.f12366c = macroDroidVariable;
        this.f12367d = variableValue;
        this.f12368f = variableValue2;
    }

    public final void run() {
        this.f12365a.lambda$notifyVariableListenersOnCorrectThread$2(this.f12366c, this.f12367d, this.f12368f);
    }
}
