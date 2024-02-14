package p292io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p209aa.C11078a;
import p223ca.C11163b;
import p223ca.C11164c;
import p241da.C11984b;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.b */
/* compiled from: ObservableBuffer */
public final class C13086b<T, U extends Collection<? super T>> extends C13083a<T, U> {

    /* renamed from: c */
    final int f60861c;

    /* renamed from: d */
    final int f60862d;

    /* renamed from: f */
    final Callable<U> f60863f;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    /* compiled from: ObservableBuffer */
    static final class C13087a<T, U extends Collection<? super T>> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super U> f60864a;

        /* renamed from: c */
        final int f60865c;

        /* renamed from: d */
        final Callable<U> f60866d;

        /* renamed from: f */
        U f60867f;

        /* renamed from: g */
        int f60868g;

        /* renamed from: o */
        C17071b f60869o;

        C13087a(C16741n<? super U> nVar, int i, Callable<U> callable) {
            this.f60864a = nVar;
            this.f60865c = i;
            this.f60866d = callable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo69935a() {
            try {
                this.f60867f = (Collection) C11984b.m82367d(this.f60866d.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                C11078a.m74639b(th);
                this.f60867f = null;
                C17071b bVar = this.f60869o;
                if (bVar == null) {
                    C11164c.m74936g(th, this.f60864a);
                    return false;
                }
                bVar.dispose();
                this.f60864a.onError(th);
                return false;
            }
        }

        public void dispose() {
            this.f60869o.dispose();
        }

        public boolean isDisposed() {
            return this.f60869o.isDisposed();
        }

        public void onComplete() {
            U u = this.f60867f;
            if (u != null) {
                this.f60867f = null;
                if (!u.isEmpty()) {
                    this.f60864a.onNext(u);
                }
                this.f60864a.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f60867f = null;
            this.f60864a.onError(th);
        }

        public void onNext(T t) {
            U u = this.f60867f;
            if (u != null) {
                u.add(t);
                int i = this.f60868g + 1;
                this.f60868g = i;
                if (i >= this.f60865c) {
                    this.f60864a.onNext(u);
                    this.f60868g = 0;
                    mo69935a();
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60869o, bVar)) {
                this.f60869o = bVar;
                this.f60864a.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.b$b */
    /* compiled from: ObservableBuffer */
    static final class C13088b<T, U extends Collection<? super T>> extends AtomicBoolean implements C16741n<T>, C17071b {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final C16741n<? super U> downstream;
        long index;
        final int skip;
        C17071b upstream;

        C13088b(C16741n<? super U> nVar, int i, int i2, Callable<U> callable) {
            this.downstream = nVar;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        public void dispose() {
            this.upstream.dispose();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((Collection) C11984b.m82367d(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.count <= collection.size()) {
                    it.remove();
                    this.downstream.onNext(collection);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13086b(C16739l<T> lVar, int i, int i2, Callable<U> callable) {
        super(lVar);
        this.f60861c = i;
        this.f60862d = i2;
        this.f60863f = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super U> nVar) {
        int i = this.f60862d;
        int i2 = this.f60861c;
        if (i == i2) {
            C13087a aVar = new C13087a(nVar, i2, this.f60863f);
            if (aVar.mo69935a()) {
                this.f60853a.mo79695a(aVar);
                return;
            }
            return;
        }
        this.f60853a.mo79695a(new C13088b(nVar, this.f60861c, this.f60862d, this.f60863f));
    }
}
