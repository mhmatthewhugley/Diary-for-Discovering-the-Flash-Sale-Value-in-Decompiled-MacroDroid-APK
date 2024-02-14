package p292io.grpc.internal;

import androidx.core.app.NotificationCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p292io.grpc.C12537b1;
import p292io.grpc.internal.C12844w1;

/* renamed from: io.grpc.internal.b2 */
/* compiled from: ServiceConfigUtil */
public final class C12612b2 {

    /* renamed from: io.grpc.internal.b2$a */
    /* compiled from: ServiceConfigUtil */
    public static final class C12613a {

        /* renamed from: a */
        private final String f59671a;

        /* renamed from: b */
        private final Map<String, ?> f59672b;

        public C12613a(String str, Map<String, ?> map) {
            this.f59671a = (String) Preconditions.m5393t(str, "policyName");
            this.f59672b = (Map) Preconditions.m5393t(map, "rawConfigValue");
        }

        /* renamed from: a */
        public String mo69233a() {
            return this.f59671a;
        }

        /* renamed from: b */
        public Map<String, ?> mo69234b() {
            return this.f59672b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12613a)) {
                return false;
            }
            C12613a aVar = (C12613a) obj;
            if (!this.f59671a.equals(aVar.f59671a) || !this.f59672b.equals(aVar.f59672b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f59671a, this.f59672b);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("policyName", this.f59671a).mo22194d("rawConfigValue", this.f59672b).toString();
        }
    }

    /* renamed from: a */
    static Double m83908a(Map<String, ?> map) {
        return C12879y0.m84797h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    static Long m83909b(Map<String, ?> map) {
        return C12879y0.m84801l(map, "hedgingDelay");
    }

    /* renamed from: c */
    static Map<String, ?> m83910c(Map<String, ?> map) {
        return C12879y0.m84799j(map, "hedgingPolicy");
    }

    /* renamed from: d */
    static Long m83911d(Map<String, ?> map) {
        return C12879y0.m84801l(map, "initialBackoff");
    }

    /* renamed from: e */
    private static Set<C12537b1.C12539b> m83912e(Map<String, ?> map, String str) {
        List<?> e = C12879y0.m84794e(map, str);
        if (e == null) {
            return null;
        }
        return m83926s(e);
    }

    @VisibleForTesting
    /* renamed from: f */
    public static List<Map<String, ?>> m83913f(Map<String, ?> map) {
        String k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C12879y0.m84795f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k = C12879y0.m84800k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    static Integer m83914g(Map<String, ?> map) {
        return C12879y0.m84798i(map, "maxAttempts");
    }

    /* renamed from: h */
    static Integer m83915h(Map<String, ?> map) {
        return C12879y0.m84798i(map, "maxAttempts");
    }

    /* renamed from: i */
    static Long m83916i(Map<String, ?> map) {
        return C12879y0.m84801l(map, "maxBackoff");
    }

    /* renamed from: j */
    static Integer m83917j(Map<String, ?> map) {
        return C12879y0.m84798i(map, "maxRequestMessageBytes");
    }

    /* renamed from: k */
    static Integer m83918k(Map<String, ?> map) {
        return C12879y0.m84798i(map, "maxResponseMessageBytes");
    }

    /* renamed from: l */
    static List<Map<String, ?>> m83919l(Map<String, ?> map) {
        return C12879y0.m84795f(map, "methodConfig");
    }

    /* renamed from: m */
    static String m83920m(Map<String, ?> map) {
        return C12879y0.m84800k(map, "method");
    }

    /* renamed from: n */
    static List<Map<String, ?>> m83921n(Map<String, ?> map) {
        return C12879y0.m84795f(map, "name");
    }

    /* renamed from: o */
    static Set<C12537b1.C12539b> m83922o(Map<String, ?> map) {
        Set<C12537b1.C12539b> e = m83912e(map, "nonFatalStatusCodes");
        if (e == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C12537b1.C12539b.class));
        }
        Verify.m5498a(!e.contains(C12537b1.C12539b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return e;
    }

    /* renamed from: p */
    static Map<String, ?> m83923p(Map<String, ?> map) {
        return C12879y0.m84799j(map, "retryPolicy");
    }

    /* renamed from: q */
    static Set<C12537b1.C12539b> m83924q(Map<String, ?> map) {
        Set<C12537b1.C12539b> e = m83912e(map, "retryableStatusCodes");
        Verify.m5498a(e != null, "%s is required in retry policy", "retryableStatusCodes");
        Verify.m5498a(!e.isEmpty(), "%s must not be empty", "retryableStatusCodes");
        Verify.m5498a(true ^ e.contains(C12537b1.C12539b.OK), "%s must not contain OK", "retryableStatusCodes");
        return e;
    }

    /* renamed from: r */
    static String m83925r(Map<String, ?> map) {
        return C12879y0.m84800k(map, NotificationCompat.CATEGORY_SERVICE);
    }

    /* renamed from: s */
    private static Set<C12537b1.C12539b> m83926s(List<?> list) {
        C12537b1.C12539b bVar;
        EnumSet<E> noneOf = EnumSet.noneOf(C12537b1.C12539b.class);
        for (Object next : list) {
            if (next instanceof Double) {
                Double d = (Double) next;
                int intValue = d.intValue();
                boolean z = true;
                Verify.m5498a(((double) intValue) == d.doubleValue(), "Status code %s is not integral", next);
                bVar = C12537b1.m83683h(intValue).mo69062m();
                if (bVar.mo69069e() != d.intValue()) {
                    z = false;
                }
                Verify.m5498a(z, "Status code %s is not valid", next);
            } else if (next instanceof String) {
                try {
                    bVar = C12537b1.C12539b.valueOf((String) next);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException("Status code " + next + " is not valid", e);
                }
            } else {
                throw new VerifyException("Can not convert status code " + next + " to Status.Code, because its type is " + next.getClass());
            }
            noneOf.add(bVar);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* renamed from: t */
    static C12844w1.C12872x m83927t(Map<String, ?> map) {
        Map<String, ?> j;
        if (map == null || (j = C12879y0.m84799j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = C12879y0.m84797h(j, "maxTokens").floatValue();
        float floatValue2 = C12879y0.m84797h(j, "tokenRatio").floatValue();
        boolean z = true;
        Preconditions.m5399z(floatValue > 0.0f, "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z = false;
        }
        Preconditions.m5399z(z, "tokenRatio should be greater than zero");
        return new C12844w1.C12872x(floatValue, floatValue2);
    }

    /* renamed from: u */
    static Long m83928u(Map<String, ?> map) {
        return C12879y0.m84801l(map, "timeout");
    }

    /* renamed from: v */
    static Boolean m83929v(Map<String, ?> map) {
        return C12879y0.m84793d(map, "waitForReady");
    }

    /* renamed from: w */
    public static C12613a m83930w(Map<String, ?> map) {
        if (map.size() == 1) {
            String str = (String) map.entrySet().iterator().next().getKey();
            return new C12613a(str, C12879y0.m84799j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }

    /* renamed from: x */
    public static List<C12613a> m83931x(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> w : list) {
            arrayList.add(m83930w(w));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
