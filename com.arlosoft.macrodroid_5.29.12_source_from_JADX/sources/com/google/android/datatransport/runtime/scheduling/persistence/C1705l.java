package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1705l implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ long f1631a;

    public /* synthetic */ C1705l(long j) {
        this.f1631a = j;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.m1597q0(this.f1631a, (SQLiteDatabase) obj);
    }
}
