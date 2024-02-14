package p019c1;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;

/* renamed from: c1.j */
/* compiled from: RxBeaconRange.kt */
public final class C2266j {

    /* renamed from: a */
    private final Collection<Beacon> f6971a;

    /* renamed from: b */
    private final Region f6972b;

    public C2266j(Collection<? extends Beacon> collection, Region region) {
        C13706o.m87929f(collection, "beacons");
        C13706o.m87929f(region, "region");
        this.f6971a = collection;
        this.f6972b = region;
    }

    /* renamed from: a */
    public final Collection<Beacon> mo24573a() {
        return this.f6971a;
    }

    public String toString() {
        return "RxBeaconRange{beacons=" + this.f6971a + ", region=" + this.f6972b + '}';
    }
}
