package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ComparisonChain f16530a = new ComparisonChain() {
        /* renamed from: d */
        public ComparisonChain mo34896d(Comparable<?> comparable, Comparable<?> comparable2) {
            return mo34898g(comparable.compareTo(comparable2));
        }

        /* renamed from: e */
        public int mo34897e() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public ComparisonChain mo34898g(int i) {
            return i < 0 ? ComparisonChain.f16531b : i > 0 ? ComparisonChain.f16532c : ComparisonChain.f16530a;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ComparisonChain f16531b = new InactiveComparisonChain(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ComparisonChain f16532c = new InactiveComparisonChain(1);

    private static final class InactiveComparisonChain extends ComparisonChain {

        /* renamed from: d */
        final int f16533d;

        InactiveComparisonChain(int i) {
            super();
            this.f16533d = i;
        }

        /* renamed from: d */
        public ComparisonChain mo34896d(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        /* renamed from: e */
        public int mo34897e() {
            return this.f16533d;
        }
    }

    private ComparisonChain() {
    }

    /* renamed from: f */
    public static ComparisonChain m26697f() {
        return f16530a;
    }

    /* renamed from: d */
    public abstract ComparisonChain mo34896d(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: e */
    public abstract int mo34897e();
}
