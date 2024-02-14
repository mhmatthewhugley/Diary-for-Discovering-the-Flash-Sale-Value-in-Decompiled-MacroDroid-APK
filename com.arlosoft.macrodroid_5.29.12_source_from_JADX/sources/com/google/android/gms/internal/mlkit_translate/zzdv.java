package com.google.android.gms.internal.mlkit_translate;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzdv implements Closeable, Flushable {

    /* renamed from: p */
    private static final Pattern f43262p = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: s */
    private static final String[] f43263s = new String[128];

    /* renamed from: z */
    private static final String[] f43264z;

    /* renamed from: a */
    private final Writer f43265a;

    /* renamed from: c */
    private int[] f43266c = new int[32];

    /* renamed from: d */
    private int f43267d = 0;

    /* renamed from: f */
    private final String f43268f;

    /* renamed from: g */
    private boolean f43269g;

    /* renamed from: o */
    private String f43270o;

    static {
        for (int i = 0; i <= 31; i++) {
            f43263s[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f43263s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f43264z = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzdv(Writer writer) {
        m61761v(6);
        this.f43268f = ":";
        this.f43265a = writer;
    }

    /* renamed from: p */
    private final int m61757p() {
        int i = this.f43267d;
        if (i != 0) {
            return this.f43266c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: r */
    private final zzdv m61758r(int i, int i2, char c) throws IOException {
        int p = m61757p();
        if (p == i2 || p == i) {
            String str = this.f43270o;
            if (str == null) {
                this.f43267d--;
                this.f43265a.write(c);
                return this;
            }
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: s */
    private final zzdv m61759s(int i, char c) throws IOException {
        m61760u();
        m61761v(i);
        this.f43265a.write(c);
        return this;
    }

    /* renamed from: u */
    private final void m61760u() throws IOException {
        int p = m61757p();
        if (p == 1) {
            m61762w(2);
        } else if (p == 2) {
            this.f43265a.append(',');
        } else if (p != 4) {
            if (p != 6) {
                if (p != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f43269g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m61762w(7);
        } else {
            this.f43265a.append(this.f43268f);
            m61762w(5);
        }
    }

    /* renamed from: v */
    private final void m61761v(int i) {
        int i2 = this.f43267d;
        int[] iArr = this.f43266c;
        if (i2 == iArr.length) {
            this.f43266c = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.f43266c;
        int i3 = this.f43267d;
        this.f43267d = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: w */
    private final void m61762w(int i) {
        this.f43266c[this.f43267d - 1] = i;
    }

    /* renamed from: x */
    private final void m61763x(String str) throws IOException {
        String str2;
        String[] strArr = f43263s;
        this.f43265a.write(34);
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
                this.f43265a.write(str, i, i2 - i);
            }
            this.f43265a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f43265a.write(str, i, length - i);
        }
        this.f43265a.write(34);
    }

    /* renamed from: y */
    private final void m61764y() throws IOException {
        if (this.f43270o != null) {
            int p = m61757p();
            if (p == 5) {
                this.f43265a.write(44);
            } else if (p != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m61762w(4);
            m61763x(this.f43270o);
            this.f43270o = null;
        }
    }

    /* renamed from: b */
    public final zzdv mo52187b() throws IOException {
        m61764y();
        m61759s(1, '[');
        return this;
    }

    /* renamed from: c */
    public final zzdv mo52188c() throws IOException {
        m61764y();
        m61759s(3, '{');
        return this;
    }

    public final void close() throws IOException {
        this.f43265a.close();
        int i = this.f43267d;
        if (i > 1 || (i == 1 && this.f43266c[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f43267d = 0;
    }

    /* renamed from: e */
    public final zzdv mo52190e() throws IOException {
        m61758r(1, 2, ']');
        return this;
    }

    /* renamed from: f */
    public final zzdv mo52191f() throws IOException {
        m61758r(3, 5, '}');
        return this;
    }

    public final void flush() throws IOException {
        if (this.f43267d != 0) {
            this.f43265a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final zzdv mo52193g(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f43270o != null) {
            throw new IllegalStateException();
        } else if (this.f43267d != 0) {
            this.f43270o = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: h */
    public final zzdv mo52194h() throws IOException {
        if (this.f43270o != null) {
            m61764y();
        }
        m61760u();
        this.f43265a.write("null");
        return this;
    }

    /* renamed from: i */
    public final zzdv mo52195i(Number number) throws IOException {
        m61764y();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class || f43262p.matcher(obj).matches())) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f43269g) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        m61760u();
        this.f43265a.append(obj);
        return this;
    }

    /* renamed from: j */
    public final zzdv mo52196j(String str) throws IOException {
        if (str == null) {
            mo52194h();
            return this;
        }
        m61764y();
        m61760u();
        m61763x(str);
        return this;
    }

    /* renamed from: m */
    public final zzdv mo52197m(boolean z) throws IOException {
        m61764y();
        m61760u();
        this.f43265a.write(true != z ? "false" : "true");
        return this;
    }

    /* renamed from: o */
    public final void mo52198o(boolean z) {
        this.f43269g = true;
    }
}
