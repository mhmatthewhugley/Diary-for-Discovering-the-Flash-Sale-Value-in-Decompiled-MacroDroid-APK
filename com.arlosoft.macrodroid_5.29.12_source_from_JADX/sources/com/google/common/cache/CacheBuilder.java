package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CacheBuilder<K, V> {

    /* renamed from: q */
    static final Supplier<? extends AbstractCache.StatsCounter> f4277q = Suppliers.m5475a(new AbstractCache.StatsCounter() {
        /* renamed from: a */
        public void mo22276a(int i) {
        }

        /* renamed from: b */
        public void mo22277b(int i) {
        }

        /* renamed from: c */
        public void mo22278c() {
        }

        /* renamed from: d */
        public void mo22279d(long j) {
        }

        /* renamed from: e */
        public void mo22280e(long j) {
        }
    });

    /* renamed from: r */
    static final CacheStats f4278r = new CacheStats(0, 0, 0, 0, 0, 0);

    /* renamed from: s */
    static final Supplier<AbstractCache.StatsCounter> f4279s = new Supplier<AbstractCache.StatsCounter>() {
        /* renamed from: a */
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    };

    /* renamed from: t */
    static final Ticker f4280t = new Ticker() {
        /* renamed from: a */
        public long mo22274a() {
            return 0;
        }
    };

    /* renamed from: u */
    private static final Logger f4281u = Logger.getLogger(CacheBuilder.class.getName());

    /* renamed from: a */
    boolean f4282a = true;

    /* renamed from: b */
    int f4283b = -1;

    /* renamed from: c */
    int f4284c = -1;

    /* renamed from: d */
    long f4285d = -1;

    /* renamed from: e */
    long f4286e = -1;

    /* renamed from: f */
    Weigher<? super K, ? super V> f4287f;

    /* renamed from: g */
    LocalCache.Strength f4288g;

    /* renamed from: h */
    LocalCache.Strength f4289h;

    /* renamed from: i */
    long f4290i = -1;

    /* renamed from: j */
    long f4291j = -1;

    /* renamed from: k */
    long f4292k = -1;

    /* renamed from: l */
    Equivalence<Object> f4293l;

    /* renamed from: m */
    Equivalence<Object> f4294m;

    /* renamed from: n */
    RemovalListener<? super K, ? super V> f4295n;

    /* renamed from: o */
    Ticker f4296o;

    /* renamed from: p */
    Supplier<? extends AbstractCache.StatsCounter> f4297p = f4277q;

    enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        /* renamed from: b */
        public void mo22313b(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        /* renamed from: b */
        public int mo22314b(Object obj, Object obj2) {
            return 1;
        }
    }

    private CacheBuilder() {
    }

    /* renamed from: c */
    private void m5514c() {
        Preconditions.m5399z(this.f4292k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    /* renamed from: d */
    private void m5515d() {
        boolean z = true;
        if (this.f4287f == null) {
            if (this.f4286e != -1) {
                z = false;
            }
            Preconditions.m5399z(z, "maximumWeight requires weigher");
        } else if (this.f4282a) {
            if (this.f4286e == -1) {
                z = false;
            }
            Preconditions.m5399z(z, "weigher requires maximumWeight");
        } else if (this.f4286e == -1) {
            f4281u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @CheckReturnValue
    /* renamed from: y */
    public static CacheBuilder<Object, Object> m5516y() {
        return new CacheBuilder<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public CacheBuilder<K, V> mo22282A(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f4288g;
        Preconditions.m5372C(strength2 == null, "Key strength was already set to %s", strength2);
        this.f4288g = (LocalCache.Strength) Preconditions.m5392s(strength);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public CacheBuilder<K, V> mo22283B(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.f4289h;
        Preconditions.m5372C(strength2 == null, "Value strength was already set to %s", strength2);
        this.f4289h = (LocalCache.Strength) Preconditions.m5392s(strength);
        return this;
    }

    /* renamed from: C */
    public CacheBuilder<K, V> mo22284C(Ticker ticker) {
        Preconditions.m5398y(this.f4296o == null);
        this.f4296o = (Ticker) Preconditions.m5392s(ticker);
        return this;
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: D */
    public CacheBuilder<K, V> mo22285D(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f4294m;
        Preconditions.m5372C(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f4294m = (Equivalence) Preconditions.m5392s(equivalence);
        return this;
    }

    @GwtIncompatible
    /* renamed from: E */
    public CacheBuilder<K, V> mo22286E() {
        return mo22282A(LocalCache.Strength.WEAK);
    }

    @GwtIncompatible
    /* renamed from: F */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> mo22287F(Weigher<? super K1, ? super V1> weigher) {
        boolean z = true;
        Preconditions.m5398y(this.f4287f == null);
        if (this.f4282a) {
            long j = this.f4285d;
            if (j != -1) {
                z = false;
            }
            Preconditions.m5371B(z, "weigher can not be combined with maximum size", j);
        }
        this.f4287f = (Weigher) Preconditions.m5392s(weigher);
        return this;
    }

    @CheckReturnValue
    /* renamed from: a */
    public <K1 extends K, V1 extends V> Cache<K1, V1> mo22288a() {
        m5515d();
        m5514c();
        return new LocalCache.LocalManualCache(this);
    }

    @CheckReturnValue
    /* renamed from: b */
    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> mo22289b(CacheLoader<? super K1, V1> cacheLoader) {
        m5515d();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    /* renamed from: e */
    public CacheBuilder<K, V> mo22290e(int i) {
        int i2 = this.f4284c;
        boolean z = true;
        Preconditions.m5370A(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z = false;
        }
        Preconditions.m5377d(z);
        this.f4284c = i;
        return this;
    }

    /* renamed from: f */
    public CacheBuilder<K, V> mo22291f(long j, TimeUnit timeUnit) {
        long j2 = this.f4291j;
        boolean z = true;
        Preconditions.m5371B(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        Preconditions.m5384k(z, "duration cannot be negative: %s %s", j, timeUnit);
        this.f4291j = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: g */
    public CacheBuilder<K, V> mo22292g(long j, TimeUnit timeUnit) {
        long j2 = this.f4290i;
        boolean z = true;
        Preconditions.m5371B(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        Preconditions.m5384k(z, "duration cannot be negative: %s %s", j, timeUnit);
        this.f4290i = timeUnit.toNanos(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo22293h() {
        int i = this.f4284c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo22294i() {
        long j = this.f4291j;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo22295j() {
        long j = this.f4290i;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo22296k() {
        int i = this.f4283b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Equivalence<Object> mo22297l() {
        return (Equivalence) MoreObjects.m5332a(this.f4293l, mo22298m().mo22507d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public LocalCache.Strength mo22298m() {
        return (LocalCache.Strength) MoreObjects.m5332a(this.f4288g, LocalCache.Strength.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public long mo22299n() {
        if (this.f4290i == 0 || this.f4291j == 0) {
            return 0;
        }
        return this.f4287f == null ? this.f4285d : this.f4286e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo22300o() {
        long j = this.f4292k;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <K1 extends K, V1 extends V> RemovalListener<K1, V1> mo22301p() {
        return (RemovalListener) MoreObjects.m5332a(this.f4295n, NullListener.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Supplier<? extends AbstractCache.StatsCounter> mo22302q() {
        return this.f4297p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Ticker mo22303r(boolean z) {
        Ticker ticker = this.f4296o;
        if (ticker != null) {
            return ticker;
        }
        return z ? Ticker.m5495b() : f4280t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Equivalence<Object> mo22304s() {
        return (Equivalence) MoreObjects.m5332a(this.f4294m, mo22305t().mo22507d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public LocalCache.Strength mo22305t() {
        return (LocalCache.Strength) MoreObjects.m5332a(this.f4289h, LocalCache.Strength.STRONG);
    }

    public String toString() {
        MoreObjects.ToStringHelper c = MoreObjects.m5334c(this);
        int i = this.f4283b;
        if (i != -1) {
            c.mo22192b("initialCapacity", i);
        }
        int i2 = this.f4284c;
        if (i2 != -1) {
            c.mo22192b("concurrencyLevel", i2);
        }
        long j = this.f4285d;
        if (j != -1) {
            c.mo22193c("maximumSize", j);
        }
        long j2 = this.f4286e;
        if (j2 != -1) {
            c.mo22193c("maximumWeight", j2);
        }
        long j3 = this.f4290i;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            c.mo22194d("expireAfterWrite", sb.toString());
        }
        long j4 = this.f4291j;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            c.mo22194d("expireAfterAccess", sb2.toString());
        }
        LocalCache.Strength strength = this.f4288g;
        if (strength != null) {
            c.mo22194d("keyStrength", Ascii.m5147c(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f4289h;
        if (strength2 != null) {
            c.mo22194d("valueStrength", Ascii.m5147c(strength2.toString()));
        }
        if (this.f4293l != null) {
            c.mo22196k("keyEquivalence");
        }
        if (this.f4294m != null) {
            c.mo22196k("valueEquivalence");
        }
        if (this.f4295n != null) {
            c.mo22196k("removalListener");
        }
        return c.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <K1 extends K, V1 extends V> Weigher<K1, V1> mo22307u() {
        return (Weigher) MoreObjects.m5332a(this.f4287f, OneWeigher.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: v */
    public CacheBuilder<K, V> mo22308v(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f4293l;
        Preconditions.m5372C(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f4293l = (Equivalence) Preconditions.m5392s(equivalence);
        return this;
    }

    /* renamed from: w */
    public CacheBuilder<K, V> mo22309w(long j) {
        long j2 = this.f4285d;
        boolean z = true;
        Preconditions.m5371B(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f4286e;
        Preconditions.m5371B(j3 == -1, "maximum weight was already set to %s", j3);
        Preconditions.m5399z(this.f4287f == null, "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        Preconditions.m5378e(z, "maximum size must not be negative");
        this.f4285d = j;
        return this;
    }

    @GwtIncompatible
    /* renamed from: x */
    public CacheBuilder<K, V> mo22310x(long j) {
        long j2 = this.f4286e;
        boolean z = true;
        Preconditions.m5371B(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.f4285d;
        Preconditions.m5371B(j3 == -1, "maximum size was already set to %s", j3);
        if (j < 0) {
            z = false;
        }
        Preconditions.m5378e(z, "maximum weight must not be negative");
        this.f4286e = j;
        return this;
    }

    @CheckReturnValue
    /* renamed from: z */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> mo22311z(RemovalListener<? super K1, ? super V1> removalListener) {
        Preconditions.m5398y(this.f4295n == null);
        this.f4295n = (RemovalListener) Preconditions.m5392s(removalListener);
        return this;
    }
}
