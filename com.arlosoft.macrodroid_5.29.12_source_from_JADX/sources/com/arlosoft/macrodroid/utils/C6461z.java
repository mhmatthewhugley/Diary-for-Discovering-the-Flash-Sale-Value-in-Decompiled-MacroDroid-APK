package com.arlosoft.macrodroid.utils;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.utils.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6461z implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C6461z f15087a = new C6461z();

    private /* synthetic */ C6461z() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().toLowerCase().compareTo(((File) obj2).getName().toLowerCase());
    }
}
