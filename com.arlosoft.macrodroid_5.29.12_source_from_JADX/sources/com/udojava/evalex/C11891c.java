package com.udojava.evalex;

import com.udojava.evalex.Expression;
import java.math.BigDecimal;

/* renamed from: com.udojava.evalex.c */
/* compiled from: AbstractUnaryOperator */
public abstract class C11891c extends C11888b {

    /* renamed from: com.udojava.evalex.c$a */
    /* compiled from: AbstractUnaryOperator */
    class C11892a implements Expression.C11882y1 {

        /* renamed from: a */
        final /* synthetic */ Expression.C11882y1 f57865a;

        C11892a(Expression.C11882y1 y1Var) {
            this.f57865a = y1Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return C11891c.this.mo67127g(this.f57865a.mo67128a());
        }
    }

    protected C11891c(String str, int i, boolean z) {
        super(str, i, z);
    }

    /* renamed from: d */
    public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal2 == null) {
            return mo67127g(bigDecimal);
        }
        throw new Expression.ExpressionException("Did not expect a second parameter for unary operator");
    }

    /* renamed from: e */
    public Expression.C11882y1 mo67130e(Expression.C11882y1 y1Var, Expression.C11882y1 y1Var2) {
        if (y1Var2 == null) {
            return new C11892a(y1Var);
        }
        throw new Expression.ExpressionException("Did not expect a second parameter for unary operator");
    }

    /* renamed from: g */
    public abstract BigDecimal mo67127g(BigDecimal bigDecimal);
}
