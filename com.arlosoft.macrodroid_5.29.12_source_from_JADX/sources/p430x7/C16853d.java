package p430x7;

import com.sun.mail.util.ASCIIUtility;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: x7.d */
/* compiled from: Response */
public class C16853d {

    /* renamed from: g */
    private static String f68043g = " (){%*\"\\]";

    /* renamed from: h */
    private static String f68044h = " (){%*\"\\";

    /* renamed from: a */
    protected int f68045a;

    /* renamed from: b */
    protected int f68046b;

    /* renamed from: c */
    protected int f68047c;

    /* renamed from: d */
    protected byte[] f68048d;

    /* renamed from: e */
    protected int f68049e;

    /* renamed from: f */
    protected boolean f68050f;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r5 = r7.f68048d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m99871h(boolean r8, boolean r9) {
        /*
            r7 = this;
            r7.mo80008r()
            byte[] r0 = r7.f68048d
            int r1 = r7.f68045a
            byte r0 = r0[r1]
            r2 = 34
            r3 = 0
            if (r0 != r2) goto L_0x004f
            int r1 = r1 + 1
            r7.f68045a = r1
            r8 = r1
        L_0x0013:
            int r0 = r7.f68045a
            int r4 = r7.f68047c
            if (r0 >= r4) goto L_0x0036
            byte[] r5 = r7.f68048d
            byte r6 = r5[r0]
            if (r6 == r2) goto L_0x0036
            r4 = 92
            if (r6 != r4) goto L_0x0027
            int r0 = r0 + 1
            r7.f68045a = r0
        L_0x0027:
            int r0 = r7.f68045a
            if (r0 == r8) goto L_0x002f
            byte r4 = r5[r0]
            r5[r8] = r4
        L_0x002f:
            int r8 = r8 + 1
            int r0 = r0 + 1
            r7.f68045a = r0
            goto L_0x0013
        L_0x0036:
            if (r0 < r4) goto L_0x0039
            return r3
        L_0x0039:
            int r0 = r0 + 1
            r7.f68045a = r0
            if (r9 == 0) goto L_0x0046
            byte[] r9 = r7.f68048d
            java.lang.String r8 = r7.m99874s(r9, r1, r8)
            return r8
        L_0x0046:
            x7.a r9 = new x7.a
            byte[] r0 = r7.f68048d
            int r8 = r8 - r1
            r9.<init>(r0, r1, r8)
            return r9
        L_0x004f:
            r2 = 123(0x7b, float:1.72E-43)
            if (r0 != r2) goto L_0x0084
            int r1 = r1 + 1
            r7.f68045a = r1
        L_0x0057:
            byte[] r8 = r7.f68048d
            int r0 = r7.f68045a
            byte r2 = r8[r0]
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 == r4) goto L_0x0066
            int r0 = r0 + 1
            r7.f68045a = r0
            goto L_0x0057
        L_0x0066:
            int r8 = com.sun.mail.util.ASCIIUtility.parseInt(r8, r1, r0)     // Catch:{ NumberFormatException -> 0x0083 }
            int r0 = r7.f68045a
            int r0 = r0 + 3
            int r1 = r0 + r8
            r7.f68045a = r1
            if (r9 == 0) goto L_0x007b
            byte[] r8 = r7.f68048d
            java.lang.String r8 = r7.m99874s(r8, r0, r1)
            return r8
        L_0x007b:
            x7.a r9 = new x7.a
            byte[] r1 = r7.f68048d
            r9.<init>(r1, r0, r8)
            return r9
        L_0x0083:
            return r3
        L_0x0084:
            if (r8 == 0) goto L_0x0099
            java.lang.String r8 = f68044h
            java.lang.String r8 = r7.m99872m(r8)
            if (r9 == 0) goto L_0x008f
            return r8
        L_0x008f:
            x7.a r8 = new x7.a
            byte[] r9 = r7.f68048d
            int r0 = r7.f68045a
            r8.<init>(r9, r1, r0)
            return r8
        L_0x0099:
            r8 = 78
            if (r0 == r8) goto L_0x00a3
            r8 = 110(0x6e, float:1.54E-43)
            if (r0 != r8) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            return r3
        L_0x00a3:
            int r1 = r1 + 3
            r7.f68045a = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p430x7.C16853d.m99871h(boolean, boolean):java.lang.Object");
    }

    /* renamed from: m */
    private String m99872m(String str) {
        byte b;
        mo80008r();
        int i = this.f68045a;
        if (i >= this.f68047c) {
            return null;
        }
        while (true) {
            int i2 = this.f68045a;
            if (i2 < this.f68047c && (b = this.f68048d[i2] & 255) >= 32 && str.indexOf((char) b) < 0 && b != Byte.MAX_VALUE) {
                this.f68045a++;
            }
        }
        return m99874s(this.f68048d, i, this.f68045a);
    }

    /* renamed from: p */
    private String[] m99873p(boolean z) {
        mo80008r();
        byte[] bArr = this.f68048d;
        int i = this.f68045a;
        if (bArr[i] != 40) {
            return null;
        }
        this.f68045a = i + 1;
        ArrayList arrayList = new ArrayList();
        while (!mo79998e(')')) {
            String j = z ? mo80002j() : mo80006o();
            if (j == null) {
                break;
            }
            arrayList.add(j);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: s */
    private String m99874s(byte[] bArr, int i, int i2) {
        if (this.f68050f) {
            return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
        }
        return ASCIIUtility.toString(bArr, i, i2);
    }

    /* renamed from: a */
    public String mo79994a() {
        mo80008r();
        return m99874s(this.f68048d, this.f68045a, this.f68047c);
    }

    /* renamed from: b */
    public boolean mo79995b() {
        return (this.f68049e & 28) == 12;
    }

    /* renamed from: c */
    public boolean mo79996c() {
        return (this.f68049e & 28) == 16;
    }

    /* renamed from: d */
    public boolean mo79997d() {
        return (this.f68049e & 28) == 8;
    }

    /* renamed from: e */
    public boolean mo79998e(char c) {
        mo80008r();
        int i = this.f68045a;
        if (i >= this.f68047c || this.f68048d[i] != ((byte) c)) {
            return false;
        }
        this.f68045a = i + 1;
        return true;
    }

    /* renamed from: f */
    public boolean mo79999f() {
        return (this.f68049e & 28) == 4;
    }

    /* renamed from: g */
    public boolean mo80000g() {
        return (this.f68049e & 3) == 3;
    }

    /* renamed from: i */
    public String mo80001i() {
        return m99872m(f68043g);
    }

    /* renamed from: j */
    public String mo80002j() {
        return (String) m99871h(true, true);
    }

    /* renamed from: k */
    public String[] mo80003k() {
        return m99873p(true);
    }

    /* renamed from: l */
    public byte mo80004l() {
        int i = this.f68045a;
        if (i >= this.f68047c) {
            return 0;
        }
        byte[] bArr = this.f68048d;
        this.f68045a = i + 1;
        return bArr[i];
    }

    /* renamed from: n */
    public long mo80005n() {
        mo80008r();
        int i = this.f68045a;
        while (true) {
            int i2 = this.f68045a;
            if (i2 >= this.f68047c || !Character.isDigit((char) this.f68048d[i2])) {
                int i3 = this.f68045a;
            } else {
                this.f68045a++;
            }
        }
        int i32 = this.f68045a;
        if (i32 <= i) {
            return -1;
        }
        try {
            return ASCIIUtility.parseLong(this.f68048d, i, i32);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: o */
    public String mo80006o() {
        return (String) m99871h(false, true);
    }

    /* renamed from: q */
    public void mo80007q() {
        this.f68045a = this.f68046b;
    }

    /* renamed from: r */
    public void mo80008r() {
        while (true) {
            int i = this.f68045a;
            if (i < this.f68047c && this.f68048d[i] == 32) {
                this.f68045a = i + 1;
            } else {
                return;
            }
        }
    }

    public String toString() {
        return m99874s(this.f68048d, 0, this.f68047c);
    }
}
