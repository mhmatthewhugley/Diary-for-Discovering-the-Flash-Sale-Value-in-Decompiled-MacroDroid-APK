package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s */
/* compiled from: RopeByteString */
class C14521s extends C14485d {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final int[] f63395s;

    /* renamed from: c */
    private final int f63396c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14485d f63397d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C14485d f63398f;

    /* renamed from: g */
    private final int f63399g;

    /* renamed from: o */
    private final int f63400o;

    /* renamed from: p */
    private int f63401p;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b */
    /* compiled from: RopeByteString */
    private static class C14523b {

        /* renamed from: a */
        private final Stack<C14485d> f63402a;

        private C14523b() {
            this.f63402a = new Stack<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C14485d m91060b(C14485d dVar, C14485d dVar2) {
            m91061c(dVar);
            m91061c(dVar2);
            C14485d pop = this.f63402a.pop();
            while (!this.f63402a.isEmpty()) {
                pop = new C14521s(this.f63402a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m91061c(C14485d dVar) {
            if (dVar.mo73313n()) {
                m91063e(dVar);
            } else if (dVar instanceof C14521s) {
                C14521s sVar = (C14521s) dVar;
                m91061c(sVar.f63397d);
                m91061c(sVar.f63398f);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        private int m91062d(int i) {
            int binarySearch = Arrays.binarySearch(C14521s.f63395s, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m91063e(C14485d dVar) {
            int d = m91062d(dVar.size());
            int i = C14521s.f63395s[d + 1];
            if (this.f63402a.isEmpty() || this.f63402a.peek().size() >= i) {
                this.f63402a.push(dVar);
                return;
            }
            int i2 = C14521s.f63395s[d];
            C14485d pop = this.f63402a.pop();
            while (!this.f63402a.isEmpty() && this.f63402a.peek().size() < i2) {
                pop = new C14521s(this.f63402a.pop(), pop);
            }
            C14521s sVar = new C14521s(pop, dVar);
            while (!this.f63402a.isEmpty()) {
                if (this.f63402a.peek().size() >= C14521s.f63395s[m91062d(sVar.size()) + 1]) {
                    break;
                }
                sVar = new C14521s(this.f63402a.pop(), sVar);
            }
            this.f63402a.push(sVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$c */
    /* compiled from: RopeByteString */
    private static class C14524c implements Iterator<C14513n> {

        /* renamed from: a */
        private final Stack<C14521s> f63403a;

        /* renamed from: c */
        private C14513n f63404c;

        /* renamed from: a */
        private C14513n m91064a(C14485d dVar) {
            while (dVar instanceof C14521s) {
                C14521s sVar = (C14521s) dVar;
                this.f63403a.push(sVar);
                dVar = sVar.f63397d;
            }
            return (C14513n) dVar;
        }

        /* renamed from: b */
        private C14513n m91065b() {
            while (!this.f63403a.isEmpty()) {
                C14513n a = m91064a(this.f63403a.pop().f63398f);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C14513n next() {
            C14513n nVar = this.f63404c;
            if (nVar != null) {
                this.f63404c = m91065b();
                return nVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f63404c != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C14524c(C14485d dVar) {
            this.f63403a = new Stack<>();
            this.f63404c = m91064a(dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$d */
    /* compiled from: RopeByteString */
    private class C14525d implements C14485d.C14486a {

        /* renamed from: a */
        private final C14524c f63405a;

        /* renamed from: c */
        private C14485d.C14486a f63406c;

        /* renamed from: d */
        int f63407d;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo73301f());
        }

        /* renamed from: f */
        public byte mo73301f() {
            if (!this.f63406c.hasNext()) {
                this.f63406c = this.f63405a.next().iterator();
            }
            this.f63407d--;
            return this.f63406c.mo73301f();
        }

        public boolean hasNext() {
            return this.f63407d > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C14525d() {
            C14524c cVar = new C14524c(C14521s.this);
            this.f63405a = cVar;
            this.f63406c = cVar.next().iterator();
            this.f63407d = C14521s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f63395s = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f63395s;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    static C14485d m91045O(C14485d dVar, C14485d dVar2) {
        C14521s sVar = dVar instanceof C14521s ? (C14521s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return m91046P(dVar, dVar2);
            }
            if (sVar != null && sVar.f63398f.size() + dVar2.size() < 128) {
                dVar2 = new C14521s(sVar.f63397d, m91046P(sVar.f63398f, dVar2));
            } else if (sVar == null || sVar.f63397d.mo73312m() <= sVar.f63398f.mo73312m() || sVar.mo73312m() <= dVar2.mo73312m()) {
                if (size >= f63395s[Math.max(dVar.mo73312m(), dVar2.mo73312m()) + 1]) {
                    return new C14521s(dVar, dVar2);
                }
                return new C14523b().m91060b(dVar, dVar2);
            } else {
                dVar2 = new C14521s(sVar.f63397d, new C14521s(sVar.f63398f, dVar2));
            }
        }
        return dVar2;
    }

    /* renamed from: P */
    private static C14513n m91046P(C14485d dVar, C14485d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.mo73311k(bArr, 0, 0, size);
        dVar2.mo73311k(bArr, 0, size, size2);
        return new C14513n(bArr);
    }

    /* renamed from: Q */
    private boolean m91047Q(C14485d dVar) {
        C14524c cVar = new C14524c(this);
        C14513n nVar = (C14513n) cVar.next();
        C14524c cVar2 = new C14524c(dVar);
        C14513n nVar2 = (C14513n) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = nVar.size() - i;
            int size2 = nVar2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? nVar.mo73438K(nVar2, i2, min) : nVar2.mo73438K(nVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f63396c;
            if (i3 < i4) {
                if (min == size) {
                    nVar = (C14513n) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    nVar2 = (C14513n) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: B */
    public String mo73305B(String str) throws UnsupportedEncodingException {
        return new String(mo73320z(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo73308I(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f63399g;
        if (i3 <= i4) {
            this.f63397d.mo73308I(outputStream, i, i2);
        } else if (i >= i4) {
            this.f63398f.mo73308I(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f63397d.mo73308I(outputStream, i, i5);
            this.f63398f.mo73308I(outputStream, 0, i2 - i5);
        }
    }

    public boolean equals(Object obj) {
        int w;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14485d)) {
            return false;
        }
        C14485d dVar = (C14485d) obj;
        if (this.f63396c != dVar.size()) {
            return false;
        }
        if (this.f63396c == 0) {
            return true;
        }
        if (this.f63401p == 0 || (w = dVar.mo73319w()) == 0 || this.f63401p == w) {
            return m91047Q(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f63401p;
        if (i == 0) {
            int i2 = this.f63396c;
            i = mo73316t(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f63401p = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo73297l(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f63399g;
        if (i4 <= i5) {
            this.f63397d.mo73297l(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f63398f.mo73297l(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f63397d.mo73297l(bArr, i, i2, i6);
            this.f63398f.mo73297l(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo73312m() {
        return this.f63400o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo73313n() {
        return this.f63396c >= f63395s[this.f63400o];
    }

    /* renamed from: o */
    public boolean mo73314o() {
        int u = this.f63397d.mo73318u(0, 0, this.f63399g);
        C14485d dVar = this.f63398f;
        if (dVar.mo73318u(u, 0, dVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public C14485d.C14486a iterator() {
        return new C14525d();
    }

    /* renamed from: q */
    public C14488e mo73315q() {
        return C14488e.m90871g(new C14526e());
    }

    public int size() {
        return this.f63396c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo73316t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f63399g;
        if (i4 <= i5) {
            return this.f63397d.mo73316t(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f63398f.mo73316t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f63398f.mo73316t(this.f63397d.mo73316t(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo73318u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f63399g;
        if (i4 <= i5) {
            return this.f63397d.mo73318u(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f63398f.mo73318u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f63398f.mo73318u(this.f63397d.mo73318u(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo73319w() {
        return this.f63401p;
    }

    private C14521s(C14485d dVar, C14485d dVar2) {
        this.f63401p = 0;
        this.f63397d = dVar;
        this.f63398f = dVar2;
        int size = dVar.size();
        this.f63399g = size;
        this.f63396c = size + dVar2.size();
        this.f63400o = Math.max(dVar.mo73312m(), dVar2.mo73312m()) + 1;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$e */
    /* compiled from: RopeByteString */
    private class C14526e extends InputStream {

        /* renamed from: a */
        private C14524c f63409a;

        /* renamed from: c */
        private C14513n f63410c;

        /* renamed from: d */
        private int f63411d;

        /* renamed from: f */
        private int f63412f;

        /* renamed from: g */
        private int f63413g;

        /* renamed from: o */
        private int f63414o;

        public C14526e() {
            m91070c();
        }

        /* renamed from: b */
        private void m91069b() {
            int i;
            if (this.f63410c != null && this.f63412f == (i = this.f63411d)) {
                this.f63413g += i;
                this.f63412f = 0;
                if (this.f63409a.hasNext()) {
                    C14513n c = this.f63409a.next();
                    this.f63410c = c;
                    this.f63411d = c.size();
                    return;
                }
                this.f63410c = null;
                this.f63411d = 0;
            }
        }

        /* renamed from: c */
        private void m91070c() {
            C14524c cVar = new C14524c(C14521s.this);
            this.f63409a = cVar;
            C14513n c = cVar.next();
            this.f63410c = c;
            this.f63411d = c.size();
            this.f63412f = 0;
            this.f63413g = 0;
        }

        /* renamed from: e */
        private int m91071e(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m91069b();
                if (this.f63410c != null) {
                    int min = Math.min(this.f63411d - this.f63412f, i3);
                    if (bArr != null) {
                        this.f63410c.mo73311k(bArr, this.f63412f, i, min);
                        i += min;
                    }
                    this.f63412f += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        public int available() throws IOException {
            return C14521s.this.size() - (this.f63413g + this.f63412f);
        }

        public void mark(int i) {
            this.f63414o = this.f63413g + this.f63412f;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m91071e(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        public synchronized void reset() {
            m91070c();
            m91071e((byte[]) null, 0, this.f63414o);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m91071e((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            m91069b();
            C14513n nVar = this.f63410c;
            if (nVar == null) {
                return -1;
            }
            int i = this.f63412f;
            this.f63412f = i + 1;
            return nVar.mo73294J(i) & 255;
        }
    }
}
