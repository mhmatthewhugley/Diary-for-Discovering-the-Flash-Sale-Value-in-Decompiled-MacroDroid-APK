package p055z;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11199o;

/* renamed from: z.c */
/* compiled from: JsonReader */
public abstract class C2205c implements Closeable {

    /* renamed from: p */
    private static final String[] f6823p = new String[128];

    /* renamed from: a */
    int f6824a;

    /* renamed from: c */
    int[] f6825c = new int[32];

    /* renamed from: d */
    String[] f6826d = new String[32];

    /* renamed from: f */
    int[] f6827f = new int[32];

    /* renamed from: g */
    boolean f6828g;

    /* renamed from: o */
    boolean f6829o;

    /* renamed from: z.c$a */
    /* compiled from: JsonReader */
    public static final class C2206a {

        /* renamed from: a */
        final String[] f6830a;

        /* renamed from: b */
        final C11199o f6831b;

        private C2206a(String[] strArr, C11199o oVar) {
            this.f6830a = strArr;
            this.f6831b = oVar;
        }

        /* renamed from: a */
        public static C2206a m9050a(String... strArr) {
            try {
                C11188e[] eVarArr = new C11188e[strArr.length];
                C11179b bVar = new C11179b();
                for (int i = 0; i < strArr.length; i++) {
                    C2205c.m9033y(bVar, strArr[i]);
                    bVar.readByte();
                    eVarArr[i] = bVar.mo62415S1();
                }
                return new C2206a((String[]) strArr.clone(), C11199o.m75179k(eVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: z.c$b */
    /* compiled from: JsonReader */
    public enum C2207b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f6823p[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f6823p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C2205c() {
    }

    /* renamed from: r */
    public static C2205c m9032r(C11186d dVar) {
        return new C2209e(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static void m9033y(C11184c cVar, String str) throws IOException {
        String str2;
        String[] strArr = f6823p;
        cVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                cVar.mo62460v0(str, i, i2);
            }
            cVar.mo62455s0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            cVar.mo62460v0(str, i, length);
        }
        cVar.writeByte(34);
    }

    /* renamed from: c */
    public abstract void mo24399c() throws IOException;

    /* renamed from: e */
    public abstract void mo24400e() throws IOException;

    /* renamed from: f */
    public abstract void mo24401f() throws IOException;

    /* renamed from: g */
    public abstract void mo24402g() throws IOException;

    public final String getPath() {
        return C2208d.m9051a(this.f6824a, this.f6825c, this.f6826d, this.f6827f);
    }

    /* renamed from: h */
    public abstract boolean mo24404h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo24405i() throws IOException;

    /* renamed from: j */
    public abstract double mo24406j() throws IOException;

    /* renamed from: m */
    public abstract int mo24407m() throws IOException;

    /* renamed from: o */
    public abstract String mo24408o() throws IOException;

    /* renamed from: p */
    public abstract String mo24409p() throws IOException;

    /* renamed from: s */
    public abstract C2207b mo24410s() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo24411u(int i) {
        int i2 = this.f6824a;
        int[] iArr = this.f6825c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f6825c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6826d;
                this.f6826d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6827f;
                this.f6827f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C2203a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f6825c;
        int i3 = this.f6824a;
        this.f6824a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: v */
    public abstract int mo24412v(C2206a aVar) throws IOException;

    /* renamed from: w */
    public abstract void mo24413w() throws IOException;

    /* renamed from: x */
    public abstract void mo24414x() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final C2204b mo24415z(String str) throws C2204b {
        throw new C2204b(str + " at path " + getPath());
    }
}
