package okhttp3;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\u0012B;\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001c\u001a\u00020\u0007*\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001bR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u0019¨\u0006$"}, mo71668d2 = {"Lokhttp3/t;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lokhttp3/g0;", "b", "Lokhttp3/g0;", "e", "()Lokhttp3/g0;", "tlsVersion", "Lokhttp3/i;", "c", "Lokhttp3/i;", "a", "()Lokhttp3/i;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "d", "Ljava/util/List;", "()Ljava/util/List;", "localCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "peerCertificates$delegate", "Lja/g;", "peerCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/g0;Lokhttp3/i;Ljava/util/List;Lqa/a;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.t */
/* compiled from: Handshake.kt */
public final class C15982t {

    /* renamed from: e */
    public static final C15983a f65786e = new C15983a((C13695i) null);

    /* renamed from: a */
    private final C13321g f65787a;

    /* renamed from: b */
    private final C15930g0 f65788b;

    /* renamed from: c */
    private final C15933i f65789c;

    /* renamed from: d */
    private final List<Certificate> f65790d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Lokhttp3/t$a;", "", "", "Ljava/security/cert/Certificate;", "", "b", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/t;", "a", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/t;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.t$a */
    /* compiled from: Handshake.kt */
    public static final class C15983a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.t$a$a */
        /* compiled from: Handshake.kt */
        static final class C15984a extends C13708q implements C16254a<List<? extends Certificate>> {
            final /* synthetic */ List $peerCertificatesCopy;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15984a(List list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            /* renamed from: a */
            public final List<Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        private C15983a() {
        }

        public /* synthetic */ C15983a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        private final List<Certificate> m96298b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return C16279b.m97666t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C13614t.m87748j();
        }

        /* renamed from: a */
        public final C15982t mo76238a(SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            C13706o.m87929f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                C15933i b = C15933i.f65618s1.mo76062b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!C13706o.m87924a(KeyPropertiesCompact.DIGEST_NONE, protocol)) {
                    C15930g0 a = C15930g0.f65508p.mo76051a(protocol);
                    try {
                        list = m96298b(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = C13614t.m87748j();
                    }
                    return new C15982t(a, b, m96298b(sSLSession.getLocalCertificates()), new C15984a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.t$b */
    /* compiled from: Handshake.kt */
    static final class C15985b extends C13708q implements C16254a<List<? extends Certificate>> {
        final /* synthetic */ C16254a $peerCertificatesFn;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15985b(C16254a aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        /* renamed from: a */
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C13614t.m87748j();
            }
        }
    }

    public C15982t(C15930g0 g0Var, C15933i iVar, List<? extends Certificate> list, C16254a<? extends List<? extends Certificate>> aVar) {
        C13706o.m87929f(g0Var, "tlsVersion");
        C13706o.m87929f(iVar, "cipherSuite");
        C13706o.m87929f(list, "localCertificates");
        C13706o.m87929f(aVar, "peerCertificatesFn");
        this.f65788b = g0Var;
        this.f65789c = iVar;
        this.f65790d = list;
        this.f65787a = C13323i.m85669b(new C15985b(aVar));
    }

    /* renamed from: b */
    private final String m96293b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C13706o.m87928e(type, "type");
        return type;
    }

    /* renamed from: a */
    public final C15933i mo76231a() {
        return this.f65789c;
    }

    /* renamed from: c */
    public final List<Certificate> mo76232c() {
        return this.f65790d;
    }

    /* renamed from: d */
    public final List<Certificate> mo76233d() {
        return (List) this.f65787a.getValue();
    }

    /* renamed from: e */
    public final C15930g0 mo76234e() {
        return this.f65788b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15982t) {
            C15982t tVar = (C15982t) obj;
            return tVar.f65788b == this.f65788b && C13706o.m87924a(tVar.f65789c, this.f65789c) && C13706o.m87924a(tVar.mo76233d(), mo76233d()) && C13706o.m87924a(tVar.f65790d, this.f65790d);
        }
    }

    public int hashCode() {
        return ((((((527 + this.f65788b.hashCode()) * 31) + this.f65789c.hashCode()) * 31) + mo76233d().hashCode()) * 31) + this.f65790d.hashCode();
    }

    public String toString() {
        List<Certificate> d = mo76233d();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (Certificate b : d) {
            arrayList.add(m96293b(b));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f65788b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f65789c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.f65790d;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
        for (Certificate b2 : list) {
            arrayList2.add(m96293b(b2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
