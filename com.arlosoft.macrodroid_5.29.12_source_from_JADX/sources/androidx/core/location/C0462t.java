package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0462t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f479a;

    /* renamed from: c */
    public final /* synthetic */ Executor f480c;

    /* renamed from: d */
    public final /* synthetic */ int f481d;

    public /* synthetic */ C0462t(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f479a = preRGnssStatusTransport;
        this.f480c = executor;
        this.f481d = i;
    }

    public final void run() {
        this.f479a.lambda$onFirstFix$2(this.f480c, this.f481d);
    }
}
