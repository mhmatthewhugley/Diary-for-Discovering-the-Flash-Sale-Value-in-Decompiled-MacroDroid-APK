package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1712s implements SQLiteEventStore.Producer {

    /* renamed from: a */
    public final /* synthetic */ SchemaManager f1638a;

    public /* synthetic */ C1712s(SchemaManager schemaManager) {
        this.f1638a = schemaManager;
    }

    /* renamed from: a */
    public final Object mo19618a() {
        return this.f1638a.getWritableDatabase();
    }
}
