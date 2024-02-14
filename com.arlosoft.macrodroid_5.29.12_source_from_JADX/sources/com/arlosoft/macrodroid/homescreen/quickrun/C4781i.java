package com.arlosoft.macrodroid.homescreen.quickrun;

import com.arlosoft.macrodroid.macro.Macro;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4781i implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f11984a;

    public /* synthetic */ C4781i(Collator collator) {
        this.f11984a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return QuickRunAddMacrosActivity.m18479j2(this.f11984a, (Macro) obj, (Macro) obj2);
    }
}
