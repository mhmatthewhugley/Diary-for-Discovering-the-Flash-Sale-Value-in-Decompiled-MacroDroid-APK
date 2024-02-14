package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import okhttp3.C15995x;
import p226cd.C11184c;
import p226cd.C11188e;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f"}, mo71668d2 = {"Lokhttp3/c0;", "", "Lokhttp3/x;", "b", "", "a", "Lcd/c;", "sink", "Lja/u;", "h", "", "f", "g", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.c0 */
/* compiled from: RequestBody.kt */
public abstract class C15907c0 {

    /* renamed from: a */
    public static final C15908a f65424a = new C15908a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, mo71668d2 = {"Lokhttp3/c0$a;", "", "", "Lokhttp3/x;", "contentType", "Lokhttp3/c0;", "c", "(Ljava/lang/String;Lokhttp3/x;)Lokhttp3/c0;", "Lcd/e;", "a", "(Lcd/e;Lokhttp3/x;)Lokhttp3/c0;", "", "", "offset", "byteCount", "h", "([BLokhttp3/x;II)Lokhttp3/c0;", "Ljava/io/File;", "b", "(Ljava/io/File;Lokhttp3/x;)Lokhttp3/c0;", "content", "f", "d", "g", "file", "e", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.c0$a */
    /* compiled from: RequestBody.kt */
    public static final class C15908a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo71668d2 = {"okhttp3/c0$a$a", "Lokhttp3/c0;", "Lokhttp3/x;", "b", "", "a", "Lcd/c;", "sink", "Lja/u;", "h", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.c0$a$a */
        /* compiled from: RequestBody.kt */
        public static final class C15909a extends C15907c0 {

            /* renamed from: b */
            final /* synthetic */ File f65425b;

            /* renamed from: c */
            final /* synthetic */ C15995x f65426c;

            C15909a(File file, C15995x xVar) {
                this.f65425b = file;
                this.f65426c = xVar;
            }

            /* renamed from: a */
            public long mo75937a() {
                return this.f65425b.length();
            }

            /* renamed from: b */
            public C15995x mo75938b() {
                return this.f65426c;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                kotlin.p312io.C13667b.m87853a(r0, r3);
             */
            /* renamed from: h */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo75941h(p226cd.C11184c r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    kotlin.jvm.internal.C13706o.m87929f(r3, r0)
                    java.io.File r0 = r2.f65425b
                    cd.y r0 = p226cd.C11196l.m75167f(r0)
                    r3.mo62396A1(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    kotlin.p312io.C13667b.m87853a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    kotlin.p312io.C13667b.m87853a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15907c0.C15908a.C15909a.mo75941h(cd.c):void");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo71668d2 = {"okhttp3/c0$a$b", "Lokhttp3/c0;", "Lokhttp3/x;", "b", "", "a", "Lcd/c;", "sink", "Lja/u;", "h", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.c0$a$b */
        /* compiled from: RequestBody.kt */
        public static final class C15910b extends C15907c0 {

            /* renamed from: b */
            final /* synthetic */ C11188e f65427b;

            /* renamed from: c */
            final /* synthetic */ C15995x f65428c;

            C15910b(C11188e eVar, C15995x xVar) {
                this.f65427b = eVar;
                this.f65428c = xVar;
            }

            /* renamed from: a */
            public long mo75937a() {
                return (long) this.f65427b.mo62485C();
            }

            /* renamed from: b */
            public C15995x mo75938b() {
                return this.f65428c;
            }

            /* renamed from: h */
            public void mo75941h(C11184c cVar) {
                C13706o.m87929f(cVar, "sink");
                cVar.mo62419V(this.f65427b);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo71668d2 = {"okhttp3/c0$a$c", "Lokhttp3/c0;", "Lokhttp3/x;", "b", "", "a", "Lcd/c;", "sink", "Lja/u;", "h", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.c0$a$c */
        /* compiled from: RequestBody.kt */
        public static final class C15911c extends C15907c0 {

            /* renamed from: b */
            final /* synthetic */ byte[] f65429b;

            /* renamed from: c */
            final /* synthetic */ C15995x f65430c;

            /* renamed from: d */
            final /* synthetic */ int f65431d;

            /* renamed from: e */
            final /* synthetic */ int f65432e;

            C15911c(byte[] bArr, C15995x xVar, int i, int i2) {
                this.f65429b = bArr;
                this.f65430c = xVar;
                this.f65431d = i;
                this.f65432e = i2;
            }

            /* renamed from: a */
            public long mo75937a() {
                return (long) this.f65431d;
            }

            /* renamed from: b */
            public C15995x mo75938b() {
                return this.f65430c;
            }

            /* renamed from: h */
            public void mo75941h(C11184c cVar) {
                C13706o.m87929f(cVar, "sink");
                cVar.write(this.f65429b, this.f65432e, this.f65431d);
            }
        }

        private C15908a() {
        }

        public /* synthetic */ C15908a(C13695i iVar) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ C15907c0 m95950i(C15908a aVar, C15995x xVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo75948g(xVar, bArr, i, i2);
        }

        /* renamed from: j */
        public static /* synthetic */ C15907c0 m95951j(C15908a aVar, byte[] bArr, C15995x xVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                xVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo75949h(bArr, xVar, i, i2);
        }

        /* renamed from: a */
        public final C15907c0 mo75942a(C11188e eVar, C15995x xVar) {
            C13706o.m87929f(eVar, "$this$toRequestBody");
            return new C15910b(eVar, xVar);
        }

        /* renamed from: b */
        public final C15907c0 mo75943b(File file, C15995x xVar) {
            C13706o.m87929f(file, "$this$asRequestBody");
            return new C15909a(file, xVar);
        }

        /* renamed from: c */
        public final C15907c0 mo75944c(String str, C15995x xVar) {
            C13706o.m87929f(str, "$this$toRequestBody");
            Charset charset = C15147d.f64349b;
            if (xVar != null) {
                Charset d = C15995x.m96394d(xVar, (Charset) null, 1, (Object) null);
                if (d == null) {
                    C15995x.C15996a aVar = C15995x.f65817g;
                    xVar = aVar.mo76320b(xVar + "; charset=utf-8");
                } else {
                    charset = d;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C13706o.m87928e(bytes, "(this as java.lang.String).getBytes(charset)");
            return mo75949h(bytes, xVar, 0, bytes.length);
        }

        /* renamed from: d */
        public final C15907c0 mo75945d(C15995x xVar, C11188e eVar) {
            C13706o.m87929f(eVar, "content");
            return mo75942a(eVar, xVar);
        }

        /* renamed from: e */
        public final C15907c0 mo75946e(C15995x xVar, File file) {
            C13706o.m87929f(file, "file");
            return mo75943b(file, xVar);
        }

        /* renamed from: f */
        public final C15907c0 mo75947f(C15995x xVar, String str) {
            C13706o.m87929f(str, "content");
            return mo75944c(str, xVar);
        }

        /* renamed from: g */
        public final C15907c0 mo75948g(C15995x xVar, byte[] bArr, int i, int i2) {
            C13706o.m87929f(bArr, "content");
            return mo75949h(bArr, xVar, i, i2);
        }

        /* renamed from: h */
        public final C15907c0 mo75949h(byte[] bArr, C15995x xVar, int i, int i2) {
            C13706o.m87929f(bArr, "$this$toRequestBody");
            C16279b.m97655i((long) bArr.length, (long) i, (long) i2);
            return new C15911c(bArr, xVar, i2, i);
        }
    }

    /* renamed from: c */
    public static final C15907c0 m95942c(C15995x xVar, C11188e eVar) {
        return f65424a.mo75945d(xVar, eVar);
    }

    /* renamed from: d */
    public static final C15907c0 m95943d(C15995x xVar, String str) {
        return f65424a.mo75947f(xVar, str);
    }

    /* renamed from: e */
    public static final C15907c0 m95944e(C15995x xVar, byte[] bArr) {
        return C15908a.m95950i(f65424a, xVar, bArr, 0, 0, 12, (Object) null);
    }

    /* renamed from: a */
    public long mo75937a() throws IOException {
        return -1;
    }

    /* renamed from: b */
    public abstract C15995x mo75938b();

    /* renamed from: f */
    public boolean mo75939f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo75940g() {
        return false;
    }

    /* renamed from: h */
    public abstract void mo75941h(C11184c cVar) throws IOException;
}
