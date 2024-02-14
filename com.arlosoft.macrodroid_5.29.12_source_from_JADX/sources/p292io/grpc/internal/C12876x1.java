package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.Set;
import p292io.grpc.C12537b1;

/* renamed from: io.grpc.internal.x1 */
/* compiled from: RetryPolicy */
final class C12876x1 {

    /* renamed from: f */
    static final C12876x1 f60381f = new C12876x1(1, 0, 0, 1.0d, Collections.emptySet());

    /* renamed from: a */
    final int f60382a;

    /* renamed from: b */
    final long f60383b;

    /* renamed from: c */
    final long f60384c;

    /* renamed from: d */
    final double f60385d;

    /* renamed from: e */
    final Set<C12537b1.C12539b> f60386e;

    /* renamed from: io.grpc.internal.x1$a */
    /* compiled from: RetryPolicy */
    interface C12877a {
        C12876x1 get();
    }

    C12876x1(int i, long j, long j2, double d, Set<C12537b1.C12539b> set) {
        this.f60382a = i;
        this.f60383b = j;
        this.f60384c = j2;
        this.f60385d = d;
        this.f60386e = ImmutableSet.m27516u(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12876x1)) {
            return false;
        }
        C12876x1 x1Var = (C12876x1) obj;
        if (this.f60382a == x1Var.f60382a && this.f60383b == x1Var.f60383b && this.f60384c == x1Var.f60384c && Double.compare(this.f60385d, x1Var.f60385d) == 0 && Objects.m5349a(this.f60386e, x1Var.f60386e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m5350b(Integer.valueOf(this.f60382a), Long.valueOf(this.f60383b), Long.valueOf(this.f60384c), Double.valueOf(this.f60385d), this.f60386e);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22192b("maxAttempts", this.f60382a).mo22193c("initialBackoffNanos", this.f60383b).mo22193c("maxBackoffNanos", this.f60384c).mo22191a("backoffMultiplier", this.f60385d).mo22194d("retryableStatusCodes", this.f60386e).toString();
    }
}
