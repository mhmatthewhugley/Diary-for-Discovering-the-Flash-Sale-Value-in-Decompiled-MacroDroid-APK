package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1694d implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1614a;

    /* renamed from: b */
    public final /* synthetic */ List f1615b;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f1616c;

    public /* synthetic */ C1694d(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext) {
        this.f1614a = sQLiteEventStore;
        this.f1615b = list;
        this.f1616c = transportContext;
    }

    public final Object apply(Object obj) {
        return this.f1614a.m1548C0(this.f1615b, this.f1616c, (Cursor) obj);
    }
}
