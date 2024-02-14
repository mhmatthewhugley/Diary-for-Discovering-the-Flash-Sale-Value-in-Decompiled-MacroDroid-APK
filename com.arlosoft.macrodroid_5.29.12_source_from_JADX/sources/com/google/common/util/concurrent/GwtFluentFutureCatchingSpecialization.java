package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class GwtFluentFutureCatchingSpecialization<V> extends AbstractFuture<V> {
    GwtFluentFutureCatchingSpecialization() {
    }
}
