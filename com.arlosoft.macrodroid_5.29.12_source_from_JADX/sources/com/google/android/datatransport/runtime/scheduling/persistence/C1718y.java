package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1718y implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1646a;

    /* renamed from: b */
    public final /* synthetic */ EventInternal f1647b;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f1648c;

    public /* synthetic */ C1718y(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext) {
        this.f1646a = sQLiteEventStore;
        this.f1647b = eventInternal;
        this.f1648c = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f1646a.m1552E0(this.f1647b, this.f1648c, (SQLiteDatabase) obj);
    }
}
