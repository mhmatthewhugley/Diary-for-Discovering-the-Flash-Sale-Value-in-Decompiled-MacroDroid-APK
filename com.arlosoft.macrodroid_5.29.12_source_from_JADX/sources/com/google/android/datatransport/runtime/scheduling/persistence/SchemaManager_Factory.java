package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import p287ia.C12478a;

public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a */
    private final C12478a<Context> f1599a;

    /* renamed from: b */
    private final C12478a<String> f1600b;

    /* renamed from: c */
    private final C12478a<Integer> f1601c;

    public SchemaManager_Factory(C12478a<Context> aVar, C12478a<String> aVar2, C12478a<Integer> aVar3) {
        this.f1599a = aVar;
        this.f1600b = aVar2;
        this.f1601c = aVar3;
    }

    /* renamed from: a */
    public static SchemaManager_Factory m1645a(C12478a<Context> aVar, C12478a<String> aVar2, C12478a<Integer> aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static SchemaManager m1646c(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    /* renamed from: b */
    public SchemaManager get() {
        return m1646c(this.f1599a.get(), this.f1600b.get(), this.f1601c.get().intValue());
    }
}
