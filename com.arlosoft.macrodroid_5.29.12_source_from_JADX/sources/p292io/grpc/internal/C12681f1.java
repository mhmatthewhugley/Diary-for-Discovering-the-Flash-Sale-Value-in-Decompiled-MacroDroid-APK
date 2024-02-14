package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12844w1;

/* renamed from: io.grpc.internal.f1 */
/* compiled from: ManagedChannelServiceConfig */
final class C12681f1 {

    /* renamed from: a */
    private final Map<String, C12682a> f59883a;

    /* renamed from: b */
    private final Map<String, C12682a> f59884b;

    /* renamed from: c */
    private final C12844w1.C12872x f59885c;

    /* renamed from: d */
    private final Object f59886d;

    /* renamed from: io.grpc.internal.f1$a */
    /* compiled from: ManagedChannelServiceConfig */
    static final class C12682a {

        /* renamed from: a */
        final Long f59887a;

        /* renamed from: b */
        final Boolean f59888b;

        /* renamed from: c */
        final Integer f59889c;

        /* renamed from: d */
        final Integer f59890d;

        /* renamed from: e */
        final C12876x1 f59891e;

        /* renamed from: f */
        final C12782q0 f59892f;

        C12682a(Map<String, ?> map, boolean z, int i, int i2) {
            this.f59887a = C12612b2.m83928u(map);
            this.f59888b = C12612b2.m83929v(map);
            Integer k = C12612b2.m83918k(map);
            this.f59889c = k;
            boolean z2 = true;
            if (k != null) {
                Preconditions.m5385l(k.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", k);
            }
            Integer j = C12612b2.m83917j(map);
            this.f59890d = j;
            if (j != null) {
                Preconditions.m5385l(j.intValue() < 0 ? false : z2, "maxOutboundMessageSize %s exceeds bounds", j);
            }
            Map<String, ?> map2 = null;
            Map<String, ?> p = z ? C12612b2.m83923p(map) : null;
            this.f59891e = p == null ? C12876x1.f60381f : m84157b(p, i);
            map2 = z ? C12612b2.m83910c(map) : map2;
            this.f59892f = map2 == null ? C12782q0.f60154d : m84156a(map2, i2);
        }

        /* renamed from: a */
        private static C12782q0 m84156a(Map<String, ?> map, int i) {
            int intValue = ((Integer) Preconditions.m5393t(C12612b2.m83914g(map), "maxAttempts cannot be empty")).intValue();
            boolean z = true;
            Preconditions.m5381h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) Preconditions.m5393t(C12612b2.m83909b(map), "hedgingDelay cannot be empty")).longValue();
            if (longValue < 0) {
                z = false;
            }
            Preconditions.m5383j(z, "hedgingDelay must not be negative: %s", longValue);
            return new C12782q0(min, longValue, C12612b2.m83922o(map));
        }

        /* renamed from: b */
        private static C12876x1 m84157b(Map<String, ?> map, int i) {
            int intValue = ((Integer) Preconditions.m5393t(C12612b2.m83915h(map), "maxAttempts cannot be empty")).intValue();
            boolean z = true;
            Preconditions.m5381h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) Preconditions.m5393t(C12612b2.m83911d(map), "initialBackoff cannot be empty")).longValue();
            Preconditions.m5383j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) Preconditions.m5393t(C12612b2.m83916i(map), "maxBackoff cannot be empty")).longValue();
            Preconditions.m5383j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) Preconditions.m5393t(C12612b2.m83908a(map), "backoffMultiplier cannot be empty")).doubleValue();
            if (doubleValue <= 0.0d) {
                z = false;
            }
            Preconditions.m5385l(z, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            return new C12876x1(min, longValue, longValue2, doubleValue, C12612b2.m83924q(map));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12682a)) {
                return false;
            }
            C12682a aVar = (C12682a) obj;
            if (!Objects.m5349a(this.f59887a, aVar.f59887a) || !Objects.m5349a(this.f59888b, aVar.f59888b) || !Objects.m5349a(this.f59889c, aVar.f59889c) || !Objects.m5349a(this.f59890d, aVar.f59890d) || !Objects.m5349a(this.f59891e, aVar.f59891e) || !Objects.m5349a(this.f59892f, aVar.f59892f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f59887a, this.f59888b, this.f59889c, this.f59890d, this.f59891e, this.f59892f);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("timeoutNanos", this.f59887a).mo22194d("waitForReady", this.f59888b).mo22194d("maxInboundMessageSize", this.f59889c).mo22194d("maxOutboundMessageSize", this.f59890d).mo22194d("retryPolicy", this.f59891e).mo22194d("hedgingPolicy", this.f59892f).toString();
        }
    }

    C12681f1(Map<String, C12682a> map, Map<String, C12682a> map2, C12844w1.C12872x xVar, Object obj) {
        this.f59883a = Collections.unmodifiableMap(new HashMap(map));
        this.f59884b = Collections.unmodifiableMap(new HashMap(map2));
        this.f59885c = xVar;
        this.f59886d = obj;
    }

    /* renamed from: a */
    static C12681f1 m84150a() {
        return new C12681f1(new HashMap(), new HashMap(), (C12844w1.C12872x) null, (Object) null);
    }

    /* renamed from: b */
    static C12681f1 m84151b(Map<String, ?> map, boolean z, int i, int i2, Object obj) {
        C12844w1.C12872x t = z ? C12612b2.m83927t(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<Map<String, ?>> l = C12612b2.m83919l(map);
        if (l == null) {
            return new C12681f1(hashMap, hashMap2, t, obj);
        }
        for (Map next : l) {
            C12682a aVar = new C12682a(next, z, i, i2);
            List<Map<String, ?>> n = C12612b2.m83921n(next);
            Preconditions.m5385l(n != null && !n.isEmpty(), "no names in method config %s", next);
            for (Map next2 : n) {
                String r = C12612b2.m83925r(next2);
                Preconditions.m5378e(!Strings.m5472b(r), "missing service name");
                String m = C12612b2.m83920m(next2);
                if (Strings.m5472b(m)) {
                    Preconditions.m5385l(!hashMap2.containsKey(r), "Duplicate service %s", r);
                    hashMap2.put(r, aVar);
                } else {
                    String b = C12972r0.m85113b(r, m);
                    Preconditions.m5385l(!hashMap.containsKey(b), "Duplicate method name %s", b);
                    hashMap.put(b, aVar);
                }
            }
        }
        return new C12681f1(hashMap, hashMap2, t, obj);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public Object mo69390c() {
        return this.f59886d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12844w1.C12872x mo69391d() {
        return this.f59885c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, C12682a> mo69392e() {
        return this.f59884b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12681f1.class != obj.getClass()) {
            return false;
        }
        C12681f1 f1Var = (C12681f1) obj;
        if (!Objects.m5349a(this.f59883a, f1Var.f59883a) || !Objects.m5349a(this.f59884b, f1Var.f59884b) || !Objects.m5349a(this.f59885c, f1Var.f59885c) || !Objects.m5349a(this.f59886d, f1Var.f59886d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, C12682a> mo69394f() {
        return this.f59883a;
    }

    public int hashCode() {
        return Objects.m5350b(this.f59883a, this.f59884b, this.f59885c, this.f59886d);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("serviceMethodMap", this.f59883a).mo22194d("serviceMap", this.f59884b).mo22194d("retryThrottling", this.f59885c).mo22194d("loadBalancingConfig", this.f59886d).toString();
    }
}
