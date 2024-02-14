package p292io.grpc;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.f0 */
/* compiled from: InternalLogId */
public final class C12560f0 {

    /* renamed from: d */
    private static final AtomicLong f59495d = new AtomicLong();

    /* renamed from: a */
    private final String f59496a;

    /* renamed from: b */
    private final String f59497b;

    /* renamed from: c */
    private final long f59498c;

    C12560f0(String str, String str2, long j) {
        Preconditions.m5393t(str, "typeName");
        Preconditions.m5378e(!str.isEmpty(), "empty type");
        this.f59496a = str;
        this.f59497b = str2;
        this.f59498c = j;
    }

    /* renamed from: a */
    public static C12560f0 m83768a(Class<?> cls, String str) {
        return m83769b(m83770c(cls), str);
    }

    /* renamed from: b */
    public static C12560f0 m83769b(String str, String str2) {
        return new C12560f0(str, str2, m83771e());
    }

    /* renamed from: c */
    private static String m83770c(Class<?> cls) {
        String simpleName = ((Class) Preconditions.m5393t(cls, "type")).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    static long m83771e() {
        return f59495d.incrementAndGet();
    }

    /* renamed from: d */
    public long mo69134d() {
        return this.f59498c;
    }

    /* renamed from: f */
    public String mo69135f() {
        return this.f59496a + "<" + this.f59498c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo69135f());
        if (this.f59497b != null) {
            sb.append(": (");
            sb.append(this.f59497b);
            sb.append(')');
        }
        return sb.toString();
    }
}
