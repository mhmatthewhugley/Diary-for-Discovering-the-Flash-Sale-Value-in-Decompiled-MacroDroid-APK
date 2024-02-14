package p292io.grpc;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.s */
/* compiled from: Deadline */
public final class C12977s implements Comparable<C12977s> {

    /* renamed from: f */
    private static final C12979b f60704f = new C12979b();

    /* renamed from: g */
    private static final long f60705g;

    /* renamed from: o */
    private static final long f60706o;

    /* renamed from: p */
    private static final long f60707p = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    private final C12980c f60708a;

    /* renamed from: c */
    private final long f60709c;

    /* renamed from: d */
    private volatile boolean f60710d;

    /* renamed from: io.grpc.s$b */
    /* compiled from: Deadline */
    private static class C12979b extends C12980c {
        private C12979b() {
        }

        /* renamed from: a */
        public long mo69812a() {
            return System.nanoTime();
        }
    }

    /* renamed from: io.grpc.s$c */
    /* compiled from: Deadline */
    public static abstract class C12980c {
        /* renamed from: a */
        public abstract long mo69812a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f60705g = nanos;
        f60706o = -nanos;
    }

    private C12977s(C12980c cVar, long j, boolean z) {
        this(cVar, cVar.mo69812a(), j, z);
    }

    /* renamed from: b */
    public static C12977s m85131b(long j, TimeUnit timeUnit) {
        return m85132d(j, timeUnit, f60704f);
    }

    /* renamed from: d */
    public static C12977s m85132d(long j, TimeUnit timeUnit, C12980c cVar) {
        m85133e(timeUnit, "units");
        return new C12977s(cVar, timeUnit.toNanos(j), true);
    }

    /* renamed from: e */
    private static <T> T m85133e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: f */
    private void m85134f(C12977s sVar) {
        if (this.f60708a != sVar.f60708a) {
            throw new AssertionError("Tickers (" + this.f60708a + " and " + sVar.f60708a + ") don't match. Custom Ticker should only be used in tests!");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12977s)) {
            return false;
        }
        C12977s sVar = (C12977s) obj;
        C12980c cVar = this.f60708a;
        if (cVar != null ? cVar == sVar.f60708a : sVar.f60708a == null) {
            return this.f60709c == sVar.f60709c;
        }
        return false;
    }

    /* renamed from: g */
    public int compareTo(C12977s sVar) {
        m85134f(sVar);
        int i = ((this.f60709c - sVar.f60709c) > 0 ? 1 : ((this.f60709c - sVar.f60709c) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public int hashCode() {
        return Arrays.asList(new Object[]{this.f60708a, Long.valueOf(this.f60709c)}).hashCode();
    }

    /* renamed from: i */
    public boolean mo69807i(C12977s sVar) {
        m85134f(sVar);
        return this.f60709c - sVar.f60709c < 0;
    }

    /* renamed from: j */
    public boolean mo69808j() {
        if (!this.f60710d) {
            if (this.f60709c - this.f60708a.mo69812a() > 0) {
                return false;
            }
            this.f60710d = true;
        }
        return true;
    }

    /* renamed from: k */
    public C12977s mo69809k(C12977s sVar) {
        m85134f(sVar);
        return mo69807i(sVar) ? this : sVar;
    }

    /* renamed from: l */
    public long mo69810l(TimeUnit timeUnit) {
        long a = this.f60708a.mo69812a();
        if (!this.f60710d && this.f60709c - a <= 0) {
            this.f60710d = true;
        }
        return timeUnit.convert(this.f60709c - a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long l = mo69810l(TimeUnit.NANOSECONDS);
        long abs = Math.abs(l);
        long j = f60707p;
        long j2 = abs / j;
        long abs2 = Math.abs(l) % j;
        StringBuilder sb = new StringBuilder();
        if (l < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb.append("s from now");
        if (this.f60708a != f60704f) {
            sb.append(" (ticker=" + this.f60708a + ")");
        }
        return sb.toString();
    }

    private C12977s(C12980c cVar, long j, long j2, boolean z) {
        this.f60708a = cVar;
        long min = Math.min(f60705g, Math.max(f60706o, j2));
        this.f60709c = j + min;
        this.f60710d = z && min <= 0;
    }
}
