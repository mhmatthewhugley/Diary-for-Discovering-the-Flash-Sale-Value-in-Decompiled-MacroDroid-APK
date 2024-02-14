package p292io.grpc;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import org.apache.commons.p353io.IOUtils;
import p292io.grpc.C12960q0;

/* renamed from: io.grpc.b1 */
/* compiled from: Status */
public final class C12537b1 {

    /* renamed from: d */
    private static final boolean f59405d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final List<C12537b1> f59406e = m83681f();

    /* renamed from: f */
    public static final C12537b1 f59407f = C12539b.OK.mo69068d();

    /* renamed from: g */
    public static final C12537b1 f59408g = C12539b.CANCELLED.mo69068d();

    /* renamed from: h */
    public static final C12537b1 f59409h = C12539b.UNKNOWN.mo69068d();

    /* renamed from: i */
    public static final C12537b1 f59410i = C12539b.INVALID_ARGUMENT.mo69068d();

    /* renamed from: j */
    public static final C12537b1 f59411j = C12539b.DEADLINE_EXCEEDED.mo69068d();

    /* renamed from: k */
    public static final C12537b1 f59412k = C12539b.NOT_FOUND.mo69068d();

    /* renamed from: l */
    public static final C12537b1 f59413l = C12539b.ALREADY_EXISTS.mo69068d();

    /* renamed from: m */
    public static final C12537b1 f59414m = C12539b.PERMISSION_DENIED.mo69068d();

    /* renamed from: n */
    public static final C12537b1 f59415n = C12539b.UNAUTHENTICATED.mo69068d();

    /* renamed from: o */
    public static final C12537b1 f59416o = C12539b.RESOURCE_EXHAUSTED.mo69068d();

    /* renamed from: p */
    public static final C12537b1 f59417p = C12539b.FAILED_PRECONDITION.mo69068d();

    /* renamed from: q */
    public static final C12537b1 f59418q = C12539b.ABORTED.mo69068d();

    /* renamed from: r */
    public static final C12537b1 f59419r = C12539b.OUT_OF_RANGE.mo69068d();

    /* renamed from: s */
    public static final C12537b1 f59420s = C12539b.UNIMPLEMENTED.mo69068d();

    /* renamed from: t */
    public static final C12537b1 f59421t = C12539b.INTERNAL.mo69068d();

    /* renamed from: u */
    public static final C12537b1 f59422u = C12539b.UNAVAILABLE.mo69068d();

    /* renamed from: v */
    public static final C12537b1 f59423v = C12539b.DATA_LOSS.mo69068d();

    /* renamed from: w */
    static final C12960q0.C12967g<C12537b1> f59424w = C12960q0.C12967g.m85094g("grpc-status", false, new C12540c());

    /* renamed from: x */
    private static final C12960q0.C12970j<String> f59425x;

    /* renamed from: y */
    static final C12960q0.C12967g<String> f59426y;

    /* renamed from: a */
    private final C12539b f59427a;

    /* renamed from: b */
    private final String f59428b;

    /* renamed from: c */
    private final Throwable f59429c;

    /* renamed from: io.grpc.b1$b */
    /* compiled from: Status */
    public enum C12539b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;
        private final byte[] valueAscii;

        private C12539b(int i) {
            this.value = i;
            this.valueAscii = Integer.toString(i).getBytes(Charsets.f4137a);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public byte[] m83697f() {
            return this.valueAscii;
        }

        /* renamed from: d */
        public C12537b1 mo69068d() {
            return (C12537b1) C12537b1.f59406e.get(this.value);
        }

        /* renamed from: e */
        public int mo69069e() {
            return this.value;
        }
    }

    /* renamed from: io.grpc.b1$c */
    /* compiled from: Status */
    private static final class C12540c implements C12960q0.C12970j<C12537b1> {
        private C12540c() {
        }

        /* renamed from: c */
        public C12537b1 mo69071b(byte[] bArr) {
            return C12537b1.m83684i(bArr);
        }

        /* renamed from: d */
        public byte[] mo69070a(C12537b1 b1Var) {
            return b1Var.mo69062m().m83697f();
        }
    }

    /* renamed from: io.grpc.b1$d */
    /* compiled from: Status */
    private static final class C12541d implements C12960q0.C12970j<String> {

        /* renamed from: a */
        private static final byte[] f59448a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private C12541d() {
        }

        /* renamed from: c */
        private static boolean m83704c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        /* renamed from: e */
        private static String m83705e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, Charsets.f4137a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), Charsets.f4139c);
        }

        /* renamed from: g */
        private static byte[] m83706g(byte[] bArr, int i) {
            byte[] bArr2 = new byte[(((bArr.length - i) * 3) + i)];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (m83704c(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f59448a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr2, 0, bArr4, 0, i2);
            return bArr4;
        }

        /* renamed from: d */
        public String mo69071b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return m83705e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        /* renamed from: f */
        public byte[] mo69070a(String str) {
            byte[] bytes = str.getBytes(Charsets.f4139c);
            for (int i = 0; i < bytes.length; i++) {
                if (m83704c(bytes[i])) {
                    return m83706g(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        C12541d dVar = new C12541d();
        f59425x = dVar;
        f59426y = C12960q0.C12967g.m85094g("grpc-message", false, dVar);
    }

    private C12537b1(C12539b bVar) {
        this(bVar, (String) null, (Throwable) null);
    }

    /* renamed from: f */
    private static List<C12537b1> m83681f() {
        TreeMap treeMap = new TreeMap();
        C12539b[] values = C12539b.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C12539b bVar = values[i];
            C12537b1 b1Var = (C12537b1) treeMap.put(Integer.valueOf(bVar.mo69069e()), new C12537b1(bVar));
            if (b1Var == null) {
                i++;
            } else {
                throw new IllegalStateException("Code value duplication between " + b1Var.mo69062m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: g */
    static String m83682g(C12537b1 b1Var) {
        if (b1Var.f59428b == null) {
            return b1Var.f59427a.toString();
        }
        return b1Var.f59427a + ": " + b1Var.f59428b;
    }

    /* renamed from: h */
    public static C12537b1 m83683h(int i) {
        if (i >= 0) {
            List<C12537b1> list = f59406e;
            if (i <= list.size()) {
                return list.get(i);
            }
        }
        C12537b1 b1Var = f59409h;
        return b1Var.mo69066q("Unknown code " + i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C12537b1 m83684i(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f59407f;
        }
        return m83685j(bArr);
    }

    /* renamed from: j */
    private static C12537b1 m83685j(byte[] bArr) {
        int length = bArr.length;
        char c = 1;
        int i = 0;
        if (length != 1) {
            if (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) {
                i = 0 + ((bArr[0] - 48) * 10);
            }
            C12537b1 b1Var = f59409h;
            return b1Var.mo69066q("Unknown code " + new String(bArr, Charsets.f4137a));
        }
        c = 0;
        if (bArr[c] >= 48 && bArr[c] <= 57) {
            int i2 = i + (bArr[c] - 48);
            List<C12537b1> list = f59406e;
            if (i2 < list.size()) {
                return list.get(i2);
            }
        }
        C12537b1 b1Var2 = f59409h;
        return b1Var2.mo69066q("Unknown code " + new String(bArr, Charsets.f4137a));
    }

    /* renamed from: k */
    public static C12537b1 m83686k(Throwable th) {
        for (Throwable th2 = (Throwable) Preconditions.m5393t(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).mo69022a();
            }
            if (th2 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th2).mo69024a();
            }
        }
        return f59409h.mo69065p(th);
    }

    /* renamed from: c */
    public StatusException mo69056c() {
        return new StatusException(this);
    }

    /* renamed from: d */
    public StatusRuntimeException mo69057d() {
        return new StatusRuntimeException(this);
    }

    /* renamed from: e */
    public C12537b1 mo69058e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f59428b == null) {
            return new C12537b1(this.f59427a, str, this.f59429c);
        }
        C12539b bVar = this.f59427a;
        return new C12537b1(bVar, this.f59428b + IOUtils.LINE_SEPARATOR_UNIX + str, this.f59429c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public Throwable mo69061l() {
        return this.f59429c;
    }

    /* renamed from: m */
    public C12539b mo69062m() {
        return this.f59427a;
    }

    /* renamed from: n */
    public String mo69063n() {
        return this.f59428b;
    }

    /* renamed from: o */
    public boolean mo69064o() {
        return C12539b.OK == this.f59427a;
    }

    /* renamed from: p */
    public C12537b1 mo69065p(Throwable th) {
        if (Objects.m5349a(this.f59429c, th)) {
            return this;
        }
        return new C12537b1(this.f59427a, this.f59428b, th);
    }

    /* renamed from: q */
    public C12537b1 mo69066q(String str) {
        if (Objects.m5349a(this.f59428b, str)) {
            return this;
        }
        return new C12537b1(this.f59427a, str, this.f59429c);
    }

    public String toString() {
        MoreObjects.ToStringHelper d = MoreObjects.m5334c(this).mo22194d("code", this.f59427a.name()).mo22194d("description", this.f59428b);
        Throwable th = this.f59429c;
        Object obj = th;
        if (th != null) {
            obj = Throwables.m5486i(th);
        }
        return d.mo22194d("cause", obj).toString();
    }

    private C12537b1(C12539b bVar, String str, Throwable th) {
        this.f59427a = (C12539b) Preconditions.m5393t(bVar, "code");
        this.f59428b = str;
        this.f59429c = th;
    }
}
