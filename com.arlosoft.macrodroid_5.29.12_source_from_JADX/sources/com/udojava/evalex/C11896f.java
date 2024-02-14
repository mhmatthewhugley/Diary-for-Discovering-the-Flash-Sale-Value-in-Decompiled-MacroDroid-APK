package com.udojava.evalex;

import com.udojava.evalex.Expression;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: com.udojava.evalex.f */
/* compiled from: LazyIfNumber */
public class C11896f implements Expression.C11882y1 {

    /* renamed from: a */
    private List<Expression.C11882y1> f57871a;

    public C11896f(List<Expression.C11882y1> list) {
        this.f57871a = list;
    }

    /* renamed from: b */
    private void m82125b(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            throw new ArithmeticException("Operand may not be null");
        }
    }

    /* renamed from: a */
    public BigDecimal mo67128a() {
        boolean z = false;
        BigDecimal a = this.f57871a.get(0).mo67128a();
        m82125b(a);
        if (a.compareTo(BigDecimal.ZERO) != 0) {
            z = true;
        }
        List list = this.f57871a;
        return ((Expression.C11882y1) (z ? list.get(1) : list.get(2))).mo67128a();
    }
}
