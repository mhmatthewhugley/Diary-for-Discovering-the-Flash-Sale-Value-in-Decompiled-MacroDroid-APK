package com.arlosoft.macrodroid.settings;

import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.settings.z1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5214z1 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C5214z1 f13023a = new C5214z1();

    private /* synthetic */ C5214z1() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Locale) obj).getDisplayName().compareTo(((Locale) obj2).getDisplayName());
    }
}
