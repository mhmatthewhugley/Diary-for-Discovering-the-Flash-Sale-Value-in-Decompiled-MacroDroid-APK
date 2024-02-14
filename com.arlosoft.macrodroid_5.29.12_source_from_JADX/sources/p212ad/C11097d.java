package p212ad;

import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p226cd.C11178a0;
import p372qc.C16278a;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001a"}, mo71668d2 = {"Lad/d;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "hostname", "g", "b", "d", "pattern", "f", "", "type", "", "c", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "e", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: ad.d */
/* compiled from: OkHostnameVerifier.kt */
public final class C11097d implements HostnameVerifier {

    /* renamed from: a */
    public static final C11097d f54015a = new C11097d();

    private C11097d() {
    }

    /* renamed from: b */
    private final String m74707b(String str) {
        if (!m74709d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C13706o.m87928e(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    private final List<String> m74708c(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C13614t.m87748j();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C13706o.m87924a(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C13614t.m87748j();
        }
    }

    /* renamed from: d */
    private final boolean m74709d(String str) {
        return str.length() == ((int) C11178a0.m75008b(str, 0, 0, 3, (Object) null));
    }

    /* renamed from: f */
    private final boolean m74710f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C15176v.m93634I(str, ".", false, 2, (Object) null) && !C15176v.m93640u(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !C15176v.m93634I(str2, ".", false, 2, (Object) null) && !C15176v.m93640u(str2, "..", false, 2, (Object) null)) {
                if (!C15176v.m93640u(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C15176v.m93640u(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                String b = m74707b(str2);
                if (!C15177w.m93663N(b, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
                    return C13706o.m87924a(str3, b);
                }
                if (!C15176v.m93634I(b, "*.", false, 2, (Object) null) || C15177w.m93681Z(b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b.length() || C13706o.m87924a("*.", b)) {
                    return false;
                }
                String substring = b.substring(1);
                C13706o.m87928e(substring, "(this as java.lang.String).substring(startIndex)");
                if (!C15176v.m93640u(str3, substring, false, 2, (Object) null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || C15177w.m93686e0(str3, FilenameUtils.EXTENSION_SEPARATOR, length + -1, false, 4, (Object) null) == -1;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m74711g(String str, X509Certificate x509Certificate) {
        String b = m74707b(str);
        List<String> c = m74708c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String f : c) {
            if (f54015a.m74710f(b, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m74712h(String str, X509Certificate x509Certificate) {
        String e = C16278a.m97624e(str);
        List<String> c = m74708c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String e2 : c) {
            if (C13706o.m87924a(e, C16278a.m97624e(e2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> mo62217a(X509Certificate x509Certificate) {
        C13706o.m87929f(x509Certificate, "certificate");
        return C13566b0.m87442q0(m74708c(x509Certificate, 7), m74708c(x509Certificate, 2));
    }

    /* renamed from: e */
    public final boolean mo62218e(String str, X509Certificate x509Certificate) {
        C13706o.m87929f(str, "host");
        C13706o.m87929f(x509Certificate, "certificate");
        if (C16279b.m97652f(str)) {
            return m74712h(str, x509Certificate);
        }
        return m74711g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C13706o.m87929f(str, "host");
        C13706o.m87929f(sSLSession, "session");
        if (!m74709d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo62218e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
