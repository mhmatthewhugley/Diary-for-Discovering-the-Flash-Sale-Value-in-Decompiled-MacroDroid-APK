package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

public final class UnknownFieldSetLite {

    /* renamed from: f */
    private static final UnknownFieldSetLite f57118f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f57119a;

    /* renamed from: b */
    private int[] f57120b;

    /* renamed from: c */
    private Object[] f57121c;

    /* renamed from: d */
    private int f57122d;

    /* renamed from: e */
    private boolean f57123e;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m81293b() {
        int i = this.f57119a;
        int[] iArr = this.f57120b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f57120b = Arrays.copyOf(iArr, i2);
            this.f57121c = Arrays.copyOf(this.f57121c, i2);
        }
    }

    /* renamed from: c */
    public static UnknownFieldSetLite m81294c() {
        return f57118f;
    }

    /* renamed from: f */
    private static int m81295f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    private static int m81296g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    static UnknownFieldSetLite m81297i(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.f57119a + unknownFieldSetLite2.f57119a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f57120b, i);
        System.arraycopy(unknownFieldSetLite2.f57120b, 0, copyOf, unknownFieldSetLite.f57119a, unknownFieldSetLite2.f57119a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f57121c, i);
        System.arraycopy(unknownFieldSetLite2.f57121c, 0, copyOf2, unknownFieldSetLite.f57119a, unknownFieldSetLite2.f57119a);
        return new UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    /* renamed from: j */
    static UnknownFieldSetLite m81298j() {
        return new UnknownFieldSetLite();
    }

    /* renamed from: k */
    private static boolean m81299k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m81300n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private static void m81301p(int i, Object obj, Writer writer) throws IOException {
        int a = WireFormat.m81547a(i);
        int b = WireFormat.m81548b(i);
        if (b == 0) {
            writer.mo64813A(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo64874x(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo64869j(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo64865d(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.m80761d());
        } else if (writer.mo64853y() == Writer.FieldOrder.ASCENDING) {
            writer.mo64856D(a);
            ((UnknownFieldSetLite) obj).mo65471q(writer);
            writer.mo64858J(a);
        } else {
            writer.mo64858J(a);
            ((UnknownFieldSetLite) obj).mo65471q(writer);
            writer.mo64856D(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo65462a() {
        if (!this.f57123e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public int mo65463d() {
        int i;
        int i2 = this.f57122d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f57119a; i4++) {
            int i5 = this.f57120b[i4];
            int a = WireFormat.m81547a(i5);
            int b = WireFormat.m81548b(i5);
            if (b == 0) {
                i = CodedOutputStream.m80096Q0(a, ((Long) this.f57121c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m80115g0(a, ((Long) this.f57121c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m80105Y(a, (ByteString) this.f57121c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m80093N0(a) * 2) + ((UnknownFieldSetLite) this.f57121c[i4]).mo65463d();
            } else if (b == 5) {
                i = CodedOutputStream.m80113e0(a, ((Integer) this.f57121c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.m80761d());
            }
            i3 += i;
        }
        this.f57122d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo65464e() {
        int i = this.f57122d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f57119a; i3++) {
            i2 += CodedOutputStream.m80081B0(WireFormat.m81547a(this.f57120b[i3]), (ByteString) this.f57121c[i3]);
        }
        this.f57122d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f57119a;
        return i == unknownFieldSetLite.f57119a && m81300n(this.f57120b, unknownFieldSetLite.f57120b, i) && m81299k(this.f57121c, unknownFieldSetLite.f57121c, this.f57119a);
    }

    /* renamed from: h */
    public void mo65466h() {
        this.f57123e = false;
    }

    public int hashCode() {
        int i = this.f57119a;
        return ((((527 + i) * 31) + m81295f(this.f57120b, i)) * 31) + m81296g(this.f57121c, this.f57119a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo65468l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f57119a; i2++) {
            MessageLiteToString.m80913c(sb, i, String.valueOf(WireFormat.m81547a(this.f57120b[i2])), this.f57121c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo65469m(int i, Object obj) {
        mo65462a();
        m81293b();
        int[] iArr = this.f57120b;
        int i2 = this.f57119a;
        iArr[i2] = i;
        this.f57121c[i2] = obj;
        this.f57119a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo65470o(Writer writer) throws IOException {
        if (writer.mo64853y() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f57119a - 1; i >= 0; i--) {
                writer.mo64836c(WireFormat.m81547a(this.f57120b[i]), this.f57121c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f57119a; i2++) {
            writer.mo64836c(WireFormat.m81547a(this.f57120b[i2]), this.f57121c[i2]);
        }
    }

    /* renamed from: q */
    public void mo65471q(Writer writer) throws IOException {
        if (this.f57119a != 0) {
            if (writer.mo64853y() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f57119a; i++) {
                    m81301p(this.f57120b[i], this.f57121c[i], writer);
                }
                return;
            }
            for (int i2 = this.f57119a - 1; i2 >= 0; i2--) {
                m81301p(this.f57120b[i2], this.f57121c[i2], writer);
            }
        }
    }

    private UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f57122d = -1;
        this.f57119a = i;
        this.f57120b = iArr;
        this.f57121c = objArr;
        this.f57123e = z;
    }
}
