package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Deprecated
@Beta
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$1 */
    class C71401 extends TreeTraverser<Object> {

        /* renamed from: a */
        final /* synthetic */ Function f17312a;

        /* renamed from: a */
        public Iterable<Object> mo36767a(Object obj) {
            return (Iterable) this.f17312a.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$2 */
    class C71412 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Object f17313c;

        /* renamed from: d */
        final /* synthetic */ TreeTraverser f17314d;

        /* renamed from: n */
        public UnmodifiableIterator<Object> iterator() {
            return this.f17314d.mo36769c(this.f17313c);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$3 */
    class C71423 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Object f17315c;

        /* renamed from: d */
        final /* synthetic */ TreeTraverser f17316d;

        /* renamed from: n */
        public UnmodifiableIterator<Object> iterator() {
            return this.f17316d.mo36768b(this.f17315c);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$4 */
    class C71434 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Object f17317c;

        /* renamed from: d */
        final /* synthetic */ TreeTraverser f17318d;

        /* renamed from: n */
        public UnmodifiableIterator<Object> iterator() {
            return new BreadthFirstIterator(this.f17317c);
        }
    }

    private final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {

        /* renamed from: a */
        private final Queue<T> f17319a;

        BreadthFirstIterator(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f17319a = arrayDeque;
            arrayDeque.add(t);
        }

        public boolean hasNext() {
            return !this.f17319a.isEmpty();
        }

        public T next() {
            T remove = this.f17319a.remove();
            Iterables.m27674a(this.f17319a, TreeTraverser.this.mo36767a(remove));
            return remove;
        }

        public T peek() {
            return this.f17319a.element();
        }
    }

    private final class PostOrderIterator extends AbstractIterator<T> {

        /* renamed from: d */
        private final ArrayDeque<PostOrderNode<T>> f17321d;

        PostOrderIterator(T t) {
            ArrayDeque<PostOrderNode<T>> arrayDeque = new ArrayDeque<>();
            this.f17321d = arrayDeque;
            arrayDeque.addLast(m29191d(t));
        }

        /* renamed from: d */
        private PostOrderNode<T> m29191d(T t) {
            return new PostOrderNode<>(t, TreeTraverser.this.mo36767a(t).iterator());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo34417a() {
            while (!this.f17321d.isEmpty()) {
                PostOrderNode last = this.f17321d.getLast();
                if (last.f17324b.hasNext()) {
                    this.f17321d.addLast(m29191d(last.f17324b.next()));
                } else {
                    this.f17321d.removeLast();
                    return last.f17323a;
                }
            }
            return mo34418b();
        }
    }

    private static final class PostOrderNode<T> {

        /* renamed from: a */
        final T f17323a;

        /* renamed from: b */
        final Iterator<T> f17324b;

        PostOrderNode(T t, Iterator<T> it) {
            this.f17323a = Preconditions.m5392s(t);
            this.f17324b = (Iterator) Preconditions.m5392s(it);
        }
    }

    private final class PreOrderIterator extends UnmodifiableIterator<T> {

        /* renamed from: a */
        private final Deque<Iterator<T>> f17325a;

        PreOrderIterator(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f17325a = arrayDeque;
            arrayDeque.addLast(Iterators.m27700G(Preconditions.m5392s(t)));
        }

        public boolean hasNext() {
            return !this.f17325a.isEmpty();
        }

        public T next() {
            Iterator last = this.f17325a.getLast();
            T s = Preconditions.m5392s(last.next());
            if (!last.hasNext()) {
                this.f17325a.removeLast();
            }
            Iterator it = TreeTraverser.this.mo36767a(s).iterator();
            if (it.hasNext()) {
                this.f17325a.addLast(it);
            }
            return s;
        }
    }

    /* renamed from: a */
    public abstract Iterable<T> mo36767a(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public UnmodifiableIterator<T> mo36768b(T t) {
        return new PostOrderIterator(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public UnmodifiableIterator<T> mo36769c(T t) {
        return new PreOrderIterator(t);
    }
}
