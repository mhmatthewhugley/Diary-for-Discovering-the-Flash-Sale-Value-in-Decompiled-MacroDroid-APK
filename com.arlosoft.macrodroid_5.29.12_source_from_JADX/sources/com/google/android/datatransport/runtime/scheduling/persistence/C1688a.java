package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1688a implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ long f1602a;

    public /* synthetic */ C1688a(long j) {
        this.f1602a = j;
    }

    public final Object apply(Object obj) {
        return ((Cursor) obj).moveToNext();
    }
}
