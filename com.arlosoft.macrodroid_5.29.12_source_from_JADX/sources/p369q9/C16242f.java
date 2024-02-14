package p369q9;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11196l;
import p226cd.C11212y;

/* renamed from: q9.f */
/* compiled from: Hpack */
final class C16242f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11188e f66569a = C11188e.m75103f(":");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C16240d[] f66570b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<C11188e, Integer> f66571c = m97531f();

    /* renamed from: q9.f$a */
    /* compiled from: Hpack */
    static final class C16243a {

        /* renamed from: a */
        private final List<C16240d> f66572a;

        /* renamed from: b */
        private final C11186d f66573b;

        /* renamed from: c */
        private int f66574c;

        /* renamed from: d */
        private int f66575d;

        /* renamed from: e */
        C16240d[] f66576e;

        /* renamed from: f */
        int f66577f;

        /* renamed from: g */
        int f66578g;

        /* renamed from: h */
        int f66579h;

        C16243a(int i, C11212y yVar) {
            this(i, i, yVar);
        }

        /* renamed from: a */
        private void m97532a() {
            int i = this.f66575d;
            int i2 = this.f66579h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m97533b();
            } else {
                m97535d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m97533b() {
            Arrays.fill(this.f66576e, (Object) null);
            this.f66577f = this.f66576e.length - 1;
            this.f66578g = 0;
            this.f66579h = 0;
        }

        /* renamed from: c */
        private int m97534c(int i) {
            return this.f66577f + 1 + i;
        }

        /* renamed from: d */
        private int m97535d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f66576e.length;
                while (true) {
                    length--;
                    i2 = this.f66577f;
                    if (length < i2 || i <= 0) {
                        C16240d[] dVarArr = this.f66576e;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f66578g);
                        this.f66577f += i3;
                    } else {
                        C16240d[] dVarArr2 = this.f66576e;
                        i -= dVarArr2[length].f66563c;
                        this.f66579h -= dVarArr2[length].f66563c;
                        this.f66578g--;
                        i3++;
                    }
                }
                C16240d[] dVarArr3 = this.f66576e;
                System.arraycopy(dVarArr3, i2 + 1, dVarArr3, i2 + 1 + i3, this.f66578g);
                this.f66577f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private C11188e m97536f(int i) throws IOException {
            if (m97538i(i)) {
                return C16242f.f66570b[i].f66561a;
            }
            int c = m97534c(i - C16242f.f66570b.length);
            if (c >= 0) {
                C16240d[] dVarArr = this.f66576e;
                if (c < dVarArr.length) {
                    return dVarArr[c].f66561a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: h */
        private void m97537h(int i, C16240d dVar) {
            this.f66572a.add(dVar);
            int i2 = dVar.f66563c;
            if (i != -1) {
                i2 -= this.f66576e[m97534c(i)].f66563c;
            }
            int i3 = this.f66575d;
            if (i2 > i3) {
                m97533b();
                return;
            }
            int d = m97535d((this.f66579h + i2) - i3);
            if (i == -1) {
                int i4 = this.f66578g + 1;
                C16240d[] dVarArr = this.f66576e;
                if (i4 > dVarArr.length) {
                    C16240d[] dVarArr2 = new C16240d[(dVarArr.length * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f66577f = this.f66576e.length - 1;
                    this.f66576e = dVarArr2;
                }
                int i5 = this.f66577f;
                this.f66577f = i5 - 1;
                this.f66576e[i5] = dVar;
                this.f66578g++;
            } else {
                this.f66576e[i + m97534c(i) + d] = dVar;
            }
            this.f66579h += i2;
        }

        /* renamed from: i */
        private boolean m97538i(int i) {
            return i >= 0 && i <= C16242f.f66570b.length - 1;
        }

        /* renamed from: j */
        private int m97539j() throws IOException {
            return this.f66573b.readByte() & 255;
        }

        /* renamed from: m */
        private void m97540m(int i) throws IOException {
            if (m97538i(i)) {
                this.f66572a.add(C16242f.f66570b[i]);
                return;
            }
            int c = m97534c(i - C16242f.f66570b.length);
            if (c >= 0) {
                C16240d[] dVarArr = this.f66576e;
                if (c <= dVarArr.length - 1) {
                    this.f66572a.add(dVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m97541o(int i) throws IOException {
            m97537h(-1, new C16240d(m97536f(i), mo78750k()));
        }

        /* renamed from: p */
        private void m97542p() throws IOException {
            m97537h(-1, new C16240d(C16242f.m97530e(mo78750k()), mo78750k()));
        }

        /* renamed from: q */
        private void m97543q(int i) throws IOException {
            this.f66572a.add(new C16240d(m97536f(i), mo78750k()));
        }

        /* renamed from: r */
        private void m97544r() throws IOException {
            this.f66572a.add(new C16240d(C16242f.m97530e(mo78750k()), mo78750k()));
        }

        /* renamed from: e */
        public List<C16240d> mo78748e() {
            ArrayList arrayList = new ArrayList(this.f66572a);
            this.f66572a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo78749g(int i) {
            this.f66574c = i;
            this.f66575d = i;
            m97532a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C11188e mo78750k() throws IOException {
            int j = m97539j();
            boolean z = (j & 128) == 128;
            int n = mo78752n(j, 127);
            if (z) {
                return C11188e.m75104r(C16250h.m97603f().mo78763c(this.f66573b.mo62404H0((long) n)));
            }
            return this.f66573b.mo62438i1((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo78751l() throws IOException {
            while (!this.f66573b.mo62469x1()) {
                byte readByte = this.f66573b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m97540m(mo78752n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m97542p();
                } else if ((readByte & 64) == 64) {
                    m97541o(mo78752n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo78752n(readByte, 31);
                    this.f66575d = n;
                    if (n < 0 || n > this.f66574c) {
                        throw new IOException("Invalid dynamic table size update " + this.f66575d);
                    }
                    m97532a();
                } else if (readByte == 16 || readByte == 0) {
                    m97544r();
                } else {
                    m97543q(mo78752n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo78752n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m97539j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }

        C16243a(int i, int i2, C11212y yVar) {
            this.f66572a = new ArrayList();
            C16240d[] dVarArr = new C16240d[8];
            this.f66576e = dVarArr;
            this.f66577f = dVarArr.length - 1;
            this.f66578g = 0;
            this.f66579h = 0;
            this.f66574c = i;
            this.f66575d = i2;
            this.f66573b = C11196l.m75163b(yVar);
        }
    }

    /* renamed from: q9.f$b */
    /* compiled from: Hpack */
    static final class C16244b {

        /* renamed from: a */
        private final C11179b f66580a;

        /* renamed from: b */
        private boolean f66581b;

        /* renamed from: c */
        int f66582c;

        /* renamed from: d */
        private int f66583d;

        /* renamed from: e */
        private boolean f66584e;

        /* renamed from: f */
        private int f66585f;

        /* renamed from: g */
        C16240d[] f66586g;

        /* renamed from: h */
        int f66587h;

        /* renamed from: i */
        private int f66588i;

        /* renamed from: j */
        private int f66589j;

        C16244b(C11179b bVar) {
            this(4096, false, bVar);
        }

        /* renamed from: a */
        private void m97550a() {
            Arrays.fill(this.f66586g, (Object) null);
            this.f66588i = this.f66586g.length - 1;
            this.f66587h = 0;
            this.f66589j = 0;
        }

        /* renamed from: b */
        private int m97551b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f66586g.length;
                while (true) {
                    length--;
                    i2 = this.f66588i;
                    if (length < i2 || i <= 0) {
                        C16240d[] dVarArr = this.f66586g;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f66587h);
                        this.f66588i += i3;
                    } else {
                        C16240d[] dVarArr2 = this.f66586g;
                        i -= dVarArr2[length].f66563c;
                        this.f66589j -= dVarArr2[length].f66563c;
                        this.f66587h--;
                        i3++;
                    }
                }
                C16240d[] dVarArr3 = this.f66586g;
                System.arraycopy(dVarArr3, i2 + 1, dVarArr3, i2 + 1 + i3, this.f66587h);
                this.f66588i += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private void m97552c(C16240d dVar) {
            int i = dVar.f66563c;
            int i2 = this.f66585f;
            if (i > i2) {
                m97550a();
                return;
            }
            m97551b((this.f66589j + i) - i2);
            int i3 = this.f66587h + 1;
            C16240d[] dVarArr = this.f66586g;
            if (i3 > dVarArr.length) {
                C16240d[] dVarArr2 = new C16240d[(dVarArr.length * 2)];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f66588i = this.f66586g.length - 1;
                this.f66586g = dVarArr2;
            }
            int i4 = this.f66588i;
            this.f66588i = i4 - 1;
            this.f66586g[i4] = dVar;
            this.f66587h++;
            this.f66589j += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo78753d(C11188e eVar) throws IOException {
            if (!this.f66581b || C16250h.m97603f().mo78765e(eVar.mo62488G()) >= eVar.mo62485C()) {
                mo78755f(eVar.mo62485C(), 127, 0);
                this.f66580a.mo62419V(eVar);
                return;
            }
            C11179b bVar = new C11179b();
            C16250h.m97603f().mo78764d(eVar.mo62488G(), bVar.mo62454s());
            C11188e S1 = bVar.mo62415S1();
            mo78755f(S1.mo62485C(), 127, 128);
            this.f66580a.mo62419V(S1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo78754e(List<C16240d> list) throws IOException {
            int i;
            int i2;
            if (this.f66584e) {
                int i3 = this.f66583d;
                if (i3 < this.f66585f) {
                    mo78755f(i3, 31, 32);
                }
                this.f66584e = false;
                this.f66583d = Integer.MAX_VALUE;
                mo78755f(this.f66585f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C16240d dVar = list.get(i4);
                C11188e F = dVar.f66561a.mo62487F();
                C11188e eVar = dVar.f66562b;
                Integer num = (Integer) C16242f.f66571c.get(F);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 >= 2 && i2 <= 7) {
                        if (C16242f.f66570b[i2 - 1].f66562b.equals(eVar)) {
                            i = i2;
                        } else if (C16242f.f66570b[i2].f66562b.equals(eVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f66588i;
                    while (true) {
                        i5++;
                        C16240d[] dVarArr = this.f66586g;
                        if (i5 >= dVarArr.length) {
                            break;
                        } else if (dVarArr[i5].f66561a.equals(F)) {
                            if (this.f66586g[i5].f66562b.equals(eVar)) {
                                i2 = C16242f.f66570b.length + (i5 - this.f66588i);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f66588i) + C16242f.f66570b.length;
                            }
                        }
                    }
                }
                if (i2 != -1) {
                    mo78755f(i2, 127, 128);
                } else if (i == -1) {
                    this.f66580a.writeByte(64);
                    mo78753d(F);
                    mo78753d(eVar);
                    m97552c(dVar);
                } else if (!F.mo62486E(C16242f.f66569a) || C16240d.f66558h.equals(F)) {
                    mo78755f(i, 63, 64);
                    mo78753d(eVar);
                    m97552c(dVar);
                } else {
                    mo78755f(i, 15, 0);
                    mo78753d(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo78755f(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f66580a.writeByte(i | i3);
                return;
            }
            this.f66580a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f66580a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f66580a.writeByte(i4);
        }

        C16244b(int i, boolean z, C11179b bVar) {
            this.f66583d = Integer.MAX_VALUE;
            C16240d[] dVarArr = new C16240d[8];
            this.f66586g = dVarArr;
            this.f66588i = dVarArr.length - 1;
            this.f66582c = i;
            this.f66585f = i;
            this.f66581b = z;
            this.f66580a = bVar;
        }
    }

    static {
        C11188e eVar = C16240d.f66555e;
        C11188e eVar2 = C16240d.f66556f;
        C11188e eVar3 = C16240d.f66557g;
        C11188e eVar4 = C16240d.f66554d;
        f66570b = new C16240d[]{new C16240d(C16240d.f66558h, ""), new C16240d(eVar, "GET"), new C16240d(eVar, "POST"), new C16240d(eVar2, "/"), new C16240d(eVar2, "/index.html"), new C16240d(eVar3, "http"), new C16240d(eVar3, (String) ProxyConfig.MATCH_HTTPS), new C16240d(eVar4, "200"), new C16240d(eVar4, "204"), new C16240d(eVar4, "206"), new C16240d(eVar4, "304"), new C16240d(eVar4, "400"), new C16240d(eVar4, "404"), new C16240d(eVar4, "500"), new C16240d("accept-charset", ""), new C16240d("accept-encoding", "gzip, deflate"), new C16240d("accept-language", ""), new C16240d("accept-ranges", ""), new C16240d("accept", ""), new C16240d("access-control-allow-origin", ""), new C16240d("age", ""), new C16240d("allow", ""), new C16240d("authorization", ""), new C16240d("cache-control", ""), new C16240d("content-disposition", ""), new C16240d("content-encoding", ""), new C16240d("content-language", ""), new C16240d("content-length", ""), new C16240d("content-location", ""), new C16240d("content-range", ""), new C16240d("content-type", ""), new C16240d("cookie", ""), new C16240d("date", ""), new C16240d("etag", ""), new C16240d("expect", ""), new C16240d((String) ClientCookie.EXPIRES_ATTR, ""), new C16240d((String) TypedValues.Transition.S_FROM, ""), new C16240d("host", ""), new C16240d("if-match", ""), new C16240d("if-modified-since", ""), new C16240d("if-none-match", ""), new C16240d("if-range", ""), new C16240d("if-unmodified-since", ""), new C16240d("last-modified", ""), new C16240d("link", ""), new C16240d("location", ""), new C16240d("max-forwards", ""), new C16240d("proxy-authenticate", ""), new C16240d("proxy-authorization", ""), new C16240d("range", ""), new C16240d("referer", ""), new C16240d("refresh", ""), new C16240d("retry-after", ""), new C16240d("server", ""), new C16240d("set-cookie", ""), new C16240d("strict-transport-security", ""), new C16240d("transfer-encoding", ""), new C16240d("user-agent", ""), new C16240d("vary", ""), new C16240d("via", ""), new C16240d("www-authenticate", "")};
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C11188e m97530e(C11188e eVar) throws IOException {
        int C = eVar.mo62485C();
        int i = 0;
        while (i < C) {
            byte g = eVar.mo62496g(i);
            if (g < 65 || g > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + eVar.mo62489H());
            }
        }
        return eVar;
    }

    /* renamed from: f */
    private static Map<C11188e, Integer> m97531f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f66570b.length);
        int i = 0;
        while (true) {
            C16240d[] dVarArr = f66570b;
            if (i >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i].f66561a)) {
                linkedHashMap.put(dVarArr[i].f66561a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
