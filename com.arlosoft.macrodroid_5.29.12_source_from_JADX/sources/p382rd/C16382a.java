package p382rd;

import androidx.core.app.FrameMetricsAggregator;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import p351od.C15852c;

/* renamed from: rd.a */
/* compiled from: CharacterReader */
public final class C16382a {

    /* renamed from: a */
    private char[] f66933a;

    /* renamed from: b */
    private Reader f66934b;

    /* renamed from: c */
    private int f66935c;

    /* renamed from: d */
    private int f66936d;

    /* renamed from: e */
    private int f66937e;

    /* renamed from: f */
    private int f66938f;

    /* renamed from: g */
    private int f66939g;

    /* renamed from: h */
    private String[] f66940h;

    /* renamed from: i */
    private ArrayList<Integer> f66941i;

    /* renamed from: j */
    private int f66942j;

    /* renamed from: k */
    private boolean f66943k;

    /* renamed from: l */
    private String f66944l;

    /* renamed from: m */
    private int f66945m;

    public C16382a(Reader reader, int i) {
        this.f66939g = -1;
        this.f66940h = new String[512];
        this.f66941i = null;
        this.f66942j = 1;
        C15852c.m95479h(reader);
        C15852c.m95474c(reader.markSupported());
        this.f66934b = reader;
        this.f66933a = new char[Math.min(i, 32768)];
        m98135b();
    }

    /* renamed from: A */
    private int m98132A(int i) {
        if (!mo79105z()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.f66941i, Integer.valueOf(i));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    /* renamed from: R */
    static boolean m98133R(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: T */
    private void m98134T() {
        if (mo79105z()) {
            if (this.f66941i.size() > 0) {
                int A = m98132A(this.f66938f);
                if (A == -1) {
                    A = 0;
                }
                int intValue = this.f66941i.get(A).intValue();
                this.f66942j += A;
                this.f66941i.clear();
                this.f66941i.add(Integer.valueOf(intValue));
            }
            for (int i = this.f66937e; i < this.f66935c; i++) {
                if (this.f66933a[i] == 10) {
                    this.f66941i.add(Integer.valueOf(this.f66938f + 1 + i));
                }
            }
        }
    }

    /* renamed from: b */
    private void m98135b() {
        int i;
        int i2;
        boolean z;
        if (!this.f66943k && (i = this.f66937e) >= this.f66936d) {
            int i3 = this.f66939g;
            if (i3 != -1) {
                int i4 = i3;
                i2 = i - i3;
                i = i4;
            } else {
                i2 = 0;
            }
            try {
                long j = (long) i;
                long skip = this.f66934b.skip(j);
                this.f66934b.mark(32768);
                int i5 = 0;
                while (true) {
                    z = true;
                    if (i5 > 1024) {
                        break;
                    }
                    Reader reader = this.f66934b;
                    char[] cArr = this.f66933a;
                    int read = reader.read(cArr, i5, cArr.length - i5);
                    if (read == -1) {
                        this.f66943k = true;
                    }
                    if (read <= 0) {
                        break;
                    }
                    i5 += read;
                }
                this.f66934b.reset();
                if (i5 > 0) {
                    if (skip != j) {
                        z = false;
                    }
                    C15852c.m95474c(z);
                    this.f66935c = i5;
                    this.f66938f += i;
                    this.f66937e = i2;
                    if (this.f66939g != -1) {
                        this.f66939g = 0;
                    }
                    this.f66936d = Math.min(i5, 24576);
                }
                m98134T();
                this.f66944l = null;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    /* renamed from: c */
    private static String m98136c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & FrameMetricsAggregator.EVERY_DURATION;
        String str = strArr[i5];
        if (str != null && m98133R(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    /* renamed from: y */
    private boolean m98137y() {
        return this.f66937e >= this.f66935c;
    }

    /* renamed from: B */
    public int mo79062B() {
        return mo79063C(mo79077Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo79063C(int i) {
        if (!mo79105z()) {
            return 1;
        }
        int A = m98132A(i);
        if (A == -1) {
            return this.f66942j;
        }
        return A + this.f66942j + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo79064D() {
        if (this.f66935c - this.f66937e < 1024) {
            this.f66936d = 0;
        }
        m98135b();
        this.f66939g = this.f66937e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo79065E(String str) {
        m98135b();
        if (!mo79068H(str)) {
            return false;
        }
        this.f66937e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo79066F(String str) {
        if (!mo79073M(str)) {
            return false;
        }
        this.f66937e += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo79067G(char c) {
        return !mo79104x() && this.f66933a[this.f66937e] == c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo79068H(String str) {
        m98135b();
        int length = str.length();
        if (length > this.f66935c - this.f66937e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f66933a[this.f66937e + i]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo79069I(char... cArr) {
        if (mo79104x()) {
            return false;
        }
        m98135b();
        char c = this.f66933a[this.f66937e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo79070J(char[] cArr) {
        m98135b();
        return !mo79104x() && Arrays.binarySearch(cArr, this.f66933a[this.f66937e]) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo79071K() {
        if (mo79104x()) {
            return false;
        }
        char c = this.f66933a[this.f66937e];
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo79072L() {
        char c;
        if (!mo79104x() && (c = this.f66933a[this.f66937e]) >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo79073M(String str) {
        m98135b();
        int length = str.length();
        if (length > this.f66935c - this.f66937e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f66933a[this.f66937e + i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo79074N() {
        if (mo79104x()) {
            return false;
        }
        char c = this.f66933a[this.f66937e];
        if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public int mo79075O(char c) {
        m98135b();
        for (int i = this.f66937e; i < this.f66935c; i++) {
            if (c == this.f66933a[i]) {
                return i - this.f66937e;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo79076P(CharSequence charSequence) {
        m98135b();
        char charAt = charSequence.charAt(0);
        int i = this.f66937e;
        while (i < this.f66935c) {
            int i2 = 1;
            if (charAt != this.f66933a[i]) {
                do {
                    i++;
                    if (i >= this.f66935c) {
                        break;
                    }
                } while (charAt == this.f66933a[i]);
            }
            int i3 = i + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.f66935c;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length && charSequence.charAt(i2) == this.f66933a[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.f66937e;
                }
            }
            i = i3;
        }
        return -1;
    }

    /* renamed from: Q */
    public int mo79077Q() {
        return this.f66938f + this.f66937e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo79078S() {
        int i = this.f66939g;
        if (i != -1) {
            this.f66937e = i;
            mo79081W();
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    /* renamed from: U */
    public void mo79079U(boolean z) {
        if (z && this.f66941i == null) {
            this.f66941i = new ArrayList<>(409);
            m98134T();
        } else if (!z) {
            this.f66941i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo79080V() {
        int i = this.f66937e;
        if (i >= 1) {
            this.f66937e = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo79081W() {
        this.f66939g = -1;
    }

    /* renamed from: a */
    public void mo79082a() {
        this.f66937e++;
    }

    /* renamed from: d */
    public void mo79083d() {
        Reader reader = this.f66934b;
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f66934b = null;
                this.f66933a = null;
                this.f66940h = null;
                throw th;
            }
            this.f66934b = null;
            this.f66933a = null;
            this.f66940h = null;
        }
    }

    /* renamed from: e */
    public int mo79084e() {
        return mo79085f(mo79077Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo79085f(int i) {
        if (!mo79105z()) {
            return i + 1;
        }
        int A = m98132A(i);
        if (A == -1) {
            return i + 1;
        }
        return (i - this.f66941i.get(A).intValue()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo79086g() {
        m98135b();
        char c = m98137y() ? 65535 : this.f66933a[this.f66937e];
        this.f66937e++;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo79087h(boolean z) {
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr = this.f66933a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                } else if (c == '\'') {
                    if (z) {
                        break;
                    }
                } else {
                    continue;
                    i3++;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo79088i() {
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr = this.f66933a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo79089j() {
        int i;
        char c;
        m98135b();
        int i2 = this.f66937e;
        while (true) {
            i = this.f66937e;
            if (i < this.f66935c && (c = this.f66933a[i]) >= '0' && c <= '9') {
                this.f66937e = i + 1;
            }
        }
        return m98136c(this.f66933a, this.f66940h, i2, i - i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo79090k() {
        int i;
        char c;
        m98135b();
        int i2 = this.f66937e;
        while (true) {
            i = this.f66937e;
            if (i < this.f66935c && (((c = this.f66933a[i]) >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')))) {
                this.f66937e = i + 1;
            }
        }
        return m98136c(this.f66933a, this.f66940h, i2, i - i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo79091l() {
        char c;
        m98135b();
        int i = this.f66937e;
        while (true) {
            int i2 = this.f66937e;
            if (i2 < this.f66935c && (((c = this.f66933a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f66937e++;
            }
        }
        return m98136c(this.f66933a, this.f66940h, i, this.f66937e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo79092m() {
        char c;
        m98135b();
        int i = this.f66937e;
        while (true) {
            int i2 = this.f66937e;
            if (i2 < this.f66935c && (((c = this.f66933a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f66937e++;
            }
        }
        while (!m98137y() && (r1 = this.f66933a[r2]) >= '0' && r1 <= '9') {
            this.f66937e = (r2 = this.f66937e) + 1;
        }
        return m98136c(this.f66933a, this.f66940h, i, this.f66937e - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo79093n() {
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr = this.f66933a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo79094o() {
        m98135b();
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr = this.f66933a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* renamed from: p */
    public String mo79095p(char c) {
        int O = mo79075O(c);
        if (O == -1) {
            return mo79099t();
        }
        String c2 = m98136c(this.f66933a, this.f66940h, this.f66937e, O);
        this.f66937e += O;
        return c2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public String mo79096q(String str) {
        int P = mo79076P(str);
        if (P != -1) {
            String c = m98136c(this.f66933a, this.f66940h, this.f66937e, P);
            this.f66937e += P;
            return c;
        } else if (this.f66935c - this.f66937e < str.length()) {
            return mo79099t();
        } else {
            int length = (this.f66935c - str.length()) + 1;
            char[] cArr = this.f66933a;
            String[] strArr = this.f66940h;
            int i = this.f66937e;
            String c2 = m98136c(cArr, strArr, i, length - i);
            this.f66937e = length;
            return c2;
        }
    }

    /* renamed from: r */
    public String mo79097r(char... cArr) {
        m98135b();
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr2 = this.f66933a;
        int i3 = i;
        loop0:
        while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo79098s(char... cArr) {
        m98135b();
        int i = this.f66937e;
        int i2 = this.f66935c;
        char[] cArr2 = this.f66933a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f66937e = i3;
        return i3 > i ? m98136c(this.f66933a, this.f66940h, i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo79099t() {
        m98135b();
        char[] cArr = this.f66933a;
        String[] strArr = this.f66940h;
        int i = this.f66937e;
        String c = m98136c(cArr, strArr, i, this.f66935c - i);
        this.f66937e = this.f66935c;
        return c;
    }

    public String toString() {
        int i = this.f66935c;
        int i2 = this.f66937e;
        if (i - i2 < 0) {
            return "";
        }
        return new String(this.f66933a, i2, i - i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo79101u(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.f66944l)) {
            int i2 = this.f66945m;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.f66937e) {
                return true;
            }
        }
        this.f66944l = str;
        Locale locale = Locale.ENGLISH;
        int P = mo79076P(str.toLowerCase(locale));
        if (P > -1) {
            this.f66945m = this.f66937e + P;
            return true;
        }
        int P2 = mo79076P(str.toUpperCase(locale));
        if (P2 > -1) {
            z = true;
        }
        if (z) {
            i = this.f66937e + P2;
        }
        this.f66945m = i;
        return z;
    }

    /* renamed from: v */
    public char mo79102v() {
        m98135b();
        if (m98137y()) {
            return 65535;
        }
        return this.f66933a[this.f66937e];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public String mo79103w() {
        return mo79062B() + ":" + mo79084e();
    }

    /* renamed from: x */
    public boolean mo79104x() {
        m98135b();
        return this.f66937e >= this.f66935c;
    }

    /* renamed from: z */
    public boolean mo79105z() {
        return this.f66941i != null;
    }

    public C16382a(Reader reader) {
        this(reader, 32768);
    }

    public C16382a(String str) {
        this(new StringReader(str), str.length());
    }
}
