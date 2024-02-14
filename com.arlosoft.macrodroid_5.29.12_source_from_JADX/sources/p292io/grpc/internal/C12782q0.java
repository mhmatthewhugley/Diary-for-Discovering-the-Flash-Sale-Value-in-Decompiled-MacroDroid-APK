package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.Set;
import p292io.grpc.C12537b1;

/* renamed from: io.grpc.internal.q0 */
/* compiled from: HedgingPolicy */
final class C12782q0 {

    /* renamed from: d */
    static final C12782q0 f60154d = new C12782q0(1, 0, Collections.emptySet());

    /* renamed from: a */
    final int f60155a;

    /* renamed from: b */
    final long f60156b;

    /* renamed from: c */
    final Set<C12537b1.C12539b> f60157c;

    /* renamed from: io.grpc.internal.q0$a */
    /* compiled from: HedgingPolicy */
    interface C12783a {
        C12782q0 get();
    }

    C12782q0(int i, long j, Set<C12537b1.C12539b> set) {
        this.f60155a = i;
        this.f60156b = j;
        this.f60157c = ImmutableSet.m27516u(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12782q0.class != obj.getClass()) {
            return false;
        }
        C12782q0 q0Var = (C12782q0) obj;
        if (this.f60155a == q0Var.f60155a && this.f60156b == q0Var.f60156b && Objects.m5349a(this.f60157c, q0Var.f60157c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m5350b(Integer.valueOf(this.f60155a), Long.valueOf(this.f60156b), this.f60157c);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22192b("maxAttempts", this.f60155a).mo22193c("hedgingDelayNanos", this.f60156b).mo22194d("nonFatalStatusCodes", this.f60157c).toString();
    }
}
