package com.arlosoft.macrodroid.action;

import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.action.fh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3062fh implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C3062fh f8335a = new C3062fh();

    private /* synthetic */ C3062fh() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Locale) obj).getDisplayLanguage().compareTo(((Locale) obj2).getDisplayLanguage());
    }
}
