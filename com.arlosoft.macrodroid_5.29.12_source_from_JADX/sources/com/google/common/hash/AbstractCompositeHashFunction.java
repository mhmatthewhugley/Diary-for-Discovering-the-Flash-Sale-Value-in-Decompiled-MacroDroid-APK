package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {

    /* renamed from: a */
    final HashFunction[] f17504a;

    /* renamed from: h */
    private Hasher m29596h(final Hasher[] hasherArr) {
        return new Hasher() {
            /* renamed from: f */
            public <T> Hasher mo36962f(@ParametricNullness T t, Funnel<? super T> funnel) {
                for (Hasher f : hasherArr) {
                    f.mo36962f(t, funnel);
                }
                return this;
            }

            /* renamed from: g */
            public HashCode mo36963g() {
                return AbstractCompositeHashFunction.this.mo36959i(hasherArr);
            }

            /* renamed from: a */
            public Hasher m29601a(byte[] bArr) {
                for (Hasher a : hasherArr) {
                    a.mo36948a(bArr);
                }
                return this;
            }

            /* renamed from: b */
            public Hasher m29603b(byte b) {
                for (Hasher b2 : hasherArr) {
                    b2.mo36949b(b);
                }
                return this;
            }

            /* renamed from: c */
            public Hasher m29605c(CharSequence charSequence) {
                for (Hasher c : hasherArr) {
                    c.mo36960c(charSequence);
                }
                return this;
            }

            /* renamed from: d */
            public Hasher m29607d(byte[] bArr, int i, int i2) {
                for (Hasher d : hasherArr) {
                    d.mo36950d(bArr, i, i2);
                }
                return this;
            }

            /* renamed from: e */
            public Hasher m29609e(CharSequence charSequence, Charset charset) {
                for (Hasher e : hasherArr) {
                    e.mo36961e(charSequence, charset);
                }
                return this;
            }

            public Hasher putInt(int i) {
                for (Hasher putInt : hasherArr) {
                    putInt.putInt(i);
                }
                return this;
            }

            public Hasher putLong(long j) {
                for (Hasher putLong : hasherArr) {
                    putLong.putLong(j);
                }
                return this;
            }
        };
    }

    /* renamed from: c */
    public Hasher mo36957c(int i) {
        Preconditions.m5377d(i >= 0);
        int length = this.f17504a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.f17504a[i2].mo36957c(i);
        }
        return m29596h(hasherArr);
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        int length = this.f17504a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.f17504a[i].mo36958d();
        }
        return m29596h(hasherArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract HashCode mo36959i(Hasher[] hasherArr);
}
