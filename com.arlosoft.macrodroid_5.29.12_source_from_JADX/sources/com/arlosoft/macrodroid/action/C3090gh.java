package com.arlosoft.macrodroid.action;

import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.action.gh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3090gh implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C3090gh f8379a = new C3090gh();

    private /* synthetic */ C3090gh() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Locale) obj).getDisplayCountry().compareTo(((Locale) obj2).getDisplayCountry());
    }
}
