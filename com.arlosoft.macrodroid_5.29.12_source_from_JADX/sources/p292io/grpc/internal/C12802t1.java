package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import p292io.grpc.C12908k0;

/* renamed from: io.grpc.internal.t1 */
/* compiled from: ReadableBuffers */
public final class C12802t1 {

    /* renamed from: a */
    private static final C12798s1 f60193a = new C12805c(new byte[0]);

    /* renamed from: io.grpc.internal.t1$a */
    /* compiled from: ReadableBuffers */
    class C12803a extends C12732l0 {
        C12803a(C12798s1 s1Var) {
            super(s1Var);
        }

        public void close() {
        }
    }

    /* renamed from: io.grpc.internal.t1$c */
    /* compiled from: ReadableBuffers */
    private static class C12805c extends C12614c {

        /* renamed from: a */
        int f60195a;

        /* renamed from: c */
        final int f60196c;

        /* renamed from: d */
        final byte[] f60197d;

        C12805c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        /* renamed from: M1 */
        public void mo69460M1(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f60197d, this.f60195a, bArr, i, i2);
            this.f60195a += i2;
        }

        /* renamed from: c */
        public C12805c mo69461Y(int i) {
            mo69238b(i);
            int i2 = this.f60195a;
            this.f60195a = i2 + i;
            return new C12805c(this.f60197d, i2, i);
        }

        /* renamed from: l */
        public int mo69462l() {
            return this.f60196c - this.f60195a;
        }

        public int readUnsignedByte() {
            mo69238b(1);
            byte[] bArr = this.f60197d;
            int i = this.f60195a;
            this.f60195a = i + 1;
            return bArr[i] & 255;
        }

        C12805c(byte[] bArr, int i, int i2) {
            boolean z = true;
            Preconditions.m5378e(i >= 0, "offset must be >= 0");
            Preconditions.m5378e(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            Preconditions.m5378e(i3 > bArr.length ? false : z, "offset + length exceeds array boundary");
            this.f60197d = (byte[]) Preconditions.m5393t(bArr, "bytes");
            this.f60195a = i;
            this.f60196c = i3;
        }
    }

    /* renamed from: a */
    public static C12798s1 m84562a(C12798s1 s1Var) {
        return new C12803a(s1Var);
    }

    /* renamed from: b */
    public static InputStream m84563b(C12798s1 s1Var, boolean z) {
        if (!z) {
            s1Var = m84562a(s1Var);
        }
        return new C12804b(s1Var);
    }

    /* renamed from: c */
    public static byte[] m84564c(C12798s1 s1Var) {
        Preconditions.m5393t(s1Var, "buffer");
        int l = s1Var.mo69462l();
        byte[] bArr = new byte[l];
        s1Var.mo69460M1(bArr, 0, l);
        return bArr;
    }

    /* renamed from: d */
    public static String m84565d(C12798s1 s1Var, Charset charset) {
        Preconditions.m5393t(charset, "charset");
        return new String(m84564c(s1Var), charset);
    }

    /* renamed from: e */
    public static C12798s1 m84566e(byte[] bArr, int i, int i2) {
        return new C12805c(bArr, i, i2);
    }

    /* renamed from: io.grpc.internal.t1$b */
    /* compiled from: ReadableBuffers */
    private static final class C12804b extends InputStream implements C12908k0 {

        /* renamed from: a */
        final C12798s1 f60194a;

        public C12804b(C12798s1 s1Var) {
            this.f60194a = (C12798s1) Preconditions.m5393t(s1Var, "buffer");
        }

        public int available() throws IOException {
            return this.f60194a.mo69462l();
        }

        public void close() throws IOException {
            this.f60194a.close();
        }

        public int read() {
            if (this.f60194a.mo69462l() == 0) {
                return -1;
            }
            return this.f60194a.readUnsignedByte();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f60194a.mo69462l() == 0) {
                return -1;
            }
            int min = Math.min(this.f60194a.mo69462l(), i2);
            this.f60194a.mo69460M1(bArr, i, min);
            return min;
        }
    }
}
