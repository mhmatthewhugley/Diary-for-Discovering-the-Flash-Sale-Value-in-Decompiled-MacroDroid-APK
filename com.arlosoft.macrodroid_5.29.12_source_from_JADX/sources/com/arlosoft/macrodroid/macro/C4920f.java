package com.arlosoft.macrodroid.macro;

import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.macro.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4920f implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Locale f12370a;

    public /* synthetic */ C4920f(Locale locale) {
        this.f12370a = locale;
    }

    public final int compare(Object obj, Object obj2) {
        return Macro.lambda$getLocalVariablesSorted$0(this.f12370a, (MacroDroidVariable) obj, (MacroDroidVariable) obj2);
    }
}
