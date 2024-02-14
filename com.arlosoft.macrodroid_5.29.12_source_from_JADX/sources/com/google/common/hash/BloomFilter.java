package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@Beta
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    /* access modifiers changed from: private */
    public final BloomFilterStrategies.LockFreeBitArray bits;
    /* access modifiers changed from: private */
    public final Funnel<? super T> funnel;
    /* access modifiers changed from: private */
    public final int numHashFunctions;
    /* access modifiers changed from: private */
    public final Strategy strategy;

    private static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.LockFreeBitArray.m29662c(bloomFilter.bits.f17515a);
            this.numHashFunctions = bloomFilter.numHashFunctions;
            this.funnel = bloomFilter.funnel;
            this.strategy = bloomFilter.strategy;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    interface Strategy extends Serializable {
        /* renamed from: K */
        <T> boolean mo36976K(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Deprecated
    public boolean apply(@ParametricNullness T t) {
        return mo36973e(t);
    }

    /* renamed from: e */
    public boolean mo36973e(@ParametricNullness T t) {
        return this.strategy.mo36976K(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        if (this.numHashFunctions != bloomFilter.numHashFunctions || !this.funnel.equals(bloomFilter.funnel) || !this.bits.equals(bloomFilter.bits) || !this.strategy.equals(bloomFilter.strategy)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i, Funnel<? super T> funnel2, Strategy strategy2) {
        boolean z = true;
        Preconditions.m5381h(i > 0, "numHashFunctions (%s) must be > 0", i);
        Preconditions.m5381h(i > 255 ? false : z, "numHashFunctions (%s) must be <= 255", i);
        this.bits = (BloomFilterStrategies.LockFreeBitArray) Preconditions.m5392s(lockFreeBitArray);
        this.numHashFunctions = i;
        this.funnel = (Funnel) Preconditions.m5392s(funnel2);
        this.strategy = (Strategy) Preconditions.m5392s(strategy2);
    }
}
