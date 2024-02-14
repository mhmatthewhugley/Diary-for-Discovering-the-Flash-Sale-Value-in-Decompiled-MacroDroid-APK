package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1713t implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ long f1639a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f1640b;

    public /* synthetic */ C1713t(long j, TransportContext transportContext) {
        this.f1639a = j;
        this.f1640b = transportContext;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.m1569U0(this.f1639a, this.f1640b, (SQLiteDatabase) obj);
    }
}
