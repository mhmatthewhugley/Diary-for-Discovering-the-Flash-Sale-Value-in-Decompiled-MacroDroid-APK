package p115j5;

import androidx.core.view.InputDeviceCompat;
import com.fasterxml.jackson.core.util.C6830d;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j5.a */
/* compiled from: BytesToNameCanonicalizer */
public final class C7457a {

    /* renamed from: a */
    protected final C7457a f18263a;

    /* renamed from: b */
    protected final AtomicReference<C7459b> f18264b;

    /* renamed from: c */
    private final int f18265c;

    /* renamed from: d */
    protected final boolean f18266d;

    /* renamed from: e */
    protected int f18267e;

    /* renamed from: f */
    protected int f18268f;

    /* renamed from: g */
    protected int f18269g;

    /* renamed from: h */
    protected int[] f18270h;

    /* renamed from: i */
    protected C7465f[] f18271i;

    /* renamed from: j */
    protected C7458a[] f18272j;

    /* renamed from: k */
    protected int f18273k;

    /* renamed from: l */
    protected int f18274l;

    /* renamed from: m */
    private transient boolean f18275m;

    /* renamed from: n */
    private boolean f18276n;

    /* renamed from: o */
    private boolean f18277o;

    /* renamed from: p */
    private boolean f18278p;

    /* renamed from: j5.a$a */
    /* compiled from: BytesToNameCanonicalizer */
    static final class C7458a {

        /* renamed from: a */
        protected final C7465f f18279a;

        /* renamed from: b */
        protected final C7458a f18280b;

        /* renamed from: c */
        private final int f18281c;

        C7458a(C7465f fVar, C7458a aVar) {
            this.f18279a = fVar;
            this.f18280b = aVar;
            this.f18281c = aVar != null ? 1 + aVar.f18281c : 1;
        }

        /* renamed from: a */
        public C7465f mo37597a(int i, int i2, int i3) {
            if (this.f18279a.hashCode() == i && this.f18279a.mo37615b(i2, i3)) {
                return this.f18279a;
            }
            for (C7458a aVar = this.f18280b; aVar != null; aVar = aVar.f18280b) {
                C7465f fVar = aVar.f18279a;
                if (fVar.hashCode() == i && fVar.mo37615b(i2, i3)) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: b */
        public C7465f mo37598b(int i, int[] iArr, int i2) {
            if (this.f18279a.hashCode() == i && this.f18279a.mo37616c(iArr, i2)) {
                return this.f18279a;
            }
            for (C7458a aVar = this.f18280b; aVar != null; aVar = aVar.f18280b) {
                C7465f fVar = aVar.f18279a;
                if (fVar.hashCode() == i && fVar.mo37616c(iArr, i2)) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public int mo37599c() {
            return this.f18281c;
        }
    }

    private C7457a(int i, boolean z, int i2) {
        this.f18263a = null;
        this.f18265c = i2;
        this.f18266d = z;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.f18264b = new AtomicReference<>(m30958o(i));
    }

    /* renamed from: a */
    private void m30951a(int i, C7465f fVar) {
        int i2;
        if (this.f18276n) {
            m30963x();
        }
        if (this.f18275m) {
            m30961t();
        }
        this.f18267e++;
        int i3 = this.f18269g & i;
        if (this.f18271i[i3] == null) {
            this.f18270h[i3] = i << 8;
            if (this.f18277o) {
                m30964y();
            }
            this.f18271i[i3] = fVar;
        } else {
            if (this.f18278p) {
                m30962w();
            }
            this.f18273k++;
            int i4 = this.f18270h[i3];
            int i5 = i4 & 255;
            if (i5 == 0) {
                i2 = this.f18274l;
                if (i2 <= 254) {
                    this.f18274l = i2 + 1;
                    if (i2 >= this.f18272j.length) {
                        m30955i();
                    }
                } else {
                    i2 = m30956j();
                }
                this.f18270h[i3] = (i4 & InputDeviceCompat.SOURCE_ANY) | (i2 + 1);
            } else {
                i2 = i5 - 1;
            }
            C7458a aVar = new C7458a(fVar, this.f18272j[i2]);
            this.f18272j[i2] = aVar;
            int max = Math.max(aVar.mo37599c(), this.f18268f);
            this.f18268f = max;
            if (max > 255) {
                mo37596v(255);
            }
        }
        int length = this.f18270h.length;
        int i6 = this.f18267e;
        if (i6 > (length >> 1)) {
            int i7 = length >> 2;
            if (i6 > length - i7) {
                this.f18275m = true;
            } else if (this.f18273k >= i7) {
                this.f18275m = true;
            }
        }
    }

    /* renamed from: f */
    private static C7465f m30952f(int i, String str, int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 1) {
                return new C7462c(str, i, iArr[0]);
            }
            if (i2 == 2) {
                return new C7463d(str, i, iArr[0], iArr[1]);
            }
            if (i2 == 3) {
                return new C7464e(str, i, iArr[0], iArr[1], iArr[2]);
            }
        }
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = iArr[i3];
        }
        return new C7466g(str, i, iArr2, i2);
    }

    /* renamed from: g */
    public static C7457a m30953g() {
        long currentTimeMillis = System.currentTimeMillis();
        return m30954h((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: h */
    protected static C7457a m30954h(int i) {
        return new C7457a(64, true, i);
    }

    /* renamed from: i */
    private void m30955i() {
        C7458a[] aVarArr = this.f18272j;
        int length = aVarArr.length;
        C7458a[] aVarArr2 = new C7458a[(length + length)];
        this.f18272j = aVarArr2;
        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
    }

    /* renamed from: j */
    private int m30956j() {
        C7458a[] aVarArr = this.f18272j;
        int i = this.f18274l;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int c = aVarArr[i4].mo37599c();
            if (c < i2) {
                if (c == 1) {
                    return i4;
                }
                i3 = i4;
                i2 = c;
            }
        }
        return i3;
    }

    /* renamed from: n */
    public static C7465f m30957n() {
        return C7462c.m31001e();
    }

    /* renamed from: o */
    private C7459b m30958o(int i) {
        return new C7459b(0, i - 1, new int[i], new C7465f[i], (C7458a[]) null, 0, 0, 0);
    }

    /* renamed from: r */
    private void m30959r(C7459b bVar) {
        int i = bVar.f18282a;
        C7459b bVar2 = this.f18264b.get();
        if (i > bVar2.f18282a) {
            if (i > 6000 || bVar.f18289h > 63) {
                bVar = m30958o(64);
            }
            this.f18264b.compareAndSet(bVar2, bVar);
        }
    }

    /* renamed from: s */
    private void m30960s() {
        this.f18267e = 0;
        this.f18268f = 0;
        Arrays.fill(this.f18270h, 0);
        Arrays.fill(this.f18271i, (Object) null);
        Arrays.fill(this.f18272j, (Object) null);
        this.f18273k = 0;
        this.f18274l = 0;
    }

    /* renamed from: t */
    private void m30961t() {
        int i;
        this.f18275m = false;
        this.f18277o = false;
        int length = this.f18270h.length;
        int i2 = length + length;
        if (i2 > 65536) {
            m30960s();
            return;
        }
        this.f18270h = new int[i2];
        this.f18269g = i2 - 1;
        C7465f[] fVarArr = this.f18271i;
        this.f18271i = new C7465f[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            C7465f fVar = fVarArr[i4];
            if (fVar != null) {
                i3++;
                int hashCode = fVar.hashCode();
                int i5 = this.f18269g & hashCode;
                this.f18271i[i5] = fVar;
                this.f18270h[i5] = hashCode << 8;
            }
        }
        int i6 = this.f18274l;
        if (i6 == 0) {
            this.f18268f = 0;
            return;
        }
        this.f18273k = 0;
        this.f18274l = 0;
        this.f18278p = false;
        C7458a[] aVarArr = this.f18272j;
        this.f18272j = new C7458a[aVarArr.length];
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            for (C7458a aVar = aVarArr[i8]; aVar != null; aVar = aVar.f18280b) {
                i3++;
                C7465f fVar2 = aVar.f18279a;
                int hashCode2 = fVar2.hashCode();
                int i9 = this.f18269g & hashCode2;
                int[] iArr = this.f18270h;
                int i10 = iArr[i9];
                C7465f[] fVarArr2 = this.f18271i;
                if (fVarArr2[i9] == null) {
                    iArr[i9] = hashCode2 << 8;
                    fVarArr2[i9] = fVar2;
                } else {
                    this.f18273k++;
                    int i11 = i10 & 255;
                    if (i11 == 0) {
                        i = this.f18274l;
                        if (i <= 254) {
                            this.f18274l = i + 1;
                            if (i >= this.f18272j.length) {
                                m30955i();
                            }
                        } else {
                            i = m30956j();
                        }
                        this.f18270h[i9] = (i10 & InputDeviceCompat.SOURCE_ANY) | (i + 1);
                    } else {
                        i = i11 - 1;
                    }
                    C7458a aVar2 = new C7458a(fVar2, this.f18272j[i]);
                    this.f18272j[i] = aVar2;
                    i7 = Math.max(i7, aVar2.mo37599c());
                }
            }
        }
        this.f18268f = i7;
        if (i3 != this.f18267e) {
            throw new RuntimeException("Internal error: count after rehash " + i3 + "; should be " + this.f18267e);
        }
    }

    /* renamed from: w */
    private void m30962w() {
        C7458a[] aVarArr = this.f18272j;
        if (aVarArr == null) {
            this.f18272j = new C7458a[32];
        } else {
            int length = aVarArr.length;
            C7458a[] aVarArr2 = new C7458a[length];
            this.f18272j = aVarArr2;
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
        }
        this.f18278p = false;
    }

    /* renamed from: x */
    private void m30963x() {
        int[] iArr = this.f18270h;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.f18270h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        this.f18276n = false;
    }

    /* renamed from: y */
    private void m30964y() {
        C7465f[] fVarArr = this.f18271i;
        int length = fVarArr.length;
        C7465f[] fVarArr2 = new C7465f[length];
        this.f18271i = fVarArr2;
        System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
        this.f18277o = false;
    }

    /* renamed from: b */
    public C7465f mo37586b(String str, int[] iArr, int i) {
        int i2;
        if (this.f18266d) {
            str = C6830d.f15891a.mo33957a(str);
        }
        if (i < 3) {
            i2 = i == 1 ? mo37587c(iArr[0]) : mo37588d(iArr[0], iArr[1]);
        } else {
            i2 = mo37589e(iArr, i);
        }
        C7465f f = m30952f(i2, str, iArr, i);
        m30951a(i2, f);
        return f;
    }

    /* renamed from: c */
    public int mo37587c(int i) {
        int i2 = i ^ this.f18265c;
        int i3 = i2 + (i2 >>> 15);
        return i3 ^ (i3 >>> 9);
    }

    /* renamed from: d */
    public int mo37588d(int i, int i2) {
        int i3 = ((i ^ (i >>> 15)) + (i2 * 33)) ^ this.f18265c;
        return i3 + (i3 >>> 7);
    }

    /* renamed from: e */
    public int mo37589e(int[] iArr, int i) {
        if (i >= 3) {
            int i2 = iArr[0] ^ this.f18265c;
            int i3 = (((i2 + (i2 >>> 9)) * 33) + iArr[1]) * 65599;
            int i4 = (i3 + (i3 >>> 15)) ^ iArr[2];
            int i5 = i4 + (i4 >>> 17);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = (i5 * 31) ^ iArr[i6];
                int i8 = i7 + (i7 >>> 3);
                i5 = i8 ^ (i8 << 7);
            }
            int i9 = i5 + (i5 >>> 15);
            return (i9 << 9) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public C7465f mo37590k(int i) {
        C7458a aVar;
        int c = mo37587c(i);
        int i2 = this.f18269g & c;
        int i3 = this.f18270h[i2];
        if ((((i3 >> 8) ^ c) << 8) == 0) {
            C7465f fVar = this.f18271i[i2];
            if (fVar == null) {
                return null;
            }
            if (fVar.mo37614a(i)) {
                return fVar;
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = i3 & 255;
        if (i4 <= 0 || (aVar = this.f18272j[i4 - 1]) == null) {
            return null;
        }
        return aVar.mo37597a(c, i, 0);
    }

    /* renamed from: l */
    public C7465f mo37591l(int i, int i2) {
        C7458a aVar;
        int c = i2 == 0 ? mo37587c(i) : mo37588d(i, i2);
        int i3 = this.f18269g & c;
        int i4 = this.f18270h[i3];
        if ((((i4 >> 8) ^ c) << 8) == 0) {
            C7465f fVar = this.f18271i[i3];
            if (fVar == null) {
                return null;
            }
            if (fVar.mo37615b(i, i2)) {
                return fVar;
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = i4 & 255;
        if (i5 <= 0 || (aVar = this.f18272j[i5 - 1]) == null) {
            return null;
        }
        return aVar.mo37597a(c, i, i2);
    }

    /* renamed from: m */
    public C7465f mo37592m(int[] iArr, int i) {
        C7458a aVar;
        if (i < 3) {
            int i2 = 0;
            int i3 = iArr[0];
            if (i >= 2) {
                i2 = iArr[1];
            }
            return mo37591l(i3, i2);
        }
        int e = mo37589e(iArr, i);
        int i4 = this.f18269g & e;
        int i5 = this.f18270h[i4];
        if ((((i5 >> 8) ^ e) << 8) == 0) {
            C7465f fVar = this.f18271i[i4];
            if (fVar == null || fVar.mo37616c(iArr, i)) {
                return fVar;
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = i5 & 255;
        if (i6 <= 0 || (aVar = this.f18272j[i6 - 1]) == null) {
            return null;
        }
        return aVar.mo37598b(e, iArr, i);
    }

    /* renamed from: p */
    public C7457a mo37593p(boolean z, boolean z2) {
        return new C7457a(this, z2, this.f18265c, this.f18264b.get());
    }

    /* renamed from: q */
    public boolean mo37594q() {
        return !this.f18276n;
    }

    /* renamed from: u */
    public void mo37595u() {
        if (this.f18263a != null && mo37594q()) {
            this.f18263a.m30959r(new C7459b(this));
            this.f18276n = true;
            this.f18277o = true;
            this.f18278p = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo37596v(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f18267e + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    private C7457a(C7457a aVar, boolean z, int i, C7459b bVar) {
        this.f18263a = aVar;
        this.f18265c = i;
        this.f18266d = z;
        this.f18264b = null;
        this.f18267e = bVar.f18282a;
        this.f18269g = bVar.f18283b;
        this.f18270h = bVar.f18284c;
        this.f18271i = bVar.f18285d;
        this.f18272j = bVar.f18286e;
        this.f18273k = bVar.f18287f;
        this.f18274l = bVar.f18288g;
        this.f18268f = bVar.f18289h;
        this.f18275m = false;
        this.f18276n = true;
        this.f18277o = true;
        this.f18278p = true;
    }

    /* renamed from: j5.a$b */
    /* compiled from: BytesToNameCanonicalizer */
    private static final class C7459b {

        /* renamed from: a */
        public final int f18282a;

        /* renamed from: b */
        public final int f18283b;

        /* renamed from: c */
        public final int[] f18284c;

        /* renamed from: d */
        public final C7465f[] f18285d;

        /* renamed from: e */
        public final C7458a[] f18286e;

        /* renamed from: f */
        public final int f18287f;

        /* renamed from: g */
        public final int f18288g;

        /* renamed from: h */
        public final int f18289h;

        public C7459b(int i, int i2, int[] iArr, C7465f[] fVarArr, C7458a[] aVarArr, int i3, int i4, int i5) {
            this.f18282a = i;
            this.f18283b = i2;
            this.f18284c = iArr;
            this.f18285d = fVarArr;
            this.f18286e = aVarArr;
            this.f18287f = i3;
            this.f18288g = i4;
            this.f18289h = i5;
        }

        public C7459b(C7457a aVar) {
            this.f18282a = aVar.f18267e;
            this.f18283b = aVar.f18269g;
            this.f18284c = aVar.f18270h;
            this.f18285d = aVar.f18271i;
            this.f18286e = aVar.f18272j;
            this.f18287f = aVar.f18273k;
            this.f18288g = aVar.f18274l;
            this.f18289h = aVar.f18268f;
        }
    }
}
