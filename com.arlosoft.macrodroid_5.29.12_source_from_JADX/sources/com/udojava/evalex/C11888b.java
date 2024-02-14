package com.udojava.evalex;

import com.udojava.evalex.Expression;
import java.math.BigDecimal;
import p333n8.C15758b;
import p333n8.C15760d;

/* renamed from: com.udojava.evalex.b */
/* compiled from: AbstractOperator */
public abstract class C11888b extends C15758b implements C15760d {

    /* renamed from: com.udojava.evalex.b$a */
    /* compiled from: AbstractOperator */
    class C11889a implements Expression.C11882y1 {

        /* renamed from: a */
        final /* synthetic */ Expression.C11882y1 f57860a;

        C11889a(Expression.C11882y1 y1Var) {
            this.f57860a = y1Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return C11888b.this.mo67116d(this.f57860a.mo67128a(), (BigDecimal) null);
        }
    }

    /* renamed from: com.udojava.evalex.b$b */
    /* compiled from: AbstractOperator */
    class C11890b implements Expression.C11882y1 {

        /* renamed from: a */
        final /* synthetic */ Expression.C11882y1 f57862a;

        /* renamed from: b */
        final /* synthetic */ Expression.C11882y1 f57863b;

        C11890b(Expression.C11882y1 y1Var, Expression.C11882y1 y1Var2) {
            this.f57862a = y1Var;
            this.f57863b = y1Var2;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return C11888b.this.mo67116d(this.f57862a.mo67128a(), this.f57863b.mo67128a());
        }
    }

    protected C11888b(String str, int i, boolean z, boolean z2) {
        super(str, i, z, z2);
    }

    /* renamed from: e */
    public Expression.C11882y1 mo67130e(Expression.C11882y1 y1Var, Expression.C11882y1 y1Var2) {
        if (y1Var2 == null) {
            return new C11889a(y1Var);
        }
        return new C11890b(y1Var, y1Var2);
    }

    protected C11888b(String str, int i, boolean z) {
        super(str, i, z);
    }
}
