package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1707n implements SQLiteEventStore.Function {

    /* renamed from: a */
    public static final /* synthetic */ C1707n f1633a = new C1707n();

    private /* synthetic */ C1707n() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
