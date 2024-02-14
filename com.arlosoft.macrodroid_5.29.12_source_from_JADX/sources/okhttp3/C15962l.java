package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002\u0012\u0017B9\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010!R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006)"}, mo71668d2 = {"Lokhttp3/l;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "g", "Lja/u;", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "other", "equals", "", "hashCode", "", "toString", "a", "Z", "f", "()Z", "isTls", "b", "h", "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "", "Lokhttp3/i;", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/g0;", "i", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "k", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.l */
/* compiled from: ConnectionSpec.kt */
public final class C15962l {

    /* renamed from: e */
    private static final C15933i[] f65736e;

    /* renamed from: f */
    private static final C15933i[] f65737f;

    /* renamed from: g */
    public static final C15962l f65738g;

    /* renamed from: h */
    public static final C15962l f65739h;

    /* renamed from: i */
    public static final C15962l f65740i;

    /* renamed from: j */
    public static final C15962l f65741j = new C15963a(false).mo76174a();

    /* renamed from: k */
    public static final C15964b f65742k = new C15964b((C13695i) null);

    /* renamed from: a */
    private final boolean f65743a;

    /* renamed from: b */
    private final boolean f65744b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f65745c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String[] f65746d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, mo71668d2 = {"Lokhttp3/l$a;", "", "", "Lokhttp3/i;", "cipherSuites", "c", "([Lokhttp3/i;)Lokhttp3/l$a;", "", "b", "([Ljava/lang/String;)Lokhttp3/l$a;", "Lokhttp3/g0;", "tlsVersions", "f", "([Lokhttp3/g0;)Lokhttp3/l$a;", "e", "", "supportsTlsExtensions", "d", "Lokhttp3/l;", "a", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "(Z)V", "tls", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "<init>", "connectionSpec", "(Lokhttp3/l;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.l$a */
    /* compiled from: ConnectionSpec.kt */
    public static final class C15963a {

        /* renamed from: a */
        private boolean f65747a;

        /* renamed from: b */
        private String[] f65748b;

        /* renamed from: c */
        private String[] f65749c;

        /* renamed from: d */
        private boolean f65750d;

        public C15963a(boolean z) {
            this.f65747a = z;
        }

        /* renamed from: a */
        public final C15962l mo76174a() {
            return new C15962l(this.f65747a, this.f65750d, this.f65748b, this.f65749c);
        }

        /* renamed from: b */
        public final C15963a mo76175b(String... strArr) {
            C13706o.m87929f(strArr, "cipherSuites");
            if (this.f65747a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f65748b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C15963a mo76176c(C15933i... iVarArr) {
            C13706o.m87929f(iVarArr, "cipherSuites");
            if (this.f65747a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (C15933i c : iVarArr) {
                    arrayList.add(c.mo76058c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return mo76175b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final C15963a mo76177d(boolean z) {
            if (this.f65747a) {
                this.f65750d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final C15963a mo76178e(String... strArr) {
            C13706o.m87929f(strArr, "tlsVersions");
            if (this.f65747a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f65749c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final C15963a mo76179f(C15930g0... g0VarArr) {
            C13706o.m87929f(g0VarArr, "tlsVersions");
            if (this.f65747a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (C15930g0 b : g0VarArr) {
                    arrayList.add(b.mo76050b());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return mo76178e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C15963a(C15962l lVar) {
            C13706o.m87929f(lVar, "connectionSpec");
            this.f65747a = lVar.mo76169f();
            this.f65748b = lVar.f65745c;
            this.f65749c = lVar.f65746d;
            this.f65750d = lVar.mo76170h();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/l$b;", "", "", "Lokhttp3/i;", "APPROVED_CIPHER_SUITES", "[Lokhttp3/i;", "Lokhttp3/l;", "CLEARTEXT", "Lokhttp3/l;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.l$b */
    /* compiled from: ConnectionSpec.kt */
    public static final class C15964b {
        private C15964b() {
        }

        public /* synthetic */ C15964b(C13695i iVar) {
            this();
        }
    }

    static {
        C15933i iVar = C15933i.f65603n1;
        C15933i iVar2 = C15933i.f65606o1;
        C15933i iVar3 = C15933i.f65609p1;
        C15933i iVar4 = C15933i.f65562Z0;
        C15933i iVar5 = C15933i.f65573d1;
        C15933i iVar6 = C15933i.f65564a1;
        C15933i iVar7 = C15933i.f65576e1;
        C15933i iVar8 = C15933i.f65594k1;
        C15933i iVar9 = C15933i.f65591j1;
        C15933i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f65736e = iVarArr;
        C15933i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, C15933i.f65532K0, C15933i.f65534L0, C15933i.f65587i0, C15933i.f65590j0, C15933i.f65523G, C15933i.f65531K, C15933i.f65592k};
        f65737f = iVarArr2;
        C15963a c = new C15963a(true).mo76176c((C15933i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        C15930g0 g0Var = C15930g0.TLS_1_3;
        C15930g0 g0Var2 = C15930g0.TLS_1_2;
        f65738g = c.mo76179f(g0Var, g0Var2).mo76177d(true).mo76174a();
        f65739h = new C15963a(true).mo76176c((C15933i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).mo76179f(g0Var, g0Var2).mo76177d(true).mo76174a();
        f65740i = new C15963a(true).mo76176c((C15933i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).mo76179f(g0Var, g0Var2, C15930g0.TLS_1_1, C15930g0.TLS_1_0).mo76177d(true).mo76174a();
    }

    public C15962l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f65743a = z;
        this.f65744b = z2;
        this.f65745c = strArr;
        this.f65746d = strArr2;
    }

    /* renamed from: g */
    private final C15962l m96212g(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f65745c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C13706o.m87928e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C16279b.m97626B(enabledCipherSuites, this.f65745c, C15933i.f65618s1.mo76063c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f65746d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C13706o.m87928e(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C16279b.m97626B(enabledProtocols, this.f65746d, C15612b.m94866b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C13706o.m87928e(supportedCipherSuites, "supportedCipherSuites");
        int u = C16279b.m97667u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C15933i.f65618s1.mo76063c());
        if (z && u != -1) {
            C13706o.m87928e(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u];
            C13706o.m87928e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C16279b.m97658l(strArr, str);
        }
        C15963a aVar = new C15963a(this);
        C13706o.m87928e(strArr, "cipherSuitesIntersection");
        C15963a b = aVar.mo76175b((String[]) Arrays.copyOf(strArr, strArr.length));
        C13706o.m87928e(strArr2, "tlsVersionsIntersection");
        return b.mo76178e((String[]) Arrays.copyOf(strArr2, strArr2.length)).mo76174a();
    }

    /* renamed from: c */
    public final void mo76165c(SSLSocket sSLSocket, boolean z) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C15962l g = m96212g(sSLSocket, z);
        if (g.mo76172i() != null) {
            sSLSocket.setEnabledProtocols(g.f65746d);
        }
        if (g.mo76166d() != null) {
            sSLSocket.setEnabledCipherSuites(g.f65745c);
        }
    }

    /* renamed from: d */
    public final List<C15933i> mo76166d() {
        String[] strArr = this.f65745c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(C15933i.f65618s1.mo76062b(b));
        }
        return C13566b0.m87402F0(arrayList);
    }

    /* renamed from: e */
    public final boolean mo76167e(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "socket");
        if (!this.f65743a) {
            return false;
        }
        String[] strArr = this.f65746d;
        if (strArr != null && !C16279b.m97664r(strArr, sSLSocket.getEnabledProtocols(), C15612b.m94866b())) {
            return false;
        }
        String[] strArr2 = this.f65745c;
        if (strArr2 == null || C16279b.m97664r(strArr2, sSLSocket.getEnabledCipherSuites(), C15933i.f65618s1.mo76063c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15962l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f65743a;
        C15962l lVar = (C15962l) obj;
        if (z != lVar.f65743a) {
            return false;
        }
        return !z || (Arrays.equals(this.f65745c, lVar.f65745c) && Arrays.equals(this.f65746d, lVar.f65746d) && this.f65744b == lVar.f65744b);
    }

    /* renamed from: f */
    public final boolean mo76169f() {
        return this.f65743a;
    }

    /* renamed from: h */
    public final boolean mo76170h() {
        return this.f65744b;
    }

    public int hashCode() {
        if (!this.f65743a) {
            return 17;
        }
        String[] strArr = this.f65745c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f65746d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f65744b ^ true ? 1 : 0);
    }

    /* renamed from: i */
    public final List<C15930g0> mo76172i() {
        String[] strArr = this.f65746d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C15930g0.f65508p.mo76051a(a));
        }
        return C13566b0.m87402F0(arrayList);
    }

    public String toString() {
        if (!this.f65743a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(" + "cipherSuites=" + Objects.toString(mo76166d(), "[all enabled]") + ", " + "tlsVersions=" + Objects.toString(mo76172i(), "[all enabled]") + ", " + "supportsTlsExtensions=" + this.f65744b + ')';
    }
}
