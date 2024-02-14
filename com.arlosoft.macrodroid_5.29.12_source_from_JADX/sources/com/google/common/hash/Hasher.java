package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@Beta
public interface Hasher extends PrimitiveSink {
    /* renamed from: a */
    Hasher mo36948a(byte[] bArr);

    /* renamed from: b */
    Hasher mo36949b(byte b);

    /* renamed from: c */
    Hasher mo36960c(CharSequence charSequence);

    /* renamed from: d */
    Hasher mo36950d(byte[] bArr, int i, int i2);

    /* renamed from: e */
    Hasher mo36961e(CharSequence charSequence, Charset charset);

    /* renamed from: f */
    <T> Hasher mo36962f(@ParametricNullness T t, Funnel<? super T> funnel);

    /* renamed from: g */
    HashCode mo36963g();

    Hasher putInt(int i);

    Hasher putLong(long j);
}
