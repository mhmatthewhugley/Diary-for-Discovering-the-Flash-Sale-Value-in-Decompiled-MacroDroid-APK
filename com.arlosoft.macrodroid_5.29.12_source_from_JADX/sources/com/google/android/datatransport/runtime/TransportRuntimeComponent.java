package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;
import java.io.IOException;

@Component
abstract class TransportRuntimeComponent implements Closeable {

    @Component.Builder
    interface Builder {
        @BindsInstance
        /* renamed from: a */
        Builder mo19437a(Context context);

        TransportRuntimeComponent build();
    }

    TransportRuntimeComponent() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract EventStore mo19435b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract TransportRuntime mo19436c();

    public void close() throws IOException {
        mo19435b().close();
    }
}
