package com.google.firebase.appindexing.internal;

import android.os.Parcelable;
import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final /* synthetic */ class zzab implements Comparator {

    /* renamed from: a */
    static final Comparator f53840a = new zzab();

    private zzab() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Parcelable.Creator<Thing> creator = Thing.CREATOR;
        if (str == null) {
            return str2 != null ? -1 : 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
