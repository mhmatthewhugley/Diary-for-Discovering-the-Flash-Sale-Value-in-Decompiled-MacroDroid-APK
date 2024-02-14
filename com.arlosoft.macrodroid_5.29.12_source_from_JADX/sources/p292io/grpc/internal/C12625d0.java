package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p292io.grpc.internal.C12717j;

/* renamed from: io.grpc.internal.d0 */
/* compiled from: ExponentialBackoffPolicy */
public final class C12625d0 implements C12717j {

    /* renamed from: a */
    private Random f59693a = new Random();

    /* renamed from: b */
    private long f59694b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private long f59695c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private double f59696d = 1.6d;

    /* renamed from: e */
    private double f59697e = 0.2d;

    /* renamed from: f */
    private long f59698f = this.f59694b;

    /* renamed from: io.grpc.internal.d0$a */
    /* compiled from: ExponentialBackoffPolicy */
    public static final class C12626a implements C12717j.C12718a {
        public C12717j get() {
            return new C12625d0();
        }
    }

    /* renamed from: b */
    private long m83970b(double d, double d2) {
        Preconditions.m5377d(d2 >= d);
        return (long) ((this.f59693a.nextDouble() * (d2 - d)) + d);
    }

    /* renamed from: a */
    public long mo69262a() {
        long j = this.f59698f;
        double d = (double) j;
        this.f59698f = Math.min((long) (this.f59696d * d), this.f59695c);
        double d2 = this.f59697e;
        return j + m83970b((-d2) * d, d2 * d);
    }
}
