package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1711r implements SQLiteEventStore.Producer {

    /* renamed from: a */
    public final /* synthetic */ SQLiteDatabase f1637a;

    public /* synthetic */ C1711r(SQLiteDatabase sQLiteDatabase) {
        this.f1637a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final Object mo19618a() {
        return this.f1637a.beginTransaction();
    }
}
