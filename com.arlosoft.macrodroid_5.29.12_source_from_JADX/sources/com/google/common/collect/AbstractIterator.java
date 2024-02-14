package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: a */
    private State f16382a = State.NOT_READY;

    /* renamed from: c */
    private T f16383c;

    /* renamed from: com.google.common.collect.AbstractIterator$1 */
    static /* synthetic */ class C69261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16384a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16384a = r0
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16384a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator.C69261.<clinit>():void");
        }
    }

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    /* renamed from: c */
    private boolean m26291c() {
        this.f16382a = State.FAILED;
        this.f16383c = mo34417a();
        if (this.f16382a == State.DONE) {
            return false;
        }
        this.f16382a = State.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo34417a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo34418b() {
        this.f16382a = State.DONE;
        return null;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        Preconditions.m5398y(this.f16382a != State.FAILED);
        int i = C69261.f16384a[this.f16382a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m26291c();
        }
        return true;
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f16382a = State.NOT_READY;
            T a = NullnessCasts.m28457a(this.f16383c);
            this.f16383c = null;
            return a;
        }
        throw new NoSuchElementException();
    }
}
