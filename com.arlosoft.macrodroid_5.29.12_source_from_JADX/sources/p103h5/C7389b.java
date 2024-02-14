package p103h5;

import androidx.core.location.LocationRequestCompat;
import com.fasterxml.jackson.core.C6801d;
import com.fasterxml.jackson.core.C6805g;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.p072io.C6815h;
import com.fasterxml.jackson.core.util.C6825b;
import com.fasterxml.jackson.core.util.C6831e;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p109i5.C7422c;

/* renamed from: h5.b */
/* compiled from: ParserBase */
public abstract class C7389b extends C7390c {

    /* renamed from: U */
    static final BigInteger f18055U;

    /* renamed from: V */
    static final BigInteger f18056V;

    /* renamed from: W */
    static final BigInteger f18057W;

    /* renamed from: X */
    static final BigInteger f18058X;

    /* renamed from: Y */
    static final BigDecimal f18059Y;

    /* renamed from: Z */
    static final BigDecimal f18060Z;

    /* renamed from: a0 */
    static final BigDecimal f18061a0;

    /* renamed from: b0 */
    static final BigDecimal f18062b0;

    /* renamed from: A */
    protected long f18063A = 0;

    /* renamed from: B */
    protected int f18064B = 1;

    /* renamed from: C */
    protected int f18065C = 0;

    /* renamed from: D */
    protected C7422c f18066D;

    /* renamed from: E */
    protected C6805g f18067E;

    /* renamed from: F */
    protected final C6831e f18068F;

    /* renamed from: G */
    protected char[] f18069G = null;

    /* renamed from: H */
    protected boolean f18070H = false;

    /* renamed from: I */
    protected C6825b f18071I = null;

    /* renamed from: J */
    protected byte[] f18072J;

    /* renamed from: K */
    protected int f18073K = 0;

    /* renamed from: L */
    protected int f18074L;

    /* renamed from: M */
    protected long f18075M;

    /* renamed from: N */
    protected double f18076N;

    /* renamed from: O */
    protected BigInteger f18077O;

    /* renamed from: P */
    protected BigDecimal f18078P;

    /* renamed from: Q */
    protected boolean f18079Q;

    /* renamed from: R */
    protected int f18080R;

    /* renamed from: S */
    protected int f18081S;

    /* renamed from: T */
    protected int f18082T;

    /* renamed from: d */
    protected final C6811d f18083d;

    /* renamed from: f */
    protected boolean f18084f;

    /* renamed from: g */
    protected int f18085g = 0;

    /* renamed from: o */
    protected int f18086o = 0;

    /* renamed from: p */
    protected long f18087p = 0;

    /* renamed from: s */
    protected int f18088s = 1;

    /* renamed from: z */
    protected int f18089z = 0;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f18055U = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f18056V = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f18057W = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL);
        f18058X = valueOf4;
        f18059Y = new BigDecimal(valueOf3);
        f18060Z = new BigDecimal(valueOf4);
        f18061a0 = new BigDecimal(valueOf);
        f18062b0 = new BigDecimal(valueOf2);
    }

    protected C7389b(C6811d dVar, int i) {
        this.f15780a = i;
        this.f18083d = dVar;
        this.f18068F = dVar.mo33904e();
        this.f18066D = C7422c.m30642i();
    }

    /* renamed from: M */
    private void m30504M(int i) throws IOException, JsonParseException {
        if (i == 16) {
            try {
                this.f18078P = this.f18068F.mo33961f();
                this.f18073K = 16;
            } catch (NumberFormatException e) {
                mo37421J("Malformed numeric value '" + this.f18068F.mo33963h() + "'", e);
            }
        } else {
            this.f18076N = this.f18068F.mo33962g();
            this.f18073K = 8;
        }
    }

    /* renamed from: N */
    private void m30505N(int i, char[] cArr, int i2, int i3) throws IOException, JsonParseException {
        String h = this.f18068F.mo33963h();
        try {
            if (C6815h.m25615a(cArr, i2, i3, this.f18079Q)) {
                this.f18075M = Long.parseLong(h);
                this.f18073K = 2;
                return;
            }
            this.f18077O = new BigInteger(h);
            this.f18073K = 4;
        } catch (NumberFormatException e) {
            mo37421J("Malformed numeric value '" + h + "'", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void mo37392K() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo37393L(int i) throws IOException, JsonParseException {
        C6805g gVar = this.f18090c;
        if (gVar == C6805g.VALUE_NUMBER_INT) {
            char[] p = this.f18068F.mo33969p();
            int q = this.f18068F.mo33970q();
            int i2 = this.f18080R;
            if (this.f18079Q) {
                q++;
            }
            if (i2 <= 9) {
                int c = C6815h.m25617c(p, q, i2);
                if (this.f18079Q) {
                    c = -c;
                }
                this.f18074L = c;
                this.f18073K = 1;
            } else if (i2 <= 18) {
                long d = C6815h.m25618d(p, q, i2);
                boolean z = this.f18079Q;
                if (z) {
                    d = -d;
                }
                if (i2 == 10) {
                    if (z) {
                        if (d >= -2147483648L) {
                            this.f18074L = (int) d;
                            this.f18073K = 1;
                            return;
                        }
                    } else if (d <= 2147483647L) {
                        this.f18074L = (int) d;
                        this.f18073K = 1;
                        return;
                    }
                }
                this.f18075M = d;
                this.f18073K = 2;
            } else {
                m30505N(i, p, q, i2);
            }
        } else if (gVar == C6805g.VALUE_NUMBER_FLOAT) {
            m30504M(i);
        } else {
            mo37413B("Current token (" + this.f18090c + ") not numeric, can not use numeric value accessors");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo37394O() throws IOException {
        this.f18068F.mo33971r();
        char[] cArr = this.f18069G;
        if (cArr != null) {
            this.f18069G = null;
            this.f18083d.mo33909j(cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo37395Q(int i, char c) throws JsonParseException {
        mo37413B("Unexpected close marker '" + ((char) i) + "': expected '" + c + "' (for " + this.f18066D.mo33880c() + " starting at " + ("" + this.f18066D.mo37480m(this.f18083d.mo33906g())) + ")");
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo37396S() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 8) != 0) {
            this.f18078P = new BigDecimal(mo33872s());
        } else if ((i & 4) != 0) {
            this.f18078P = new BigDecimal(this.f18077O);
        } else if ((i & 2) != 0) {
            this.f18078P = BigDecimal.valueOf(this.f18075M);
        } else if ((i & 1) != 0) {
            this.f18078P = BigDecimal.valueOf((long) this.f18074L);
        } else {
            mo37418G();
        }
        this.f18073K |= 16;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo37397U() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 16) != 0) {
            this.f18077O = this.f18078P.toBigInteger();
        } else if ((i & 2) != 0) {
            this.f18077O = BigInteger.valueOf(this.f18075M);
        } else if ((i & 1) != 0) {
            this.f18077O = BigInteger.valueOf((long) this.f18074L);
        } else if ((i & 8) != 0) {
            this.f18077O = BigDecimal.valueOf(this.f18076N).toBigInteger();
        } else {
            mo37418G();
        }
        this.f18073K |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo37398W() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 16) != 0) {
            this.f18076N = this.f18078P.doubleValue();
        } else if ((i & 4) != 0) {
            this.f18076N = this.f18077O.doubleValue();
        } else if ((i & 2) != 0) {
            this.f18076N = (double) this.f18075M;
        } else if ((i & 1) != 0) {
            this.f18076N = (double) this.f18074L;
        } else {
            mo37418G();
        }
        this.f18073K |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo37399Z() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 2) != 0) {
            long j = this.f18075M;
            int i2 = (int) j;
            if (((long) i2) != j) {
                mo37413B("Numeric value (" + mo33872s() + ") out of range of int");
            }
            this.f18074L = i2;
        } else if ((i & 4) != 0) {
            if (f18055U.compareTo(this.f18077O) > 0 || f18056V.compareTo(this.f18077O) < 0) {
                mo37404j0();
            }
            this.f18074L = this.f18077O.intValue();
        } else if ((i & 8) != 0) {
            double d = this.f18076N;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                mo37404j0();
            }
            this.f18074L = (int) this.f18076N;
        } else if ((i & 16) != 0) {
            if (f18061a0.compareTo(this.f18078P) > 0 || f18062b0.compareTo(this.f18078P) < 0) {
                mo37404j0();
            }
            this.f18074L = this.f18078P.intValue();
        } else {
            mo37418G();
        }
        this.f18073K |= 1;
    }

    /* renamed from: c */
    public BigInteger mo33860c() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 4) == 0) {
            if (i == 0) {
                mo37393L(4);
            }
            if ((this.f18073K & 4) == 0) {
                mo37397U();
            }
        }
        return this.f18077O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo37400c0() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 1) != 0) {
            this.f18075M = (long) this.f18074L;
        } else if ((i & 4) != 0) {
            if (f18057W.compareTo(this.f18077O) > 0 || f18058X.compareTo(this.f18077O) < 0) {
                mo37405k0();
            }
            this.f18075M = this.f18077O.longValue();
        } else if ((i & 8) != 0) {
            double d = this.f18076N;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                mo37405k0();
            }
            this.f18075M = (long) this.f18076N;
        } else if ((i & 16) != 0) {
            if (f18059Y.compareTo(this.f18078P) > 0 || f18060Z.compareTo(this.f18078P) < 0) {
                mo37405k0();
            }
            this.f18075M = this.f18078P.longValue();
        } else {
            mo37418G();
        }
        this.f18073K |= 2;
    }

    public void close() throws IOException {
        if (!this.f18084f) {
            this.f18084f = true;
            try {
                mo37392K();
            } finally {
                mo37394O();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract boolean mo37401e0() throws IOException;

    /* renamed from: f */
    public C6801d mo33863f() {
        return new C6801d(this.f18083d.mo33906g(), (this.f18087p + ((long) this.f18085g)) - 1, this.f18088s, (this.f18085g - this.f18089z) + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void mo37402f0() throws IOException {
        if (!mo37401e0()) {
            mo37414C();
        }
    }

    /* renamed from: g */
    public String mo33864g() throws IOException, JsonParseException {
        C6805g gVar = this.f18090c;
        if (gVar == C6805g.START_OBJECT || gVar == C6805g.START_ARRAY) {
            return this.f18066D.mo37479l().mo37478k();
        }
        return this.f18066D.mo37478k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo37403h0(String str) throws JsonParseException {
        mo37413B("Invalid numeric value: " + str);
    }

    /* renamed from: i */
    public BigDecimal mo33866i() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 16) == 0) {
            if (i == 0) {
                mo37393L(16);
            }
            if ((this.f18073K & 16) == 0) {
                mo37396S();
            }
        }
        return this.f18078P;
    }

    /* renamed from: j */
    public double mo33867j() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 8) == 0) {
            if (i == 0) {
                mo37393L(8);
            }
            if ((this.f18073K & 8) == 0) {
                mo37398W();
            }
        }
        return this.f18076N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo37404j0() throws IOException, JsonParseException {
        mo37413B("Numeric value (" + mo33872s() + ") out of range of int (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo37405k0() throws IOException, JsonParseException {
        mo37413B("Numeric value (" + mo33872s() + ") out of range of long (" + Long.MIN_VALUE + " - " + LocationRequestCompat.PASSIVE_INTERVAL + ")");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void mo37406l0(int i, String str) throws JsonParseException {
        String str2 = "Unexpected character (" + C7390c.m30534y(i) + ") in numeric value";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        mo37413B(str2);
    }

    /* renamed from: m */
    public float mo33868m() throws IOException, JsonParseException {
        return (float) mo33867j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final C6805g mo37407n0(boolean z, int i, int i2, int i3) {
        if (i2 >= 1 || i3 >= 1) {
            return mo37409q0(z, i, i2, i3);
        }
        return mo37410t0(z, i);
    }

    /* renamed from: o */
    public int mo33869o() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 1) == 0) {
            if (i == 0) {
                mo37393L(1);
            }
            if ((this.f18073K & 1) == 0) {
                mo37399Z();
            }
        }
        return this.f18074L;
    }

    /* renamed from: p */
    public long mo33870p() throws IOException, JsonParseException {
        int i = this.f18073K;
        if ((i & 2) == 0) {
            if (i == 0) {
                mo37393L(2);
            }
            if ((this.f18073K & 2) == 0) {
                mo37400c0();
            }
        }
        return this.f18075M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final C6805g mo37408p0(String str, double d) {
        this.f18068F.mo33976v(str);
        this.f18076N = d;
        this.f18073K = 8;
        return C6805g.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final C6805g mo37409q0(boolean z, int i, int i2, int i3) {
        this.f18079Q = z;
        this.f18080R = i;
        this.f18081S = i2;
        this.f18082T = i3;
        this.f18073K = 0;
        return C6805g.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final C6805g mo37410t0(boolean z, int i) {
        this.f18079Q = z;
        this.f18080R = i;
        this.f18081S = 0;
        this.f18082T = 0;
        this.f18073K = 0;
        return C6805g.VALUE_NUMBER_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo37411z() throws JsonParseException {
        if (!this.f18066D.mo33883f()) {
            mo37415D(": expected close marker for " + this.f18066D.mo33880c() + " (from " + this.f18066D.mo37480m(this.f18083d.mo33906g()) + ")");
        }
    }
}
