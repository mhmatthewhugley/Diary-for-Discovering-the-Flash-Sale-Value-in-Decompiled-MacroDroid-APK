package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Function<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22141a(F f, F f2) {
        return this.resultEquivalence.mo22143d(this.function.apply(f), this.function.apply(f2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22142b(F f) {
        return this.resultEquivalence.mo22144e(this.function.apply(f));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        if (!this.function.equals(functionalEquivalence.function) || !this.resultEquivalence.equals(functionalEquivalence.resultEquivalence)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.function, this.resultEquivalence);
    }

    public String toString() {
        String valueOf = String.valueOf(this.resultEquivalence);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
