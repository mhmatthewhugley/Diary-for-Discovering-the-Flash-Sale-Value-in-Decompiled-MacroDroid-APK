package com.google.common.graph;

import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: a */
    private final Map<N, V> f17491a;

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    static /* synthetic */ class C71991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17492a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17492a = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17492a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.UndirectedGraphConnections.C71991.<clinit>():void");
        }
    }

    /* renamed from: a */
    public Set<N> mo36856a() {
        return mo36858c();
    }

    /* renamed from: b */
    public Set<N> mo36857b() {
        return mo36858c();
    }

    /* renamed from: c */
    public Set<N> mo36858c() {
        return Collections.unmodifiableSet(this.f17491a.keySet());
    }

    /* renamed from: d */
    public V mo36859d(N n) {
        return this.f17491a.get(n);
    }

    /* renamed from: e */
    public Iterator<EndpointPair<N>> mo36860e(N n) {
        return Iterators.m27703J(this.f17491a.keySet().iterator(), new C7210j(n));
    }
}
