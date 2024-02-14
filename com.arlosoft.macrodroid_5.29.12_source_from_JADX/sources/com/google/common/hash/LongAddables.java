package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* renamed from: a */
    private static final Supplier<LongAddable> f17559a;

    private static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        /* renamed from: a */
        public void mo37035a(long j) {
            getAndAdd(j);
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
        f17559a = supplier;
    }

    LongAddables() {
    }

    /* renamed from: a */
    public static LongAddable m29783a() {
        return f17559a.get();
    }
}
