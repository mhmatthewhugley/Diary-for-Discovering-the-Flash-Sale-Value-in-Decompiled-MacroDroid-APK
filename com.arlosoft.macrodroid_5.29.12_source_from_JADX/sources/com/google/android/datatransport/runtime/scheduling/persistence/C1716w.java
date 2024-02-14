package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1716w implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1643a;

    public /* synthetic */ C1716w(SQLiteEventStore sQLiteEventStore) {
        this.f1643a = sQLiteEventStore;
    }

    public final Object apply(Object obj) {
        return this.f1643a.m1570V0((SQLiteDatabase) obj);
    }
}
