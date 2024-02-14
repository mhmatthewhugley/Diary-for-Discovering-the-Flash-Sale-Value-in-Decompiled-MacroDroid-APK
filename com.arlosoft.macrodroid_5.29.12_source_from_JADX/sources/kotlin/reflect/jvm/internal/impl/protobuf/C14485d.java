package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* compiled from: ByteString */
public abstract class C14485d implements Iterable<Byte> {

    /* renamed from: a */
    public static final C14485d f63329a = new C14513n(new byte[0]);

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    /* compiled from: ByteString */
    public interface C14486a extends Iterator<Byte> {
        /* renamed from: f */
        byte mo73301f();
    }

    static {
        Class<C14485d> cls = C14485d.class;
    }

    C14485d() {
    }

    /* renamed from: c */
    private static C14485d m90835c(Iterator<C14485d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m90835c(it, i2).mo73309d(m90835c(it, i - i2));
    }

    /* renamed from: f */
    public static C14485d m90836f(Iterable<C14485d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (C14485d add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f63329a;
        }
        return m90835c(collection.iterator(), collection.size());
    }

    /* renamed from: h */
    public static C14485d m90837h(byte[] bArr) {
        return m90838i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static C14485d m90838i(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C14513n(bArr2);
    }

    /* renamed from: j */
    public static C14485d m90839j(String str) {
        try {
            return new C14513n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: s */
    public static C14487b m90840s() {
        return new C14487b(128);
    }

    /* renamed from: B */
    public abstract String mo73305B(String str) throws UnsupportedEncodingException;

    /* renamed from: D */
    public String mo73306D() {
        try {
            return mo73305B("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo73307F(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                mo73308I(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract void mo73308I(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: d */
    public C14485d mo73309d(C14485d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C14521s.m91045O(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public void mo73311k(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    mo73297l(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo73297l(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo73312m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo73313n();

    /* renamed from: o */
    public abstract boolean mo73314o();

    /* renamed from: p */
    public abstract C14486a iterator();

    /* renamed from: q */
    public abstract C14488e mo73315q();

    public abstract int size();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo73316t(int i, int i2, int i3);

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo73318u(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract int mo73319w();

    /* renamed from: z */
    public byte[] mo73320z() {
        int size = size();
        if (size == 0) {
            return C14503i.f63379a;
        }
        byte[] bArr = new byte[size];
        mo73297l(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    /* compiled from: ByteString */
    public static final class C14487b extends OutputStream {

        /* renamed from: o */
        private static final byte[] f63330o = new byte[0];

        /* renamed from: a */
        private final int f63331a;

        /* renamed from: c */
        private final ArrayList<C14485d> f63332c;

        /* renamed from: d */
        private int f63333d;

        /* renamed from: f */
        private byte[] f63334f;

        /* renamed from: g */
        private int f63335g;

        C14487b(int i) {
            if (i >= 0) {
                this.f63331a = i;
                this.f63332c = new ArrayList<>();
                this.f63334f = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: b */
        private byte[] m90858b(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: c */
        private void m90859c(int i) {
            this.f63332c.add(new C14513n(this.f63334f));
            int length = this.f63333d + this.f63334f.length;
            this.f63333d = length;
            this.f63334f = new byte[Math.max(this.f63331a, Math.max(i, length >>> 1))];
            this.f63335g = 0;
        }

        /* renamed from: e */
        private void m90860e() {
            int i = this.f63335g;
            byte[] bArr = this.f63334f;
            if (i >= bArr.length) {
                this.f63332c.add(new C14513n(this.f63334f));
                this.f63334f = f63330o;
            } else if (i > 0) {
                this.f63332c.add(new C14513n(m90858b(bArr, i)));
            }
            this.f63333d += this.f63335g;
            this.f63335g = 0;
        }

        /* renamed from: f */
        public synchronized int mo73321f() {
            return this.f63333d + this.f63335g;
        }

        /* renamed from: g */
        public synchronized C14485d mo73322g() {
            m90860e();
            return C14485d.m90836f(this.f63332c);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo73321f())});
        }

        public synchronized void write(int i) {
            if (this.f63335g == this.f63334f.length) {
                m90859c(1);
            }
            byte[] bArr = this.f63334f;
            int i2 = this.f63335g;
            this.f63335g = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f63334f;
            int length = bArr2.length;
            int i3 = this.f63335g;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f63335g += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m90859c(i4);
                System.arraycopy(bArr, i + length2, this.f63334f, 0, i4);
                this.f63335g = i4;
            }
        }
    }
}
