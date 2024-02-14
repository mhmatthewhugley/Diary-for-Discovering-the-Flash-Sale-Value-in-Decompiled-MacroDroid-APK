package okhttp3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p212ad.C11095c;
import p226cd.C11188e;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0003\b\f\u000fB#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, mo71668d2 = {"Lokhttp3/g;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lja/u;", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Lqa/a;)V", "Lokhttp3/g$c;", "c", "Lad/c;", "certificateChainCleaner", "e", "(Lad/c;)Lokhttp3/g;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "pins", "Lad/c;", "d", "()Lad/c;", "<init>", "(Ljava/util/Set;Lad/c;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.g */
/* compiled from: CertificatePinner.kt */
public final class C15925g {

    /* renamed from: c */
    public static final C15925g f65494c = new C15926a().mo76039a();

    /* renamed from: d */
    public static final C15927b f65495d = new C15927b((C13695i) null);

    /* renamed from: a */
    private final Set<C15928c> f65496a;

    /* renamed from: b */
    private final C11095c f65497b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo71668d2 = {"Lokhttp3/g$a;", "", "Lokhttp3/g;", "a", "", "Lokhttp3/g$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.g$a */
    /* compiled from: CertificatePinner.kt */
    public static final class C15926a {

        /* renamed from: a */
        private final List<C15928c> f65498a = new ArrayList();

        /* renamed from: a */
        public final C15925g mo76039a() {
            return new C15925g(C13566b0.m87407K0(this.f65498a), (C11095c) null, 2, (C13695i) null);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/g$b;", "", "Ljava/security/cert/X509Certificate;", "Lcd/e;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lokhttp3/g;", "DEFAULT", "Lokhttp3/g;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.g$b */
    /* compiled from: CertificatePinner.kt */
    public static final class C15927b {
        private C15927b() {
        }

        public /* synthetic */ C15927b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final String mo76040a(Certificate certificate) {
            C13706o.m87929f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + mo76042c((X509Certificate) certificate).mo62491b();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final C11188e mo76041b(X509Certificate x509Certificate) {
            C13706o.m87929f(x509Certificate, "$this$sha1Hash");
            C11188e.C11189a aVar = C11188e.f54104d;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C13706o.m87928e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C13706o.m87928e(encoded, "publicKey.encoded");
            return C11188e.C11189a.m75128f(aVar, encoded, 0, 0, 3, (Object) null).mo62510y();
        }

        /* renamed from: c */
        public final C11188e mo76042c(X509Certificate x509Certificate) {
            C13706o.m87929f(x509Certificate, "$this$sha256Hash");
            C11188e.C11189a aVar = C11188e.f54104d;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C13706o.m87928e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C13706o.m87928e(encoded, "publicKey.encoded");
            return C11188e.C11189a.m75128f(aVar, encoded, 0, 0, 3, (Object) null).mo62484A();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, mo71668d2 = {"Lokhttp3/g$c;", "", "", "hostname", "", "c", "toString", "other", "equals", "", "hashCode", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "Lcd/e;", "hash", "Lcd/e;", "()Lcd/e;", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.g$c */
    /* compiled from: CertificatePinner.kt */
    public static final class C15928c {

        /* renamed from: a */
        private final String f65499a;

        /* renamed from: b */
        private final String f65500b;

        /* renamed from: c */
        private final C11188e f65501c;

        /* renamed from: a */
        public final C11188e mo76043a() {
            return this.f65501c;
        }

        /* renamed from: b */
        public final String mo76044b() {
            return this.f65500b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x003f A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo76045c(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.C13706o.m87929f(r12, r0)
                java.lang.String r0 = r11.f65499a
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.text.C15176v.m93634I(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L_0x0041
                java.lang.String r0 = r11.f65499a
                int r0 = r0.length()
                int r7 = r0 + -3
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.f65499a
                r6 = 3
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = kotlin.text.C15176v.m93645z(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x003f
                int r0 = r0 - r1
                char r12 = r12.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L_0x0082
            L_0x003f:
                r2 = 1
                goto L_0x0082
            L_0x0041:
                java.lang.String r0 = r11.f65499a
                java.lang.String r5 = "*."
                boolean r0 = kotlin.text.C15176v.m93634I(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L_0x007c
                java.lang.String r0 = r11.f65499a
                int r0 = r0.length()
                int r7 = r0 + -1
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.f65499a
                r6 = 1
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = kotlin.text.C15176v.m93645z(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                r5 = 46
                int r6 = r0 + -1
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r12
                int r12 = kotlin.text.C15177w.m93686e0(r4, r5, r6, r7, r8, r9)
                r0 = -1
                if (r12 != r0) goto L_0x0082
                goto L_0x003f
            L_0x007c:
                java.lang.String r0 = r11.f65499a
                boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r12, r0)
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15925g.C15928c.mo76045c(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15928c)) {
                return false;
            }
            C15928c cVar = (C15928c) obj;
            return !(C13706o.m87924a(this.f65499a, cVar.f65499a) ^ true) && !(C13706o.m87924a(this.f65500b, cVar.f65500b) ^ true) && !(C13706o.m87924a(this.f65501c, cVar.f65501c) ^ true);
        }

        public int hashCode() {
            return (((this.f65499a.hashCode() * 31) + this.f65500b.hashCode()) * 31) + this.f65501c.hashCode();
        }

        public String toString() {
            return this.f65500b + '/' + this.f65501c.mo62491b();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.g$d */
    /* compiled from: CertificatePinner.kt */
    static final class C15929d extends C13708q implements C16254a<List<? extends X509Certificate>> {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List $peerCertificates;
        final /* synthetic */ C15925g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15929d(C15925g gVar, List list, String str) {
            super(0);
            this.this$0 = gVar;
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            List<Certificate> list;
            C11095c d = this.this$0.mo76035d();
            if (d == null || (list = d.mo62210a(this.$peerCertificates, this.$hostname)) == null) {
                list = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C15925g(Set<C15928c> set, C11095c cVar) {
        C13706o.m87929f(set, "pins");
        this.f65496a = set;
        this.f65497b = cVar;
    }

    /* renamed from: a */
    public final void mo76032a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        C13706o.m87929f(str, "hostname");
        C13706o.m87929f(list, "peerCertificates");
        mo76033b(str, new C15929d(this, list, str));
    }

    /* renamed from: b */
    public final void mo76033b(String str, C16254a<? extends List<? extends X509Certificate>> aVar) {
        C15928c next;
        C13706o.m87929f(str, "hostname");
        C13706o.m87929f(aVar, "cleanedPeerCertificatesFn");
        List<C15928c> c = mo76034c(str);
        if (!c.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<C15928c> it = c.iterator();
                C11188e eVar = null;
                C11188e eVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String b = next.mo76044b();
                        int hashCode = b.hashCode();
                        if (hashCode == -903629273) {
                            if (!b.equals("sha256")) {
                                break loop0;
                            }
                            if (eVar == null) {
                                eVar = f65495d.mo76042c(x509Certificate);
                            }
                            if (C13706o.m87924a(next.mo76043a(), eVar)) {
                                return;
                            }
                        } else if (hashCode != 3528965 || !b.equals("sha1")) {
                            break loop0;
                        } else {
                            if (eVar2 == null) {
                                eVar2 = f65495d.mo76041b(x509Certificate);
                            }
                            if (C13706o.m87924a(next.mo76043a(), eVar2)) {
                                return;
                            }
                        }
                    }
                }
                throw new AssertionError("unsupported hashAlgorithm: " + next.mo76044b());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f65495d.mo76040a(x509Certificate2));
                sb.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C13706o.m87928e(subjectDN, "element.subjectDN");
                sb.append(subjectDN.getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (C15928c append : c) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    /* renamed from: c */
    public final List<C15928c> mo76034c(String str) {
        C13706o.m87929f(str, "hostname");
        Set<C15928c> set = this.f65496a;
        List<C15928c> j = C13614t.m87748j();
        for (T next : set) {
            if (((C15928c) next).mo76045c(str)) {
                if (j.isEmpty()) {
                    j = new ArrayList<>();
                }
                C13698j0.m87903c(j).add(next);
            }
        }
        return j;
    }

    /* renamed from: d */
    public final C11095c mo76035d() {
        return this.f65497b;
    }

    /* renamed from: e */
    public final C15925g mo76036e(C11095c cVar) {
        C13706o.m87929f(cVar, "certificateChainCleaner");
        if (C13706o.m87924a(this.f65497b, cVar)) {
            return this;
        }
        return new C15925g(this.f65496a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15925g) {
            C15925g gVar = (C15925g) obj;
            return C13706o.m87924a(gVar.f65496a, this.f65496a) && C13706o.m87924a(gVar.f65497b, this.f65497b);
        }
    }

    public int hashCode() {
        int hashCode = (1517 + this.f65496a.hashCode()) * 41;
        C11095c cVar = this.f65497b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15925g(Set set, C11095c cVar, int i, C13695i iVar) {
        this(set, (i & 2) != 0 ? null : cVar);
    }
}
