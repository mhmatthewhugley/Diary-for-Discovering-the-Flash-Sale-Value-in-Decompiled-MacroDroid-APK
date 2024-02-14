package p019c1;

import kotlin.jvm.internal.C13706o;
import org.altbeacon.beacon.Region;

/* renamed from: c1.i */
/* compiled from: RxBeaconMonitor.kt */
public final class C2264i {

    /* renamed from: a */
    private final C2265a f6966a;

    /* renamed from: b */
    private final Region f6967b;

    /* renamed from: c1.i$a */
    /* compiled from: RxBeaconMonitor.kt */
    public enum C2265a {
        ENTER,
        EXIT
    }

    public C2264i(C2265a aVar, Region region) {
        C13706o.m87929f(region, "region");
        this.f6966a = aVar;
        this.f6967b = region;
    }

    /* renamed from: a */
    public final Region mo24570a() {
        return this.f6967b;
    }

    /* renamed from: b */
    public final C2265a mo24571b() {
        return this.f6966a;
    }

    public String toString() {
        return "RxBeaconMonitor{region=" + this.f6967b + ", state=" + this.f6966a + '}';
    }
}
