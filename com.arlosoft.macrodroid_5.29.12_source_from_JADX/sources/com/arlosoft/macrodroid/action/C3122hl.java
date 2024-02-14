package com.arlosoft.macrodroid.action;

import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.action.hl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3122hl implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C3122hl f8445a = new C3122hl();

    private /* synthetic */ C3122hl() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Locale) obj).getDisplayName().compareTo(((Locale) obj2).getDisplayName());
    }
}
