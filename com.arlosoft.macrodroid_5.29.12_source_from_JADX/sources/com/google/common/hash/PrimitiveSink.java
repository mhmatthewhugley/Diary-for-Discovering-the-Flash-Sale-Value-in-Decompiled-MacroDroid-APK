package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@Beta
public interface PrimitiveSink {
    /* renamed from: a */
    PrimitiveSink mo36948a(byte[] bArr);

    /* renamed from: b */
    PrimitiveSink mo36949b(byte b);

    /* renamed from: c */
    PrimitiveSink mo36960c(CharSequence charSequence);

    /* renamed from: d */
    PrimitiveSink mo36950d(byte[] bArr, int i, int i2);

    /* renamed from: e */
    PrimitiveSink mo36961e(CharSequence charSequence, Charset charset);

    PrimitiveSink putInt(int i);

    PrimitiveSink putLong(long j);
}
