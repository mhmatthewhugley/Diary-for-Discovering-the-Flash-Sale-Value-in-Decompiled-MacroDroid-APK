package p109i5;

import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6806h;
import com.fasterxml.jackson.core.C6821j;
import com.fasterxml.jackson.core.p072io.C6809b;
import com.fasterxml.jackson.core.p072io.C6811d;
import com.fasterxml.jackson.core.util.C6826c;
import p103h5.C7388a;

/* renamed from: i5.b */
/* compiled from: JsonGeneratorImpl */
public abstract class C7421b extends C7388a {

    /* renamed from: A */
    protected static final int[] f18135A = C6809b.m25590e();

    /* renamed from: o */
    protected final C6811d f18136o;

    /* renamed from: p */
    protected int[] f18137p = f18135A;

    /* renamed from: s */
    protected int f18138s;

    /* renamed from: z */
    protected C6821j f18139z = C6826c.f15885c;

    public C7421b(C6811d dVar, int i, C6806h hVar) {
        super(i, hVar);
        this.f18136o = dVar;
        if (mo37390F(C6799c.C6800a.ESCAPE_NON_ASCII)) {
            mo37473G(127);
        }
    }

    /* renamed from: G */
    public C6799c mo37473G(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f18138s = i;
        return this;
    }

    /* renamed from: H */
    public C6799c mo37474H(C6821j jVar) {
        this.f18139z = jVar;
        return this;
    }
}
