package com.arlosoft.macrodroid.macro;

import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.macro.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4919e implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Locale f12369a;

    public /* synthetic */ C4919e(Locale locale) {
        this.f12369a = locale;
    }

    public final int compare(Object obj, Object obj2) {
        return Macro.lambda$sortVariables$1(this.f12369a, (MacroDroidVariable) obj, (MacroDroidVariable) obj2);
    }
}
