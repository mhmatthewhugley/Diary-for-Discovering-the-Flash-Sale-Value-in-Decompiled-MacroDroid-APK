package p294j7;

import android.net.Uri;
import p216ba.C11114e;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12243c;
import p259f7.C12245e;
import p259f7.C12246f;
import p275h7.C12379a;
import p275h7.C12386d;
import p275h7.C12389e;
import p275h7.C12394g;
import p275h7.C12395h;
import p275h7.C12398i;
import p275h7.C12401k;
import p414v9.C16735i;
import p414v9.C16739l;

/* renamed from: j7.b */
/* compiled from: Files */
public final class C13292b extends C13298c {

    /* renamed from: b */
    private final C12389e f61259b;

    /* renamed from: c */
    private final C12401k f61260c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12386d f61261d;

    /* renamed from: e */
    private final C12379a f61262e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12398i f61263f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12246f f61264g;

    /* renamed from: h */
    private final C12241a f61265h;

    /* renamed from: j7.b$a */
    /* compiled from: Files */
    class C13293a implements C11114e<C12242b, C12245e<T, C12242b>> {
        C13293a() {
        }

        /* renamed from: a */
        public C12245e<T, C12242b> apply(C12242b bVar) throws Exception {
            return new C12245e<>(C13292b.this.f61264g.mo68563e(), bVar, -1);
        }
    }

    /* renamed from: j7.b$b */
    /* compiled from: Files */
    class C13294b implements C11114e<C12242b, C16739l<C12242b>> {
        C13294b() {
        }

        /* renamed from: a */
        public C16739l<C12242b> apply(C12242b bVar) throws Exception {
            return C13292b.this.m85620g(bVar);
        }
    }

    /* renamed from: j7.b$c */
    /* compiled from: Files */
    class C13295c implements C11114e<Uri, C16739l<C12242b>> {
        C13295c() {
        }

        /* renamed from: a */
        public C16739l<C12242b> apply(Uri uri) throws Exception {
            return C13292b.this.f61261d.mo68727n(uri).mo68726m();
        }
    }

    /* renamed from: j7.b$d */
    /* compiled from: Files */
    class C13296d implements C11114e<C12243c, C16739l<Uri>> {

        /* renamed from: a */
        final /* synthetic */ C12395h f61269a;

        C13296d(C12395h hVar) {
            this.f61269a = hVar;
        }

        /* renamed from: a */
        public C16739l<Uri> apply(C12243c cVar) throws Exception {
            return this.f61269a.mo68744e();
        }
    }

    /* renamed from: j7.b$e */
    /* compiled from: Files */
    class C13297e implements C11114e<C12242b, C16739l<C12242b>> {
        C13297e() {
        }

        /* renamed from: a */
        public C16739l<C12242b> apply(C12242b bVar) throws Exception {
            return C13292b.this.f61263f.mo68748j(bVar).mo68747d();
        }
    }

    public C13292b(C12389e eVar, C12401k kVar, C12386d dVar, C12379a aVar, C12398i iVar, C12246f fVar, C12241a aVar2) {
        super(fVar);
        this.f61259b = eVar;
        this.f61260c = kVar;
        this.f61261d = dVar;
        this.f61262e = aVar;
        this.f61263f = iVar;
        this.f61264g = fVar;
        this.f61265h = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C16735i<C12242b> m85620g(C12242b bVar) {
        return this.f61262e.mo68717j(bVar).mo68716i().mo79712u(new C13297e());
    }

    /* renamed from: h */
    private String[] m85621h() {
        return C12394g.m83225a(this.f61265h.mo68537m());
    }

    /* renamed from: i */
    public <T> C16735i<C12245e<T, C12242b>> mo70126i() {
        return mo70127j(new C12395h(this.f61264g, this.f61265h, this.f61260c));
    }

    /* renamed from: j */
    public <T> C16735i<C12245e<T, C12242b>> mo70127j(C12395h hVar) {
        return this.f61259b.mo68729b(m85621h()).mo68728a().mo79712u(new C13296d(hVar)).mo79712u(new C13295c()).mo79712u(new C13294b()).mo79678G(new C13293a()).mo79701f(mo70133b());
    }
}
