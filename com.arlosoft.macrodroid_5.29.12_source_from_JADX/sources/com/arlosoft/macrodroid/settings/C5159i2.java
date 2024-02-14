package com.arlosoft.macrodroid.settings;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.settings.i2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5159i2 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Collator f12943a;

    public /* synthetic */ C5159i2(Collator collator) {
        this.f12943a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f12943a.compare((String) obj, (String) obj2);
    }
}
