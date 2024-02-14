package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1719z implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1649a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1650b;

    public /* synthetic */ C1719z(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.f1649a = sQLiteEventStore;
        this.f1650b = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f1649a.m1610z0(this.f1650b, (SQLiteDatabase) obj);
    }
}
