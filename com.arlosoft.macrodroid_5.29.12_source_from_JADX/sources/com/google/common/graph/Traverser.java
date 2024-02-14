package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock
public abstract class Traverser<N> {

    /* renamed from: com.google.common.graph.Traverser$1 */
    class C71881 extends Traverser<Object> {

        /* renamed from: a */
        final /* synthetic */ SuccessorsFunction f17472a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Traversal<Object> mo36938a() {
            return Traversal.m29547b(this.f17472a);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$2 */
    class C71892 extends Traverser<Object> {

        /* renamed from: a */
        final /* synthetic */ SuccessorsFunction f17473a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Traversal<Object> mo36938a() {
            return Traversal.m29548c(this.f17473a);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$3 */
    class C71903 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ ImmutableSet f17474a;

        /* renamed from: c */
        final /* synthetic */ Traverser f17475c;

        public Iterator<Object> iterator() {
            return this.f17475c.mo36938a().mo36943a(this.f17474a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$4 */
    class C71914 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ ImmutableSet f17476a;

        /* renamed from: c */
        final /* synthetic */ Traverser f17477c;

        public Iterator<Object> iterator() {
            return this.f17477c.mo36938a().mo36945e(this.f17476a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$5 */
    class C71925 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ ImmutableSet f17478a;

        /* renamed from: c */
        final /* synthetic */ Traverser f17479c;

        public Iterator<Object> iterator() {
            return this.f17479c.mo36938a().mo36944d(this.f17478a.iterator());
        }
    }

    private enum InsertionOrder {
        FRONT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public <T> void mo36942d(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public <T> void mo36942d(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract <T> void mo36942d(Deque<T> deque, T t);
    }

    private static abstract class Traversal<N> {

        /* renamed from: a */
        final SuccessorsFunction<N> f17483a;

        Traversal(SuccessorsFunction<N> successorsFunction) {
            this.f17483a = successorsFunction;
        }

        /* renamed from: b */
        static <N> Traversal<N> m29547b(SuccessorsFunction<N> successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<N>(successorsFunction) {
                /* access modifiers changed from: package-private */
                /* renamed from: g */
                public N mo36946g(Deque<Iterator<? extends N>> deque) {
                    Iterator first = deque.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        /* renamed from: c */
        static <N> Traversal<N> m29548c(SuccessorsFunction<N> successorsFunction) {
            return new Traversal<N>(successorsFunction) {
                /* access modifiers changed from: package-private */
                /* renamed from: g */
                public N mo36946g(Deque<Iterator<? extends N>> deque) {
                    Iterator first = deque.getFirst();
                    if (first.hasNext()) {
                        return Preconditions.m5392s(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        /* renamed from: f */
        private Iterator<N> m29549f(Iterator<? extends N> it, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new AbstractIterator<N>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public N mo34417a() {
                    do {
                        N g = Traversal.this.mo36946g(arrayDeque);
                        if (g != null) {
                            Iterator<? extends N> it = Traversal.this.f17483a.mo36813a(g).iterator();
                            if (it.hasNext()) {
                                insertionOrder.mo36942d(arrayDeque, it);
                            }
                            return g;
                        }
                    } while (!arrayDeque.isEmpty());
                    return mo34418b();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Iterator<N> mo36943a(Iterator<? extends N> it) {
            return m29549f(it, InsertionOrder.BACK);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final Iterator<N> mo36944d(Iterator<? extends N> it) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new AbstractIterator<N>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public N mo34417a() {
                    while (true) {
                        N g = Traversal.this.mo36946g(arrayDeque2);
                        if (g != null) {
                            Iterator<? extends N> it = Traversal.this.f17483a.mo36813a(g).iterator();
                            if (!it.hasNext()) {
                                return g;
                            }
                            arrayDeque2.addFirst(it);
                            arrayDeque.push(g);
                        } else if (!arrayDeque.isEmpty()) {
                            return arrayDeque.pop();
                        } else {
                            return mo34418b();
                        }
                    }
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final Iterator<N> mo36945e(Iterator<? extends N> it) {
            return m29549f(it, InsertionOrder.FRONT);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract N mo36946g(Deque<Iterator<? extends N>> deque);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Traversal<N> mo36938a();
}
