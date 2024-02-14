package p426wc;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11196l;
import p226cd.C11212y;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u0010B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Lwc/c;", "", "", "Lcd/e;", "", "d", "name", "a", "", "Lwc/b;", "STATIC_HEADER_TABLE", "[Lwc/b;", "c", "()[Lwc/b;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.c */
/* compiled from: Hpack.kt */
public final class C16798c {

    /* renamed from: a */
    private static final C16796b[] f67809a;

    /* renamed from: b */
    private static final Map<C11188e, Integer> f67810b;

    /* renamed from: c */
    public static final C16798c f67811c;

    static {
        C16798c cVar = new C16798c();
        f67811c = cVar;
        C11188e eVar = C16796b.f67801f;
        C11188e eVar2 = C16796b.f67802g;
        C11188e eVar3 = C16796b.f67803h;
        C11188e eVar4 = C16796b.f67800e;
        f67809a = new C16796b[]{new C16796b(C16796b.f67804i, ""), new C16796b(eVar, "GET"), new C16796b(eVar, "POST"), new C16796b(eVar2, "/"), new C16796b(eVar2, "/index.html"), new C16796b(eVar3, "http"), new C16796b(eVar3, (String) ProxyConfig.MATCH_HTTPS), new C16796b(eVar4, "200"), new C16796b(eVar4, "204"), new C16796b(eVar4, "206"), new C16796b(eVar4, "304"), new C16796b(eVar4, "400"), new C16796b(eVar4, "404"), new C16796b(eVar4, "500"), new C16796b("accept-charset", ""), new C16796b("accept-encoding", "gzip, deflate"), new C16796b("accept-language", ""), new C16796b("accept-ranges", ""), new C16796b("accept", ""), new C16796b("access-control-allow-origin", ""), new C16796b("age", ""), new C16796b("allow", ""), new C16796b("authorization", ""), new C16796b("cache-control", ""), new C16796b("content-disposition", ""), new C16796b("content-encoding", ""), new C16796b("content-language", ""), new C16796b("content-length", ""), new C16796b("content-location", ""), new C16796b("content-range", ""), new C16796b("content-type", ""), new C16796b("cookie", ""), new C16796b("date", ""), new C16796b("etag", ""), new C16796b("expect", ""), new C16796b((String) ClientCookie.EXPIRES_ATTR, ""), new C16796b((String) TypedValues.Transition.S_FROM, ""), new C16796b("host", ""), new C16796b("if-match", ""), new C16796b("if-modified-since", ""), new C16796b("if-none-match", ""), new C16796b("if-range", ""), new C16796b("if-unmodified-since", ""), new C16796b("last-modified", ""), new C16796b("link", ""), new C16796b("location", ""), new C16796b("max-forwards", ""), new C16796b("proxy-authenticate", ""), new C16796b("proxy-authorization", ""), new C16796b("range", ""), new C16796b("referer", ""), new C16796b("refresh", ""), new C16796b("retry-after", ""), new C16796b("server", ""), new C16796b("set-cookie", ""), new C16796b("strict-transport-security", ""), new C16796b("transfer-encoding", ""), new C16796b("user-agent", ""), new C16796b("vary", ""), new C16796b("via", ""), new C16796b("www-authenticate", "")};
        f67810b = cVar.m99566d();
    }

    private C16798c() {
    }

    /* renamed from: d */
    private final Map<C11188e, Integer> m99566d() {
        C16796b[] bVarArr = f67809a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        for (int i = 0; i < length; i++) {
            C16796b[] bVarArr2 = f67809a;
            if (!linkedHashMap.containsKey(bVarArr2[i].f67807b)) {
                linkedHashMap.put(bVarArr2[i].f67807b, Integer.valueOf(i));
            }
        }
        Map<C11188e, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C13706o.m87928e(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final C11188e mo79798a(C11188e eVar) throws IOException {
        C13706o.m87929f(eVar, "name");
        int C = eVar.mo62485C();
        for (int i = 0; i < C; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte g = eVar.mo62496g(i);
            if (b <= g && b2 >= g) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + eVar.mo62489H());
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final Map<C11188e, Integer> mo79799b() {
        return f67810b;
    }

    /* renamed from: c */
    public final C16796b[] mo79800c() {
        return f67809a;
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0010¨\u0006%"}, mo71668d2 = {"Lwc/c$a;", "", "Lja/u;", "a", "b", "", "bytesToRecover", "d", "index", "l", "c", "p", "q", "nameIndex", "n", "o", "Lcd/e;", "f", "", "h", "Lwc/b;", "entry", "g", "i", "", "e", "k", "firstByte", "prefixMask", "m", "j", "Lcd/y;", "source", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lcd/y;II)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.c$a */
    /* compiled from: Hpack.kt */
    public static final class C16799a {

        /* renamed from: a */
        private final List<C16796b> f67812a;

        /* renamed from: b */
        private final C11186d f67813b;

        /* renamed from: c */
        public C16796b[] f67814c;

        /* renamed from: d */
        private int f67815d;

        /* renamed from: e */
        public int f67816e;

        /* renamed from: f */
        public int f67817f;

        /* renamed from: g */
        private final int f67818g;

        /* renamed from: h */
        private int f67819h;

        public C16799a(C11212y yVar, int i, int i2) {
            C13706o.m87929f(yVar, "source");
            this.f67818g = i;
            this.f67819h = i2;
            this.f67812a = new ArrayList();
            this.f67813b = C11196l.m75163b(yVar);
            C16796b[] bVarArr = new C16796b[8];
            this.f67814c = bVarArr;
            this.f67815d = bVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m99570a() {
            int i = this.f67819h;
            int i2 = this.f67817f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m99571b();
            } else {
                m99573d(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m99571b() {
            C13593l.m87566m(this.f67814c, (Object) null, 0, 0, 6, (Object) null);
            this.f67815d = this.f67814c.length - 1;
            this.f67816e = 0;
            this.f67817f = 0;
        }

        /* renamed from: c */
        private final int m99572c(int i) {
            return this.f67815d + 1 + i;
        }

        /* renamed from: d */
        private final int m99573d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f67814c.length;
                while (true) {
                    length--;
                    i2 = this.f67815d;
                    if (length < i2 || i <= 0) {
                        C16796b[] bVarArr = this.f67814c;
                        System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f67816e);
                        this.f67815d += i3;
                    } else {
                        C16796b bVar = this.f67814c[length];
                        C13706o.m87926c(bVar);
                        int i4 = bVar.f67806a;
                        i -= i4;
                        this.f67817f -= i4;
                        this.f67816e--;
                        i3++;
                    }
                }
                C16796b[] bVarArr2 = this.f67814c;
                System.arraycopy(bVarArr2, i2 + 1, bVarArr2, i2 + 1 + i3, this.f67816e);
                this.f67815d += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final C11188e m99574f(int i) throws IOException {
            if (m99576h(i)) {
                return C16798c.f67811c.mo79800c()[i].f67807b;
            }
            int c = m99572c(i - C16798c.f67811c.mo79800c().length);
            if (c >= 0) {
                C16796b[] bVarArr = this.f67814c;
                if (c < bVarArr.length) {
                    C16796b bVar = bVarArr[c];
                    C13706o.m87926c(bVar);
                    return bVar.f67807b;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        private final void m99575g(int i, C16796b bVar) {
            this.f67812a.add(bVar);
            int i2 = bVar.f67806a;
            if (i != -1) {
                C16796b bVar2 = this.f67814c[m99572c(i)];
                C13706o.m87926c(bVar2);
                i2 -= bVar2.f67806a;
            }
            int i3 = this.f67819h;
            if (i2 > i3) {
                m99571b();
                return;
            }
            int d = m99573d((this.f67817f + i2) - i3);
            if (i == -1) {
                int i4 = this.f67816e + 1;
                C16796b[] bVarArr = this.f67814c;
                if (i4 > bVarArr.length) {
                    C16796b[] bVarArr2 = new C16796b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f67815d = this.f67814c.length - 1;
                    this.f67814c = bVarArr2;
                }
                int i5 = this.f67815d;
                this.f67815d = i5 - 1;
                this.f67814c[i5] = bVar;
                this.f67816e++;
            } else {
                this.f67814c[i + m99572c(i) + d] = bVar;
            }
            this.f67817f += i2;
        }

        /* renamed from: h */
        private final boolean m99576h(int i) {
            return i >= 0 && i <= C16798c.f67811c.mo79800c().length - 1;
        }

        /* renamed from: i */
        private final int m99577i() throws IOException {
            return C16279b.m97648b(this.f67813b.readByte(), 255);
        }

        /* renamed from: l */
        private final void m99578l(int i) throws IOException {
            if (m99576h(i)) {
                this.f67812a.add(C16798c.f67811c.mo79800c()[i]);
                return;
            }
            int c = m99572c(i - C16798c.f67811c.mo79800c().length);
            if (c >= 0) {
                C16796b[] bVarArr = this.f67814c;
                if (c < bVarArr.length) {
                    List<C16796b> list = this.f67812a;
                    C16796b bVar = bVarArr[c];
                    C13706o.m87926c(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private final void m99579n(int i) throws IOException {
            m99575g(-1, new C16796b(m99574f(i), mo79802j()));
        }

        /* renamed from: o */
        private final void m99580o() throws IOException {
            m99575g(-1, new C16796b(C16798c.f67811c.mo79798a(mo79802j()), mo79802j()));
        }

        /* renamed from: p */
        private final void m99581p(int i) throws IOException {
            this.f67812a.add(new C16796b(m99574f(i), mo79802j()));
        }

        /* renamed from: q */
        private final void m99582q() throws IOException {
            this.f67812a.add(new C16796b(C16798c.f67811c.mo79798a(mo79802j()), mo79802j()));
        }

        /* renamed from: e */
        public final List<C16796b> mo79801e() {
            List<C16796b> F0 = C13566b0.m87402F0(this.f67812a);
            this.f67812a.clear();
            return F0;
        }

        /* renamed from: j */
        public final C11188e mo79802j() throws IOException {
            int i = m99577i();
            boolean z = (i & 128) == 128;
            long m = (long) mo79804m(i, 127);
            if (!z) {
                return this.f67813b.mo62438i1(m);
            }
            C11179b bVar = new C11179b();
            C16834j.f68003d.mo79938b(this.f67813b, m, bVar);
            return bVar.mo62415S1();
        }

        /* renamed from: k */
        public final void mo79803k() throws IOException {
            while (!this.f67813b.mo62469x1()) {
                int b = C16279b.m97648b(this.f67813b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    m99578l(mo79804m(b, 127) - 1);
                } else if (b == 64) {
                    m99580o();
                } else if ((b & 64) == 64) {
                    m99579n(mo79804m(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int m = mo79804m(b, 31);
                    this.f67819h = m;
                    if (m < 0 || m > this.f67818g) {
                        throw new IOException("Invalid dynamic table size update " + this.f67819h);
                    }
                    m99570a();
                } else if (b == 16 || b == 0) {
                    m99582q();
                } else {
                    m99581p(mo79804m(b, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final int mo79804m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m99577i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16799a(C11212y yVar, int i, int i2, int i3, C13695i iVar) {
            this(yVar, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004¨\u0006\u001d"}, mo71668d2 = {"Lwc/c$b;", "", "Lja/u;", "b", "", "bytesToRecover", "c", "Lwc/b;", "entry", "d", "a", "", "headerBlock", "g", "value", "prefixMask", "bits", "h", "Lcd/e;", "data", "f", "headerTableSizeSetting", "e", "", "useCompression", "Lcd/b;", "out", "<init>", "(IZLcd/b;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.c$b */
    /* compiled from: Hpack.kt */
    public static final class C16800b {

        /* renamed from: a */
        private int f67820a;

        /* renamed from: b */
        private boolean f67821b;

        /* renamed from: c */
        public int f67822c;

        /* renamed from: d */
        public C16796b[] f67823d;

        /* renamed from: e */
        private int f67824e;

        /* renamed from: f */
        public int f67825f;

        /* renamed from: g */
        public int f67826g;

        /* renamed from: h */
        public int f67827h;

        /* renamed from: i */
        private final boolean f67828i;

        /* renamed from: j */
        private final C11179b f67829j;

        public C16800b(int i, boolean z, C11179b bVar) {
            C13706o.m87929f(bVar, "out");
            this.f67827h = i;
            this.f67828i = z;
            this.f67829j = bVar;
            this.f67820a = Integer.MAX_VALUE;
            this.f67822c = i;
            C16796b[] bVarArr = new C16796b[8];
            this.f67823d = bVarArr;
            this.f67824e = bVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m99587a() {
            int i = this.f67822c;
            int i2 = this.f67826g;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m99588b();
            } else {
                m99589c(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m99588b() {
            C13593l.m87566m(this.f67823d, (Object) null, 0, 0, 6, (Object) null);
            this.f67824e = this.f67823d.length - 1;
            this.f67825f = 0;
            this.f67826g = 0;
        }

        /* renamed from: c */
        private final int m99589c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f67823d.length;
                while (true) {
                    length--;
                    i2 = this.f67824e;
                    if (length < i2 || i <= 0) {
                        C16796b[] bVarArr = this.f67823d;
                        System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f67825f);
                        C16796b[] bVarArr2 = this.f67823d;
                        int i4 = this.f67824e;
                        Arrays.fill(bVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f67824e += i3;
                    } else {
                        C16796b bVar = this.f67823d[length];
                        C13706o.m87926c(bVar);
                        i -= bVar.f67806a;
                        int i5 = this.f67826g;
                        C16796b bVar2 = this.f67823d[length];
                        C13706o.m87926c(bVar2);
                        this.f67826g = i5 - bVar2.f67806a;
                        this.f67825f--;
                        i3++;
                    }
                }
                C16796b[] bVarArr3 = this.f67823d;
                System.arraycopy(bVarArr3, i2 + 1, bVarArr3, i2 + 1 + i3, this.f67825f);
                C16796b[] bVarArr22 = this.f67823d;
                int i42 = this.f67824e;
                Arrays.fill(bVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f67824e += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m99590d(C16796b bVar) {
            int i = bVar.f67806a;
            int i2 = this.f67822c;
            if (i > i2) {
                m99588b();
                return;
            }
            m99589c((this.f67826g + i) - i2);
            int i3 = this.f67825f + 1;
            C16796b[] bVarArr = this.f67823d;
            if (i3 > bVarArr.length) {
                C16796b[] bVarArr2 = new C16796b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f67824e = this.f67823d.length - 1;
                this.f67823d = bVarArr2;
            }
            int i4 = this.f67824e;
            this.f67824e = i4 - 1;
            this.f67823d[i4] = bVar;
            this.f67825f++;
            this.f67826g += i;
        }

        /* renamed from: e */
        public final void mo79805e(int i) {
            this.f67827h = i;
            int min = Math.min(i, 16384);
            int i2 = this.f67822c;
            if (i2 != min) {
                if (min < i2) {
                    this.f67820a = Math.min(this.f67820a, min);
                }
                this.f67821b = true;
                this.f67822c = min;
                m99587a();
            }
        }

        /* renamed from: f */
        public final void mo79806f(C11188e eVar) throws IOException {
            C13706o.m87929f(eVar, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            if (this.f67828i) {
                C16834j jVar = C16834j.f68003d;
                if (jVar.mo79940d(eVar) < eVar.mo62485C()) {
                    C11179b bVar = new C11179b();
                    jVar.mo79939c(eVar, bVar);
                    C11188e S1 = bVar.mo62415S1();
                    mo79808h(S1.mo62485C(), 127, 128);
                    this.f67829j.mo62419V(S1);
                    return;
                }
            }
            mo79808h(eVar.mo62485C(), 127, 0);
            this.f67829j.mo62419V(eVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo79807g(java.util.List<p426wc.C16796b> r14) throws java.io.IOException {
            /*
                r13 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.C13706o.m87929f(r14, r0)
                boolean r0 = r13.f67821b
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r13.f67820a
                int r2 = r13.f67822c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r13.mo79808h(r0, r4, r3)
            L_0x0017:
                r13.f67821b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f67820a = r0
                int r0 = r13.f67822c
                r13.mo79808h(r0, r4, r3)
            L_0x0023:
                int r0 = r14.size()
                r2 = 0
            L_0x0028:
                if (r2 >= r0) goto L_0x010b
                java.lang.Object r3 = r14.get(r2)
                wc.b r3 = (p426wc.C16796b) r3
                cd.e r4 = r3.f67807b
                cd.e r4 = r4.mo62487F()
                cd.e r5 = r3.f67808c
                wc.c r6 = p426wc.C16798c.f67811c
                java.util.Map r7 = r6.mo79799b()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L_0x007c
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L_0x0052
                goto L_0x007a
            L_0x0052:
                if (r9 < r7) goto L_0x007a
                wc.b[] r9 = r6.mo79800c()
                int r10 = r7 + -1
                r9 = r9[r10]
                cd.e r9 = r9.f67808c
                boolean r9 = kotlin.jvm.internal.C13706o.m87924a(r9, r5)
                if (r9 == 0) goto L_0x0066
                r6 = r7
                goto L_0x007e
            L_0x0066:
                wc.b[] r6 = r6.mo79800c()
                r6 = r6[r7]
                cd.e r6 = r6.f67808c
                boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r5)
                if (r6 == 0) goto L_0x007a
                int r6 = r7 + 1
                r12 = r7
                r7 = r6
                r6 = r12
                goto L_0x007e
            L_0x007a:
                r6 = r7
                goto L_0x007d
            L_0x007c:
                r6 = -1
            L_0x007d:
                r7 = -1
            L_0x007e:
                if (r7 != r8) goto L_0x00c4
                int r9 = r13.f67824e
                int r9 = r9 + 1
                wc.b[] r10 = r13.f67823d
                int r10 = r10.length
            L_0x0087:
                if (r9 >= r10) goto L_0x00c4
                wc.b[] r11 = r13.f67823d
                r11 = r11[r9]
                kotlin.jvm.internal.C13706o.m87926c(r11)
                cd.e r11 = r11.f67807b
                boolean r11 = kotlin.jvm.internal.C13706o.m87924a(r11, r4)
                if (r11 == 0) goto L_0x00c1
                wc.b[] r11 = r13.f67823d
                r11 = r11[r9]
                kotlin.jvm.internal.C13706o.m87926c(r11)
                cd.e r11 = r11.f67808c
                boolean r11 = kotlin.jvm.internal.C13706o.m87924a(r11, r5)
                if (r11 == 0) goto L_0x00b3
                int r7 = r13.f67824e
                int r9 = r9 - r7
                wc.c r7 = p426wc.C16798c.f67811c
                wc.b[] r7 = r7.mo79800c()
                int r7 = r7.length
                int r7 = r7 + r9
                goto L_0x00c4
            L_0x00b3:
                if (r6 != r8) goto L_0x00c1
                int r6 = r13.f67824e
                int r6 = r9 - r6
                wc.c r11 = p426wc.C16798c.f67811c
                wc.b[] r11 = r11.mo79800c()
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00c1:
                int r9 = r9 + 1
                goto L_0x0087
            L_0x00c4:
                if (r7 == r8) goto L_0x00ce
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.mo79808h(r7, r3, r4)
                goto L_0x0107
            L_0x00ce:
                r7 = 64
                if (r6 != r8) goto L_0x00e1
                cd.b r6 = r13.f67829j
                r6.writeByte(r7)
                r13.mo79806f(r4)
                r13.mo79806f(r5)
                r13.m99590d(r3)
                goto L_0x0107
            L_0x00e1:
                cd.e r8 = p426wc.C16796b.f67799d
                boolean r8 = r4.mo62486E(r8)
                if (r8 == 0) goto L_0x00fc
                cd.e r8 = p426wc.C16796b.f67804i
                boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r8, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00fc
                r3 = 15
                r13.mo79808h(r6, r3, r1)
                r13.mo79806f(r5)
                goto L_0x0107
            L_0x00fc:
                r4 = 63
                r13.mo79808h(r6, r4, r7)
                r13.mo79806f(r5)
                r13.m99590d(r3)
            L_0x0107:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x010b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p426wc.C16798c.C16800b.mo79807g(java.util.List):void");
        }

        /* renamed from: h */
        public final void mo79808h(int i, int i2, int i3) {
            if (i < i2) {
                this.f67829j.writeByte(i | i3);
                return;
            }
            this.f67829j.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f67829j.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f67829j.writeByte(i4);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16800b(int i, boolean z, C11179b bVar, int i2, C13695i iVar) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, bVar);
        }
    }
}
