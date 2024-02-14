package p473rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p459ef.C17153c;
import p459ef.C17158f;
import p459ef.C17162h;
import p459ef.C17163i;
import p464jf.C17176a;
import p473rx.internal.operators.C17344j;

/* renamed from: rx.internal.operators.i */
/* compiled from: OperatorTimeout */
public final class C17339i<T> extends C17344j<T> {

    /* renamed from: rx.internal.operators.i$a */
    /* compiled from: OperatorTimeout */
    class C17340a implements C17344j.C17345a<T> {

        /* renamed from: a */
        final /* synthetic */ long f69035a;

        /* renamed from: b */
        final /* synthetic */ TimeUnit f69036b;

        /* renamed from: rx.internal.operators.i$a$a */
        /* compiled from: OperatorTimeout */
        class C17341a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17344j.C17347c f69037a;

            /* renamed from: c */
            final /* synthetic */ Long f69038c;

            C17341a(C17344j.C17347c cVar, Long l) {
                this.f69037a = cVar;
                this.f69038c = l;
            }

            public void call() {
                this.f69037a.mo80667h(this.f69038c.longValue());
            }
        }

        C17340a(long j, TimeUnit timeUnit) {
            this.f69035a = j;
            this.f69036b = timeUnit;
        }

        /* renamed from: b */
        public C17163i mo80461a(C17344j.C17347c<T> cVar, Long l, C17158f.C17159a aVar) {
            return aVar.mo80447c(new C17341a(cVar, l), this.f69035a, this.f69036b);
        }
    }

    /* renamed from: rx.internal.operators.i$b */
    /* compiled from: OperatorTimeout */
    class C17342b implements C17344j.C17346b<T> {

        /* renamed from: a */
        final /* synthetic */ long f69040a;

        /* renamed from: b */
        final /* synthetic */ TimeUnit f69041b;

        /* renamed from: rx.internal.operators.i$b$a */
        /* compiled from: OperatorTimeout */
        class C17343a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17344j.C17347c f69042a;

            /* renamed from: c */
            final /* synthetic */ Long f69043c;

            C17343a(C17344j.C17347c cVar, Long l) {
                this.f69042a = cVar;
                this.f69043c = l;
            }

            public void call() {
                this.f69042a.mo80667h(this.f69043c.longValue());
            }
        }

        C17342b(long j, TimeUnit timeUnit) {
            this.f69040a = j;
            this.f69041b = timeUnit;
        }

        /* renamed from: b */
        public C17163i mo80462a(C17344j.C17347c<T> cVar, Long l, T t, C17158f.C17159a aVar) {
            return aVar.mo80447c(new C17343a(cVar, l), this.f69040a, this.f69041b);
        }
    }

    public C17339i(long j, TimeUnit timeUnit, C17153c<? extends T> cVar, C17158f fVar) {
        super(new C17340a(j, timeUnit), new C17342b(j, timeUnit), cVar, fVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C17162h mo80664b(C17162h hVar) {
        return super.mo80454a(hVar);
    }
}
