package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class Uploader {

    /* renamed from: a */
    private final Context f1502a;

    /* renamed from: b */
    private final BackendRegistry f1503b;

    /* renamed from: c */
    private final EventStore f1504c;

    /* renamed from: d */
    private final WorkScheduler f1505d;

    /* renamed from: e */
    private final Executor f1506e;

    /* renamed from: f */
    private final SynchronizationGuard f1507f;

    /* renamed from: g */
    private final Clock f1508g;

    /* renamed from: h */
    private final Clock f1509h;

    /* renamed from: i */
    private final ClientHealthMetricsStore f1510i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f1502a = context;
        this.f1503b = backendRegistry;
        this.f1504c = eventStore;
        this.f1505d = workScheduler;
        this.f1506e = executor;
        this.f1507f = synchronizationGuard;
        this.f1508g = clock;
        this.f1509h = clock2;
        this.f1510i = clientHealthMetricsStore;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m1456l(TransportContext transportContext) {
        return Boolean.valueOf(this.f1504c.mo19601Q0(transportContext));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m1457m(TransportContext transportContext) {
        return this.f1504c.mo19607p1(transportContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m1458n(Iterable iterable, TransportContext transportContext, long j) {
        this.f1504c.mo19603S0(iterable);
        this.f1504c.mo19605b0(transportContext, this.f1508g.mo19627a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m1459o(Iterable iterable) {
        this.f1504c.mo19602R(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m1460p() {
        this.f1510i.mo19596b();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m1461q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f1510i.mo19598f((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m1462r(TransportContext transportContext, long j) {
        this.f1504c.mo19605b0(transportContext, this.f1508g.mo19627a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m1463s(TransportContext transportContext, int i) {
        this.f1505d.mo19537a(transportContext, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f1505d.mo19537a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m1464t(com.google.android.datatransport.runtime.TransportContext r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.f1507f     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = r3.f1504c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.m r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.m     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo19615c(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo19565k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.f1507f     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.g r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.g     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo19615c(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo19566u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r3.f1505d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo19537a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.m1464t(com.google.android.datatransport.runtime.TransportContext, int, java.lang.Runnable):void");
    }

    @VisibleForTesting
    /* renamed from: j */
    public EventInternal mo19564j(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f1507f;
        ClientHealthMetricsStore clientHealthMetricsStore = this.f1510i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.mo19283a(EventInternal.m1208a().mo19409i(this.f1508g.mo19627a()).mo19411k(this.f1509h.mo19627a()).mo19410j("GDT_CLIENT_METRICS").mo19408h(new EncodedPayload(Encoding.m954b("proto"), ((ClientMetrics) synchronizationGuard.mo19615c(new C1682l(clientHealthMetricsStore))).mo19503f())).mo19404d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo19565k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f1502a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public BackendResponse mo19566u(TransportContext transportContext, int i) {
        BackendResponse b;
        TransportBackend transportBackend = this.f1503b.get(transportContext.mo19426b());
        long j = 0;
        BackendResponse e = BackendResponse.m1303e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f1507f.mo19615c(new C1675e(this, transportContext))).booleanValue()) {
                Iterable<PersistedEvent> iterable = (Iterable) this.f1507f.mo19615c(new C1676f(this, transportContext));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (transportBackend == null) {
                    Logging.m1381b("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                    b = BackendResponse.m1301a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (PersistedEvent b2 : iterable) {
                        arrayList.add(b2.mo19590b());
                    }
                    if (transportContext.mo19459e()) {
                        arrayList.add(mo19564j(transportBackend));
                    }
                    b = transportBackend.mo19284b(BackendRequest.m1295a().mo19474b(arrayList).mo19475c(transportContext.mo19427c()).mo19473a());
                }
                e = b;
                if (e.mo19477c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f1507f.mo19615c(new C1680j(this, iterable, transportContext, j2));
                    this.f1505d.mo19538b(transportContext, i + 1, true);
                    return e;
                }
                this.f1507f.mo19615c(new C1679i(this, iterable));
                if (e.mo19477c() == BackendResponse.Status.OK) {
                    j = Math.max(j2, e.mo19476b());
                    if (transportContext.mo19459e()) {
                        this.f1507f.mo19615c(new C1673c(this));
                    }
                } else if (e.mo19477c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (PersistedEvent b3 : iterable) {
                        String j3 = b3.mo19590b().mo19401j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f1507f.mo19615c(new C1681k(this, hashMap));
                }
            }
            this.f1507f.mo19615c(new C1678h(this, transportContext, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo19567v(TransportContext transportContext, int i, Runnable runnable) {
        this.f1506e.execute(new C1674d(this, transportContext, i, runnable));
    }
}
