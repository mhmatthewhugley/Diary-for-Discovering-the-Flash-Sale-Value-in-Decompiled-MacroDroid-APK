package p459ef;

import p464jf.C17177b;
import p464jf.C17181e;
import p468nf.C17195c;
import p470pf.C17225d;

/* renamed from: ef.a */
/* compiled from: Completable */
public class C17147a {

    /* renamed from: b */
    static final C17147a f68704b = new C17147a(new C17148a(), false);

    /* renamed from: c */
    static final C17147a f68705c = new C17147a(new C17149b(), false);

    /* renamed from: a */
    private final C17150c f68706a;

    /* renamed from: ef.a$a */
    /* compiled from: Completable */
    static class C17148a implements C17150c {
        C17148a() {
        }

        /* renamed from: b */
        public void mo26537a(C17152b bVar) {
            bVar.mo80426a(C17225d.m100809b());
            bVar.onCompleted();
        }
    }

    /* renamed from: ef.a$b */
    /* compiled from: Completable */
    static class C17149b implements C17150c {
        C17149b() {
        }

        /* renamed from: b */
        public void mo26537a(C17152b bVar) {
            bVar.mo80426a(C17225d.m100809b());
        }
    }

    /* renamed from: ef.a$c */
    /* compiled from: Completable */
    public interface C17150c extends C17177b<C17152b> {
    }

    /* renamed from: ef.a$d */
    /* compiled from: Completable */
    public interface C17151d extends C17181e<C17152b, C17152b> {
    }

    protected C17147a(C17150c cVar, boolean z) {
        this.f68706a = z ? C17195c.m100721e(cVar) : cVar;
    }
}
