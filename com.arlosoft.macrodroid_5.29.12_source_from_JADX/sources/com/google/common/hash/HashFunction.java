package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
public interface HashFunction {
    /* renamed from: a */
    HashCode mo36964a(CharSequence charSequence, Charset charset);

    /* renamed from: b */
    int mo36981b();

    /* renamed from: c */
    Hasher mo36957c(int i);

    /* renamed from: d */
    Hasher mo36958d();

    /* renamed from: e */
    <T> HashCode mo36965e(@ParametricNullness T t, Funnel<? super T> funnel);
}
