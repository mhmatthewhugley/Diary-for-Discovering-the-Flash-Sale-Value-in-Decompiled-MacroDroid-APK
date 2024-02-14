package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.data.WifiCellInfo;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.triggers.za */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6216za implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C6216za f14781a = new C6216za();

    private /* synthetic */ C6216za() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((WifiCellInfo) obj).getDisplayName().toLowerCase().compareTo(((WifiCellInfo) obj2).getDisplayName().toLowerCase());
    }
}
