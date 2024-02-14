package p483y5;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;

/* renamed from: y5.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17516b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DefaultScheduler f69342a;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f69343c;

    /* renamed from: d */
    public final /* synthetic */ TransportScheduleCallback f69344d;

    /* renamed from: f */
    public final /* synthetic */ EventInternal f69345f;

    public /* synthetic */ C17516b(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        this.f69342a = defaultScheduler;
        this.f69343c = transportContext;
        this.f69344d = transportScheduleCallback;
        this.f69345f = eventInternal;
    }

    public final void run() {
        this.f69342a.m1392e(this.f69343c, this.f69344d, this.f69345f);
    }
}
