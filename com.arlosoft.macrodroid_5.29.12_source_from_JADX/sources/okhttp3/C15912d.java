package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 '2\u00020\u0001:\u0002\u0005\nBs\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0011\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0019\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0018\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, mo71668d2 = {"Lokhttp3/d;", "", "", "toString", "", "a", "Z", "g", "()Z", "noCache", "b", "h", "noStore", "", "c", "I", "()I", "maxAgeSeconds", "d", "sMaxAgeSeconds", "e", "isPrivate", "f", "isPublic", "mustRevalidate", "maxStaleSeconds", "i", "minFreshSeconds", "j", "onlyIfCached", "k", "noTransform", "l", "immutable", "m", "Ljava/lang/String;", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "p", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.d */
/* compiled from: CacheControl.kt */
public final class C15912d {

    /* renamed from: n */
    public static final C15912d f65433n = new C15913a().mo75962d().mo75960a();

    /* renamed from: o */
    public static final C15912d f65434o = new C15913a().mo75963e().mo75961c(Integer.MAX_VALUE, TimeUnit.SECONDS).mo75960a();

    /* renamed from: p */
    public static final C15914b f65435p = new C15914b((C13695i) null);

    /* renamed from: a */
    private final boolean f65436a;

    /* renamed from: b */
    private final boolean f65437b;

    /* renamed from: c */
    private final int f65438c;

    /* renamed from: d */
    private final int f65439d;

    /* renamed from: e */
    private final boolean f65440e;

    /* renamed from: f */
    private final boolean f65441f;

    /* renamed from: g */
    private final boolean f65442g;

    /* renamed from: h */
    private final int f65443h;

    /* renamed from: i */
    private final int f65444i;

    /* renamed from: j */
    private final boolean f65445j;

    /* renamed from: k */
    private final boolean f65446k;

    /* renamed from: l */
    private final boolean f65447l;

    /* renamed from: m */
    private String f65448m;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e¨\u0006\u001d"}, mo71668d2 = {"Lokhttp3/d$a;", "", "", "", "b", "d", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "c", "e", "Lokhttp3/d;", "a", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "f", "onlyIfCached", "g", "noTransform", "h", "immutable", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.d$a */
    /* compiled from: CacheControl.kt */
    public static final class C15913a {

        /* renamed from: a */
        private boolean f65449a;

        /* renamed from: b */
        private boolean f65450b;

        /* renamed from: c */
        private int f65451c = -1;

        /* renamed from: d */
        private int f65452d = -1;

        /* renamed from: e */
        private int f65453e = -1;

        /* renamed from: f */
        private boolean f65454f;

        /* renamed from: g */
        private boolean f65455g;

        /* renamed from: h */
        private boolean f65456h;

        /* renamed from: b */
        private final int m95978b(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        /* renamed from: a */
        public final C15912d mo75960a() {
            return new C15912d(this.f65449a, this.f65450b, this.f65451c, -1, false, false, false, this.f65452d, this.f65453e, this.f65454f, this.f65455g, this.f65456h, (String) null, (C13695i) null);
        }

        /* renamed from: c */
        public final C15913a mo75961c(int i, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f65452d = m95978b(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        /* renamed from: d */
        public final C15913a mo75962d() {
            this.f65449a = true;
            return this;
        }

        /* renamed from: e */
        public final C15913a mo75963e() {
            this.f65454f = true;
            return this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lokhttp3/d$b;", "", "", "characters", "", "startIndex", "a", "Lokhttp3/u;", "headers", "Lokhttp3/d;", "b", "FORCE_CACHE", "Lokhttp3/d;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.d$b */
    /* compiled from: CacheControl.kt */
    public static final class C15914b {
        private C15914b() {
        }

        public /* synthetic */ C15914b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        private final int m95983a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C15177w.m93661M(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.C15912d mo75964b(okhttp3.C15986u r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.C13706o.m87929f(r1, r2)
                int r2 = r32.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0181
                java.lang.String r3 = r1.mo76242d(r7)
                java.lang.String r5 = r1.mo76246i(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.C15176v.m93641v(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.text.C15176v.m93641v(r3, r4, r6)
                if (r3 == 0) goto L_0x0176
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x0171
                java.lang.String r4 = "=,;"
                int r4 = r0.m95983a(r5, r4, r3)
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r3, r6)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r3, r1)
                java.lang.CharSequence r3 = kotlin.text.C15177w.m93672R0(r3)
                java.lang.String r3 = r3.toString()
                r29 = r2
                int r2 = r5.length()
                if (r4 == r2) goto L_0x00cb
                char r2 = r5.charAt(r4)
                r30 = r8
                r8 = 44
                if (r2 == r8) goto L_0x00cd
                char r2 = r5.charAt(r4)
                r8 = 59
                if (r2 != r8) goto L_0x0081
                goto L_0x00cd
            L_0x0081:
                int r4 = r4 + 1
                int r2 = p372qc.C16279b.m97625A(r5, r4)
                int r4 = r5.length()
                if (r2 >= r4) goto L_0x00b2
                char r4 = r5.charAt(r2)
                r8 = 34
                if (r4 != r8) goto L_0x00b2
                int r2 = r2 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r2
                int r1 = kotlin.text.C15177w.m93681Z(r23, r24, r25, r26, r27, r28)
                java.lang.String r2 = r5.substring(r2, r1)
                kotlin.jvm.internal.C13706o.m87928e(r2, r6)
                r4 = 1
                int r1 = r1 + r4
                r4 = r1
                goto L_0x00d0
            L_0x00b2:
                java.lang.String r4 = ",;"
                int r4 = r0.m95983a(r5, r4, r2)
                java.lang.String r2 = r5.substring(r2, r4)
                kotlin.jvm.internal.C13706o.m87928e(r2, r6)
                java.util.Objects.requireNonNull(r2, r1)
                java.lang.CharSequence r1 = kotlin.text.C15177w.m93672R0(r2)
                java.lang.String r2 = r1.toString()
                goto L_0x00d0
            L_0x00cb:
                r30 = r8
            L_0x00cd:
                int r4 = r4 + 1
                r2 = 0
            L_0x00d0:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x00dd
                r1 = -1
                r10 = 1
                goto L_0x0168
            L_0x00dd:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x00e9
                r1 = -1
                r11 = 1
                goto L_0x0168
            L_0x00e9:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                int r12 = p372qc.C16279b.m97642R(r2, r1)
                goto L_0x0168
            L_0x00f8:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = kotlin.text.C15176v.m93641v(r8, r3, r6)
                if (r8 == 0) goto L_0x0106
                int r13 = p372qc.C16279b.m97642R(r2, r1)
                goto L_0x0168
            L_0x0106:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x0111
                r1 = -1
                r14 = 1
                goto L_0x0168
            L_0x0111:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x011c
                r1 = -1
                r15 = 1
                goto L_0x0168
            L_0x011c:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x0128
                r1 = -1
                r16 = 1
                goto L_0x0168
            L_0x0128:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x0139
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p372qc.C16279b.m97642R(r2, r1)
                r1 = -1
                goto L_0x0168
            L_0x0139:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.text.C15176v.m93641v(r1, r3, r6)
                if (r1 == 0) goto L_0x0147
                r1 = -1
                int r18 = p372qc.C16279b.m97642R(r2, r1)
                goto L_0x0168
            L_0x0147:
                r1 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = kotlin.text.C15176v.m93641v(r2, r3, r6)
                if (r2 == 0) goto L_0x0153
                r19 = 1
                goto L_0x0168
            L_0x0153:
                java.lang.String r2 = "no-transform"
                boolean r2 = kotlin.text.C15176v.m93641v(r2, r3, r6)
                if (r2 == 0) goto L_0x015e
                r20 = 1
                goto L_0x0168
            L_0x015e:
                java.lang.String r2 = "immutable"
                boolean r2 = kotlin.text.C15176v.m93641v(r2, r3, r6)
                if (r2 == 0) goto L_0x0168
                r21 = 1
            L_0x0168:
                r1 = r32
                r3 = r4
                r2 = r29
                r8 = r30
                goto L_0x0044
            L_0x0171:
                r29 = r2
                r30 = r8
                goto L_0x0178
            L_0x0176:
                r29 = r2
            L_0x0178:
                r1 = -1
                int r7 = r7 + 1
                r1 = r32
                r2 = r29
                goto L_0x0023
            L_0x0181:
                if (r8 != 0) goto L_0x0186
                r22 = 0
                goto L_0x0188
            L_0x0186:
                r22 = r9
            L_0x0188:
                okhttp3.d r1 = new okhttp3.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15912d.C15914b.mo75964b(okhttp3.u):okhttp3.d");
        }
    }

    private C15912d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f65436a = z;
        this.f65437b = z2;
        this.f65438c = i;
        this.f65439d = i2;
        this.f65440e = z3;
        this.f65441f = z4;
        this.f65442g = z5;
        this.f65443h = i3;
        this.f65444i = i4;
        this.f65445j = z6;
        this.f65446k = z7;
        this.f65447l = z8;
        this.f65448m = str;
    }

    /* renamed from: a */
    public final boolean mo75950a() {
        return this.f65440e;
    }

    /* renamed from: b */
    public final boolean mo75951b() {
        return this.f65441f;
    }

    /* renamed from: c */
    public final int mo75952c() {
        return this.f65438c;
    }

    /* renamed from: d */
    public final int mo75953d() {
        return this.f65443h;
    }

    /* renamed from: e */
    public final int mo75954e() {
        return this.f65444i;
    }

    /* renamed from: f */
    public final boolean mo75955f() {
        return this.f65442g;
    }

    /* renamed from: g */
    public final boolean mo75956g() {
        return this.f65436a;
    }

    /* renamed from: h */
    public final boolean mo75957h() {
        return this.f65437b;
    }

    /* renamed from: i */
    public final boolean mo75958i() {
        return this.f65445j;
    }

    public String toString() {
        String str = this.f65448m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f65436a) {
            sb.append("no-cache, ");
        }
        if (this.f65437b) {
            sb.append("no-store, ");
        }
        if (this.f65438c != -1) {
            sb.append("max-age=");
            sb.append(this.f65438c);
            sb.append(", ");
        }
        if (this.f65439d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f65439d);
            sb.append(", ");
        }
        if (this.f65440e) {
            sb.append("private, ");
        }
        if (this.f65441f) {
            sb.append("public, ");
        }
        if (this.f65442g) {
            sb.append("must-revalidate, ");
        }
        if (this.f65443h != -1) {
            sb.append("max-stale=");
            sb.append(this.f65443h);
            sb.append(", ");
        }
        if (this.f65444i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f65444i);
            sb.append(", ");
        }
        if (this.f65445j) {
            sb.append("only-if-cached, ");
        }
        if (this.f65446k) {
            sb.append("no-transform, ");
        }
        if (this.f65447l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f65448m = sb2;
        return sb2;
    }

    public /* synthetic */ C15912d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C13695i iVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
