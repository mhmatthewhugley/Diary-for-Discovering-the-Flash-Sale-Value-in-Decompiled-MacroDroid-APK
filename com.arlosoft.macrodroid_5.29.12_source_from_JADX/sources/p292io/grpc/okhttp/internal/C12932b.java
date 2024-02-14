package p292io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.okhttp.internal.b */
/* compiled from: ConnectionSpec */
public final class C12932b {

    /* renamed from: e */
    private static final C12931a[] f60583e;

    /* renamed from: f */
    public static final C12932b f60584f;

    /* renamed from: g */
    public static final C12932b f60585g;

    /* renamed from: h */
    public static final C12932b f60586h = new C12934b(false).mo69718e();

    /* renamed from: a */
    final boolean f60587a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f60588b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f60589c;

    /* renamed from: d */
    final boolean f60590d;

    static {
        C12931a[] aVarArr = {C12931a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C12931a.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C12931a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C12931a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C12931a.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C12931a.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, C12931a.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C12931a.TLS_RSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_RSA_WITH_AES_128_CBC_SHA, C12931a.TLS_RSA_WITH_AES_256_CBC_SHA, C12931a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f60583e = aVarArr;
        C12934b f = new C12934b(true).mo69719f(aVarArr);
        C12948h hVar = C12948h.TLS_1_0;
        C12932b e = f.mo69722i(C12948h.TLS_1_2, C12948h.TLS_1_1, hVar).mo69721h(true).mo69718e();
        f60584f = e;
        f60585g = new C12934b(e).mo69722i(hVar).mo69721h(true).mo69718e();
    }

    /* renamed from: e */
    private C12932b m84959e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f60588b != null) {
            strArr = (String[]) C12949i.m85025c(cls, this.f60588b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C12934b(this).mo69720g(strArr).mo69723j((String[]) C12949i.m85025c(cls, this.f60589c, enabledProtocols)).mo69718e();
    }

    /* renamed from: c */
    public void mo69711c(SSLSocket sSLSocket, boolean z) {
        C12932b e = m84959e(sSLSocket, z);
        sSLSocket.setEnabledProtocols(e.f60589c);
        String[] strArr = e.f60588b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<C12931a> mo69712d() {
        String[] strArr = this.f60588b;
        if (strArr == null) {
            return null;
        }
        C12931a[] aVarArr = new C12931a[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f60588b;
            if (i >= strArr2.length) {
                return C12949i.m85023a(aVarArr);
            }
            aVarArr[i] = C12931a.m84956b(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12932b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12932b bVar = (C12932b) obj;
        boolean z = this.f60587a;
        if (z != bVar.f60587a) {
            return false;
        }
        return !z || (Arrays.equals(this.f60588b, bVar.f60588b) && Arrays.equals(this.f60589c, bVar.f60589c) && this.f60590d == bVar.f60590d);
    }

    /* renamed from: f */
    public boolean mo69714f() {
        return this.f60590d;
    }

    /* renamed from: g */
    public List<C12948h> mo69715g() {
        C12948h[] hVarArr = new C12948h[this.f60589c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f60589c;
            if (i >= strArr.length) {
                return C12949i.m85023a(hVarArr);
            }
            hVarArr[i] = C12948h.m85022b(strArr[i]);
            i++;
        }
    }

    public int hashCode() {
        if (this.f60587a) {
            return ((((527 + Arrays.hashCode(this.f60588b)) * 31) + Arrays.hashCode(this.f60589c)) * 31) + (this.f60590d ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f60587a) {
            return "ConnectionSpec()";
        }
        List<C12931a> d = mo69712d();
        if (d == null) {
            str = "[use default]";
        } else {
            str = d.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + mo69715g() + ", supportsTlsExtensions=" + this.f60590d + ")";
    }

    /* renamed from: io.grpc.okhttp.internal.b$b */
    /* compiled from: ConnectionSpec */
    public static final class C12934b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f60591a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f60592b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f60593c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f60594d;

        public C12934b(boolean z) {
            this.f60591a = z;
        }

        /* renamed from: e */
        public C12932b mo69718e() {
            return new C12932b(this);
        }

        /* renamed from: f */
        public C12934b mo69719f(C12931a... aVarArr) {
            if (this.f60591a) {
                String[] strArr = new String[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    strArr[i] = aVarArr[i].javaName;
                }
                this.f60592b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C12934b mo69720g(String... strArr) {
            if (this.f60591a) {
                if (strArr == null) {
                    this.f60592b = null;
                } else {
                    this.f60592b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C12934b mo69721h(boolean z) {
            if (this.f60591a) {
                this.f60594d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C12934b mo69722i(C12948h... hVarArr) {
            if (!this.f60591a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (hVarArr.length != 0) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].javaName;
                }
                this.f60593c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        /* renamed from: j */
        public C12934b mo69723j(String... strArr) {
            if (this.f60591a) {
                if (strArr == null) {
                    this.f60593c = null;
                } else {
                    this.f60593c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C12934b(C12932b bVar) {
            this.f60591a = bVar.f60587a;
            this.f60592b = bVar.f60588b;
            this.f60593c = bVar.f60589c;
            this.f60594d = bVar.f60590d;
        }
    }

    private C12932b(C12934b bVar) {
        this.f60587a = bVar.f60591a;
        this.f60588b = bVar.f60592b;
        this.f60589c = bVar.f60593c;
        this.f60590d = bVar.f60594d;
    }
}
