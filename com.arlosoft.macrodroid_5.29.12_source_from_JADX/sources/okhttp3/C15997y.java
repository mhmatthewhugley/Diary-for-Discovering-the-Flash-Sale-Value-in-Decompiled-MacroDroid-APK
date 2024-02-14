package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15986u;
import okhttp3.C15995x;
import p226cd.C11184c;
import p226cd.C11188e;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0003\n\t\u000fB'\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, mo71668d2 = {"Lokhttp3/y;", "Lokhttp3/c0;", "Lcd/c;", "sink", "", "countBytes", "", "j", "Lokhttp3/x;", "b", "a", "Lja/u;", "h", "Lokhttp3/x;", "contentType", "c", "J", "contentLength", "e", "type", "()Lokhttp3/x;", "", "Lokhttp3/y$c;", "f", "Ljava/util/List;", "parts", "()Ljava/util/List;", "", "i", "()Ljava/lang/String;", "boundary", "Lcd/e;", "boundaryByteString", "<init>", "(Lcd/e;Lokhttp3/x;Ljava/util/List;)V", "o", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.y */
/* compiled from: MultipartBody.kt */
public final class C15997y extends C15907c0 {

    /* renamed from: g */
    public static final C15995x f65822g;

    /* renamed from: h */
    public static final C15995x f65823h;

    /* renamed from: i */
    public static final C15995x f65824i;

    /* renamed from: j */
    public static final C15995x f65825j;

    /* renamed from: k */
    public static final C15995x f65826k;

    /* renamed from: l */
    private static final byte[] f65827l = {(byte) 58, (byte) 32};

    /* renamed from: m */
    private static final byte[] f65828m = {(byte) 13, (byte) 10};

    /* renamed from: n */
    private static final byte[] f65829n;

    /* renamed from: o */
    public static final C15999b f65830o = new C15999b((C13695i) null);

    /* renamed from: b */
    private final C15995x f65831b;

    /* renamed from: c */
    private long f65832c = -1;

    /* renamed from: d */
    private final C11188e f65833d;

    /* renamed from: e */
    private final C15995x f65834e;

    /* renamed from: f */
    private final List<C16000c> f65835f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, mo71668d2 = {"Lokhttp3/y$b;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lja/u;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/x;", "ALTERNATIVE", "Lokhttp3/x;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.y$b */
    /* compiled from: MultipartBody.kt */
    public static final class C15999b {
        private C15999b() {
        }

        public /* synthetic */ C15999b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo76326a(StringBuilder sb, String str) {
            C13706o.m87929f(sb, "$this$appendQuotedString");
            C13706o.m87929f(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u001b\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/y$c;", "", "Lokhttp3/u;", "a", "Lokhttp3/u;", "b", "()Lokhttp3/u;", "headers", "Lokhttp3/c0;", "Lokhttp3/c0;", "()Lokhttp3/c0;", "body", "<init>", "(Lokhttp3/u;Lokhttp3/c0;)V", "c", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.y$c */
    /* compiled from: MultipartBody.kt */
    public static final class C16000c {

        /* renamed from: c */
        public static final C16001a f65839c = new C16001a((C13695i) null);

        /* renamed from: a */
        private final C15986u f65840a;

        /* renamed from: b */
        private final C15907c0 f65841b;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, mo71668d2 = {"Lokhttp3/y$c$a;", "", "Lokhttp3/u;", "headers", "Lokhttp3/c0;", "body", "Lokhttp3/y$c;", "a", "", "name", "filename", "b", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.y$c$a */
        /* compiled from: MultipartBody.kt */
        public static final class C16001a {
            private C16001a() {
            }

            public /* synthetic */ C16001a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final C16000c mo76329a(C15986u uVar, C15907c0 c0Var) {
                C13706o.m87929f(c0Var, "body");
                boolean z = true;
                if ((uVar != null ? uVar.mo76241c("Content-Type") : null) == null) {
                    if ((uVar != null ? uVar.mo76241c("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new C16000c(uVar, c0Var, (C13695i) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            /* renamed from: b */
            public final C16000c mo76330b(String str, String str2, C15907c0 c0Var) {
                C13706o.m87929f(str, "name");
                C13706o.m87929f(c0Var, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                C15999b bVar = C15997y.f65830o;
                bVar.mo76326a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.mo76326a(sb, str2);
                }
                String sb2 = sb.toString();
                C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
                return mo76329a(new C15986u.C15987a().mo76255e("Content-Disposition", sb2).mo76256f(), c0Var);
            }
        }

        private C16000c(C15986u uVar, C15907c0 c0Var) {
            this.f65840a = uVar;
            this.f65841b = c0Var;
        }

        /* renamed from: a */
        public final C15907c0 mo76327a() {
            return this.f65841b;
        }

        /* renamed from: b */
        public final C15986u mo76328b() {
            return this.f65840a;
        }

        public /* synthetic */ C16000c(C15986u uVar, C15907c0 c0Var, C13695i iVar) {
            this(uVar, c0Var);
        }
    }

    static {
        C15995x.C15996a aVar = C15995x.f65817g;
        f65822g = aVar.mo76319a("multipart/mixed");
        f65823h = aVar.mo76319a("multipart/alternative");
        f65824i = aVar.mo76319a("multipart/digest");
        f65825j = aVar.mo76319a("multipart/parallel");
        f65826k = aVar.mo76319a(ShareTarget.ENCODING_TYPE_MULTIPART);
        byte b = (byte) 45;
        f65829n = new byte[]{b, b};
    }

    public C15997y(C11188e eVar, C15995x xVar, List<C16000c> list) {
        C13706o.m87929f(eVar, "boundaryByteString");
        C13706o.m87929f(xVar, "type");
        C13706o.m87929f(list, "parts");
        this.f65833d = eVar;
        this.f65834e = xVar;
        this.f65835f = list;
        C15995x.C15996a aVar = C15995x.f65817g;
        this.f65831b = aVar.mo76319a(xVar + "; boundary=" + mo76321i());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: cd.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: cd.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: cd.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: cd.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: cd.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m96402j(p226cd.C11184c r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            cd.b r13 = new cd.b
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.y$c> r1 = r12.f65835f
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List<okhttp3.y$c> r6 = r12.f65835f
            java.lang.Object r6 = r6.get(r5)
            okhttp3.y$c r6 = (okhttp3.C15997y.C16000c) r6
            okhttp3.u r7 = r6.mo76328b()
            okhttp3.c0 r6 = r6.mo76327a()
            kotlin.jvm.internal.C13706o.m87926c(r13)
            byte[] r8 = f65829n
            r13.write(r8)
            cd.e r8 = r12.f65833d
            r13.mo62419V(r8)
            byte[] r8 = f65828m
            r13.write(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = 0
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.mo76242d(r9)
            cd.c r10 = r13.mo62455s0(r10)
            byte[] r11 = f65827l
            cd.c r10 = r10.write(r11)
            java.lang.String r11 = r7.mo76246i(r9)
            cd.c r10 = r10.mo62455s0(r11)
            byte[] r11 = f65828m
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            okhttp3.x r7 = r6.mo75938b()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            cd.c r8 = r13.mo62455s0(r8)
            java.lang.String r7 = r7.toString()
            cd.c r7 = r8.mo62455s0(r7)
            byte[] r8 = f65828m
            r7.write(r8)
        L_0x0078:
            long r7 = r6.mo75937a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            cd.c r9 = r13.mo62455s0(r9)
            cd.c r9 = r9.mo62423a1(r7)
            byte[] r10 = f65828m
            r9.write(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r0.mo62424b()
            return r9
        L_0x009b:
            byte[] r9 = f65828m
            r13.write(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.mo75941h(r13)
        L_0x00a7:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            kotlin.jvm.internal.C13706o.m87926c(r13)
            byte[] r1 = f65829n
            r13.write(r1)
            cd.e r2 = r12.f65833d
            r13.mo62419V(r2)
            r13.write(r1)
            byte[] r1 = f65828m
            r13.write(r1)
            if (r14 == 0) goto L_0x00d0
            kotlin.jvm.internal.C13706o.m87926c(r0)
            long r13 = r0.mo62399D()
            long r3 = r3 + r13
            r0.mo62424b()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15997y.m96402j(cd.c, boolean):long");
    }

    /* renamed from: a */
    public long mo75937a() throws IOException {
        long j = this.f65832c;
        if (j != -1) {
            return j;
        }
        long j2 = m96402j((C11184c) null, true);
        this.f65832c = j2;
        return j2;
    }

    /* renamed from: b */
    public C15995x mo75938b() {
        return this.f65831b;
    }

    /* renamed from: h */
    public void mo75941h(C11184c cVar) throws IOException {
        C13706o.m87929f(cVar, "sink");
        m96402j(cVar, false);
    }

    /* renamed from: i */
    public final String mo76321i() {
        return this.f65833d.mo62489H();
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, mo71668d2 = {"Lokhttp3/y$a;", "", "Lokhttp3/x;", "type", "d", "Lokhttp3/u;", "headers", "Lokhttp3/c0;", "body", "a", "Lokhttp3/y$c;", "part", "b", "Lokhttp3/y;", "c", "Lokhttp3/x;", "", "Ljava/util/List;", "parts", "", "boundary", "<init>", "(Ljava/lang/String;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.y$a */
    /* compiled from: MultipartBody.kt */
    public static final class C15998a {

        /* renamed from: a */
        private final C11188e f65836a;

        /* renamed from: b */
        private C15995x f65837b;

        /* renamed from: c */
        private final List<C16000c> f65838c;

        public C15998a() {
            this((String) null, 1, (C13695i) null);
        }

        public C15998a(String str) {
            C13706o.m87929f(str, "boundary");
            this.f65836a = C11188e.f54104d.mo62513c(str);
            this.f65837b = C15997y.f65822g;
            this.f65838c = new ArrayList();
        }

        /* renamed from: a */
        public final C15998a mo76322a(C15986u uVar, C15907c0 c0Var) {
            C13706o.m87929f(c0Var, "body");
            mo76323b(C16000c.f65839c.mo76329a(uVar, c0Var));
            return this;
        }

        /* renamed from: b */
        public final C15998a mo76323b(C16000c cVar) {
            C13706o.m87929f(cVar, "part");
            this.f65838c.add(cVar);
            return this;
        }

        /* renamed from: c */
        public final C15997y mo76324c() {
            if (!this.f65838c.isEmpty()) {
                return new C15997y(this.f65836a, this.f65837b, C16279b.m97639O(this.f65838c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final C15998a mo76325d(C15995x xVar) {
            C13706o.m87929f(xVar, "type");
            if (C13706o.m87924a(xVar.mo76316h(), "multipart")) {
                this.f65837b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C15998a(java.lang.String r1, int r2, kotlin.jvm.internal.C13695i r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15997y.C15998a.<init>(java.lang.String, int, kotlin.jvm.internal.i):void");
        }
    }
}
