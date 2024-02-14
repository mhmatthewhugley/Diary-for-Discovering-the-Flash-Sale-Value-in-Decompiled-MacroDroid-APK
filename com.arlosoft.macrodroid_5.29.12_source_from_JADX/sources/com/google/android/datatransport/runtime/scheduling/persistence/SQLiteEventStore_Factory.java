package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p287ia.C12478a;

public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* renamed from: a */
    private final C12478a<Clock> f1584a;

    /* renamed from: b */
    private final C12478a<Clock> f1585b;

    /* renamed from: c */
    private final C12478a<EventStoreConfig> f1586c;

    /* renamed from: d */
    private final C12478a<SchemaManager> f1587d;

    /* renamed from: e */
    private final C12478a<String> f1588e;

    public SQLiteEventStore_Factory(C12478a<Clock> aVar, C12478a<Clock> aVar2, C12478a<EventStoreConfig> aVar3, C12478a<SchemaManager> aVar4, C12478a<String> aVar5) {
        this.f1584a = aVar;
        this.f1585b = aVar2;
        this.f1586c = aVar3;
        this.f1587d = aVar4;
        this.f1588e = aVar5;
    }

    /* renamed from: a */
    public static SQLiteEventStore_Factory m1628a(C12478a<Clock> aVar, C12478a<Clock> aVar2, C12478a<EventStoreConfig> aVar3, C12478a<SchemaManager> aVar4, C12478a<String> aVar5) {
        return new SQLiteEventStore_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static SQLiteEventStore m1629c(Clock clock, Clock clock2, Object obj, Object obj2, C12478a<String> aVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, aVar);
    }

    /* renamed from: b */
    public SQLiteEventStore get() {
        return m1629c(this.f1584a.get(), this.f1585b.get(), this.f1586c.get(), this.f1587d.get(), this.f1588e);
    }
}
