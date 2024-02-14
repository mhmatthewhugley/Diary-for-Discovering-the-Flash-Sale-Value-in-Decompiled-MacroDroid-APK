package com.udojava.evalex;

import java.math.MathContext;

/* renamed from: com.udojava.evalex.d */
/* compiled from: ExpressionSettings */
public class C11893d {

    /* renamed from: a */
    private MathContext f57867a;

    /* renamed from: b */
    private int f57868b;

    /* renamed from: com.udojava.evalex.d$a */
    /* compiled from: ExpressionSettings */
    public static class C11894a {

        /* renamed from: a */
        private MathContext f57869a = MathContext.DECIMAL32;

        /* renamed from: b */
        private int f57870b = 40;

        /* renamed from: a */
        public C11893d mo67133a() {
            return new C11893d(this.f57869a, this.f57870b);
        }

        /* renamed from: b */
        public C11894a mo67134b(MathContext mathContext) {
            this.f57869a = mathContext;
            return this;
        }
    }

    public C11893d(MathContext mathContext, int i) {
        this.f57867a = mathContext;
        this.f57868b = i;
    }

    /* renamed from: a */
    public static C11894a m82117a() {
        return new C11894a();
    }

    /* renamed from: b */
    public MathContext mo67131b() {
        return this.f57867a;
    }

    /* renamed from: c */
    public int mo67132c() {
        return this.f57868b;
    }
}
