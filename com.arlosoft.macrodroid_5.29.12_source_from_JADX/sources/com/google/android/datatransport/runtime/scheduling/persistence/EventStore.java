package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

@WorkerThread
public interface EventStore extends Closeable {
    /* renamed from: M0 */
    long mo19599M0(TransportContext transportContext);

    /* renamed from: P */
    int mo19600P();

    /* renamed from: Q0 */
    boolean mo19601Q0(TransportContext transportContext);

    /* renamed from: R */
    void mo19602R(Iterable<PersistedEvent> iterable);

    /* renamed from: S0 */
    void mo19603S0(Iterable<PersistedEvent> iterable);

    @Nullable
    /* renamed from: a2 */
    PersistedEvent mo19604a2(TransportContext transportContext, EventInternal eventInternal);

    /* renamed from: b0 */
    void mo19605b0(TransportContext transportContext, long j);

    /* renamed from: g0 */
    Iterable<TransportContext> mo19606g0();

    /* renamed from: p1 */
    Iterable<PersistedEvent> mo19607p1(TransportContext transportContext);
}
