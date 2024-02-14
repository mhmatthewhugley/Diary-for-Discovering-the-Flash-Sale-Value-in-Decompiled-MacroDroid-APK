package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Stopwatch {

    /* renamed from: a */
    private final Ticker f4246a = Ticker.m5495b();

    /* renamed from: b */
    private boolean f4247b;

    /* renamed from: c */
    private long f4248c;

    /* renamed from: d */
    private long f4249d;

    /* renamed from: com.google.common.base.Stopwatch$1 */
    static /* synthetic */ class C17741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4250a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4250a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4250a     // Catch:{ NoSuchFieldError -> 0x0054 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Stopwatch.C17741.<clinit>():void");
        }
    }

    Stopwatch() {
    }

    /* renamed from: a */
    private static String m5461a(TimeUnit timeUnit) {
        switch (C17741.f4250a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static TimeUnit m5462b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* renamed from: c */
    public static Stopwatch m5463c() {
        return new Stopwatch().mo22255i();
    }

    /* renamed from: d */
    public static Stopwatch m5464d() {
        return new Stopwatch();
    }

    /* renamed from: f */
    private long m5465f() {
        return this.f4247b ? (this.f4246a.mo22274a() - this.f4249d) + this.f4248c : this.f4248c;
    }

    /* renamed from: e */
    public long mo22252e(TimeUnit timeUnit) {
        return timeUnit.convert(m5465f(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: g */
    public boolean mo22253g() {
        return this.f4247b;
    }

    @CanIgnoreReturnValue
    /* renamed from: h */
    public Stopwatch mo22254h() {
        this.f4248c = 0;
        this.f4247b = false;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: i */
    public Stopwatch mo22255i() {
        Preconditions.m5399z(!this.f4247b, "This stopwatch is already running.");
        this.f4247b = true;
        this.f4249d = this.f4246a.mo22274a();
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public Stopwatch mo22256j() {
        long a = this.f4246a.mo22274a();
        Preconditions.m5399z(this.f4247b, "This stopwatch is already stopped.");
        this.f4247b = false;
        this.f4248c += a - this.f4249d;
        return this;
    }

    public String toString() {
        long f = m5465f();
        TimeUnit b = m5462b(f);
        String c = Platform.m5365c(((double) f) / ((double) TimeUnit.NANOSECONDS.convert(1, b)));
        String a = m5461a(b);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1 + String.valueOf(a).length());
        sb.append(c);
        sb.append(" ");
        sb.append(a);
        return sb.toString();
    }
}
