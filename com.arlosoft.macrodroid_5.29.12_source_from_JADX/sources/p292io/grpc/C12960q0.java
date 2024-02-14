package p292io.grpc;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.p206io.BaseEncoding;
import com.google.common.p206io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: io.grpc.q0 */
/* compiled from: Metadata */
public final class C12960q0 {

    /* renamed from: c */
    public static final C12965e<byte[]> f60665c = new C12961a();

    /* renamed from: d */
    public static final C12964d<String> f60666d = new C12962b();

    /* renamed from: e */
    static final BaseEncoding f60667e = BaseEncoding.m73356b().mo60976n();

    /* renamed from: a */
    private Object[] f60668a;

    /* renamed from: b */
    private int f60669b;

    /* renamed from: io.grpc.q0$a */
    /* compiled from: Metadata */
    class C12961a implements C12965e<byte[]> {
        C12961a() {
        }
    }

    /* renamed from: io.grpc.q0$b */
    /* compiled from: Metadata */
    class C12962b implements C12964d<String> {
        C12962b() {
        }

        /* renamed from: c */
        public String mo69493b(String str) {
            return str;
        }

        /* renamed from: d */
        public String mo69492a(String str) {
            return str;
        }
    }

    /* renamed from: io.grpc.q0$c */
    /* compiled from: Metadata */
    private static class C12963c<T> extends C12967g<T> {

        /* renamed from: f */
        private final C12964d<T> f60670f;

        /* synthetic */ C12963c(String str, boolean z, C12964d dVar, C12961a aVar) {
            this(str, z, dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo69773h(byte[] bArr) {
            return this.f60670f.mo69493b(new String(bArr, Charsets.f4137a));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo69774j(T t) {
            return this.f60670f.mo69492a(t).getBytes(Charsets.f4137a);
        }

        private C12963c(String str, boolean z, C12964d<T> dVar) {
            super(str, z, dVar, (C12961a) null);
            Preconditions.m5387n(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f60670f = (C12964d) Preconditions.m5393t(dVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.q0$d */
    /* compiled from: Metadata */
    public interface C12964d<T> {
        /* renamed from: a */
        String mo69492a(T t);

        /* renamed from: b */
        T mo69493b(String str);
    }

    /* renamed from: io.grpc.q0$e */
    /* compiled from: Metadata */
    public interface C12965e<T> {
    }

    /* renamed from: io.grpc.q0$f */
    /* compiled from: Metadata */
    public interface C12966f<T> {
        /* renamed from: a */
        InputStream mo69775a(T t);

        /* renamed from: b */
        T mo69776b(InputStream inputStream);
    }

    /* renamed from: io.grpc.q0$g */
    /* compiled from: Metadata */
    public static abstract class C12967g<T> {

        /* renamed from: e */
        private static final BitSet f60671e = m85091b();

        /* renamed from: a */
        private final String f60672a;

        /* renamed from: b */
        private final String f60673b;

        /* renamed from: c */
        private final byte[] f60674c;

        /* renamed from: d */
        private final Object f60675d;

        /* synthetic */ C12967g(String str, boolean z, Object obj, C12961a aVar) {
            this(str, z, obj);
        }

        /* renamed from: b */
        private static BitSet m85091b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: e */
        public static <T> C12967g<T> m85092e(String str, C12964d<T> dVar) {
            return m85093f(str, false, dVar);
        }

        /* renamed from: f */
        static <T> C12967g<T> m85093f(String str, boolean z, C12964d<T> dVar) {
            return new C12963c(str, z, dVar, (C12961a) null);
        }

        /* renamed from: g */
        static <T> C12967g<T> m85094g(String str, boolean z, C12970j<T> jVar) {
            return new C12969i(str, z, jVar, (C12961a) null);
        }

        /* renamed from: k */
        private static String m85095k(String str, boolean z) {
            Preconditions.m5393t(str, "name");
            Preconditions.m5378e(!str.isEmpty(), "token must have at least 1 tchar");
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    Preconditions.m5380g(f60671e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: a */
        public byte[] mo69777a() {
            return this.f60674c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final <M> M mo69778c(Class<M> cls) {
            if (cls.isInstance(this.f60675d)) {
                return cls.cast(this.f60675d);
            }
            return null;
        }

        /* renamed from: d */
        public final String mo69779d() {
            return this.f60673b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f60673b.equals(((C12967g) obj).f60673b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract T mo69773h(byte[] bArr);

        public final int hashCode() {
            return this.f60673b.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo69782i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract byte[] mo69774j(T t);

        public String toString() {
            return "Key{name='" + this.f60673b + "'}";
        }

        private C12967g(String str, boolean z, Object obj) {
            String str2 = (String) Preconditions.m5393t(str, "name");
            this.f60672a = str2;
            String k = m85095k(str2.toLowerCase(Locale.ROOT), z);
            this.f60673b = k;
            this.f60674c = k.getBytes(Charsets.f4137a);
            this.f60675d = obj;
        }
    }

    /* renamed from: io.grpc.q0$h */
    /* compiled from: Metadata */
    static final class C12968h<T> {

        /* renamed from: a */
        private final C12966f<T> f60676a;

        /* renamed from: b */
        private final T f60677b;

        /* renamed from: c */
        private volatile byte[] f60678c;

        C12968h(C12966f<T> fVar, T t) {
            this.f60676a = fVar;
            this.f60677b = t;
        }

        /* renamed from: a */
        static <T> C12968h<T> m85102a(C12967g<T> gVar, T t) {
            return new C12968h<>((C12966f) Preconditions.m5392s(m85103b(gVar)), t);
        }

        /* renamed from: b */
        private static <T> C12966f<T> m85103b(C12967g<T> gVar) {
            return (C12966f) gVar.mo69778c(C12966f.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte[] mo69784c() {
            if (this.f60678c == null) {
                synchronized (this) {
                    if (this.f60678c == null) {
                        this.f60678c = C12960q0.m85068q(mo69786e());
                    }
                }
            }
            return this.f60678c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T2> T2 mo69785d(C12967g<T2> gVar) {
            C12966f<T2> b;
            if (!gVar.mo69782i() || (b = m85103b(gVar)) == null) {
                return gVar.mo69773h(mo69784c());
            }
            return b.mo69776b(mo69786e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public InputStream mo69786e() {
            return this.f60676a.mo69775a(this.f60677b);
        }
    }

    /* renamed from: io.grpc.q0$i */
    /* compiled from: Metadata */
    private static final class C12969i<T> extends C12967g<T> {

        /* renamed from: f */
        private final C12970j<T> f60679f;

        /* synthetic */ C12969i(String str, boolean z, C12970j jVar, C12961a aVar) {
            this(str, z, jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo69773h(byte[] bArr) {
            return this.f60679f.mo69071b(bArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo69774j(T t) {
            return this.f60679f.mo69070a(t);
        }

        private C12969i(String str, boolean z, C12970j<T> jVar) {
            super(str, z, jVar, (C12961a) null);
            Preconditions.m5387n(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f60679f = (C12970j) Preconditions.m5393t(jVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.q0$j */
    /* compiled from: Metadata */
    interface C12970j<T> {
        /* renamed from: a */
        byte[] mo69070a(T t);

        /* renamed from: b */
        T mo69071b(byte[] bArr);
    }

    public C12960q0() {
    }

    C12960q0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: b */
    private boolean m85060b(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: c */
    private int m85061c() {
        Object[] objArr = this.f60668a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: e */
    private void m85062e(int i) {
        Object[] objArr = new Object[i];
        if (!m85063h()) {
            System.arraycopy(this.f60668a, 0, objArr, 0, m85064j());
        }
        this.f60668a = objArr;
    }

    /* renamed from: h */
    private boolean m85063h() {
        return this.f60669b == 0;
    }

    /* renamed from: j */
    private int m85064j() {
        return this.f60669b * 2;
    }

    /* renamed from: k */
    private void m85065k() {
        if (m85064j() == 0 || m85064j() == m85061c()) {
            m85062e(Math.max(m85064j() * 2, 8));
        }
    }

    /* renamed from: m */
    private void m85066m(int i, byte[] bArr) {
        this.f60668a[i * 2] = bArr;
    }

    /* renamed from: n */
    private byte[] m85067n(int i) {
        return (byte[]) this.f60668a[i * 2];
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static byte[] m85068q(InputStream inputStream) {
        try {
            return ByteStreams.m73417j(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    /* renamed from: r */
    private Object m85069r(int i) {
        return this.f60668a[(i * 2) + 1];
    }

    /* renamed from: s */
    private void m85070s(int i, Object obj) {
        if (this.f60668a instanceof byte[][]) {
            m85062e(m85061c());
        }
        this.f60668a[(i * 2) + 1] = obj;
    }

    /* renamed from: t */
    private void m85071t(int i, byte[] bArr) {
        this.f60668a[(i * 2) + 1] = bArr;
    }

    /* renamed from: u */
    private byte[] m85072u(int i) {
        Object r = m85069r(i);
        if (r instanceof byte[]) {
            return (byte[]) r;
        }
        return ((C12968h) r).mo69784c();
    }

    /* renamed from: v */
    private <T> T m85073v(int i, C12967g<T> gVar) {
        Object r = m85069r(i);
        if (r instanceof byte[]) {
            return gVar.mo69773h((byte[]) r);
        }
        return ((C12968h) r).mo69785d(gVar);
    }

    /* renamed from: d */
    public <T> void mo69763d(C12967g<T> gVar) {
        if (!m85063h()) {
            int i = 0;
            for (int i2 = 0; i2 < this.f60669b; i2++) {
                if (!m85060b(gVar.mo69777a(), m85067n(i2))) {
                    m85066m(i, m85067n(i2));
                    m85070s(i, m85069r(i2));
                    i++;
                }
            }
            Arrays.fill(this.f60668a, i * 2, m85064j(), (Object) null);
            this.f60669b = i;
        }
    }

    /* renamed from: f */
    public <T> T mo69764f(C12967g<T> gVar) {
        for (int i = this.f60669b - 1; i >= 0; i--) {
            if (m85060b(gVar.mo69777a(), m85067n(i))) {
                return m85073v(i, gVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo69765g() {
        return this.f60669b;
    }

    /* renamed from: i */
    public Set<String> mo69766i() {
        if (m85063h()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f60669b);
        for (int i = 0; i < this.f60669b; i++) {
            hashSet.add(new String(m85067n(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public void mo69767l(C12960q0 q0Var) {
        if (!q0Var.m85063h()) {
            int c = m85061c() - m85064j();
            if (m85063h() || c < q0Var.m85064j()) {
                m85062e(m85064j() + q0Var.m85064j());
            }
            System.arraycopy(q0Var.f60668a, 0, this.f60668a, m85064j(), q0Var.m85064j());
            this.f60669b += q0Var.f60669b;
        }
    }

    /* renamed from: o */
    public <T> void mo69768o(C12967g<T> gVar, T t) {
        Preconditions.m5393t(gVar, "key");
        Preconditions.m5393t(t, "value");
        m85065k();
        m85066m(this.f60669b, gVar.mo69777a());
        if (gVar.mo69782i()) {
            m85070s(this.f60669b, C12968h.m85102a(gVar, t));
        } else {
            m85071t(this.f60669b, gVar.mo69774j(t));
        }
        this.f60669b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public byte[][] mo69769p() {
        byte[][] bArr = new byte[m85064j()][];
        Object[] objArr = this.f60668a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m85064j());
        } else {
            for (int i = 0; i < this.f60669b; i++) {
                int i2 = i * 2;
                bArr[i2] = m85067n(i);
                bArr[i2 + 1] = m85072u(i);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f60669b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] n = m85067n(i);
            Charset charset = Charsets.f4137a;
            String str = new String(n, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f60667e.mo60971g(m85072u(i)));
            } else {
                sb.append(new String(m85072u(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C12960q0(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    C12960q0(int i, Object[] objArr) {
        this.f60669b = i;
        this.f60668a = objArr;
    }
}
