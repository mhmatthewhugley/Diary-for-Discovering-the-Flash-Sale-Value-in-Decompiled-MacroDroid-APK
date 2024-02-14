package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1698f implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ String f1622a;

    /* renamed from: b */
    public final /* synthetic */ LogEventDropped.Reason f1623b;

    /* renamed from: c */
    public final /* synthetic */ long f1624c;

    public /* synthetic */ C1698f(String str, LogEventDropped.Reason reason, long j) {
        this.f1622a = str;
        this.f1623b = reason;
        this.f1624c = j;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.m1566R0(this.f1622a, this.f1623b, this.f1624c, (SQLiteDatabase) obj);
    }
}
