package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractHashFunction implements HashFunction {
    AbstractHashFunction() {
    }

    /* renamed from: a */
    public HashCode mo36964a(CharSequence charSequence, Charset charset) {
        return mo36958d().mo36961e(charSequence, charset).mo36963g();
    }

    /* renamed from: c */
    public Hasher mo36957c(int i) {
        Preconditions.m5381h(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return mo36958d();
    }

    /* renamed from: e */
    public <T> HashCode mo36965e(@ParametricNullness T t, Funnel<? super T> funnel) {
        return mo36958d().mo36962f(t, funnel).mo36963g();
    }

    /* renamed from: f */
    public HashCode mo36966f(byte[] bArr) {
        return mo36967g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public HashCode mo36967g(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        return mo36957c(i2).mo36950d(bArr, i, i2).mo36963g();
    }
}
