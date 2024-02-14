package okhttp3;

import androidx.webkit.ProxyConfig;
import com.android.p023dx.p026io.Opcodes;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import p226cd.C11179b;
import p372qc.C16278a;
import p372qc.C16279b;
import p424wa.C16785c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0014\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0015\u001aBc\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0+\u0012\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+\u0012\b\u00103\u001a\u0004\u0018\u00010\b\u0012\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\"\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010%\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010*\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001e\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010+8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0019\u00103\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u0014\u00104\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0011\u00105\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u00106\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u00107\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\b0+8G¢\u0006\u0006\u001a\u0004\b#\u0010/R\u0013\u00109\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u0010;\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b:\u0010\u001dR\u0013\u0010<\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006?"}, mo71668d2 = {"Lokhttp3/v;", "", "Ljava/net/URL;", "t", "()Ljava/net/URL;", "Ljava/net/URI;", "s", "()Ljava/net/URI;", "", "p", "link", "q", "Lokhttp3/v$a;", "k", "l", "other", "", "equals", "", "hashCode", "toString", "a", "Z", "j", "()Z", "isHttps", "b", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "scheme", "c", "username", "d", "password", "e", "i", "host", "f", "I", "n", "()I", "port", "", "g", "Ljava/util/List;", "m", "()Ljava/util/List;", "pathSegments", "h", "queryNamesAndValues", "fragment", "url", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "o", "query", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.v */
/* compiled from: HttpUrl.kt */
public final class C15989v {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final char[] f65794k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C15992b f65795l = new C15992b((C13695i) null);

    /* renamed from: a */
    private final boolean f65796a;

    /* renamed from: b */
    private final String f65797b;

    /* renamed from: c */
    private final String f65798c;

    /* renamed from: d */
    private final String f65799d;

    /* renamed from: e */
    private final String f65800e;

    /* renamed from: f */
    private final int f65801f;

    /* renamed from: g */
    private final List<String> f65802g;

    /* renamed from: h */
    private final List<String> f65803h;

    /* renamed from: i */
    private final String f65804i;

    /* renamed from: j */
    private final String f65805j;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u000f\u0010$\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010'\u001a\u00020&J\b\u0010(\u001a\u00020\u0004H\u0016J!\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b*\u0010+R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00103\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u00106\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010,\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001d\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR,\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010>8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bC\u0010A\"\u0004\bD\u0010ER$\u0010I\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100¨\u0006L"}, mo71668d2 = {"Lokhttp3/v$a;", "", "", "d", "", "input", "startPos", "limit", "Lja/u;", "p", "pos", "", "addTrailingSlash", "alreadyEncoded", "n", "h", "i", "l", "scheme", "q", "username", "x", "password", "k", "host", "g", "port", "m", "encodedQuery", "e", "name", "value", "b", "encodedName", "encodedValue", "a", "o", "()Lokhttp3/v$a;", "Lokhttp3/v;", "c", "toString", "base", "j", "(Lokhttp3/v;Ljava/lang/String;)Lokhttp3/v$a;", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "t", "encodedUsername", "getEncodedPassword$okhttp", "s", "encodedPassword", "getHost$okhttp", "u", "I", "getPort$okhttp", "()I", "v", "(I)V", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "r", "encodedFragment", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.v$a */
    /* compiled from: HttpUrl.kt */
    public static final class C15990a {

        /* renamed from: i */
        public static final C15991a f65806i = new C15991a((C13695i) null);

        /* renamed from: a */
        private String f65807a;

        /* renamed from: b */
        private String f65808b = "";

        /* renamed from: c */
        private String f65809c = "";

        /* renamed from: d */
        private String f65810d;

        /* renamed from: e */
        private int f65811e = -1;

        /* renamed from: f */
        private final List<String> f65812f;

        /* renamed from: g */
        private List<String> f65813g;

        /* renamed from: h */
        private String f65814h;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/v$a$a;", "", "", "input", "", "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.v$a$a */
        /* compiled from: HttpUrl.kt */
        public static final class C15991a {
            private C15991a() {
            }

            public /* synthetic */ C15991a(C13695i iVar) {
                this();
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public final int m96372e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C15992b.m96376b(C15989v.f65795l, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public final int m96373f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public final int m96374g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C13706o.m87931h(charAt, 97) < 0 || C13706o.m87931h(charAt, 122) > 0) && (C13706o.m87931h(charAt, 65) < 0 || C13706o.m87931h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public final int m96375h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public C15990a() {
            ArrayList arrayList = new ArrayList();
            this.f65812f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private final int m96344d() {
            int i = this.f65811e;
            if (i != -1) {
                return i;
            }
            C15992b bVar = C15989v.f65795l;
            String str = this.f65807a;
            C13706o.m87926c(str);
            return bVar.mo76302c(str);
        }

        /* renamed from: h */
        private final boolean m96345h(String str) {
            return C13706o.m87924a(str, ".") || C15176v.m93641v(str, "%2e", true);
        }

        /* renamed from: i */
        private final boolean m96346i(String str) {
            if (C13706o.m87924a(str, "..") || C15176v.m93641v(str, "%2e.", true) || C15176v.m93641v(str, ".%2e", true) || C15176v.m93641v(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        private final void m96347l() {
            List<String> list = this.f65812f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f65812f.isEmpty())) {
                this.f65812f.add("");
                return;
            }
            List<String> list2 = this.f65812f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: n */
        private final void m96348n(String str, int i, int i2, boolean z, boolean z2) {
            String b = C15992b.m96376b(C15989v.f65795l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!m96345h(b)) {
                if (m96346i(b)) {
                    m96347l();
                    return;
                }
                List<String> list = this.f65812f;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.f65812f;
                    list2.set(list2.size() - 1, b);
                } else {
                    this.f65812f.add(b);
                }
                if (z) {
                    this.f65812f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: p */
        private final void m96349p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f65812f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f65812f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f65812f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p372qc.C16279b.m97660n(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m96348n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15989v.C15990a.m96349p(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        public final C15990a mo76282a(String str, String str2) {
            C13706o.m87929f(str, "encodedName");
            if (this.f65813g == null) {
                this.f65813g = new ArrayList();
            }
            List<String> list = this.f65813g;
            C13706o.m87926c(list);
            C15992b bVar = C15989v.f65795l;
            list.add(C15992b.m96376b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, Opcodes.DIV_INT_LIT16, (Object) null));
            List<String> list2 = this.f65813g;
            C13706o.m87926c(list2);
            list2.add(str2 != null ? C15992b.m96376b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, Opcodes.DIV_INT_LIT16, (Object) null) : null);
            return this;
        }

        /* renamed from: b */
        public final C15990a mo76283b(String str, String str2) {
            C13706o.m87929f(str, "name");
            if (this.f65813g == null) {
                this.f65813g = new ArrayList();
            }
            List<String> list = this.f65813g;
            C13706o.m87926c(list);
            C15992b bVar = C15989v.f65795l;
            list.add(C15992b.m96376b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, Opcodes.DIV_INT_LIT8, (Object) null));
            List<String> list2 = this.f65813g;
            C13706o.m87926c(list2);
            list2.add(str2 != null ? C15992b.m96376b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, Opcodes.DIV_INT_LIT8, (Object) null) : null);
            return this;
        }

        /* renamed from: c */
        public final C15989v mo76284c() {
            ArrayList arrayList;
            String str = this.f65807a;
            if (str != null) {
                C15992b bVar = C15989v.f65795l;
                String h = C15992b.m96378h(bVar, this.f65808b, 0, 0, false, 7, (Object) null);
                String h2 = C15992b.m96378h(bVar, this.f65809c, 0, 0, false, 7, (Object) null);
                String str2 = this.f65810d;
                if (str2 != null) {
                    int d = m96344d();
                    List<String> list = this.f65812f;
                    ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
                    for (String h3 : list) {
                        arrayList2.add(C15992b.m96378h(C15989v.f65795l, h3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.f65813g;
                    if (list2 != null) {
                        arrayList = new ArrayList(C13616u.m87774u(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? C15992b.m96378h(C15989v.f65795l, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f65814h;
                    return new C15989v(str, h, h2, str2, d, arrayList2, arrayList, str4 != null ? C15992b.m96378h(C15989v.f65795l, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        public final C15990a mo76285e(String str) {
            List<String> list;
            if (str != null) {
                C15992b bVar = C15989v.f65795l;
                String b = C15992b.m96376b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, Opcodes.DIV_INT_LIT16, (Object) null);
                if (b != null) {
                    list = bVar.mo76307j(b);
                    this.f65813g = list;
                    return this;
                }
            }
            list = null;
            this.f65813g = list;
            return this;
        }

        /* renamed from: f */
        public final List<String> mo76286f() {
            return this.f65812f;
        }

        /* renamed from: g */
        public final C15990a mo76287g(String str) {
            C13706o.m87929f(str, "host");
            String e = C16278a.m97624e(C15992b.m96378h(C15989v.f65795l, str, 0, 0, false, 7, (Object) null));
            if (e != null) {
                this.f65810d = e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: j */
        public final C15990a mo76288j(C15989v vVar, String str) {
            int i;
            int n;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            boolean z;
            boolean z2;
            String str4 = str;
            C13706o.m87929f(str4, "input");
            int x = C16279b.m97670x(str4, 0, 0, 3, (Object) null);
            int z3 = C16279b.m97672z(str4, x, 0, 2, (Object) null);
            C15991a aVar = f65806i;
            int c = aVar.m96374g(str4, x, z3);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c2 = 65535;
            if (c != -1) {
                if (C15176v.m93631F(str4, "https:", x, true)) {
                    this.f65807a = ProxyConfig.MATCH_HTTPS;
                    x += 6;
                } else if (C15176v.m93631F(str4, "http:", x, true)) {
                    this.f65807a = "http";
                    x += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, c);
                    C13706o.m87928e(substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (vVar != null) {
                this.f65807a = vVar.mo76278r();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d = aVar.m96375h(str4, x, z3);
            char c3 = '?';
            char c4 = '#';
            if (d >= 2 || vVar == null || (!C13706o.m87924a(vVar.mo76278r(), this.f65807a))) {
                int i5 = x + d;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    n = C16279b.m97660n(str4, "@/\\?#", i5, z3);
                    char charAt = n != z3 ? str4.charAt(n) : 65535;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        String str6 = str5;
                        i = z3;
                        int i6 = n;
                        C15991a aVar2 = f65806i;
                        int b = aVar2.m96373f(str4, i5, i6);
                        int i7 = b + 1;
                    } else {
                        if (charAt != '@') {
                            str3 = str5;
                            i3 = z3;
                        } else {
                            if (!z4) {
                                int m = C16279b.m97659m(str4, ':', i5, n);
                                C15992b bVar = C15989v.f65795l;
                                String str7 = "%40";
                                int i8 = n;
                                int i9 = m;
                                i3 = z3;
                                String str8 = str5;
                                String b2 = C15992b.m96376b(bVar, str, i5, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z5) {
                                    b2 = this.f65808b + str7 + b2;
                                }
                                this.f65808b = b2;
                                int i10 = i8;
                                int i11 = i9;
                                if (i11 != i10) {
                                    this.f65809c = C15992b.m96376b(bVar, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z2 = true;
                                } else {
                                    z2 = z4;
                                }
                                z4 = z2;
                                str3 = str8;
                                z = true;
                                i4 = i10;
                            } else {
                                i3 = z3;
                                String str9 = str5;
                                int i12 = n;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f65809c);
                                sb2.append("%40");
                                StringBuilder sb3 = sb2;
                                str3 = str9;
                                i4 = i12;
                                sb3.append(C15992b.m96376b(C15989v.f65795l, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.f65809c = sb3.toString();
                                z = z5;
                            }
                            i5 = i4 + 1;
                            z5 = z;
                        }
                        str5 = str3;
                        z3 = i3;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                String str62 = str5;
                i = z3;
                int i62 = n;
                C15991a aVar22 = f65806i;
                int b3 = aVar22.m96373f(str4, i5, i62);
                int i72 = b3 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.f65810d = C16278a.m97624e(C15992b.m96378h(C15989v.f65795l, str, i5, b3, false, 4, (Object) null));
                    int a = aVar22.m96372e(str4, i72, i62);
                    this.f65811e = a;
                    if (a != -1) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        C13706o.m87928e(substring2, str62);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    C15992b bVar2 = C15989v.f65795l;
                    this.f65810d = C16278a.m97624e(C15992b.m96378h(bVar2, str, i2, b3, false, 4, (Object) null));
                    String str10 = this.f65807a;
                    C13706o.m87926c(str10);
                    this.f65811e = bVar2.mo76302c(str10);
                }
                if (this.f65810d != null) {
                    x = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, b3);
                    C13706o.m87928e(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f65808b = vVar.mo76267g();
                this.f65809c = vVar.mo76262c();
                this.f65810d = vVar.mo76269i();
                this.f65811e = vVar.mo76274n();
                this.f65812f.clear();
                this.f65812f.addAll(vVar.mo76264e());
                if (x == z3 || str4.charAt(x) == '#') {
                    mo76285e(vVar.mo76266f());
                }
                i = z3;
            }
            int i13 = i;
            int n2 = C16279b.m97660n(str4, "?#", x, i13);
            m96349p(str4, x, n2);
            if (n2 < i13 && str4.charAt(n2) == '?') {
                int m2 = C16279b.m97659m(str4, '#', n2, i13);
                C15992b bVar3 = C15989v.f65795l;
                this.f65813g = bVar3.mo76307j(C15992b.m96376b(bVar3, str, n2 + 1, m2, " \"'<>#", true, false, true, false, (Charset) null, Opcodes.ADD_INT_LIT16, (Object) null));
                n2 = m2;
            }
            if (n2 < i13 && str4.charAt(n2) == '#') {
                this.f65814h = C15992b.m96376b(C15989v.f65795l, str, n2 + 1, i13, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        /* renamed from: k */
        public final C15990a mo76289k(String str) {
            C13706o.m87929f(str, "password");
            this.f65809c = C15992b.m96376b(C15989v.f65795l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        /* renamed from: m */
        public final C15990a mo76290m(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.f65811e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* renamed from: o */
        public final C15990a mo76291o() {
            String str = this.f65810d;
            String str2 = null;
            this.f65810d = str != null ? new C15159j("[\"<>^`{|}]").mo74469d(str, "") : null;
            int size = this.f65812f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f65812f;
                list.set(i, C15992b.m96376b(C15989v.f65795l, list.get(i), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.f65813g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? C15992b.m96376b(C15989v.f65795l, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.f65814h;
            if (str4 != null) {
                str2 = C15992b.m96376b(C15989v.f65795l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f65814h = str2;
            return this;
        }

        /* renamed from: q */
        public final C15990a mo76292q(String str) {
            C13706o.m87929f(str, "scheme");
            if (C15176v.m93641v(str, "http", true)) {
                this.f65807a = "http";
            } else if (C15176v.m93641v(str, ProxyConfig.MATCH_HTTPS, true)) {
                this.f65807a = ProxyConfig.MATCH_HTTPS;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        /* renamed from: r */
        public final void mo76293r(String str) {
            this.f65814h = str;
        }

        /* renamed from: s */
        public final void mo76294s(String str) {
            C13706o.m87929f(str, "<set-?>");
            this.f65809c = str;
        }

        /* renamed from: t */
        public final void mo76295t(String str) {
            C13706o.m87929f(str, "<set-?>");
            this.f65808b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r6.f65809c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
            if (r1 != r3.mo76302c(r2)) goto L_0x0093;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f65807a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f65808b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = 1
                goto L_0x0024
            L_0x0023:
                r1 = 0
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.f65809c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = 1
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.f65808b
                r0.append(r1)
                java.lang.String r1 = r6.f65809c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.f65809c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.f65810d
                if (r1 == 0) goto L_0x0077
                kotlin.jvm.internal.C13706o.m87926c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.C15177w.m93661M(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x0072
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f65810d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0077
            L_0x0072:
                java.lang.String r1 = r6.f65810d
                r0.append(r1)
            L_0x0077:
                int r1 = r6.f65811e
                r2 = -1
                if (r1 != r2) goto L_0x0080
                java.lang.String r1 = r6.f65807a
                if (r1 == 0) goto L_0x0099
            L_0x0080:
                int r1 = r6.m96344d()
                java.lang.String r2 = r6.f65807a
                if (r2 == 0) goto L_0x0093
                okhttp3.v$b r3 = okhttp3.C15989v.f65795l
                kotlin.jvm.internal.C13706o.m87926c(r2)
                int r2 = r3.mo76302c(r2)
                if (r1 == r2) goto L_0x0099
            L_0x0093:
                r0.append(r4)
                r0.append(r1)
            L_0x0099:
                okhttp3.v$b r1 = okhttp3.C15989v.f65795l
                java.util.List<java.lang.String> r2 = r6.f65812f
                r1.mo76306i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f65813g
                if (r2 == 0) goto L_0x00b1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f65813g
                kotlin.jvm.internal.C13706o.m87926c(r2)
                r1.mo76308k(r2, r0)
            L_0x00b1:
                java.lang.String r1 = r6.f65814h
                if (r1 == 0) goto L_0x00bf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f65814h
                r0.append(r1)
            L_0x00bf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15989v.C15990a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final void mo76297u(String str) {
            this.f65810d = str;
        }

        /* renamed from: v */
        public final void mo76298v(int i) {
            this.f65811e = i;
        }

        /* renamed from: w */
        public final void mo76299w(String str) {
            this.f65807a = str;
        }

        /* renamed from: x */
        public final C15990a mo76300x(String str) {
            C13706o.m87929f(str, "username");
            this.f65808b = C15992b.m96376b(C15989v.f65795l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J1\u0010%\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010&Jc\u0010'\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b6\u0010*R\u0014\u00107\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b7\u0010*¨\u0006:"}, mo71668d2 = {"Lokhttp3/v$b;", "", "Lcd/b;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lja/u;", "m", "e", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "scheme", "c", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/v;", "d", "(Ljava/lang/String;)Lokhttp3/v;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.v$b */
    /* compiled from: HttpUrl.kt */
    public static final class C15992b {
        private C15992b() {
        }

        public /* synthetic */ C15992b(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m96376b(C15992b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return bVar.mo76301a(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m96377e(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || C16279b.m97629E(str.charAt(i + 1)) == -1 || C16279b.m97629E(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public static /* synthetic */ String m96378h(C15992b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.mo76305g(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
            if (m96377e(r1, r5, r2) == false) goto L_0x0072;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m96379l(p226cd.C11179b r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002e
                r8 = 9
                if (r7 == r8) goto L_0x0029
                r8 = 10
                if (r7 == r8) goto L_0x0029
                r8 = 12
                if (r7 == r8) goto L_0x0029
                r8 = 13
                if (r7 == r8) goto L_0x0029
                goto L_0x002e
            L_0x0029:
                r8 = r14
                r12 = r19
                goto L_0x00b8
            L_0x002e:
                r8 = 43
                if (r7 != r8) goto L_0x003f
                if (r22 == 0) goto L_0x003f
                if (r20 == 0) goto L_0x0039
                java.lang.String r8 = "+"
                goto L_0x003b
            L_0x0039:
                java.lang.String r8 = "%2B"
            L_0x003b:
                r15.mo62455s0(r8)
                goto L_0x0029
            L_0x003f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006f
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004f
                if (r23 == 0) goto L_0x006f
            L_0x004f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.C15177w.m93661M(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006d
                if (r7 != r9) goto L_0x0068
                if (r20 == 0) goto L_0x006d
                if (r21 == 0) goto L_0x0068
                r8 = r14
                boolean r10 = r14.m96377e(r1, r5, r2)
                if (r10 != 0) goto L_0x0069
                goto L_0x0072
            L_0x0068:
                r8 = r14
            L_0x0069:
                r15.mo62440j0(r7)
                goto L_0x00b8
            L_0x006d:
                r8 = r14
                goto L_0x0072
            L_0x006f:
                r8 = r14
                r12 = r19
            L_0x0072:
                if (r6 != 0) goto L_0x0079
                cd.b r6 = new cd.b
                r6.<init>()
            L_0x0079:
                if (r3 == 0) goto L_0x008d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C13706o.m87924a(r3, r10)
                if (r10 == 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo62421Z(r1, r5, r10, r3)
                goto L_0x0090
            L_0x008d:
                r6.mo62440j0(r7)
            L_0x0090:
                boolean r10 = r6.mo62469x1()
                if (r10 != 0) goto L_0x00b8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.C15989v.f65794k
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.C15989v.f65794k
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x0090
            L_0x00b8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15989v.C15992b.m96379l(cd.b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m96380m(C11179b bVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int E = C16279b.m97629E(str.charAt(i + 1));
                    int E2 = C16279b.m97629E(str.charAt(i3));
                    if (!(E == -1 || E2 == -1)) {
                        bVar.writeByte((E << 4) + E2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                } else if (codePointAt == 43 && z) {
                    bVar.writeByte(32);
                    i++;
                }
                bVar.mo62440j0(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }

        /* renamed from: a */
        public final String mo76301a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            C13706o.m87929f(str, "$this$canonicalize");
            C13706o.m87929f(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C15177w.m93661M(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!m96377e(str, i4, i3)) {
                                    C11179b bVar = new C11179b();
                                    int i5 = i;
                                    bVar.mo62460v0(str, i, i4);
                                    m96379l(bVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return bVar.mo62471z();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C11179b bVar2 = new C11179b();
                                    int i52 = i;
                                    bVar2.mo62460v0(str, i, i4);
                                    m96379l(bVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return bVar2.mo62471z();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C11179b bVar22 = new C11179b();
                int i522 = i;
                bVar22.mo62460v0(str, i, i4);
                m96379l(bVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return bVar22.mo62471z();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int mo76302c(String str) {
            C13706o.m87929f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals(ProxyConfig.MATCH_HTTPS)) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: d */
        public final C15989v mo76303d(String str) {
            C13706o.m87929f(str, "$this$toHttpUrl");
            return new C15990a().mo76288j((C15989v) null, str).mo76284c();
        }

        /* renamed from: f */
        public final C15989v mo76304f(String str) {
            C13706o.m87929f(str, "$this$toHttpUrlOrNull");
            try {
                return mo76303d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String mo76305g(String str, int i, int i2, boolean z) {
            C13706o.m87929f(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C11179b bVar = new C11179b();
                    bVar.mo62460v0(str, i, i3);
                    m96380m(bVar, str, i3, i2, z);
                    return bVar.mo62471z();
                }
            }
            String substring = str.substring(i, i2);
            C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void mo76306i(List<String> list, StringBuilder sb) {
            C13706o.m87929f(list, "$this$toPathString");
            C13706o.m87929f(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        /* renamed from: j */
        public final List<String> mo76307j(String str) {
            C13706o.m87929f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int Z = C15177w.m93681Z(str, '&', i, false, 4, (Object) null);
                if (Z == -1) {
                    Z = str.length();
                }
                int i2 = Z;
                int Z2 = C15177w.m93681Z(str, '=', i, false, 4, (Object) null);
                if (Z2 == -1 || Z2 > i2) {
                    String substring = str.substring(i, i2);
                    C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, Z2);
                    C13706o.m87928e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(Z2 + 1, i2);
                    C13706o.m87928e(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void mo76308k(List<String> list, StringBuilder sb) {
            C13706o.m87929f(list, "$this$toQueryString");
            C13706o.m87929f(sb, "out");
            C16785c j = C16792h.m99548j(C16792h.m99549k(0, list.size()), 2);
            int d = j.mo79764d();
            int f = j.mo79766f();
            int h = j.mo79767h();
            if (h >= 0) {
                if (d > f) {
                    return;
                }
            } else if (d < f) {
                return;
            }
            while (true) {
                String str = list.get(d);
                String str2 = list.get(d + 1);
                if (d > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (d != f) {
                    d += h;
                } else {
                    return;
                }
            }
        }
    }

    public C15989v(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C13706o.m87929f(str, "scheme");
        C13706o.m87929f(str2, "username");
        C13706o.m87929f(str3, "password");
        C13706o.m87929f(str4, "host");
        C13706o.m87929f(list, "pathSegments");
        C13706o.m87929f(str6, "url");
        this.f65797b = str;
        this.f65798c = str2;
        this.f65799d = str3;
        this.f65800e = str4;
        this.f65801f = i;
        this.f65802g = list;
        this.f65803h = list2;
        this.f65804i = str5;
        this.f65805j = str6;
        this.f65796a = C13706o.m87924a(str, ProxyConfig.MATCH_HTTPS);
    }

    /* renamed from: h */
    public static final C15989v m96325h(String str) {
        return f65795l.mo76303d(str);
    }

    /* renamed from: b */
    public final String mo76261b() {
        if (this.f65804i == null) {
            return null;
        }
        String str = this.f65805j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C15177w.m93681Z(this.f65805j, '#', 0, false, 6, (Object) null) + 1);
        C13706o.m87928e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public final String mo76262c() {
        if (this.f65799d.length() == 0) {
            return "";
        }
        int Z = C15177w.m93681Z(this.f65805j, '@', 0, false, 6, (Object) null);
        String str = this.f65805j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C15177w.m93681Z(this.f65805j, ':', this.f65797b.length() + 3, false, 4, (Object) null) + 1, Z);
        C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public final String mo76263d() {
        int Z = C15177w.m93681Z(this.f65805j, '/', this.f65797b.length() + 3, false, 4, (Object) null);
        String str = this.f65805j;
        int n = C16279b.m97660n(str, "?#", Z, str.length());
        String str2 = this.f65805j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Z, n);
        C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final List<String> mo76264e() {
        int Z = C15177w.m93681Z(this.f65805j, '/', this.f65797b.length() + 3, false, 4, (Object) null);
        String str = this.f65805j;
        int n = C16279b.m97660n(str, "?#", Z, str.length());
        ArrayList arrayList = new ArrayList();
        while (Z < n) {
            int i = Z + 1;
            int m = C16279b.m97659m(this.f65805j, '/', i, n);
            String str2 = this.f65805j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, m);
            C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Z = m;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15989v) && C13706o.m87924a(((C15989v) obj).f65805j, this.f65805j);
    }

    /* renamed from: f */
    public final String mo76266f() {
        if (this.f65803h == null) {
            return null;
        }
        int Z = C15177w.m93681Z(this.f65805j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f65805j;
        int m = C16279b.m97659m(str, '#', Z, str.length());
        String str2 = this.f65805j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Z, m);
        C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g */
    public final String mo76267g() {
        if (this.f65798c.length() == 0) {
            return "";
        }
        int length = this.f65797b.length() + 3;
        String str = this.f65805j;
        int n = C16279b.m97660n(str, ":@", length, str.length());
        String str2 = this.f65805j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, n);
        C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f65805j.hashCode();
    }

    /* renamed from: i */
    public final String mo76269i() {
        return this.f65800e;
    }

    /* renamed from: j */
    public final boolean mo76270j() {
        return this.f65796a;
    }

    /* renamed from: k */
    public final C15990a mo76271k() {
        C15990a aVar = new C15990a();
        aVar.mo76299w(this.f65797b);
        aVar.mo76295t(mo76267g());
        aVar.mo76294s(mo76262c());
        aVar.mo76297u(this.f65800e);
        aVar.mo76298v(this.f65801f != f65795l.mo76302c(this.f65797b) ? this.f65801f : -1);
        aVar.mo76286f().clear();
        aVar.mo76286f().addAll(mo76264e());
        aVar.mo76285e(mo76266f());
        aVar.mo76293r(mo76261b());
        return aVar;
    }

    /* renamed from: l */
    public final C15990a mo76272l(String str) {
        C13706o.m87929f(str, "link");
        try {
            return new C15990a().mo76288j(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List<String> mo76273m() {
        return this.f65802g;
    }

    /* renamed from: n */
    public final int mo76274n() {
        return this.f65801f;
    }

    /* renamed from: o */
    public final String mo76275o() {
        if (this.f65803h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f65795l.mo76308k(this.f65803h, sb);
        return sb.toString();
    }

    /* renamed from: p */
    public final String mo76276p() {
        C15990a l = mo76272l("/...");
        C13706o.m87926c(l);
        return l.mo76300x("").mo76289k("").mo76284c().toString();
    }

    /* renamed from: q */
    public final C15989v mo76277q(String str) {
        C13706o.m87929f(str, "link");
        C15990a l = mo76272l(str);
        if (l != null) {
            return l.mo76284c();
        }
        return null;
    }

    /* renamed from: r */
    public final String mo76278r() {
        return this.f65797b;
    }

    /* renamed from: s */
    public final URI mo76279s() {
        String aVar = mo76271k().mo76291o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C15159j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo74469d(aVar, ""));
                C13706o.m87928e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: t */
    public final URL mo76280t() {
        try {
            return new URL(this.f65805j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f65805j;
    }
}
