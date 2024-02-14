package p391sd;

import p373qd.C16293h;
import p373qd.C16303m;

/* renamed from: sd.a */
/* compiled from: Collector */
public class C16530a {

    /* renamed from: sd.a$a */
    /* compiled from: Collector */
    private static class C16531a implements C16539e {

        /* renamed from: a */
        private final C16293h f67262a;

        /* renamed from: b */
        private final C16532b f67263b;

        /* renamed from: c */
        private final C16533c f67264c;

        C16531a(C16293h hVar, C16532b bVar, C16533c cVar) {
            this.f67262a = hVar;
            this.f67263b = bVar;
            this.f67264c = cVar;
        }

        /* renamed from: a */
        public void mo78886a(C16303m mVar, int i) {
            if (mVar instanceof C16293h) {
                C16293h hVar = (C16293h) mVar;
                if (this.f67264c.mo79334a(this.f67262a, hVar)) {
                    this.f67263b.add(hVar);
                }
            }
        }

        /* renamed from: b */
        public void mo78887b(C16303m mVar, int i) {
        }
    }

    /* renamed from: a */
    public static C16532b m98653a(C16533c cVar, C16293h hVar) {
        C16532b bVar = new C16532b();
        C16538d.m98664a(new C16531a(hVar, bVar, cVar), hVar);
        return bVar;
    }
}
