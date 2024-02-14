package com.google.common.p206io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* renamed from: com.google.common.io.BaseEncoding */
public abstract class BaseEncoding {

    /* renamed from: a */
    private static final BaseEncoding f52910a = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final BaseEncoding f52911b = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final BaseEncoding f52912c = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final BaseEncoding f52913d = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final BaseEncoding f52914e = new Base16Encoding("base16()", "0123456789ABCDEF");

    /* renamed from: com.google.common.io.BaseEncoding$1 */
    class C108891 extends ByteSink {
    }

    /* renamed from: com.google.common.io.BaseEncoding$2 */
    class C108902 extends ByteSource {

        /* renamed from: a */
        final /* synthetic */ CharSource f52915a;

        /* renamed from: b */
        final /* synthetic */ BaseEncoding f52916b;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return this.f52916b.mo60970f(this.f52915a.mo61010a());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5 */
    class C108935 extends Writer {

        /* renamed from: a */
        final /* synthetic */ Appendable f52923a;

        /* renamed from: c */
        final /* synthetic */ Writer f52924c;

        public void close() throws IOException {
            this.f52924c.close();
        }

        public void flush() throws IOException {
            this.f52924c.flush();
        }

        public void write(int i) throws IOException {
            this.f52923a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$Alphabet */
    private static final class Alphabet {

        /* renamed from: a */
        private final String f52925a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final char[] f52926b;

        /* renamed from: c */
        final int f52927c;

        /* renamed from: d */
        final int f52928d;

        /* renamed from: e */
        final int f52929e;

        /* renamed from: f */
        final int f52930f;

        /* renamed from: g */
        private final byte[] f52931g;

        /* renamed from: h */
        private final boolean[] f52932h;

        Alphabet(String str, char[] cArr) {
            this.f52925a = (String) Preconditions.m5392s(str);
            this.f52926b = (char[]) Preconditions.m5392s(cArr);
            try {
                int h = IntMath.m73472h(cArr.length, RoundingMode.UNNECESSARY);
                this.f52928d = h;
                int min = Math.min(8, Integer.lowestOneBit(h));
                try {
                    this.f52929e = 8 / min;
                    this.f52930f = h / min;
                    this.f52927c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        Preconditions.m5379f(c < 128, "Non-ASCII character: %s", c);
                        Preconditions.m5379f(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f52931g = bArr;
                    boolean[] zArr = new boolean[this.f52929e];
                    for (int i2 = 0; i2 < this.f52930f; i2++) {
                        zArr[IntMath.m73468d(i2 * 8, this.f52928d, RoundingMode.CEILING)] = true;
                    }
                    this.f52932h = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo60990b(char c) throws DecodingException {
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f52931g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public char mo60991c(int i) {
            return this.f52926b[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo60992d(int i) {
            return this.f52932h[i % this.f52929e];
        }

        /* renamed from: e */
        public boolean mo60993e(char c) {
            byte[] bArr = this.f52931g;
            return c < bArr.length && bArr[c] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.f52926b, ((Alphabet) obj).f52926b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f52926b);
        }

        public String toString() {
            return this.f52925a;
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$Base16Encoding */
    static final class Base16Encoding extends StandardBaseEncoding {

        /* renamed from: h */
        final char[] f52933h;

        Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo60969e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.m5392s(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f52937f.mo60990b(charSequence.charAt(i)) << 4) | this.f52937f.mo60990b(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo60973i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.m5392s(appendable);
            Preconditions.m5397x(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = bArr[i + i3] & 255;
                appendable.append(this.f52933h[b]);
                appendable.append(this.f52933h[b | 256]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public BaseEncoding mo60997s(Alphabet alphabet, Character ch) {
            return new Base16Encoding(alphabet);
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, (Character) null);
            this.f52933h = new char[512];
            Preconditions.m5377d(alphabet.f52926b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f52933h[i] = alphabet.mo60991c(i >>> 4);
                this.f52933h[i | 256] = alphabet.mo60991c(i & 15);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$Base64Encoding */
    static final class Base64Encoding extends StandardBaseEncoding {
        Base64Encoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo60969e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.m5392s(bArr);
            CharSequence p = mo60977p(charSequence);
            if (this.f52937f.mo60992d(p.length())) {
                int i = 0;
                int i2 = 0;
                while (i < p.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int b = (this.f52937f.mo60990b(p.charAt(i)) << 18) | (this.f52937f.mo60990b(p.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (b >>> 16);
                    if (i4 < p.length()) {
                        int i6 = i4 + 1;
                        int b2 = b | (this.f52937f.mo60990b(p.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) ((b2 >>> 8) & 255);
                        if (i6 < p.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) ((b2 | this.f52937f.mo60990b(p.charAt(i6))) & 255);
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            int length = p.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo60973i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.m5392s(appendable);
            int i3 = i + i2;
            Preconditions.m5397x(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                byte b = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f52937f.mo60991c(b >>> 18));
                appendable.append(this.f52937f.mo60991c((b >>> 12) & 63));
                appendable.append(this.f52937f.mo60991c((b >>> 6) & 63));
                appendable.append(this.f52937f.mo60991c(b & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                mo61001r(appendable, bArr, i, i3 - i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public BaseEncoding mo60997s(Alphabet alphabet, Character ch) {
            return new Base64Encoding(alphabet, ch);
        }

        private Base64Encoding(Alphabet alphabet, Character ch) {
            super(alphabet, ch);
            Preconditions.m5377d(alphabet.f52926b.length == 64);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$SeparatedBaseEncoding */
    static final class SeparatedBaseEncoding extends BaseEncoding {

        /* renamed from: f */
        private final BaseEncoding f52934f;

        /* renamed from: g */
        private final String f52935g;

        /* renamed from: h */
        private final int f52936h;

        SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i) {
            this.f52934f = (BaseEncoding) Preconditions.m5392s(baseEncoding);
            this.f52935g = (String) Preconditions.m5392s(str);
            this.f52936h = i;
            Preconditions.m5381h(i > 0, "Cannot add a separator after every %s chars", i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo60969e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.f52935g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f52934f.mo60969e(bArr, sb);
        }

        @GwtIncompatible
        /* renamed from: f */
        public InputStream mo60970f(Reader reader) {
            return this.f52934f.mo60970f(BaseEncoding.m73358k(reader, this.f52935g));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo60973i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            this.f52934f.mo60973i(BaseEncoding.m73359o(appendable, this.f52935g, this.f52936h), bArr, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo60974l(int i) {
            return this.f52934f.mo60974l(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo60975m(int i) {
            int m = this.f52934f.mo60975m(i);
            return m + (this.f52935g.length() * IntMath.m73468d(Math.max(0, m - 1), this.f52936h, RoundingMode.FLOOR));
        }

        /* renamed from: n */
        public BaseEncoding mo60976n() {
            return this.f52934f.mo60976n().mo60978q(this.f52935g, this.f52936h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public CharSequence mo60977p(CharSequence charSequence) {
            return this.f52934f.mo60977p(charSequence);
        }

        /* renamed from: q */
        public BaseEncoding mo60978q(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        public String toString() {
            String valueOf = String.valueOf(this.f52934f);
            String str = this.f52935g;
            int i = this.f52936h;
            StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(".withSeparator(\"");
            sb.append(str);
            sb.append("\", ");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding */
    static class StandardBaseEncoding extends BaseEncoding {

        /* renamed from: f */
        final Alphabet f52937f;

        /* renamed from: g */
        final Character f52938g;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1 */
        class C108941 extends OutputStream {

            /* renamed from: a */
            int f52939a;

            /* renamed from: c */
            int f52940c;

            /* renamed from: d */
            int f52941d;

            /* renamed from: f */
            final /* synthetic */ Writer f52942f;

            /* renamed from: g */
            final /* synthetic */ StandardBaseEncoding f52943g;

            public void close() throws IOException {
                int i = this.f52940c;
                if (i > 0) {
                    int i2 = this.f52939a;
                    Alphabet alphabet = this.f52943g.f52937f;
                    this.f52942f.write(alphabet.mo60991c((i2 << (alphabet.f52928d - i)) & alphabet.f52927c));
                    this.f52941d++;
                    if (this.f52943g.f52938g != null) {
                        while (true) {
                            int i3 = this.f52941d;
                            StandardBaseEncoding standardBaseEncoding = this.f52943g;
                            if (i3 % standardBaseEncoding.f52937f.f52929e == 0) {
                                break;
                            }
                            this.f52942f.write(standardBaseEncoding.f52938g.charValue());
                            this.f52941d++;
                        }
                    }
                }
                this.f52942f.close();
            }

            public void flush() throws IOException {
                this.f52942f.flush();
            }

            public void write(int i) throws IOException {
                this.f52939a = (i & 255) | (this.f52939a << 8);
                this.f52940c += 8;
                while (true) {
                    int i2 = this.f52940c;
                    Alphabet alphabet = this.f52943g.f52937f;
                    int i3 = alphabet.f52928d;
                    if (i2 >= i3) {
                        this.f52942f.write(alphabet.mo60991c((this.f52939a >> (i2 - i3)) & alphabet.f52927c));
                        this.f52941d++;
                        this.f52940c -= this.f52943g.f52937f.f52928d;
                    } else {
                        return;
                    }
                }
            }
        }

        StandardBaseEncoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo60969e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Preconditions.m5392s(bArr);
            CharSequence p = mo60977p(charSequence);
            if (this.f52937f.mo60992d(p.length())) {
                int i = 0;
                int i2 = 0;
                while (i < p.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        alphabet = this.f52937f;
                        if (i3 >= alphabet.f52929e) {
                            break;
                        }
                        j <<= alphabet.f52928d;
                        if (i + i3 < p.length()) {
                            j |= (long) this.f52937f.mo60990b(p.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = alphabet.f52930f;
                    int i6 = (i5 * 8) - (i4 * alphabet.f52928d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f52937f.f52929e;
                }
                return i2;
            }
            int length = p.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
            if (!this.f52937f.equals(standardBaseEncoding.f52937f) || !Objects.m5349a(this.f52938g, standardBaseEncoding.f52938g)) {
                return false;
            }
            return true;
        }

        @GwtIncompatible
        /* renamed from: f */
        public InputStream mo60970f(final Reader reader) {
            Preconditions.m5392s(reader);
            return new InputStream() {

                /* renamed from: a */
                int f52944a = 0;

                /* renamed from: c */
                int f52945c = 0;

                /* renamed from: d */
                int f52946d = 0;

                /* renamed from: f */
                boolean f52947f = false;

                public void close() throws IOException {
                    reader.close();
                }

                public int read() throws IOException {
                    int i;
                    while (true) {
                        int read = reader.read();
                        if (read != -1) {
                            this.f52946d++;
                            char c = (char) read;
                            Character ch = StandardBaseEncoding.this.f52938g;
                            if (ch == null || ch.charValue() != c) {
                                if (!this.f52947f) {
                                    int i2 = this.f52944a;
                                    Alphabet alphabet = StandardBaseEncoding.this.f52937f;
                                    int i3 = i2 << alphabet.f52928d;
                                    this.f52944a = i3;
                                    int b = alphabet.mo60990b(c) | i3;
                                    this.f52944a = b;
                                    int i4 = this.f52945c + StandardBaseEncoding.this.f52937f.f52928d;
                                    this.f52945c = i4;
                                    if (i4 >= 8) {
                                        int i5 = i4 - 8;
                                        this.f52945c = i5;
                                        return (b >> i5) & 255;
                                    }
                                } else {
                                    int i6 = this.f52946d;
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Expected padding character but found '");
                                    sb.append(c);
                                    sb.append("' at index ");
                                    sb.append(i6);
                                    throw new DecodingException(sb.toString());
                                }
                            } else if (this.f52947f || ((i = this.f52946d) != 1 && StandardBaseEncoding.this.f52937f.mo60992d(i - 1))) {
                                this.f52947f = true;
                            }
                        } else if (this.f52947f || StandardBaseEncoding.this.f52937f.mo60992d(this.f52946d)) {
                            return -1;
                        } else {
                            int i7 = this.f52946d;
                            StringBuilder sb2 = new StringBuilder(32);
                            sb2.append("Invalid input length ");
                            sb2.append(i7);
                            throw new DecodingException(sb2.toString());
                        }
                    }
                    int i8 = this.f52946d;
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("Padding cannot start at index ");
                    sb3.append(i8);
                    throw new DecodingException(sb3.toString());
                }

                public int read(byte[] bArr, int i, int i2) throws IOException {
                    int i3 = i2 + i;
                    Preconditions.m5397x(i, i3, bArr.length);
                    int i4 = i;
                    while (i4 < i3) {
                        int read = read();
                        if (read == -1) {
                            int i5 = i4 - i;
                            if (i5 == 0) {
                                return -1;
                            }
                            return i5;
                        }
                        bArr[i4] = (byte) read;
                        i4++;
                    }
                    return i4 - i;
                }
            };
        }

        public int hashCode() {
            return this.f52937f.hashCode() ^ Objects.m5350b(this.f52938g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo60973i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.m5392s(appendable);
            Preconditions.m5397x(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                mo61001r(appendable, bArr, i + i3, Math.min(this.f52937f.f52930f, i2 - i3));
                i3 += this.f52937f.f52930f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo60974l(int i) {
            return (int) (((((long) this.f52937f.f52928d) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo60975m(int i) {
            Alphabet alphabet = this.f52937f;
            return alphabet.f52929e * IntMath.m73468d(i, alphabet.f52930f, RoundingMode.CEILING);
        }

        /* renamed from: n */
        public BaseEncoding mo60976n() {
            return this.f52938g == null ? this : mo60997s(this.f52937f, (Character) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public CharSequence mo60977p(CharSequence charSequence) {
            Preconditions.m5392s(charSequence);
            Character ch = this.f52938g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* renamed from: q */
        public BaseEncoding mo60978q(String str, int i) {
            boolean z = false;
            for (int i2 = 0; i2 < str.length(); i2++) {
                Preconditions.m5385l(!this.f52937f.mo60993e(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.f52938g;
            if (ch != null) {
                if (str.indexOf(ch.charValue()) < 0) {
                    z = true;
                }
                Preconditions.m5385l(z, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo61001r(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.m5392s(appendable);
            Preconditions.m5397x(i, i + i2, bArr.length);
            int i3 = 0;
            Preconditions.m5377d(i2 <= this.f52937f.f52930f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f52937f.f52928d;
            while (i3 < i2 * 8) {
                Alphabet alphabet = this.f52937f;
                appendable.append(alphabet.mo60991c(((int) (j >>> (i5 - i3))) & alphabet.f52927c));
                i3 += this.f52937f.f52928d;
            }
            if (this.f52938g != null) {
                while (i3 < this.f52937f.f52930f * 8) {
                    appendable.append(this.f52938g.charValue());
                    i3 += this.f52937f.f52928d;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public BaseEncoding mo60997s(Alphabet alphabet, Character ch) {
            return new StandardBaseEncoding(alphabet, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f52937f.toString());
            if (8 % this.f52937f.f52928d != 0) {
                if (this.f52938g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f52938g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        StandardBaseEncoding(Alphabet alphabet, Character ch) {
            this.f52937f = (Alphabet) Preconditions.m5392s(alphabet);
            Preconditions.m5385l(ch == null || !alphabet.mo60993e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f52938g = ch;
        }
    }

    BaseEncoding() {
    }

    /* renamed from: a */
    public static BaseEncoding m73355a() {
        return f52914e;
    }

    /* renamed from: b */
    public static BaseEncoding m73356b() {
        return f52910a;
    }

    /* renamed from: j */
    private static byte[] m73357j(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    @GwtIncompatible
    /* renamed from: k */
    static Reader m73358k(final Reader reader, final String str) {
        Preconditions.m5392s(reader);
        Preconditions.m5392s(str);
        return new Reader() {
            public void close() throws IOException {
                reader.close();
            }

            /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: 
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            public int read() throws java.io.IOException {
                /*
                    r3 = this;
                L_0x0000:
                    java.io.Reader r0 = r1
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 == r1) goto L_0x0012
                    java.lang.String r1 = r2
                    char r2 = (char) r0
                    int r1 = r1.indexOf(r2)
                    if (r1 >= 0) goto L_0x0000
                L_0x0012:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.p206io.BaseEncoding.C108913.read():int");
            }

            public int read(char[] cArr, int i, int i2) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: o */
    static Appendable m73359o(Appendable appendable, String str, int i) {
        Preconditions.m5392s(appendable);
        Preconditions.m5392s(str);
        Preconditions.m5377d(i > 0);
        return new Appendable(i, appendable, str) {

            /* renamed from: a */
            int f52919a;

            /* renamed from: c */
            final /* synthetic */ int f52920c;

            /* renamed from: d */
            final /* synthetic */ Appendable f52921d;

            /* renamed from: f */
            final /* synthetic */ String f52922f;

            {
                this.f52920c = r1;
                this.f52921d = r2;
                this.f52922f = r3;
                this.f52919a = r1;
            }

            public Appendable append(char c) throws IOException {
                if (this.f52919a == 0) {
                    this.f52921d.append(this.f52922f);
                    this.f52919a = this.f52920c;
                }
                this.f52921d.append(c);
                this.f52919a--;
                return this;
            }

            public Appendable append(CharSequence charSequence, int i, int i2) {
                throw new UnsupportedOperationException();
            }

            public Appendable append(CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: c */
    public final byte[] mo60967c(CharSequence charSequence) {
        try {
            return mo60968d(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte[] mo60968d(CharSequence charSequence) throws DecodingException {
        CharSequence p = mo60977p(charSequence);
        byte[] bArr = new byte[mo60974l(p.length())];
        return m73357j(bArr, mo60969e(bArr, p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo60969e(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @GwtIncompatible
    /* renamed from: f */
    public abstract InputStream mo60970f(Reader reader);

    /* renamed from: g */
    public String mo60971g(byte[] bArr) {
        return mo60972h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public final String mo60972h(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo60975m(i2));
        try {
            mo60973i(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo60973i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract int mo60974l(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract int mo60975m(int i);

    /* renamed from: n */
    public abstract BaseEncoding mo60976n();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public CharSequence mo60977p(CharSequence charSequence) {
        return (CharSequence) Preconditions.m5392s(charSequence);
    }

    /* renamed from: q */
    public abstract BaseEncoding mo60978q(String str, int i);
}
