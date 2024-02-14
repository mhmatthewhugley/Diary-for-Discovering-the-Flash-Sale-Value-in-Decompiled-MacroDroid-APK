package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* renamed from: a */
        private final LongAddable f4271a = LongAddables.m5886a();

        /* renamed from: b */
        private final LongAddable f4272b = LongAddables.m5886a();

        /* renamed from: c */
        private final LongAddable f4273c = LongAddables.m5886a();

        /* renamed from: d */
        private final LongAddable f4274d = LongAddables.m5886a();

        /* renamed from: e */
        private final LongAddable f4275e = LongAddables.m5886a();

        /* renamed from: f */
        private final LongAddable f4276f = LongAddables.m5886a();

        /* renamed from: a */
        public void mo22276a(int i) {
            this.f4271a.mo22536a((long) i);
        }

        /* renamed from: b */
        public void mo22277b(int i) {
            this.f4272b.mo22536a((long) i);
        }

        /* renamed from: c */
        public void mo22278c() {
            this.f4276f.mo22537b();
        }

        /* renamed from: d */
        public void mo22279d(long j) {
            this.f4274d.mo22537b();
            this.f4275e.mo22536a(j);
        }

        /* renamed from: e */
        public void mo22280e(long j) {
            this.f4273c.mo22537b();
            this.f4275e.mo22536a(j);
        }
    }

    public interface StatsCounter {
        /* renamed from: a */
        void mo22276a(int i);

        /* renamed from: b */
        void mo22277b(int i);

        /* renamed from: c */
        void mo22278c();

        /* renamed from: d */
        void mo22279d(long j);

        /* renamed from: e */
        void mo22280e(long j);
    }

    protected AbstractCache() {
    }
}
