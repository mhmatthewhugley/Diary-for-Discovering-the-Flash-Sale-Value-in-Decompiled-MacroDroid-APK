package p469of;

import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17158f;
import p468nf.C17195c;
import p468nf.C17214f;
import p468nf.C17217g;
import p473rx.internal.schedulers.C17374h;

/* renamed from: of.a */
/* compiled from: Schedulers */
public final class C17220a {

    /* renamed from: d */
    private static final AtomicReference<C17220a> f68777d = new AtomicReference<>();

    /* renamed from: a */
    private final C17158f f68778a;

    /* renamed from: b */
    private final C17158f f68779b;

    /* renamed from: c */
    private final C17158f f68780c;

    private C17220a() {
        C17217g f = C17214f.m100769c().mo80509f();
        C17158f g = f.mo80511g();
        if (g != null) {
            this.f68778a = g;
        } else {
            this.f68778a = C17217g.m100776a();
        }
        C17158f i = f.mo80512i();
        if (i != null) {
            this.f68779b = i;
        } else {
            this.f68779b = C17217g.m100778c();
        }
        C17158f j = f.mo80513j();
        if (j != null) {
            this.f68780c = j;
        } else {
            this.f68780c = C17217g.m100780e();
        }
    }

    /* renamed from: a */
    public static C17158f m100793a() {
        return C17195c.m100720d(m100794b().f68778a);
    }

    /* renamed from: b */
    private static C17220a m100794b() {
        while (true) {
            AtomicReference<C17220a> atomicReference = f68777d;
            C17220a aVar = atomicReference.get();
            if (aVar != null) {
                return aVar;
            }
            C17220a aVar2 = new C17220a();
            if (atomicReference.compareAndSet((Object) null, aVar2)) {
                return aVar2;
            }
            aVar2.mo80520d();
        }
    }

    /* renamed from: c */
    public static C17158f m100795c() {
        return C17195c.m100724h(m100794b().f68779b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo80520d() {
        C17158f fVar = this.f68778a;
        if (fVar instanceof C17374h) {
            ((C17374h) fVar).shutdown();
        }
        C17158f fVar2 = this.f68779b;
        if (fVar2 instanceof C17374h) {
            ((C17374h) fVar2).shutdown();
        }
        C17158f fVar3 = this.f68780c;
        if (fVar3 instanceof C17374h) {
            ((C17374h) fVar3).shutdown();
        }
    }
}
