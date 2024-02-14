package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* renamed from: a */
    private static final Supplier<LongAddable> f4448a;

    private static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        /* renamed from: a */
        public void mo22536a(long j) {
            getAndAdd(j);
        }

        /* renamed from: b */
        public void mo22537b() {
            getAndIncrement();
        }
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new LongAdder();
            supplier = new Supplier<LongAddable>() {
                /* renamed from: a */
                public LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() {
                /* renamed from: a */
                public LongAddable get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        f4448a = supplier;
    }

    LongAddables() {
    }

    /* renamed from: a */
    public static LongAddable m5886a() {
        return f4448a.get();
    }
}
