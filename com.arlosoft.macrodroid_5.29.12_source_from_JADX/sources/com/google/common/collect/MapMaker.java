package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* renamed from: a */
    boolean f16855a;

    /* renamed from: b */
    int f16856b = -1;

    /* renamed from: c */
    int f16857c = -1;

    /* renamed from: d */
    MapMakerInternalMap.Strength f16858d;

    /* renamed from: e */
    MapMakerInternalMap.Strength f16859e;

    /* renamed from: f */
    Equivalence<Object> f16860f;

    enum Dummy {
        VALUE
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public MapMaker mo35778a(int i) {
        int i2 = this.f16857c;
        boolean z = true;
        Preconditions.m5370A(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z = false;
        }
        Preconditions.m5377d(z);
        this.f16857c = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo35779b() {
        int i = this.f16857c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo35780c() {
        int i = this.f16856b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Equivalence<Object> mo35781d() {
        return (Equivalence) MoreObjects.m5332a(this.f16860f, mo35782e().mo35893d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public MapMakerInternalMap.Strength mo35782e() {
        return (MapMakerInternalMap.Strength) MoreObjects.m5332a(this.f16858d, MapMakerInternalMap.Strength.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public MapMakerInternalMap.Strength mo35783f() {
        return (MapMakerInternalMap.Strength) MoreObjects.m5332a(this.f16859e, MapMakerInternalMap.Strength.STRONG);
    }

    @CanIgnoreReturnValue
    /* renamed from: g */
    public MapMaker mo35784g(int i) {
        int i2 = this.f16856b;
        boolean z = true;
        Preconditions.m5370A(i2 == -1, "initial capacity was already set to %s", i2);
        if (i < 0) {
            z = false;
        }
        Preconditions.m5377d(z);
        this.f16856b = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    @CanIgnoreReturnValue
    /* renamed from: h */
    public MapMaker mo35785h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f16860f;
        Preconditions.m5372C(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f16860f = (Equivalence) Preconditions.m5392s(equivalence);
        this.f16855a = true;
        return this;
    }

    /* renamed from: i */
    public <K, V> ConcurrentMap<K, V> mo35786i() {
        if (!this.f16855a) {
            return new ConcurrentHashMap(mo35780c(), 0.75f, mo35779b());
        }
        return MapMakerInternalMap.m27870b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public MapMaker mo35787j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f16858d;
        Preconditions.m5372C(strength2 == null, "Key strength was already set to %s", strength2);
        this.f16858d = (MapMakerInternalMap.Strength) Preconditions.m5392s(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f16855a = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public MapMaker mo35788k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f16859e;
        Preconditions.m5372C(strength2 == null, "Value strength was already set to %s", strength2);
        this.f16859e = (MapMakerInternalMap.Strength) Preconditions.m5392s(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f16855a = true;
        }
        return this;
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    /* renamed from: l */
    public MapMaker mo35789l() {
        return mo35787j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        MoreObjects.ToStringHelper c = MoreObjects.m5334c(this);
        int i = this.f16856b;
        if (i != -1) {
            c.mo22192b("initialCapacity", i);
        }
        int i2 = this.f16857c;
        if (i2 != -1) {
            c.mo22192b("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f16858d;
        if (strength != null) {
            c.mo22194d("keyStrength", Ascii.m5147c(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f16859e;
        if (strength2 != null) {
            c.mo22194d("valueStrength", Ascii.m5147c(strength2.toString()));
        }
        if (this.f16860f != null) {
            c.mo22196k("keyEquivalence");
        }
        return c.toString();
    }
}
