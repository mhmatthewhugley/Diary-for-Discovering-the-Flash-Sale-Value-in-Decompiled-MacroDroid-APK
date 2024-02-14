package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.C14485d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* compiled from: BoundedByteString */
class C14482c extends C14513n {

    /* renamed from: f */
    private final int f63324f;

    /* renamed from: g */
    private final int f63325g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    /* compiled from: BoundedByteString */
    private class C14484b implements C14485d.C14486a {

        /* renamed from: a */
        private int f63326a;

        /* renamed from: c */
        private final int f63327c;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo73301f());
        }

        /* renamed from: f */
        public byte mo73301f() {
            int i = this.f63326a;
            if (i < this.f63327c) {
                byte[] bArr = C14482c.this.f63390c;
                this.f63326a = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f63326a < this.f63327c;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C14484b() {
            int M = C14482c.this.mo73295M();
            this.f63326a = M;
            this.f63327c = M + C14482c.this.size();
        }
    }

    C14482c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.f63324f = i;
            this.f63325g = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: J */
    public byte mo73294J(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < size()) {
            return this.f63390c[this.f63324f + i];
        } else {
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public int mo73295M() {
        return this.f63324f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo73297l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f63390c, mo73295M() + i, bArr, i2, i3);
    }

    /* renamed from: p */
    public C14485d.C14486a iterator() {
        return new C14484b();
    }

    public int size() {
        return this.f63325g;
    }
}
