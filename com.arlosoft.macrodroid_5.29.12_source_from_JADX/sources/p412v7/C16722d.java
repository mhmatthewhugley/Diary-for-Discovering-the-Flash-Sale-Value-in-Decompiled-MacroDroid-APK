package p412v7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p007os.EnvironmentCompat;

/* renamed from: v7.d */
/* compiled from: MailcapTokenizer */
public class C16722d {

    /* renamed from: a */
    private String f67657a;

    /* renamed from: b */
    private int f67658b = 0;

    /* renamed from: c */
    private int f67659c;

    /* renamed from: d */
    private int f67660d;

    /* renamed from: e */
    private String f67661e;

    /* renamed from: f */
    private boolean f67662f;

    /* renamed from: g */
    private char f67663g;

    public C16722d(String str) {
        this.f67657a = str;
        this.f67659c = str.length();
        this.f67660d = 1;
        this.f67661e = "";
        this.f67662f = false;
        this.f67663g = ';';
    }

    /* renamed from: a */
    private static String m99274a(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\\') {
                stringBuffer.append(charAt);
            } else if (i < length - 1) {
                i++;
                stringBuffer.append(str.charAt(i));
            } else {
                stringBuffer.append(charAt);
            }
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    private static boolean m99275c(char c) {
        return Character.isISOControl(c);
    }

    /* renamed from: d */
    private static boolean m99276d(char c) {
        if (!(c == '\"' || c == ',' || c == '/' || c == '(' || c == ')')) {
            switch (c) {
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                    break;
                default:
                    switch (c) {
                        case '[':
                        case '\\':
                        case ']':
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m99277e(char c) {
        return !m99276d(c) && !m99275c(c) && !m99278f(c);
    }

    /* renamed from: f */
    private static boolean m99278f(char c) {
        return Character.isWhitespace(c);
    }

    /* renamed from: g */
    public static String m99279g(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 5 ? i != 47 ? i != 59 ? i != 61 ? "really unknown" : "'='" : "';'" : "'/'" : "EOI" : TypedValues.Custom.S_STRING : "start" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    /* renamed from: i */
    private void m99280i() {
        int i;
        int i2 = this.f67658b;
        boolean z = false;
        while (true) {
            i = this.f67658b;
            if (i >= this.f67659c || z) {
                this.f67660d = 2;
                this.f67661e = m99274a(this.f67657a.substring(i2, i));
            } else if (this.f67657a.charAt(i) != this.f67663g) {
                this.f67658b++;
            } else {
                z = true;
            }
        }
        this.f67660d = 2;
        this.f67661e = m99274a(this.f67657a.substring(i2, i));
    }

    /* renamed from: j */
    private void m99281j() {
        int i = this.f67658b;
        while (true) {
            int i2 = this.f67658b;
            if (i2 >= this.f67659c || !m99277e(this.f67657a.charAt(i2))) {
                this.f67660d = 2;
                this.f67661e = this.f67657a.substring(i, this.f67658b);
            } else {
                this.f67658b++;
            }
        }
        this.f67660d = 2;
        this.f67661e = this.f67657a.substring(i, this.f67658b);
    }

    /* renamed from: b */
    public String mo79644b() {
        return this.f67661e;
    }

    /* renamed from: h */
    public int mo79645h() {
        if (this.f67658b < this.f67659c) {
            while (true) {
                int i = this.f67658b;
                if (i >= this.f67659c || !m99278f(this.f67657a.charAt(i))) {
                    int i2 = this.f67658b;
                } else {
                    this.f67658b++;
                }
            }
            int i22 = this.f67658b;
            if (i22 < this.f67659c) {
                char charAt = this.f67657a.charAt(i22);
                if (this.f67662f) {
                    if (charAt == ';' || charAt == '=') {
                        this.f67660d = charAt;
                        this.f67661e = new Character(charAt).toString();
                        this.f67658b++;
                    } else {
                        m99280i();
                    }
                } else if (m99277e(charAt)) {
                    m99281j();
                } else if (charAt == '/' || charAt == ';' || charAt == '=') {
                    this.f67660d = charAt;
                    this.f67661e = new Character(charAt).toString();
                    this.f67658b++;
                } else {
                    this.f67660d = 0;
                    this.f67661e = new Character(charAt).toString();
                    this.f67658b++;
                }
            } else {
                this.f67660d = 5;
                this.f67661e = null;
            }
        } else {
            this.f67660d = 5;
            this.f67661e = null;
        }
        return this.f67660d;
    }

    /* renamed from: k */
    public void mo79646k(boolean z) {
        this.f67662f = z;
    }
}
