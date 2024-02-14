package com.udojava.evalex;

import com.udojava.evalex.Expression;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p333n8.C15757a;
import p333n8.C15759c;

/* renamed from: com.udojava.evalex.a */
/* compiled from: AbstractFunction */
public abstract class C11886a extends C15757a implements C15759c {

    /* renamed from: com.udojava.evalex.a$a */
    /* compiled from: AbstractFunction */
    class C11887a implements Expression.C11882y1 {

        /* renamed from: a */
        private List<BigDecimal> f57857a;

        /* renamed from: b */
        final /* synthetic */ List f57858b;

        C11887a(List list) {
            this.f57858b = list;
        }

        /* renamed from: b */
        private List<BigDecimal> m82108b() {
            if (this.f57857a == null) {
                this.f57857a = new ArrayList();
                for (Expression.C11882y1 a : this.f57858b) {
                    this.f57857a.add(a.mo67128a());
                }
            }
            return this.f57857a;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return C11886a.this.mo67117c(m82108b());
        }
    }

    protected C11886a(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public Expression.C11882y1 mo67129a(List<Expression.C11882y1> list) {
        return new C11887a(list);
    }

    protected C11886a(String str, int i, boolean z) {
        super(str, i, z);
    }
}
