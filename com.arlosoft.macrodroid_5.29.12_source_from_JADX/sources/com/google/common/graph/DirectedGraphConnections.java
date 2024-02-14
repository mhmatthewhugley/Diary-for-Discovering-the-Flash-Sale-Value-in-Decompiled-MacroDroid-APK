package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: e */
    private static final Object f17395e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<N, Object> f17396a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<NodeConnection<N>> f17397b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f17398c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f17399d;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    static /* synthetic */ class C71775 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17411a;

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
                f17411a = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17411a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.DirectedGraphConnections.C71775.<clinit>():void");
        }
    }

    private static abstract class NodeConnection<N> {

        /* renamed from: a */
        final N f17412a;

        static final class Pred<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (obj instanceof Pred) {
                    return this.f17412a.equals(((Pred) obj).f17412a);
                }
                return false;
            }

            public int hashCode() {
                return Pred.class.hashCode() + this.f17412a.hashCode();
            }
        }

        static final class Succ<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (obj instanceof Succ) {
                    return this.f17412a.equals(((Succ) obj).f17412a);
                }
                return false;
            }

            public int hashCode() {
                return Succ.class.hashCode() + this.f17412a.hashCode();
            }
        }
    }

    private static final class PredAndSucc {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Object f17413a;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static boolean m29329o(Object obj) {
        return obj == f17395e || (obj instanceof PredAndSucc);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static boolean m29330p(Object obj) {
        return (obj == f17395e || obj == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ EndpointPair m29333s(Object obj, NodeConnection nodeConnection) {
        if (nodeConnection instanceof NodeConnection.Succ) {
            return EndpointPair.m29363l(obj, nodeConnection.f17412a);
        }
        return EndpointPair.m29363l(nodeConnection.f17412a, obj);
    }

    /* renamed from: a */
    public Set<N> mo36856a() {
        return new AbstractSet<N>() {
            /* renamed from: c */
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f17397b == null) {
                    final Iterator it = DirectedGraphConnections.this.f17396a.entrySet().iterator();
                    return new AbstractIterator<N>(this) {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public N mo34417a() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.m29330p(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return mo34418b();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f17397b.iterator();
                return new AbstractIterator<N>(this) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public N mo34417a() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.f17412a;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return DirectedGraphConnections.m29330p(DirectedGraphConnections.this.f17396a.get(obj));
            }

            public int size() {
                return DirectedGraphConnections.this.f17399d;
            }
        };
    }

    /* renamed from: b */
    public Set<N> mo36857b() {
        return new AbstractSet<N>() {
            /* renamed from: c */
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f17397b == null) {
                    final Iterator it = DirectedGraphConnections.this.f17396a.entrySet().iterator();
                    return new AbstractIterator<N>(this) {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public N mo34417a() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.m29329o(entry.getValue())) {
                                    return entry.getKey();
                                }
                            }
                            return mo34418b();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f17397b.iterator();
                return new AbstractIterator<N>(this) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public N mo34417a() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.f17412a;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return DirectedGraphConnections.m29329o(DirectedGraphConnections.this.f17396a.get(obj));
            }

            public int size() {
                return DirectedGraphConnections.this.f17398c;
            }
        };
    }

    /* renamed from: c */
    public Set<N> mo36858c() {
        if (this.f17397b == null) {
            return Collections.unmodifiableSet(this.f17396a.keySet());
        }
        return new AbstractSet<N>() {
            /* renamed from: c */
            public UnmodifiableIterator<N> iterator() {
                final Iterator it = DirectedGraphConnections.this.f17397b.iterator();
                final HashSet hashSet = new HashSet();
                return new AbstractIterator<N>(this) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public N mo34417a() {
                        while (it.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.f17412a)) {
                                return nodeConnection.f17412a;
                            }
                        }
                        return mo34418b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return DirectedGraphConnections.this.f17396a.containsKey(obj);
            }

            public int size() {
                return DirectedGraphConnections.this.f17396a.size();
            }
        };
    }

    /* renamed from: d */
    public V mo36859d(N n) {
        Preconditions.m5392s(n);
        V v = this.f17396a.get(n);
        if (v == f17395e) {
            return null;
        }
        return v instanceof PredAndSucc ? ((PredAndSucc) v).f17413a : v;
    }

    /* renamed from: e */
    public Iterator<EndpointPair<N>> mo36860e(N n) {
        final Iterator<T> it;
        Preconditions.m5392s(n);
        List<NodeConnection<N>> list = this.f17397b;
        if (list == null) {
            it = Iterators.m27711g(Iterators.m27703J(mo36857b().iterator(), new C7207g(n)), Iterators.m27703J(mo36856a().iterator(), new C7206f(n)));
        } else {
            it = Iterators.m27703J(list.iterator(), new C7205e(n));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new AbstractIterator<EndpointPair<N>>(this) {
            /* access modifiers changed from: protected */
            /* JADX WARNING: Removed duplicated region for block: B:2:0x0008  */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.common.graph.EndpointPair<N> mo34417a() {
                /*
                    r3 = this;
                L_0x0000:
                    java.util.Iterator r0 = r4
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L_0x0028
                    java.util.Iterator r0 = r4
                    java.lang.Object r0 = r0.next()
                    com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                    java.lang.Object r1 = r0.mo36889h()
                    java.lang.Object r2 = r0.mo36890i()
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x0027
                    java.util.concurrent.atomic.AtomicBoolean r1 = r0
                    r2 = 1
                    boolean r1 = r1.getAndSet(r2)
                    if (r1 != 0) goto L_0x0000
                L_0x0027:
                    return r0
                L_0x0028:
                    java.lang.Object r0 = r3.mo34418b()
                    com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.DirectedGraphConnections.C71764.mo34417a():com.google.common.graph.EndpointPair");
            }
        };
    }
}
