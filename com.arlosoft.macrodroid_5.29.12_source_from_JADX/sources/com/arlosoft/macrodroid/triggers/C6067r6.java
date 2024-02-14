package com.arlosoft.macrodroid.triggers;

import kotlin.jvm.internal.C13706o;
import org.altbeacon.beacon.Region;

/* renamed from: com.arlosoft.macrodroid.triggers.r6 */
/* compiled from: BluetoothBeaconTrigger.kt */
public final class C6067r6 {

    /* renamed from: a */
    private final Region f14341a;

    /* renamed from: b */
    private final int f14342b;

    public C6067r6(Region region, int i) {
        C13706o.m87929f(region, "region");
        this.f14341a = region;
        this.f14342b = i;
    }

    /* renamed from: b */
    public static /* synthetic */ C6067r6 m24018b(C6067r6 r6Var, Region region, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            region = r6Var.f14341a;
        }
        if ((i2 & 2) != 0) {
            i = r6Var.f14342b;
        }
        return r6Var.mo31917a(region, i);
    }

    /* renamed from: a */
    public final C6067r6 mo31917a(Region region, int i) {
        C13706o.m87929f(region, "region");
        return new C6067r6(region, i);
    }

    /* renamed from: c */
    public final int mo31918c() {
        return this.f14342b;
    }

    /* renamed from: d */
    public final Region mo31919d() {
        return this.f14341a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6067r6)) {
            return false;
        }
        C6067r6 r6Var = (C6067r6) obj;
        return C13706o.m87924a(this.f14341a, r6Var.f14341a) && this.f14342b == r6Var.f14342b;
    }

    public int hashCode() {
        return (this.f14341a.hashCode() * 31) + this.f14342b;
    }

    public String toString() {
        return "RegionWithCount(region=" + this.f14341a + ", count=" + this.f14342b + ')';
    }
}
