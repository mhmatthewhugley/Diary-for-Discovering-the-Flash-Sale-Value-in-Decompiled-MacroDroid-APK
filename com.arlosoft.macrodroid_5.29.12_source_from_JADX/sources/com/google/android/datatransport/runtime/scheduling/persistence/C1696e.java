package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1696e implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1618a;

    /* renamed from: b */
    public final /* synthetic */ Map f1619b;

    /* renamed from: c */
    public final /* synthetic */ ClientMetrics.Builder f1620c;

    public /* synthetic */ C1696e(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder) {
        this.f1618a = sQLiteEventStore;
        this.f1619b = map;
        this.f1620c = builder;
    }

    public final Object apply(Object obj) {
        return this.f1618a.m1544A0(this.f1619b, this.f1620c, (Cursor) obj);
    }
}
