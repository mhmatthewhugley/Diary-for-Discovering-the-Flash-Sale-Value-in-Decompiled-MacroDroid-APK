package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1700g implements SQLiteEventStore.Function {

    /* renamed from: a */
    public final /* synthetic */ Map f1626a;

    public /* synthetic */ C1700g(Map map) {
        this.f1626a = map;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.m1550D0(this.f1626a, (Cursor) obj);
    }
}
