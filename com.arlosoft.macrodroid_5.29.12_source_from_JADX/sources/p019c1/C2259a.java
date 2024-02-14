package p019c1;

import com.arlosoft.macrodroid.beacons.BeaconWithName;
import java.util.ArrayList;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: c1.a */
/* compiled from: BeaconWithName.kt */
public final class C2259a {

    /* renamed from: a */
    private final ArrayList<BeaconWithName> f6955a;

    public C2259a() {
        this((ArrayList) null, 1, (C13695i) null);
    }

    public C2259a(ArrayList<BeaconWithName> arrayList) {
        C13706o.m87929f(arrayList, "beacons");
        this.f6955a = arrayList;
    }

    /* renamed from: a */
    public final ArrayList<BeaconWithName> mo24551a() {
        return this.f6955a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2259a) && C13706o.m87924a(this.f6955a, ((C2259a) obj).f6955a);
    }

    public int hashCode() {
        return this.f6955a.hashCode();
    }

    public String toString() {
        return "BeaconList(beacons=" + this.f6955a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2259a(ArrayList arrayList, int i, C13695i iVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
