package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {

    /* renamed from: com.google.common.cache.CacheLoader$1 */
    class C17811 extends CacheLoader<Object, Object> {

        /* renamed from: a */
        final /* synthetic */ CacheLoader f4322a;

        /* renamed from: b */
        final /* synthetic */ Executor f4323b;

        /* renamed from: a */
        public Object mo22319a(Object obj) throws Exception {
            return this.f4322a.mo22319a(obj);
        }

        /* renamed from: b */
        public ListenableFuture<Object> mo22320b(final Object obj, final Object obj2) throws Exception {
            ListenableFutureTask a = ListenableFutureTask.m74243a(new Callable<Object>() {
                public Object call() throws Exception {
                    return C17811.this.f4322a.mo22320b(obj, obj2).get();
                }
            });
            this.f4323b.execute(a);
            return a;
        }
    }

    private static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Function<K, V> computingFunction;

        /* renamed from: a */
        public V mo22319a(K k) {
            return this.computingFunction.apply(Preconditions.m5392s(k));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    private static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> computingSupplier;

        /* renamed from: a */
        public V mo22319a(Object obj) {
            Preconditions.m5392s(obj);
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    protected CacheLoader() {
    }

    /* renamed from: a */
    public abstract V mo22319a(K k) throws Exception;

    @GwtIncompatible
    /* renamed from: b */
    public ListenableFuture<V> mo22320b(K k, V v) throws Exception {
        Preconditions.m5392s(k);
        Preconditions.m5392s(v);
        return Futures.m74210d(mo22319a(k));
    }
}
