package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import okhttp3.C15995x;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11188e;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, mo71668d2 = {"Lokhttp3/e0;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lcd/d;", "consumer", "", "sizeMapper", "consumeSource", "(Lqa/l;Lqa/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/x;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lcd/e;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "Lja/u;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "a", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.e0 */
/* compiled from: ResponseBody.kt */
public abstract class C15919e0 implements Closeable {
    public static final C15921b Companion = new C15921b((C13695i) null);
    private Reader reader;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo71668d2 = {"Lokhttp3/e0$a;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lja/u;", "close", "", "a", "Z", "closed", "c", "Ljava/io/Reader;", "delegate", "Ljava/nio/charset/Charset;", "f", "Ljava/nio/charset/Charset;", "charset", "Lcd/d;", "source", "<init>", "(Lcd/d;Ljava/nio/charset/Charset;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.e0$a */
    /* compiled from: ResponseBody.kt */
    public static final class C15920a extends Reader {

        /* renamed from: a */
        private boolean f65484a;

        /* renamed from: c */
        private Reader f65485c;

        /* renamed from: d */
        private final C11186d f65486d;

        /* renamed from: f */
        private final Charset f65487f;

        public C15920a(C11186d dVar, Charset charset) {
            C13706o.m87929f(dVar, "source");
            C13706o.m87929f(charset, "charset");
            this.f65486d = dVar;
            this.f65487f = charset;
        }

        public void close() throws IOException {
            this.f65484a = true;
            Reader reader = this.f65485c;
            if (reader != null) {
                reader.close();
            } else {
                this.f65486d.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            C13706o.m87929f(cArr, "cbuf");
            if (!this.f65484a) {
                Reader reader = this.f65485c;
                if (reader == null) {
                    reader = new InputStreamReader(this.f65486d.mo62442k2(), C16279b.m97630F(this.f65486d, this.f65487f));
                    this.f65485c = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, mo71668d2 = {"Lokhttp3/e0$b;", "", "", "Lokhttp3/x;", "contentType", "Lokhttp3/e0;", "c", "(Ljava/lang/String;Lokhttp3/x;)Lokhttp3/e0;", "", "h", "([BLokhttp3/x;)Lokhttp3/e0;", "Lcd/e;", "b", "(Lcd/e;Lokhttp3/x;)Lokhttp3/e0;", "Lcd/d;", "", "contentLength", "a", "(Lcd/d;Lokhttp3/x;J)Lokhttp3/e0;", "content", "f", "g", "e", "d", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.e0$b */
    /* compiled from: ResponseBody.kt */
    public static final class C15921b {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo71668d2 = {"okhttp3/e0$b$a", "Lokhttp3/e0;", "Lokhttp3/x;", "contentType", "", "contentLength", "Lcd/d;", "source", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.e0$b$a */
        /* compiled from: ResponseBody.kt */
        public static final class C15922a extends C15919e0 {

            /* renamed from: a */
            final /* synthetic */ C11186d f65488a;

            /* renamed from: c */
            final /* synthetic */ C15995x f65489c;

            /* renamed from: d */
            final /* synthetic */ long f65490d;

            C15922a(C11186d dVar, C15995x xVar, long j) {
                this.f65488a = dVar;
                this.f65489c = xVar;
                this.f65490d = j;
            }

            public long contentLength() {
                return this.f65490d;
            }

            public C15995x contentType() {
                return this.f65489c;
            }

            public C11186d source() {
                return this.f65488a;
            }
        }

        private C15921b() {
        }

        public /* synthetic */ C15921b(C13695i iVar) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ C15919e0 m96028i(C15921b bVar, byte[] bArr, C15995x xVar, int i, Object obj) {
            if ((i & 1) != 0) {
                xVar = null;
            }
            return bVar.mo76024h(bArr, xVar);
        }

        /* renamed from: a */
        public final C15919e0 mo76017a(C11186d dVar, C15995x xVar, long j) {
            C13706o.m87929f(dVar, "$this$asResponseBody");
            return new C15922a(dVar, xVar, j);
        }

        /* renamed from: b */
        public final C15919e0 mo76018b(C11188e eVar, C15995x xVar) {
            C13706o.m87929f(eVar, "$this$toResponseBody");
            return mo76017a(new C11179b().mo62419V(eVar), xVar, (long) eVar.mo62485C());
        }

        /* renamed from: c */
        public final C15919e0 mo76019c(String str, C15995x xVar) {
            C13706o.m87929f(str, "$this$toResponseBody");
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
            C11179b c0 = new C11179b().mo62426c0(str, charset);
            return mo76017a(c0, xVar, c0.mo62399D());
        }

        /* renamed from: d */
        public final C15919e0 mo76020d(C15995x xVar, long j, C11186d dVar) {
            C13706o.m87929f(dVar, "content");
            return mo76017a(dVar, xVar, j);
        }

        /* renamed from: e */
        public final C15919e0 mo76021e(C15995x xVar, C11188e eVar) {
            C13706o.m87929f(eVar, "content");
            return mo76018b(eVar, xVar);
        }

        /* renamed from: f */
        public final C15919e0 mo76022f(C15995x xVar, String str) {
            C13706o.m87929f(str, "content");
            return mo76019c(str, xVar);
        }

        /* renamed from: g */
        public final C15919e0 mo76023g(C15995x xVar, byte[] bArr) {
            C13706o.m87929f(bArr, "content");
            return mo76024h(bArr, xVar);
        }

        /* renamed from: h */
        public final C15919e0 mo76024h(byte[] bArr, C15995x xVar) {
            C13706o.m87929f(bArr, "$this$toResponseBody");
            return mo76017a(new C11179b().write(bArr), xVar, (long) bArr.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo76313c(kotlin.text.C15147d.f64349b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset charset() {
        /*
            r2 = this;
            okhttp3.x r0 = r2.contentType()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = kotlin.text.C15147d.f64349b
            java.nio.charset.Charset r0 = r0.mo76313c(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = kotlin.text.C15147d.f64349b
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15919e0.charset():java.nio.charset.Charset");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        kotlin.jvm.internal.C13705n.m87922b(1);
        kotlin.p312io.C13667b.m87853a(r2, r6);
        kotlin.jvm.internal.C13705n.m87921a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(p370qa.C16265l<? super p226cd.C11186d, ? extends T> r6, p370qa.C16265l<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0067
            cd.d r2 = r5.source()
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch:{ all -> 0x005a }
            kotlin.jvm.internal.C13705n.m87922b(r4)
            kotlin.p312io.C13667b.m87853a(r2, r3)
            kotlin.jvm.internal.C13705n.m87921a(r4)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0059
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            goto L_0x0059
        L_0x0035:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0059:
            return r6
        L_0x005a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005c }
        L_0x005c:
            r7 = move-exception
            kotlin.jvm.internal.C13705n.m87922b(r4)
            kotlin.p312io.C13667b.m87853a(r2, r6)
            kotlin.jvm.internal.C13705n.m87921a(r4)
            throw r7
        L_0x0067:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15919e0.consumeSource(qa.l, qa.l):java.lang.Object");
    }

    public static final C15919e0 create(C11186d dVar, C15995x xVar, long j) {
        return Companion.mo76017a(dVar, xVar, j);
    }

    public static final C15919e0 create(C11188e eVar, C15995x xVar) {
        return Companion.mo76018b(eVar, xVar);
    }

    public static final C15919e0 create(String str, C15995x xVar) {
        return Companion.mo76019c(str, xVar);
    }

    public static final C15919e0 create(C15995x xVar, long j, C11186d dVar) {
        return Companion.mo76020d(xVar, j, dVar);
    }

    public static final C15919e0 create(C15995x xVar, C11188e eVar) {
        return Companion.mo76021e(xVar, eVar);
    }

    public static final C15919e0 create(C15995x xVar, String str) {
        return Companion.mo76022f(xVar, str);
    }

    public static final C15919e0 create(C15995x xVar, byte[] bArr) {
        return Companion.mo76023g(xVar, bArr);
    }

    public static final C15919e0 create(byte[] bArr, C15995x xVar) {
        return Companion.mo76024h(bArr, xVar);
    }

    public final InputStream byteStream() {
        return source().mo62442k2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        kotlin.p312io.C13667b.m87853a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p226cd.C11188e byteString() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            cd.d r2 = r7.source()
            r3 = 0
            cd.e r4 = r2.mo62415S1()     // Catch:{ all -> 0x004d }
            kotlin.p312io.C13667b.m87853a(r2, r3)
            int r2 = r4.mo62485C()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004c
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004c:
            return r4
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            kotlin.p312io.C13667b.m87853a(r2, r0)
            throw r1
        L_0x0054:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15919e0.byteString():cd.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        kotlin.p312io.C13667b.m87853a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0051
            cd.d r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.mo62461v1()     // Catch:{ all -> 0x004a }
            kotlin.p312io.C13667b.m87853a(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            kotlin.p312io.C13667b.m87853a(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15919e0.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        C15920a aVar = new C15920a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    public void close() {
        C16279b.m97656j(source());
    }

    public abstract long contentLength();

    public abstract C15995x contentType();

    public abstract C11186d source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        kotlin.p312io.C13667b.m87853a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            cd.d r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = p372qc.C16279b.m97630F(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo62409L1(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            kotlin.p312io.C13667b.m87853a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            kotlin.p312io.C13667b.m87853a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15919e0.string():java.lang.String");
    }
}
