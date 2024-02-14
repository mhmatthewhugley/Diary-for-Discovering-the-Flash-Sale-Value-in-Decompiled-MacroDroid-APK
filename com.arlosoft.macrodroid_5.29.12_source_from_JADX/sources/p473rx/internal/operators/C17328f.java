package p473rx.internal.operators;

import java.util.NoSuchElementException;
import p459ef.C17153c;
import p459ef.C17162h;
import p468nf.C17195c;
import p473rx.internal.producers.C17351b;

/* renamed from: rx.internal.operators.f */
/* compiled from: OperatorSingle */
public final class C17328f<T> implements C17153c.C17155b<T, T> {

    /* renamed from: a */
    private final boolean f69007a;

    /* renamed from: b */
    private final T f69008b;

    /* renamed from: rx.internal.operators.f$a */
    /* compiled from: OperatorSingle */
    static final class C17329a {

        /* renamed from: a */
        static final C17328f<?> f69009a = new C17328f<>();
    }

    /* renamed from: rx.internal.operators.f$b */
    /* compiled from: OperatorSingle */
    static final class C17330b<T> extends C17162h<T> {

        /* renamed from: A */
        private boolean f69010A;

        /* renamed from: g */
        private final C17162h<? super T> f69011g;

        /* renamed from: o */
        private final boolean f69012o;

        /* renamed from: p */
        private final T f69013p;

        /* renamed from: s */
        private T f69014s;

        /* renamed from: z */
        private boolean f69015z;

        C17330b(C17162h<? super T> hVar, boolean z, T t) {
            this.f69011g = hVar;
            this.f69012o = z;
            this.f69013p = t;
            mo80452f(2);
        }

        public void onCompleted() {
            if (this.f69010A) {
                return;
            }
            if (this.f69015z) {
                this.f69011g.mo80453g(new C17351b(this.f69011g, this.f69014s));
            } else if (this.f69012o) {
                this.f69011g.mo80453g(new C17351b(this.f69011g, this.f69013p));
            } else {
                this.f69011g.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        public void onError(Throwable th) {
            if (this.f69010A) {
                C17195c.m100723g(th);
            } else {
                this.f69011g.onError(th);
            }
        }

        public void onNext(T t) {
            if (this.f69010A) {
                return;
            }
            if (this.f69015z) {
                this.f69010A = true;
                this.f69011g.onError(new IllegalArgumentException("Sequence contains too many elements"));
                mo80450d();
                return;
            }
            this.f69014s = t;
            this.f69015z = true;
        }
    }

    C17328f() {
        this(false, (Object) null);
    }

    /* renamed from: c */
    public static <T> C17328f<T> m101056c() {
        return C17329a.f69009a;
    }

    /* renamed from: b */
    public C17162h<? super T> mo80454a(C17162h<? super T> hVar) {
        C17330b bVar = new C17330b(hVar, this.f69007a, this.f69008b);
        hVar.mo80448a(bVar);
        return bVar;
    }

    private C17328f(boolean z, T t) {
        this.f69007a = z;
        this.f69008b = t;
    }
}
