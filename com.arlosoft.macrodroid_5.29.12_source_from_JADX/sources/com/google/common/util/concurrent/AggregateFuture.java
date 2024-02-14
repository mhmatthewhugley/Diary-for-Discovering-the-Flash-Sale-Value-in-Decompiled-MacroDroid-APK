package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* renamed from: D */
    private static final Logger f53448D = Logger.getLogger(AggregateFuture.class.getName());

    /* renamed from: C */
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> f53449C;

    enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* access modifiers changed from: package-private */
    @ForOverride
    @OverridingMethodsMustInvokeSuper
    /* renamed from: G */
    public void mo61645G(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.m5392s(releaseResourcesReason);
        this.f53449C = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo61544m() {
        super.mo61544m();
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f53449C;
        mo61645G(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean F = mo61565F();
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> k = immutableCollection.iterator();
            while (k.hasNext()) {
                ((Future) k.next()).cancel(F);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo61546z() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.f53449C;
        if (immutableCollection == null) {
            return super.mo61546z();
        }
        String valueOf = String.valueOf(immutableCollection);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }
}
