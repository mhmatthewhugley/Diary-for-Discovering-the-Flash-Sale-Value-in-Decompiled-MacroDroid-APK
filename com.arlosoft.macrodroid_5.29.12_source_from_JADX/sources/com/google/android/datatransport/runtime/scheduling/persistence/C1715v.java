package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1715v implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1642a;

    public /* synthetic */ C1715v(SQLiteEventStore sQLiteEventStore) {
        this.f1642a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f1642a.m1558I0((Cursor) obj);
    }
}
