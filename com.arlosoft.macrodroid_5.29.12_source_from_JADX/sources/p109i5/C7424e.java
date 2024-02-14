package p109i5;

import com.fasterxml.jackson.core.C6802e;
import com.fasterxml.jackson.core.C6805g;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p072io.C6809b;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.util.C6831e;
import java.io.IOException;
import java.io.Reader;
import p103h5.C7389b;
import p103h5.C7390c;
import p115j5.C7460b;

/* renamed from: i5.e */
/* compiled from: ReaderBasedJsonParser */
public final class C7424e extends C7389b {

    /* renamed from: c0 */
    protected Reader f18148c0;

    /* renamed from: d0 */
    protected char[] f18149d0;

    /* renamed from: e0 */
    protected final C7460b f18150e0;

    /* renamed from: f0 */
    protected final int f18151f0;

    /* renamed from: g0 */
    protected boolean f18152g0 = false;

    /* renamed from: i5.e$a */
    /* compiled from: ReaderBasedJsonParser */
    static /* synthetic */ class C7425a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18153a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.g[] r0 = com.fasterxml.jackson.core.C6805g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18153a = r0
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18153a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18153a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18153a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18153a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18153a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p109i5.C7424e.C7425a.<clinit>():void");
        }
    }

    public C7424e(C6811d dVar, int i, Reader reader, C6806h hVar, C7460b bVar) {
        super(dVar, i);
        this.f18148c0 = reader;
        this.f18149d0 = dVar.mo33902c();
        this.f18150e0 = bVar;
        this.f18151f0 = bVar.mo37604i();
    }

    /* renamed from: G0 */
    private C6805g m30659G0() {
        this.f18070H = false;
        C6805g gVar = this.f18067E;
        this.f18067E = null;
        if (gVar == C6805g.START_ARRAY) {
            this.f18066D = this.f18066D.mo37475g(this.f18064B, this.f18065C);
        } else if (gVar == C6805g.START_OBJECT) {
            this.f18066D = this.f18066D.mo37476h(this.f18064B, this.f18065C);
        }
        this.f18090c = gVar;
        return gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m30660N0(int r5, int r6, int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.e r0 = r4.f18068F
            char[] r1 = r4.f18149d0
            int r2 = r4.f18085g
            int r2 = r2 - r5
            r0.mo33975u(r1, r5, r2)
            com.fasterxml.jackson.core.util.e r5 = r4.f18068F
            char[] r5 = r5.mo33967n()
            com.fasterxml.jackson.core.util.e r0 = r4.f18068F
            int r0 = r0.mo33968o()
        L_0x0016:
            int r1 = r4.f18085g
            int r2 = r4.f18086o
            if (r1 < r2) goto L_0x003c
            boolean r1 = r4.mo37401e0()
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": was expecting closing '"
            r1.append(r2)
            char r2 = (char) r7
            r1.append(r2)
            java.lang.String r2 = "' for name"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.mo37415D(r1)
        L_0x003c:
            char[] r1 = r4.f18149d0
            int r2 = r4.f18085g
            int r3 = r2 + 1
            r4.f18085g = r3
            char r1 = r1[r2]
            r2 = 92
            if (r1 > r2) goto L_0x0078
            if (r1 != r2) goto L_0x0051
            char r2 = r4.mo37504w0()
            goto L_0x0079
        L_0x0051:
            if (r1 > r7) goto L_0x0078
            if (r1 != r7) goto L_0x006f
            com.fasterxml.jackson.core.util.e r5 = r4.f18068F
            r5.mo33977w(r0)
            com.fasterxml.jackson.core.util.e r5 = r4.f18068F
            char[] r7 = r5.mo33969p()
            int r0 = r5.mo33970q()
            int r5 = r5.mo33978x()
            j5.b r1 = r4.f18150e0
            java.lang.String r5 = r1.mo37603h(r7, r0, r5, r6)
            return r5
        L_0x006f:
            r2 = 32
            if (r1 >= r2) goto L_0x0078
            java.lang.String r2 = "name"
            r4.mo37420I(r1, r2)
        L_0x0078:
            r2 = r1
        L_0x0079:
            int r6 = r6 * 33
            int r6 = r6 + r1
            int r1 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r1 < r0) goto L_0x008b
            com.fasterxml.jackson.core.util.e r5 = r4.f18068F
            char[] r5 = r5.mo33966m()
            r0 = 0
            goto L_0x0016
        L_0x008b:
            r0 = r1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: p109i5.C7424e.m30660N0(int, int, int):java.lang.String");
    }

    /* renamed from: R0 */
    private String m30661R0(int i, int i2, int[] iArr) throws IOException, JsonParseException {
        this.f18068F.mo33975u(this.f18149d0, i, this.f18085g - i);
        char[] n = this.f18068F.mo33967n();
        int o = this.f18068F.mo33968o();
        int length = iArr.length;
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                break;
            }
            char c = this.f18149d0[this.f18085g];
            if (c > length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this.f18085g++;
            i2 = (i2 * 33) + c;
            int i3 = o + 1;
            n[o] = c;
            if (i3 >= n.length) {
                n = this.f18068F.mo33966m();
                o = 0;
            } else {
                o = i3;
            }
        }
        this.f18068F.mo33977w(o);
        C6831e eVar = this.f18068F;
        return this.f18150e0.mo37603h(eVar.mo33969p(), eVar.mo33970q(), eVar.mo33978x(), i2);
    }

    /* renamed from: V0 */
    private void m30662V0() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                break;
            }
            char[] cArr = this.f18149d0;
            int i = this.f18085g;
            int i2 = i + 1;
            this.f18085g = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this.f18086o && !mo37401e0()) {
                        break;
                    }
                    char[] cArr2 = this.f18149d0;
                    int i3 = this.f18085g;
                    if (cArr2[i3] == '/') {
                        this.f18085g = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        mo37500d1();
                    } else if (c == 13) {
                        mo37499Y0();
                    } else if (c != 9) {
                        mo37419H(c);
                    }
                }
            }
        }
        mo37415D(" in a comment");
    }

    /* renamed from: Z0 */
    private void m30663Z0() throws IOException, JsonParseException {
        if (!mo33873u(C6802e.C6803a.ALLOW_COMMENTS)) {
            mo37417F(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(" in a comment");
        }
        char[] cArr = this.f18149d0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        char c = cArr[i];
        if (c == '/') {
            m30664c1();
        } else if (c == '*') {
            m30662V0();
        } else {
            mo37417F(c, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: c1 */
    private void m30664c1() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                char[] cArr = this.f18149d0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        mo37500d1();
                        return;
                    } else if (c == 13) {
                        mo37499Y0();
                        return;
                    } else if (c != 9) {
                        mo37419H(c);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f1 */
    private int m30665f1() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                char[] cArr = this.f18149d0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    m30663Z0();
                } else if (c != ' ') {
                    if (c == 10) {
                        mo37500d1();
                    } else if (c == 13) {
                        mo37499Y0();
                    } else if (c != 9) {
                        mo37419H(c);
                    }
                }
            } else {
                throw mo33859b("Unexpected end-of-input within/between " + this.f18066D.mo33880c() + " entries");
            }
        }
    }

    /* renamed from: g1 */
    private int m30666g1() throws IOException, JsonParseException {
        while (true) {
            if (this.f18085g < this.f18086o || mo37401e0()) {
                char[] cArr = this.f18149d0;
                int i = this.f18085g;
                this.f18085g = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    m30663Z0();
                } else if (c != ' ') {
                    if (c == 10) {
                        mo37500d1();
                    } else if (c == 13) {
                        mo37499Y0();
                    } else if (c != 9) {
                        mo37419H(c);
                    }
                }
            } else {
                mo37411z();
                return -1;
            }
        }
    }

    /* renamed from: h1 */
    private char m30667h1() throws IOException, JsonParseException {
        char c;
        if ((this.f18085g >= this.f18086o && !mo37401e0()) || (c = this.f18149d0[this.f18085g]) < '0' || c > '9') {
            return '0';
        }
        if (!mo33873u(C6802e.C6803a.ALLOW_NUMERIC_LEADING_ZEROS)) {
            mo37403h0("Leading zeroes not allowed");
        }
        this.f18085g++;
        if (c == '0') {
            do {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    break;
                }
                char[] cArr = this.f18149d0;
                int i = this.f18085g;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.f18085g = i + 1;
            } while (c == '0');
        }
        return c;
    }

    /* renamed from: l1 */
    private C6805g m30668l1(boolean z) throws IOException, JsonParseException {
        int i;
        char c;
        boolean z2;
        int i2;
        char c2;
        char j1;
        int i3;
        char[] i4 = this.f18068F.mo33964i();
        int i5 = 0;
        if (z) {
            i4[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        int i6 = this.f18085g;
        if (i6 < this.f18086o) {
            char[] cArr = this.f18149d0;
            this.f18085g = i6 + 1;
            c = cArr[i6];
        } else {
            c = mo37502j1("No digit following minus sign");
        }
        if (c == '0') {
            c = m30667h1();
        }
        int i7 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i7++;
                if (i >= i4.length) {
                    i4 = this.f18068F.mo33966m();
                    i = 0;
                }
                int i8 = i + 1;
                i4[i] = c;
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    i = i8;
                    c = 0;
                    z2 = true;
                    break;
                }
                char[] cArr2 = this.f18149d0;
                int i9 = this.f18085g;
                this.f18085g = i9 + 1;
                c = cArr2[i9];
                i = i8;
            } else {
                z2 = false;
            }
        }
        z2 = false;
        if (i7 == 0) {
            mo37403h0("Missing integer part (next char " + C7390c.m30534y(c) + ")");
        }
        if (c == '.') {
            i4[i] = c;
            int i10 = i + 1;
            i2 = 0;
            while (true) {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.f18149d0;
                int i11 = this.f18085g;
                this.f18085g = i11 + 1;
                c = cArr3[i11];
                if (c < '0' || c > '9') {
                    break;
                }
                i2++;
                if (i >= i4.length) {
                    i4 = this.f18068F.mo33966m();
                    i = 0;
                }
                i4[i] = c;
                i10 = i + 1;
            }
            if (i2 == 0) {
                mo37406l0(c, "Decimal point not followed by a digit");
            }
        } else {
            i2 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i >= i4.length) {
                i4 = this.f18068F.mo33966m();
                i = 0;
            }
            int i12 = i + 1;
            i4[i] = c;
            int i13 = this.f18085g;
            if (i13 < this.f18086o) {
                char[] cArr4 = this.f18149d0;
                this.f18085g = i13 + 1;
                c2 = cArr4[i13];
            } else {
                c2 = mo37502j1("expected a digit for number exponent");
            }
            if (c2 == '-' || c2 == '+') {
                if (i12 >= i4.length) {
                    i4 = this.f18068F.mo33966m();
                    i12 = 0;
                }
                int i14 = i12 + 1;
                i4[i12] = c2;
                int i15 = this.f18085g;
                if (i15 < this.f18086o) {
                    char[] cArr5 = this.f18149d0;
                    this.f18085g = i15 + 1;
                    j1 = cArr5[i15];
                } else {
                    j1 = mo37502j1("expected a digit for number exponent");
                }
                i12 = i14;
            }
            int i16 = 0;
            while (true) {
                if (c2 <= '9' && c2 >= '0') {
                    i16++;
                    if (i12 >= i4.length) {
                        i4 = this.f18068F.mo33966m();
                        i12 = 0;
                    }
                    i3 = i12 + 1;
                    i4[i12] = c2;
                    if (this.f18085g >= this.f18086o && !mo37401e0()) {
                        i5 = i16;
                        z2 = true;
                        break;
                    }
                    char[] cArr6 = this.f18149d0;
                    int i17 = this.f18085g;
                    this.f18085g = i17 + 1;
                    c2 = cArr6[i17];
                    i12 = i3;
                } else {
                    i5 = i16;
                    i3 = i12;
                }
            }
            i5 = i16;
            i3 = i12;
            if (i5 == 0) {
                mo37406l0(c2, "Exponent indicator not followed by a digit");
            }
            i = i3;
        }
        if (!z2) {
            this.f18085g--;
        }
        this.f18068F.mo33977w(i);
        return mo37407n0(z, i7, i2, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public C6805g mo37491A0() throws IOException, JsonParseException {
        char[] i = this.f18068F.mo33964i();
        int o = this.f18068F.mo33968o();
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(": was expecting closing quote for a string value");
            }
            char[] cArr = this.f18149d0;
            int i2 = this.f18085g;
            this.f18085g = i2 + 1;
            char c = cArr[i2];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo37504w0();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this.f18068F.mo33977w(o);
                        return C6805g.VALUE_STRING;
                    } else if (c < ' ') {
                        mo37420I(c, "string value");
                    }
                }
            }
            if (o >= i.length) {
                i = this.f18068F.mo33966m();
                o = 0;
            }
            i[o] = c;
            o++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ?, r9v1 ?, r9v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: B0 */
    protected com.fasterxml.jackson.core.C6805g mo37492B0(
/*
Method generation error in method: i5.e.B0(int, boolean):com.fasterxml.jackson.core.g, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public C6805g mo37493C0(int i) throws IOException, JsonParseException {
        if (i != 39) {
            if (i == 43) {
                if (this.f18085g >= this.f18086o && !mo37401e0()) {
                    mo37416E();
                }
                char[] cArr = this.f18149d0;
                int i2 = this.f18085g;
                this.f18085g = i2 + 1;
                return mo37492B0(cArr[i2], false);
            } else if (i == 78) {
                mo37495E0("NaN", 1);
                if (mo33873u(C6802e.C6803a.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return mo37408p0("NaN", Double.NaN);
                }
                mo37413B("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        } else if (mo33873u(C6802e.C6803a.ALLOW_SINGLE_QUOTES)) {
            return mo37491A0();
        }
        mo37417F(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public String mo37494D0(int i) throws IOException, JsonParseException {
        boolean z;
        if (i == 39 && mo33873u(C6802e.C6803a.ALLOW_SINGLE_QUOTES)) {
            return mo37496I0();
        }
        if (!mo33873u(C6802e.C6803a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            mo37417F(i, "was expecting double-quote to start field name");
        }
        int[] h = C6809b.m25593h();
        int length = h.length;
        if (i < length) {
            z = h[i] == 0 && (i < 48 || i > 57);
        } else {
            z = Character.isJavaIdentifierPart((char) i);
        }
        if (!z) {
            mo37417F(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.f18085g;
        int i3 = this.f18151f0;
        int i4 = this.f18086o;
        if (i2 < i4) {
            do {
                char[] cArr = this.f18149d0;
                char c = cArr[i2];
                if (c < length) {
                    if (h[c] != 0) {
                        int i5 = this.f18085g - 1;
                        this.f18085g = i2;
                        return this.f18150e0.mo37603h(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c)) {
                    int i6 = this.f18085g - 1;
                    this.f18085g = i2;
                    return this.f18150e0.mo37603h(this.f18149d0, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        this.f18085g = i2;
        return m30661R0(this.f18085g - 1, i3, h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public void mo37495E0(String str, int i) throws IOException, JsonParseException {
        int i2;
        char c;
        int length = str.length();
        do {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37416E();
            }
            if (this.f18149d0[this.f18085g] != str.charAt(i)) {
                mo37498U0(str.substring(0, i), "'null', 'true', 'false' or NaN");
            }
            i2 = this.f18085g + 1;
            this.f18085g = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f18086o || mo37401e0()) && (c = this.f18149d0[this.f18085g]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            mo37498U0(str.substring(0, i), "'null', 'true', 'false' or NaN");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public String mo37496I0() throws IOException, JsonParseException {
        int i = this.f18085g;
        int i2 = this.f18151f0;
        int i3 = this.f18086o;
        if (i < i3) {
            int[] g = C6809b.m25592g();
            int length = g.length;
            do {
                char[] cArr = this.f18149d0;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && g[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.f18085g;
                    this.f18085g = i + 1;
                    return this.f18150e0.mo37603h(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.f18085g;
        this.f18085g = i;
        return m30660N0(i5, i2, 39);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo37392K() throws IOException {
        if (this.f18148c0 != null) {
            if (this.f18083d.mo33907h() || mo33873u(C6802e.C6803a.AUTO_CLOSE_SOURCE)) {
                this.f18148c0.close();
            }
            this.f18148c0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public String mo37497K0(int i) throws IOException, JsonParseException {
        if (i != 34) {
            return mo37494D0(i);
        }
        int i2 = this.f18085g;
        int i3 = this.f18151f0;
        int i4 = this.f18086o;
        if (i2 < i4) {
            int[] g = C6809b.m25592g();
            int length = g.length;
            while (true) {
                char[] cArr = this.f18149d0;
                char c = cArr[i2];
                if (c >= length || g[c] == 0) {
                    i3 = (i3 * 33) + c;
                    i2++;
                    if (i2 >= i4) {
                        break;
                    }
                } else if (c == '\"') {
                    int i5 = this.f18085g;
                    this.f18085g = i2 + 1;
                    return this.f18150e0.mo37603h(cArr, i5, i2 - i5, i3);
                }
            }
        }
        int i6 = this.f18085g;
        this.f18085g = i2;
        return m30660N0(i6, i3, 34);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo37394O() throws IOException {
        super.mo37394O();
        char[] cArr = this.f18149d0;
        if (cArr != null) {
            this.f18149d0 = null;
            this.f18083d.mo33911l(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public void mo37498U0(String str, String str2) throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                break;
            }
            char c = this.f18149d0[this.f18085g];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.f18085g++;
            sb.append(c);
        }
        mo37413B("Unrecognized token '" + sb.toString() + "': was expecting ");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo37499Y0() throws IOException {
        if (this.f18085g < this.f18086o || mo37401e0()) {
            char[] cArr = this.f18149d0;
            int i = this.f18085g;
            if (cArr[i] == 10) {
                this.f18085g = i + 1;
            }
        }
        this.f18088s++;
        this.f18089z = this.f18085g;
    }

    public void close() throws IOException {
        super.close();
        this.f18150e0.mo37607p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public void mo37500d1() throws IOException {
        this.f18088s++;
        this.f18089z = this.f18085g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo37401e0() throws IOException {
        long j = this.f18087p;
        int i = this.f18086o;
        this.f18087p = j + ((long) i);
        this.f18089z -= i;
        Reader reader = this.f18148c0;
        if (reader != null) {
            char[] cArr = this.f18149d0;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.f18085g = 0;
                this.f18086o = read;
                return true;
            }
            mo37392K();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f18086o);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e1 */
    public void mo37501e1() throws IOException, JsonParseException {
        this.f18152g0 = false;
        int i = this.f18085g;
        int i2 = this.f18086o;
        char[] cArr = this.f18149d0;
        while (true) {
            if (i >= i2) {
                this.f18085g = i;
                if (!mo37401e0()) {
                    mo37415D(": was expecting closing quote for a string value");
                }
                i = this.f18085g;
                i2 = this.f18086o;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.f18085g = i3;
                    mo37504w0();
                    i = this.f18085g;
                    i2 = this.f18086o;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f18085g = i3;
                        return;
                    } else if (c < ' ') {
                        this.f18085g = i3;
                        mo37420I(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public char mo37502j1(String str) throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(str);
        }
        char[] cArr = this.f18149d0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        return cArr[i];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r13v0 ?, r13v2 ?, r13v18 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: k1 */
    protected com.fasterxml.jackson.core.C6805g mo37503k1(
/*
Method generation error in method: i5.e.k1(int):com.fasterxml.jackson.core.g, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* renamed from: s */
    public String mo33872s() throws IOException, JsonParseException {
        C6805g gVar = this.f18090c;
        if (gVar != C6805g.VALUE_STRING) {
            return mo37507z0(gVar);
        }
        if (this.f18152g0) {
            this.f18152g0 = false;
            mo37505x0();
        }
        return this.f18068F.mo33963h();
    }

    /* renamed from: v */
    public C6805g mo33874v() throws IOException, JsonParseException {
        C6805g gVar;
        this.f18073K = 0;
        C6805g gVar2 = this.f18090c;
        C6805g gVar3 = C6805g.FIELD_NAME;
        if (gVar2 == gVar3) {
            return m30659G0();
        }
        if (this.f18152g0) {
            mo37501e1();
        }
        int g1 = m30666g1();
        if (g1 < 0) {
            close();
            this.f18090c = null;
            return null;
        }
        long j = this.f18087p;
        int i = this.f18085g;
        this.f18063A = (j + ((long) i)) - 1;
        this.f18064B = this.f18088s;
        this.f18065C = (i - this.f18089z) - 1;
        this.f18072J = null;
        if (g1 == 93) {
            if (!this.f18066D.mo33881d()) {
                mo37395Q(g1, '}');
            }
            this.f18066D = this.f18066D.mo37479l();
            C6805g gVar4 = C6805g.END_ARRAY;
            this.f18090c = gVar4;
            return gVar4;
        } else if (g1 == 125) {
            if (!this.f18066D.mo33882e()) {
                mo37395Q(g1, ']');
            }
            this.f18066D = this.f18066D.mo37479l();
            C6805g gVar5 = C6805g.END_OBJECT;
            this.f18090c = gVar5;
            return gVar5;
        } else {
            if (this.f18066D.mo37477j()) {
                if (g1 != 44) {
                    mo37417F(g1, "was expecting comma to separate " + this.f18066D.mo33880c() + " entries");
                }
                g1 = m30665f1();
            }
            boolean e = this.f18066D.mo33882e();
            if (e) {
                this.f18066D.mo37482o(mo37497K0(g1));
                this.f18090c = gVar3;
                int f1 = m30665f1();
                if (f1 != 58) {
                    mo37417F(f1, "was expecting a colon to separate field name and value");
                }
                g1 = m30665f1();
            }
            if (g1 != 34) {
                if (g1 != 45) {
                    if (g1 != 91) {
                        if (g1 != 93) {
                            if (g1 == 102) {
                                mo37495E0("false", 1);
                                gVar = C6805g.VALUE_FALSE;
                            } else if (g1 != 110) {
                                if (g1 != 116) {
                                    if (g1 != 123) {
                                        if (g1 != 125) {
                                            switch (g1) {
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    break;
                                                default:
                                                    gVar = mo37493C0(g1);
                                                    break;
                                            }
                                        }
                                    } else {
                                        if (!e) {
                                            this.f18066D = this.f18066D.mo37476h(this.f18064B, this.f18065C);
                                        }
                                        gVar = C6805g.START_OBJECT;
                                    }
                                }
                                mo37495E0("true", 1);
                                gVar = C6805g.VALUE_TRUE;
                            } else {
                                mo37495E0("null", 1);
                                gVar = C6805g.VALUE_NULL;
                            }
                        }
                        mo37417F(g1, "expected a value");
                        mo37495E0("true", 1);
                        gVar = C6805g.VALUE_TRUE;
                    } else {
                        if (!e) {
                            this.f18066D = this.f18066D.mo37475g(this.f18064B, this.f18065C);
                        }
                        gVar = C6805g.START_ARRAY;
                    }
                }
                gVar = mo37503k1(g1);
            } else {
                this.f18152g0 = true;
                gVar = C6805g.VALUE_STRING;
            }
            if (e) {
                this.f18067E = gVar;
                return this.f18090c;
            }
            this.f18090c = gVar;
            return gVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public char mo37504w0() throws IOException, JsonParseException {
        if (this.f18085g >= this.f18086o && !mo37401e0()) {
            mo37415D(" in character escape sequence");
        }
        char[] cArr = this.f18149d0;
        int i = this.f18085g;
        this.f18085g = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return 8;
        }
        if (c == 'f') {
            return 12;
        }
        if (c == 'n') {
            return 10;
        }
        if (c == 'r') {
            return 13;
        }
        if (c == 't') {
            return 9;
        }
        if (c != 'u') {
            return mo37412A(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(" in character escape sequence");
            }
            char[] cArr2 = this.f18149d0;
            int i4 = this.f18085g;
            this.f18085g = i4 + 1;
            char c2 = cArr2[i4];
            int b = C6809b.m25587b(c2);
            if (b < 0) {
                mo37417F(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b;
        }
        return (char) i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo37505x0() throws IOException, JsonParseException {
        int i = this.f18085g;
        int i2 = this.f18086o;
        if (i < i2) {
            int[] g = C6809b.m25592g();
            int length = g.length;
            while (true) {
                char[] cArr = this.f18149d0;
                char c = cArr[i];
                if (c >= length || g[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    C6831e eVar = this.f18068F;
                    int i3 = this.f18085g;
                    eVar.mo33975u(cArr, i3, i - i3);
                    this.f18085g = i + 1;
                    return;
                }
            }
        }
        C6831e eVar2 = this.f18068F;
        char[] cArr2 = this.f18149d0;
        int i4 = this.f18085g;
        eVar2.mo33972s(cArr2, i4, i - i4);
        this.f18085g = i;
        mo37506y0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo37506y0() throws IOException, JsonParseException {
        char[] n = this.f18068F.mo33967n();
        int o = this.f18068F.mo33968o();
        while (true) {
            if (this.f18085g >= this.f18086o && !mo37401e0()) {
                mo37415D(": was expecting closing quote for a string value");
            }
            char[] cArr = this.f18149d0;
            int i = this.f18085g;
            this.f18085g = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo37504w0();
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f18068F.mo33977w(o);
                        return;
                    } else if (c < ' ') {
                        mo37420I(c, "string value");
                    }
                }
            }
            if (o >= n.length) {
                n = this.f18068F.mo33966m();
                o = 0;
            }
            n[o] = c;
            o++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public String mo37507z0(C6805g gVar) {
        if (gVar == null) {
            return null;
        }
        int i = C7425a.f18153a[gVar.ordinal()];
        if (i == 1) {
            return this.f18066D.mo37478k();
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.f18068F.mo33963h();
        }
        return gVar.mo33884b();
    }
}
