package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;

public class TransportRuntime implements TransportInternal {

    /* renamed from: e */
    private static volatile TransportRuntimeComponent f1368e;

    /* renamed from: a */
    private final Clock f1369a;

    /* renamed from: b */
    private final Clock f1370b;

    /* renamed from: c */
    private final Scheduler f1371c;

    /* renamed from: d */
    private final Uploader f1372d;

    TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f1369a = clock;
        this.f1370b = clock2;
        this.f1371c = scheduler;
        this.f1372d = uploader;
        workInitializer.mo19569c();
    }

    /* renamed from: b */
    private EventInternal m1270b(SendRequest sendRequest) {
        return EventInternal.m1208a().mo19409i(this.f1369a.mo19627a()).mo19411k(this.f1370b.mo19627a()).mo19410j(sendRequest.mo19417g()).mo19408h(new EncodedPayload(sendRequest.mo19412b(), sendRequest.mo19458d())).mo19407g(sendRequest.mo19413c().mo19261a()).mo19404d();
    }

    /* renamed from: c */
    public static TransportRuntime m1271c() {
        TransportRuntimeComponent transportRuntimeComponent = f1368e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.mo19436c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<Encoding> m1272d(Destination destination) {
        if (destination instanceof EncodedDestination) {
            return Collections.unmodifiableSet(((EncodedDestination) destination).mo19276a());
        }
        return Collections.singleton(Encoding.m954b("proto"));
    }

    /* renamed from: f */
    public static void m1273f(Context context) {
        if (f1368e == null) {
            synchronized (TransportRuntime.class) {
                if (f1368e == null) {
                    f1368e = DaggerTransportRuntimeComponent.m1199e().mo19437a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19463a(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f1371c.mo19533a(sendRequest.mo19416f().mo19460f(sendRequest.mo19413c().mo19263c()), m1270b(sendRequest), transportScheduleCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public Uploader mo19464e() {
        return this.f1372d;
    }

    /* renamed from: g */
    public TransportFactory mo19465g(Destination destination) {
        return new TransportFactoryImpl(m1272d(destination), TransportContext.m1253a().mo19432b(destination.getName()).mo19433c(destination.getExtras()).mo19431a(), this);
    }
}
