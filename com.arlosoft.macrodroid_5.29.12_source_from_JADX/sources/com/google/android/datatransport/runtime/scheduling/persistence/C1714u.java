package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1714u implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1641a;

    public /* synthetic */ C1714u(SQLiteEventStore sQLiteEventStore) {
        this.f1641a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f1641a.m1579f0((Cursor) obj);
    }
}
