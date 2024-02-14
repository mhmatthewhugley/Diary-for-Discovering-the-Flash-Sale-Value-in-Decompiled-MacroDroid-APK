package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p287ia.C12478a;

public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* renamed from: a */
    private final C12478a<Context> f1397a;

    /* renamed from: b */
    private final C12478a<Clock> f1398b;

    /* renamed from: c */
    private final C12478a<Clock> f1399c;

    public CreationContextFactory_Factory(C12478a<Context> aVar, C12478a<Clock> aVar2, C12478a<Clock> aVar3) {
        this.f1397a = aVar;
        this.f1398b = aVar2;
        this.f1399c = aVar3;
    }

    /* renamed from: a */
    public static CreationContextFactory_Factory m1313a(C12478a<Context> aVar, C12478a<Clock> aVar2, C12478a<Clock> aVar3) {
        return new CreationContextFactory_Factory(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static CreationContextFactory m1314c(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    /* renamed from: b */
    public CreationContextFactory get() {
        return m1314c(this.f1397a.get(), this.f1398b.get(), this.f1399c.get());
    }
}
