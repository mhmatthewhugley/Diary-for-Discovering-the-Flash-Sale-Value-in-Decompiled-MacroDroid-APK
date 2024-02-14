package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    private SettableFuture() {
    }

    /* renamed from: G */
    public static <V> SettableFuture<V> m74324G() {
        return new SettableFuture<>();
    }

    @CanIgnoreReturnValue
    /* renamed from: C */
    public boolean mo61562C(@ParametricNullness V v) {
        return super.mo61562C(v);
    }

    @CanIgnoreReturnValue
    /* renamed from: D */
    public boolean mo61563D(Throwable th) {
        return super.mo61563D(th);
    }

    @CanIgnoreReturnValue
    /* renamed from: E */
    public boolean mo61564E(ListenableFuture<? extends V> listenableFuture) {
        return super.mo61564E(listenableFuture);
    }
}
