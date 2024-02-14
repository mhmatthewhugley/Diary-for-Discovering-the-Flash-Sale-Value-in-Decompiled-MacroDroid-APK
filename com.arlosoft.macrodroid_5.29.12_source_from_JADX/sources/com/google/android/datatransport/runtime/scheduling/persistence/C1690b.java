package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1690b implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ SQLiteEventStore f1605a;

    /* renamed from: b */
    public final /* synthetic */ String f1606b;

    /* renamed from: c */
    public final /* synthetic */ String f1607c;

    public /* synthetic */ C1690b(SQLiteEventStore sQLiteEventStore, String str, String str2) {
        this.f1605a = sQLiteEventStore;
        this.f1606b = str;
        this.f1607c = str2;
    }

    public final Object apply(Object obj) {
        return this.f1605a.m1561K0(this.f1606b, this.f1607c, (SQLiteDatabase) obj);
    }
}
