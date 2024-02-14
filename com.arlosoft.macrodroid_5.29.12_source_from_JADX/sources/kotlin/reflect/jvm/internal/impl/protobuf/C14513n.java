package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n */
/* compiled from: LiteralByteString */
class C14513n extends C14485d {

    /* renamed from: c */
    protected final byte[] f63390c;

    /* renamed from: d */
    private int f63391d = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n$b */
    /* compiled from: LiteralByteString */
    private class C14515b implements C14485d.C14486a {

        /* renamed from: a */
        private int f63392a;

        /* renamed from: c */
        private final int f63393c;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo73301f());
        }

        /* renamed from: f */
        public byte mo73301f() {
            try {
                byte[] bArr = C14513n.this.f63390c;
                int i = this.f63392a;
                this.f63392a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public boolean hasNext() {
            return this.f63392a < this.f63393c;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C14515b() {
            this.f63392a = 0;
            this.f63393c = C14513n.this.size();
        }
    }

    C14513n(byte[] bArr) {
        this.f63390c = bArr;
    }

    /* renamed from: O */
    static int m91013O(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: B */
    public String mo73305B(String str) throws UnsupportedEncodingException {
        return new String(this.f63390c, mo73295M(), size(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo73308I(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f63390c, mo73295M() + i, i2);
    }

    /* renamed from: J */
    public byte mo73294J(int i) {
        return this.f63390c[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo73438K(C14513n nVar, int i, int i2) {
        if (i2 > nVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= nVar.size()) {
            byte[] bArr = this.f63390c;
            byte[] bArr2 = nVar.f63390c;
            int M = mo73295M() + i2;
            int M2 = mo73295M();
            int M3 = nVar.mo73295M() + i;
            while (M2 < M) {
                if (bArr[M2] != bArr2[M3]) {
                    return false;
                }
                M2++;
                M3++;
            }
            return true;
        } else {
            int size2 = nVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public int mo73295M() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14485d) || size() != ((C14485d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C14513n) {
            return mo73438K((C14513n) obj, 0, size());
        }
        if (obj instanceof C14521s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i = this.f63391d;
        if (i == 0) {
            int size = size();
            i = mo73316t(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f63391d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo73297l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f63390c, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo73312m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo73313n() {
        return true;
    }

    /* renamed from: o */
    public boolean mo73314o() {
        int M = mo73295M();
        return C14538v.m91113f(this.f63390c, M, size() + M);
    }

    /* renamed from: p */
    public C14485d.C14486a iterator() {
        return new C14515b();
    }

    /* renamed from: q */
    public C14488e mo73315q() {
        return C14488e.m90872h(this);
    }

    public int size() {
        return this.f63390c.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo73316t(int i, int i2, int i3) {
        return m91013O(i, this.f63390c, mo73295M() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo73318u(int i, int i2, int i3) {
        int M = mo73295M() + i2;
        return C14538v.m91114g(i, this.f63390c, M, i3 + M);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo73319w() {
        return this.f63391d;
    }
}
