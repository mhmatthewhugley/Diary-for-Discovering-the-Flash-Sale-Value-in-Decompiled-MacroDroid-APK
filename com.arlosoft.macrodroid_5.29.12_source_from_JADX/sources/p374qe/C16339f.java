package p374qe;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: qe.f */
/* compiled from: DecimalStyle */
public final class C16339f {

    /* renamed from: e */
    public static final C16339f f66805e = new C16339f('0', '+', '-', FilenameUtils.EXTENSION_SEPARATOR);

    /* renamed from: f */
    private static final ConcurrentMap<Locale, C16339f> f66806f = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    private final char f66807a;

    /* renamed from: b */
    private final char f66808b;

    /* renamed from: c */
    private final char f66809c;

    /* renamed from: d */
    private final char f66810d;

    private C16339f(char c, char c2, char c3, char c4) {
        this.f66807a = c;
        this.f66808b = c2;
        this.f66809c = c3;
        this.f66810d = c4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo78999a(String str) {
        char c = this.f66807a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* renamed from: b */
    public char mo79000b() {
        return this.f66810d;
    }

    /* renamed from: c */
    public char mo79001c() {
        return this.f66809c;
    }

    /* renamed from: d */
    public char mo79002d() {
        return this.f66808b;
    }

    /* renamed from: e */
    public char mo79003e() {
        return this.f66807a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16339f)) {
            return false;
        }
        C16339f fVar = (C16339f) obj;
        if (this.f66807a == fVar.f66807a && this.f66808b == fVar.f66808b && this.f66809c == fVar.f66809c && this.f66810d == fVar.f66810d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f66807a + this.f66808b + this.f66809c + this.f66810d;
    }

    public String toString() {
        return "DecimalStyle[" + this.f66807a + this.f66808b + this.f66809c + this.f66810d + "]";
    }
}
