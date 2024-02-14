package p292io.grpc.internal;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import p292io.grpc.C12537b1;
import p292io.grpc.C12562g0;
import p292io.grpc.C12569i0;
import p292io.grpc.C12960q0;
import p292io.grpc.internal.C12570a;

/* renamed from: io.grpc.internal.r0 */
/* compiled from: Http2ClientStreamTransportState */
public abstract class C12787r0 extends C12570a.C12573c {

    /* renamed from: M */
    private static final C12562g0.C12563a<Integer> f60165M;

    /* renamed from: N */
    private static final C12960q0.C12967g<Integer> f60166N;

    /* renamed from: I */
    private C12537b1 f60167I;

    /* renamed from: J */
    private C12960q0 f60168J;

    /* renamed from: K */
    private Charset f60169K = Charsets.f4139c;

    /* renamed from: L */
    private boolean f60170L;

    /* renamed from: io.grpc.internal.r0$a */
    /* compiled from: Http2ClientStreamTransportState */
    class C12788a implements C12562g0.C12563a<Integer> {
        C12788a() {
        }

        /* renamed from: c */
        public Integer mo69071b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, C12562g0.f59499a));
        }

        /* renamed from: d */
        public byte[] mo69070a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C12788a aVar = new C12788a();
        f60165M = aVar;
        f60166N = C12562g0.m83776b(":status", aVar);
    }

    protected C12787r0(int i, C12669e2 e2Var, C12725k2 k2Var) {
        super(i, e2Var, k2Var);
    }

    /* renamed from: K */
    private static Charset m84513K(C12960q0 q0Var) {
        String str = (String) q0Var.mo69764f(C12749o0.f60035h);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.f4139c;
    }

    /* renamed from: M */
    private C12537b1 m84514M(C12960q0 q0Var) {
        C12537b1 b1Var;
        C12537b1 b1Var2 = (C12537b1) q0Var.mo69764f(C12569i0.f59505b);
        if (b1Var2 != null) {
            return b1Var2.mo69066q((String) q0Var.mo69764f(C12569i0.f59504a));
        }
        if (this.f60170L) {
            return C12537b1.f59409h.mo69066q("missing GRPC status in response");
        }
        Integer num = (Integer) q0Var.mo69764f(f60166N);
        if (num != null) {
            b1Var = C12749o0.m84367i(num.intValue());
        } else {
            b1Var = C12537b1.f59421t.mo69066q("missing HTTP status code");
        }
        return b1Var.mo69058e("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: N */
    private static void m84515N(C12960q0 q0Var) {
        q0Var.mo69763d(f60166N);
        q0Var.mo69763d(C12569i0.f59505b);
        q0Var.mo69763d(C12569i0.f59504a);
    }

    /* renamed from: R */
    private C12537b1 m84516R(C12960q0 q0Var) {
        Integer num = (Integer) q0Var.mo69764f(f60166N);
        if (num == null) {
            return C12537b1.f59421t.mo69066q("Missing HTTP status code");
        }
        String str = (String) q0Var.mo69764f(C12749o0.f60035h);
        if (C12749o0.m84368j(str)) {
            return null;
        }
        C12537b1 i = C12749o0.m84367i(num.intValue());
        return i.mo69058e("invalid content-type: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract void mo69530L(C12537b1 b1Var, boolean z, C12960q0 q0Var);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo69531O(C12798s1 s1Var, boolean z) {
        C12537b1 b1Var = this.f60167I;
        if (b1Var != null) {
            this.f60167I = b1Var.mo69058e("DATA-----------------------------\n" + C12802t1.m84565d(s1Var, this.f60169K));
            s1Var.close();
            if (this.f60167I.mo69063n().length() > 1000 || z) {
                mo69530L(this.f60167I, false, this.f60168J);
            }
        } else if (!this.f60170L) {
            mo69530L(C12537b1.f59421t.mo69066q("headers not received before payload"), false, new C12960q0());
        } else {
            mo69174z(s1Var);
            if (z) {
                this.f60167I = C12537b1.f59421t.mo69066q("Received unexpected EOS on DATA frame from server.");
                C12960q0 q0Var = new C12960q0();
                this.f60168J = q0Var;
                mo69171J(this.f60167I, false, q0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo69532P(C12960q0 q0Var) {
        Preconditions.m5393t(q0Var, "headers");
        C12537b1 b1Var = this.f60167I;
        if (b1Var != null) {
            this.f60167I = b1Var.mo69058e("headers: " + q0Var);
            return;
        }
        try {
            if (this.f60170L) {
                C12537b1 q = C12537b1.f59421t.mo69066q("Received headers twice");
                this.f60167I = q;
                if (q != null) {
                    this.f60167I = q.mo69058e("headers: " + q0Var);
                    this.f60168J = q0Var;
                    this.f60169K = m84513K(q0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) q0Var.mo69764f(f60166N);
            if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                this.f60170L = true;
                C12537b1 R = m84516R(q0Var);
                this.f60167I = R;
                if (R == null) {
                    m84515N(q0Var);
                    mo69165A(q0Var);
                    C12537b1 b1Var2 = this.f60167I;
                    if (b1Var2 != null) {
                        this.f60167I = b1Var2.mo69058e("headers: " + q0Var);
                        this.f60168J = q0Var;
                        this.f60169K = m84513K(q0Var);
                    }
                } else if (R != null) {
                    this.f60167I = R.mo69058e("headers: " + q0Var);
                    this.f60168J = q0Var;
                    this.f60169K = m84513K(q0Var);
                }
            }
        } finally {
            C12537b1 b1Var3 = this.f60167I;
            if (b1Var3 != null) {
                this.f60167I = b1Var3.mo69058e("headers: " + q0Var);
                this.f60168J = q0Var;
                this.f60169K = m84513K(q0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo69533Q(C12960q0 q0Var) {
        Preconditions.m5393t(q0Var, "trailers");
        if (this.f60167I == null && !this.f60170L) {
            C12537b1 R = m84516R(q0Var);
            this.f60167I = R;
            if (R != null) {
                this.f60168J = q0Var;
            }
        }
        C12537b1 b1Var = this.f60167I;
        if (b1Var != null) {
            C12537b1 e = b1Var.mo69058e("trailers: " + q0Var);
            this.f60167I = e;
            mo69530L(e, false, this.f60168J);
            return;
        }
        C12537b1 M = m84514M(q0Var);
        m84515N(q0Var);
        mo69166B(q0Var, M);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo69172i(boolean z) {
        super.mo69172i(z);
    }
}
