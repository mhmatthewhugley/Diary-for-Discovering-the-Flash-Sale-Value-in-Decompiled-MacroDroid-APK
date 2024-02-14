package p483y5;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* renamed from: y5.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17515a implements SynchronizationGuard.CriticalSection {

    /* renamed from: a */
    public final /* synthetic */ DefaultScheduler f69339a;

    /* renamed from: b */
    public final /* synthetic */ TransportContext f69340b;

    /* renamed from: c */
    public final /* synthetic */ EventInternal f69341c;

    public /* synthetic */ C17515a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        this.f69339a = defaultScheduler;
        this.f69340b = transportContext;
        this.f69341c = eventInternal;
    }

    public final Object execute() {
        return this.f69339a.m1391d(this.f69340b, this.f69341c);
    }
}
