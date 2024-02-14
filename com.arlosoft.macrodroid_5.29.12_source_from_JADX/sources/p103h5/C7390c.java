package p103h5;

import com.fasterxml.jackson.core.C6802e;
import com.fasterxml.jackson.core.C6805g;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

/* renamed from: h5.c */
/* compiled from: ParserMinimalBase */
public abstract class C7390c extends C6802e {

    /* renamed from: c */
    protected C6805g f18090c;

    /* renamed from: h5.c$a */
    /* compiled from: ParserMinimalBase */
    static /* synthetic */ class C7391a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.g[] r0 = com.fasterxml.jackson.core.C6805g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18091a = r0
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18091a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fasterxml.jackson.core.g r1 = com.fasterxml.jackson.core.C6805g.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p103h5.C7390c.C7391a.<clinit>():void");
        }
    }

    protected C7390c() {
    }

    /* renamed from: y */
    protected static final String m30534y(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        } else if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        } else {
            return "'" + c + "' (code " + i + ")";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public char mo37412A(char c) throws JsonProcessingException {
        if (mo33873u(C6802e.C6803a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && mo33873u(C6802e.C6803a.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        mo37413B("Unrecognized character escape " + m30534y(c));
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo37413B(String str) throws JsonParseException {
        throw mo33859b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo37414C() throws JsonParseException {
        mo37415D(" in " + this.f18090c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo37415D(String str) throws JsonParseException {
        mo37413B("Unexpected end-of-input" + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo37416E() throws JsonParseException {
        mo37415D(" in a value");
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo37417F(int i, String str) throws JsonParseException {
        String str2 = "Unexpected character (" + m30534y(i) + ")";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        mo37413B(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo37418G() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo37419H(int i) throws JsonParseException {
        mo37413B("Illegal character (" + m30534y((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo37420I(int i, String str) throws JsonParseException {
        if (!mo33873u(C6802e.C6803a.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32) {
            mo37413B("Illegal unquoted character (" + m30534y((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo37421J(String str, Throwable th) throws JsonParseException {
        throw mo37422x(str, th);
    }

    /* renamed from: h */
    public C6805g mo33865h() {
        return this.f18090c;
    }

    /* renamed from: s */
    public abstract String mo33872s() throws IOException, JsonParseException;

    /* renamed from: v */
    public abstract C6805g mo33874v() throws IOException, JsonParseException;

    /* renamed from: w */
    public C6802e mo33875w() throws IOException, JsonParseException {
        C6805g gVar = this.f18090c;
        if (gVar != C6805g.START_OBJECT && gVar != C6805g.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            C6805g v = mo33874v();
            if (v == null) {
                mo37411z();
                return this;
            }
            int i2 = C7391a.f18091a[v.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i++;
            } else if ((i2 == 3 || i2 == 4) && i - 1 == 0) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final JsonParseException mo37422x(String str, Throwable th) {
        return new JsonParseException(str, mo33863f(), th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo37411z() throws JsonParseException;
}
