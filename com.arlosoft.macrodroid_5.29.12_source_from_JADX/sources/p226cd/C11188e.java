package p226cd;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.IOUtils;
import p244dd.C12013b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001CB\u0011\b\u0000\u0012\u0006\u00103\u001a\u00020\u001d¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u0000J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u000f\u0010\u001f\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0010¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0016J(\u0010+\u001a\u00020)2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0016J\u000e\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0000J\u0013\u0010/\u001a\u00020)2\b\u0010'\u001a\u0004\u0018\u00010.H\u0002J\b\u00100\u001a\u00020\u0014H\u0016J\u0011\u00101\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0000H\u0002J\b\u00102\u001a\u00020\nH\u0016R\u001a\u00103\u001a\u00020\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010 R\"\u00100\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0011\u0010@\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b?\u0010\u001c¨\u0006D"}, mo71668d2 = {"Lcd/e;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lja/u;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "H", "b", "y", "A", "algorithm", "e", "(Ljava/lang/String;)Lcd/e;", "m", "F", "", "pos", "", "q", "(I)B", "index", "g", "k", "()I", "", "G", "n", "()[B", "Lcd/b;", "buffer", "offset", "byteCount", "I", "(Lcd/b;II)V", "other", "otherOffset", "", "t", "v", "prefix", "E", "", "equals", "hashCode", "d", "toString", "data", "[B", "i", "j", "w", "(I)V", "utf8", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "C", "size", "<init>", "([B)V", "a", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.e */
/* compiled from: ByteString.kt */
public class C11188e implements Serializable, Comparable<C11188e> {

    /* renamed from: d */
    public static final C11189a f54104d = new C11189a((C13695i) null);

    /* renamed from: f */
    public static final C11188e f54105f = new C11188e(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private transient int f54106a;

    /* renamed from: c */
    private transient String f54107c;
    private final byte[] data;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0005*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0012\u001a\u00020\u0005*\u00020\fH\u0007J\u001b\u0010\u0014\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo71668d2 = {"Lcd/e$a;", "", "", "", "data", "Lcd/e;", "d", "", "offset", "byteCount", "e", "([BII)Lcd/e;", "", "c", "Ljava/nio/charset/Charset;", "charset", "b", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcd/e;", "a", "Ljava/io/InputStream;", "g", "(Ljava/io/InputStream;I)Lcd/e;", "EMPTY", "Lcd/e;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.e$a */
    /* compiled from: ByteString.kt */
    public static final class C11189a {
        private C11189a() {
        }

        public /* synthetic */ C11189a(C13695i iVar) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ C11188e m75128f(C11189a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo62515e(bArr, i, i2);
        }

        /* renamed from: a */
        public final C11188e mo62511a(String str) {
            C13706o.m87929f(str, "<this>");
            int i = 0;
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i2 = length - 1;
                if (i2 >= 0) {
                    while (true) {
                        int i3 = i + 1;
                        int i4 = i * 2;
                        bArr[i] = (byte) ((C12013b.m82460e(str.charAt(i4)) << 4) + C12013b.m82460e(str.charAt(i4 + 1)));
                        if (i3 > i2) {
                            break;
                        }
                        i = i3;
                    }
                }
                return new C11188e(bArr);
            }
            throw new IllegalArgumentException(C13706o.m87936m("Unexpected hex string: ", str).toString());
        }

        /* renamed from: b */
        public final C11188e mo62512b(String str, Charset charset) {
            C13706o.m87929f(str, "<this>");
            C13706o.m87929f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C13706o.m87928e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C11188e(bytes);
        }

        /* renamed from: c */
        public final C11188e mo62513c(String str) {
            C13706o.m87929f(str, "<this>");
            C11188e eVar = new C11188e(C11185c0.m75078a(str));
            eVar.mo62509x(str);
            return eVar;
        }

        /* renamed from: d */
        public final C11188e mo62514d(byte... bArr) {
            C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C13706o.m87928e(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new C11188e(copyOf);
        }

        /* renamed from: e */
        public final C11188e mo62515e(byte[] bArr, int i, int i2) {
            C13706o.m87929f(bArr, "<this>");
            C11187d0.m75097b((long) bArr.length, (long) i, (long) i2);
            return new C11188e(C13593l.m87562i(bArr, i, i2 + i));
        }

        /* renamed from: g */
        public final C11188e mo62516g(InputStream inputStream, int i) throws IOException {
            C13706o.m87929f(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C11188e(bArr);
            }
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Integer.valueOf(i)).toString());
        }
    }

    public C11188e(byte[] bArr) {
        C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.data = bArr;
    }

    /* renamed from: f */
    public static final C11188e m75103f(String str) {
        return f54104d.mo62513c(str);
    }

    /* renamed from: r */
    public static final C11188e m75104r(byte... bArr) {
        return f54104d.mo62514d(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C11188e g = f54104d.mo62516g(objectInputStream, objectInputStream.readInt());
        Field declaredField = C11188e.class.getDeclaredField(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        declaredField.setAccessible(true);
        declaredField.set(this, g.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: A */
    public final C11188e mo62484A() {
        return mo62494e(KeyPropertiesCompact.DIGEST_SHA256);
    }

    /* renamed from: C */
    public final int mo62485C() {
        return mo62500k();
    }

    /* renamed from: E */
    public final boolean mo62486E(C11188e eVar) {
        C13706o.m87929f(eVar, "prefix");
        return mo62505t(0, eVar, 0, eVar.mo62485C());
    }

    /* renamed from: F */
    public C11188e mo62487F() {
        byte b;
        int i = 0;
        while (i < mo62498i().length) {
            byte b2 = mo62498i()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] i2 = mo62498i();
                byte[] copyOf = Arrays.copyOf(i2, i2.length);
                C13706o.m87928e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i3 = i + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new C11188e(copyOf);
            }
        }
        return this;
    }

    /* renamed from: G */
    public byte[] mo62488G() {
        byte[] i = mo62498i();
        byte[] copyOf = Arrays.copyOf(i, i.length);
        C13706o.m87928e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: H */
    public String mo62489H() {
        String l = mo62501l();
        if (l != null) {
            return l;
        }
        String b = C11185c0.m75079b(mo62503n());
        mo62509x(b);
        return b;
    }

    /* renamed from: I */
    public void mo62490I(C11179b bVar, int i, int i2) {
        C13706o.m87929f(bVar, "buffer");
        C12013b.m82459d(this, bVar, i, i2);
    }

    /* renamed from: b */
    public String mo62491b() {
        return C11183b0.m75071b(mo62498i(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p226cd.C11188e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            int r0 = r9.mo62485C()
            int r1 = r10.mo62485C()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo62496g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo62496g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p226cd.C11188e.compareTo(cd.e):int");
    }

    /* renamed from: e */
    public C11188e mo62494e(String str) {
        C13706o.m87929f(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(mo62498i(), 0, mo62485C());
        byte[] digest = instance.digest();
        C13706o.m87928e(digest, "digestBytes");
        return new C11188e(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11188e) {
            C11188e eVar = (C11188e) obj;
            return eVar.mo62485C() == mo62498i().length && eVar.mo62507v(0, mo62498i(), 0, mo62498i().length);
        }
    }

    /* renamed from: g */
    public final byte mo62496g(int i) {
        return mo62504q(i);
    }

    public int hashCode() {
        int j = mo62499j();
        if (j != 0) {
            return j;
        }
        int hashCode = Arrays.hashCode(mo62498i());
        mo62508w(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public final byte[] mo62498i() {
        return this.data;
    }

    /* renamed from: j */
    public final int mo62499j() {
        return this.f54106a;
    }

    /* renamed from: k */
    public int mo62500k() {
        return mo62498i().length;
    }

    /* renamed from: l */
    public final String mo62501l() {
        return this.f54107c;
    }

    /* renamed from: m */
    public String mo62502m() {
        char[] cArr = new char[(mo62498i().length * 2)];
        byte[] i = mo62498i();
        int length = i.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = i[i2];
            i2++;
            int i4 = i3 + 1;
            cArr[i3] = C12013b.m82461f()[(b >> 4) & 15];
            i3 = i4 + 1;
            cArr[i4] = C12013b.m82461f()[b & 15];
        }
        return C15176v.m93637r(cArr);
    }

    /* renamed from: n */
    public byte[] mo62503n() {
        return mo62498i();
    }

    /* renamed from: q */
    public byte mo62504q(int i) {
        return mo62498i()[i];
    }

    /* renamed from: t */
    public boolean mo62505t(int i, C11188e eVar, int i2, int i3) {
        C13706o.m87929f(eVar, "other");
        return eVar.mo62507v(i2, mo62498i(), i, i3);
    }

    public String toString() {
        C11188e eVar;
        String str;
        boolean z = true;
        if (mo62498i().length == 0) {
            str = "[size=0]";
        } else {
            int a = C12013b.m82458c(mo62498i(), 64);
            if (a != -1) {
                String H = mo62489H();
                Objects.requireNonNull(H, "null cannot be cast to non-null type java.lang.String");
                String substring = H.substring(0, a);
                C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String E = C15176v.m93630E(C15176v.m93630E(C15176v.m93630E(substring, "\\", "\\\\", false, 4, (Object) null), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a < H.length()) {
                    return "[size=" + mo62498i().length + " text=" + E + "…]";
                }
                return "[text=" + E + ']';
            } else if (mo62498i().length <= 64) {
                str = "[hex=" + mo62502m() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(mo62498i().length);
                sb.append(" hex=");
                int c = C11187d0.m75098c(this, 64);
                if (c <= mo62498i().length) {
                    if (c + 0 < 0) {
                        z = false;
                    }
                    if (z) {
                        if (c == mo62498i().length) {
                            eVar = this;
                        } else {
                            eVar = new C11188e(C13593l.m87562i(mo62498i(), 0, c));
                        }
                        sb.append(eVar.mo62502m());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                throw new IllegalArgumentException(("endIndex > length(" + mo62498i().length + ')').toString());
            }
        }
        return str;
    }

    /* renamed from: v */
    public boolean mo62507v(int i, byte[] bArr, int i2, int i3) {
        C13706o.m87929f(bArr, "other");
        return i >= 0 && i <= mo62498i().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C11187d0.m75096a(mo62498i(), i, bArr, i2, i3);
    }

    /* renamed from: w */
    public final void mo62508w(int i) {
        this.f54106a = i;
    }

    /* renamed from: x */
    public final void mo62509x(String str) {
        this.f54107c = str;
    }

    /* renamed from: y */
    public final C11188e mo62510y() {
        return mo62494e(KeyPropertiesCompact.DIGEST_SHA1);
    }
}
