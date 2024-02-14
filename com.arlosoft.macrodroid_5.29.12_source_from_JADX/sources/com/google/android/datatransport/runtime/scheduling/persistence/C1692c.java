package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1692c implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1609a;

    /* renamed from: b */
    public final /* synthetic */ String f1610b;

    /* renamed from: c */
    public final /* synthetic */ Map f1611c;

    /* renamed from: d */
    public final /* synthetic */ ClientMetrics.Builder f1612d;

    public /* synthetic */ C1692c(SQLiteEventStore sQLiteEventStore, String str, Map map, ClientMetrics.Builder builder) {
        this.f1609a = sQLiteEventStore;
        this.f1610b = str;
        this.f1611c = map;
        this.f1612d = builder;
    }

    public final Object apply(Object obj) {
        return this.f1609a.m1546B0(this.f1610b, this.f1611c, this.f1612d, (SQLiteDatabase) obj);
    }
}
