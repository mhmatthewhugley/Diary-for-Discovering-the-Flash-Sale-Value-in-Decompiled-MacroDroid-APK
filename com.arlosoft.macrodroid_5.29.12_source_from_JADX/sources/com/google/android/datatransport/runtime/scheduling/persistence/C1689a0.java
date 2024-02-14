package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1689a0 implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1603a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1604b;

    public /* synthetic */ C1689a0(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.f1603a = sQLiteEventStore;
        this.f1604b = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f1603a.m1604w0(this.f1604b, (SQLiteDatabase) obj);
    }
}
