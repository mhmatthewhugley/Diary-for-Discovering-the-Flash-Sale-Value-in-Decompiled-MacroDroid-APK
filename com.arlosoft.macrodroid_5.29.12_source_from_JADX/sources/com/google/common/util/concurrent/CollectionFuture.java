package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    /* renamed from: E */
    private List<Present<V>> f53533E;

    static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
    }

    private static final class Present<V> {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo61645G(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo61645G(releaseResourcesReason);
        this.f53533E = null;
    }
}
