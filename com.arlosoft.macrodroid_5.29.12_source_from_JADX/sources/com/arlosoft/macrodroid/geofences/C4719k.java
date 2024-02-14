package com.arlosoft.macrodroid.geofences;

import p014b3.C1405a;

/* renamed from: com.arlosoft.macrodroid.geofences.k */
/* compiled from: GeofenceManager.kt */
public final class C4719k {

    /* renamed from: a */
    private final long f11857a;

    /* renamed from: b */
    private final int f11858b;

    public C4719k(long j, int i) {
        this.f11857a = j;
        this.f11858b = i;
    }

    /* renamed from: a */
    public final long mo29206a() {
        return this.f11857a;
    }

    /* renamed from: b */
    public final int mo29207b() {
        return this.f11858b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4719k)) {
            return false;
        }
        C4719k kVar = (C4719k) obj;
        return this.f11857a == kVar.f11857a && this.f11858b == kVar.f11858b;
    }

    public int hashCode() {
        return (C1405a.m633a(this.f11857a) * 31) + this.f11858b;
    }

    public String toString() {
        return "GeofenceUser(selectableItemId=" + this.f11857a + ", updateRateMs=" + this.f11858b + ')';
    }
}
