package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1717x implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1644a;

    /* renamed from: b */
    public final /* synthetic */ long f1645b;

    public /* synthetic */ C1717x(SQLiteEventStore sQLiteEventStore, long j) {
        this.f1644a = sQLiteEventStore;
        this.f1645b = j;
    }

    public final Object apply(Object obj) {
        return this.f1644a.m1584h0(this.f1645b, (SQLiteDatabase) obj);
    }
}
