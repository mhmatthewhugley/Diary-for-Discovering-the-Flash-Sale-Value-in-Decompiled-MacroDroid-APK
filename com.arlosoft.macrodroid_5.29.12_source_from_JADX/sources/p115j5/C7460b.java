package p115j5;

import java.util.Arrays;

/* renamed from: j5.b */
/* compiled from: CharsToNameCanonicalizer */
public final class C7460b {

    /* renamed from: l */
    static final C7460b f18290l = new C7460b();

    /* renamed from: a */
    protected C7460b f18291a;

    /* renamed from: b */
    private final int f18292b;

    /* renamed from: c */
    protected final boolean f18293c;

    /* renamed from: d */
    protected final boolean f18294d;

    /* renamed from: e */
    protected String[] f18295e;

    /* renamed from: f */
    protected C7461a[] f18296f;

    /* renamed from: g */
    protected int f18297g;

    /* renamed from: h */
    protected int f18298h;

    /* renamed from: i */
    protected int f18299i;

    /* renamed from: j */
    protected int f18300j;

    /* renamed from: k */
    protected boolean f18301k;

    /* renamed from: j5.b$a */
    /* compiled from: CharsToNameCanonicalizer */
    static final class C7461a {

        /* renamed from: a */
        private final String f18302a;

        /* renamed from: b */
        private final C7461a f18303b;

        /* renamed from: c */
        private final int f18304c;

        public C7461a(String str, C7461a aVar) {
            this.f18302a = str;
            this.f18303b = aVar;
            this.f18304c = aVar != null ? 1 + aVar.f18304c : 1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:4:0x000b A[LOOP:1: B:4:0x000b->B:7:0x0018, LOOP_START, PHI: r2 
          PHI: (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:3:0x000a, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo37610a(char[] r6, int r7, int r8) {
            /*
                r5 = this;
                java.lang.String r0 = r5.f18302a
                j5.b$a r1 = r5.f18303b
            L_0x0004:
                int r2 = r0.length()
                if (r2 != r8) goto L_0x001d
                r2 = 0
            L_0x000b:
                char r3 = r0.charAt(r2)
                int r4 = r7 + r2
                char r4 = r6[r4]
                if (r3 == r4) goto L_0x0016
                goto L_0x001a
            L_0x0016:
                int r2 = r2 + 1
                if (r2 < r8) goto L_0x000b
            L_0x001a:
                if (r2 != r8) goto L_0x001d
                return r0
            L_0x001d:
                if (r1 != 0) goto L_0x0021
                r6 = 0
                return r6
            L_0x0021:
                java.lang.String r0 = r1.mo37612c()
                j5.b$a r1 = r1.mo37611b()
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: p115j5.C7460b.C7461a.mo37610a(char[], int, int):java.lang.String");
        }

        /* renamed from: b */
        public C7461a mo37611b() {
            return this.f18303b;
        }

        /* renamed from: c */
        public String mo37612c() {
            return this.f18302a;
        }

        /* renamed from: d */
        public int mo37613d() {
            return this.f18304c;
        }
    }

    private C7460b() {
        this.f18294d = true;
        this.f18293c = true;
        this.f18301k = true;
        this.f18292b = 0;
        this.f18300j = 0;
        m30983j(64);
    }

    /* renamed from: b */
    private static int m30979b(int i) {
        return i - (i >> 2);
    }

    /* renamed from: e */
    private void m30980e() {
        String[] strArr = this.f18295e;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        this.f18295e = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, length);
        C7461a[] aVarArr = this.f18296f;
        int length2 = aVarArr.length;
        C7461a[] aVarArr2 = new C7461a[length2];
        this.f18296f = aVarArr2;
        System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
    }

    /* renamed from: f */
    public static C7460b m30981f() {
        long currentTimeMillis = System.currentTimeMillis();
        return m30982g((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: g */
    protected static C7460b m30982g(int i) {
        return f18290l.m30984l(i);
    }

    /* renamed from: j */
    private void m30983j(int i) {
        this.f18295e = new String[i];
        this.f18296f = new C7461a[(i >> 1)];
        this.f18299i = i - 1;
        this.f18297g = 0;
        this.f18300j = 0;
        this.f18298h = m30979b(i);
    }

    /* renamed from: l */
    private C7460b m30984l(int i) {
        return new C7460b((C7460b) null, true, true, this.f18295e, this.f18296f, this.f18297g, i, this.f18300j);
    }

    /* renamed from: n */
    private void m30985n(C7460b bVar) {
        if (bVar.mo37609r() > 12000 || bVar.f18300j > 63) {
            synchronized (this) {
                m30983j(64);
                this.f18301k = false;
            }
        } else if (bVar.mo37609r() > mo37609r()) {
            synchronized (this) {
                this.f18295e = bVar.f18295e;
                this.f18296f = bVar.f18296f;
                this.f18297g = bVar.f18297g;
                this.f18298h = bVar.f18298h;
                this.f18299i = bVar.f18299i;
                this.f18300j = bVar.f18300j;
                this.f18301k = false;
            }
        }
    }

    /* renamed from: o */
    private void m30986o() {
        String[] strArr = this.f18295e;
        int i = r1 + r1;
        if (i > 65536) {
            this.f18297g = 0;
            Arrays.fill(strArr, (Object) null);
            Arrays.fill(this.f18296f, (Object) null);
            this.f18301k = true;
            return;
        }
        C7461a[] aVarArr = this.f18296f;
        this.f18295e = new String[i];
        this.f18296f = new C7461a[(i >> 1)];
        this.f18299i = i - 1;
        this.f18298h = m30979b(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int a = mo37600a(mo37601c(str));
                String[] strArr2 = this.f18295e;
                if (strArr2[a] == null) {
                    strArr2[a] = str;
                } else {
                    int i4 = a >> 1;
                    C7461a aVar = new C7461a(str, this.f18296f[i4]);
                    this.f18296f[i4] = aVar;
                    i3 = Math.max(i3, aVar.mo37613d());
                }
            }
        }
        int i5 = r1 >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (C7461a aVar2 = aVarArr[i6]; aVar2 != null; aVar2 = aVar2.mo37611b()) {
                i2++;
                String c = aVar2.mo37612c();
                int a2 = mo37600a(mo37601c(c));
                String[] strArr3 = this.f18295e;
                if (strArr3[a2] == null) {
                    strArr3[a2] = c;
                } else {
                    int i7 = a2 >> 1;
                    C7461a aVar3 = new C7461a(c, this.f18296f[i7]);
                    this.f18296f[i7] = aVar3;
                    i3 = Math.max(i3, aVar3.mo37613d());
                }
            }
        }
        this.f18300j = i3;
        if (i2 != this.f18297g) {
            throw new Error("Internal error on SymbolTable.rehash(): had " + this.f18297g + " entries; now have " + i2 + ".");
        }
    }

    /* renamed from: a */
    public int mo37600a(int i) {
        return (i + (i >>> 15)) & this.f18299i;
    }

    /* renamed from: c */
    public int mo37601c(String str) {
        int length = str.length();
        int i = this.f18292b;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: d */
    public int mo37602d(char[] cArr, int i, int i2) {
        int i3 = this.f18292b;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[LOOP:0: B:12:0x0021->B:15:0x002e, LOOP_START, PHI: r2 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:11:0x0020, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo37603h(char[] r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 1
            if (r8 >= r0) goto L_0x0006
            java.lang.String r6 = ""
            return r6
        L_0x0006:
            boolean r1 = r5.f18294d
            if (r1 != 0) goto L_0x0010
            java.lang.String r9 = new java.lang.String
            r9.<init>(r6, r7, r8)
            return r9
        L_0x0010:
            int r9 = r5.mo37600a(r9)
            java.lang.String[] r1 = r5.f18295e
            r1 = r1[r9]
            if (r1 == 0) goto L_0x0042
            int r2 = r1.length()
            if (r2 != r8) goto L_0x0033
            r2 = 0
        L_0x0021:
            char r3 = r1.charAt(r2)
            int r4 = r7 + r2
            char r4 = r6[r4]
            if (r3 == r4) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x0021
        L_0x0030:
            if (r2 != r8) goto L_0x0033
            return r1
        L_0x0033:
            j5.b$a[] r1 = r5.f18296f
            int r2 = r9 >> 1
            r1 = r1[r2]
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r1.mo37610a(r6, r7, r8)
            if (r1 == 0) goto L_0x0042
            return r1
        L_0x0042:
            boolean r1 = r5.f18301k
            if (r1 != 0) goto L_0x004c
            r5.m30980e()
            r5.f18301k = r0
            goto L_0x005d
        L_0x004c:
            int r1 = r5.f18297g
            int r2 = r5.f18298h
            if (r1 < r2) goto L_0x005d
            r5.m30986o()
            int r9 = r5.mo37602d(r6, r7, r8)
            int r9 = r5.mo37600a(r9)
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6, r7, r8)
            boolean r6 = r5.f18293c
            if (r6 == 0) goto L_0x006c
            com.fasterxml.jackson.core.util.d r6 = com.fasterxml.jackson.core.util.C6830d.f15891a
            java.lang.String r1 = r6.mo33957a(r1)
        L_0x006c:
            int r6 = r5.f18297g
            int r6 = r6 + r0
            r5.f18297g = r6
            java.lang.String[] r6 = r5.f18295e
            r7 = r6[r9]
            if (r7 != 0) goto L_0x007a
            r6[r9] = r1
            goto L_0x009c
        L_0x007a:
            int r6 = r9 >> 1
            j5.b$a r7 = new j5.b$a
            j5.b$a[] r8 = r5.f18296f
            r8 = r8[r6]
            r7.<init>(r1, r8)
            j5.b$a[] r8 = r5.f18296f
            r8[r6] = r7
            int r6 = r7.mo37613d()
            int r7 = r5.f18300j
            int r6 = java.lang.Math.max(r6, r7)
            r5.f18300j = r6
            r7 = 255(0xff, float:3.57E-43)
            if (r6 <= r7) goto L_0x009c
            r5.mo37608q(r7)
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115j5.C7460b.mo37603h(char[], int, int, int):java.lang.String");
    }

    /* renamed from: i */
    public int mo37604i() {
        return this.f18292b;
    }

    /* renamed from: k */
    public C7460b mo37605k(boolean z, boolean z2) {
        String[] strArr;
        C7461a[] aVarArr;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            strArr = this.f18295e;
            aVarArr = this.f18296f;
            i = this.f18297g;
            i2 = this.f18292b;
            i3 = this.f18300j;
        }
        return new C7460b(this, z, z2, strArr, aVarArr, i, i2, i3);
    }

    /* renamed from: m */
    public boolean mo37606m() {
        return this.f18301k;
    }

    /* renamed from: p */
    public void mo37607p() {
        C7460b bVar;
        if (mo37606m() && (bVar = this.f18291a) != null) {
            bVar.m30985n(this);
            this.f18301k = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo37608q(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f18297g + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    /* renamed from: r */
    public int mo37609r() {
        return this.f18297g;
    }

    private C7460b(C7460b bVar, boolean z, boolean z2, String[] strArr, C7461a[] aVarArr, int i, int i2, int i3) {
        this.f18291a = bVar;
        this.f18294d = z;
        this.f18293c = z2;
        this.f18295e = strArr;
        this.f18296f = aVarArr;
        this.f18297g = i;
        this.f18292b = i2;
        int length = strArr.length;
        this.f18298h = m30979b(length);
        this.f18299i = length - 1;
        this.f18300j = i3;
        this.f18301k = false;
    }
}
