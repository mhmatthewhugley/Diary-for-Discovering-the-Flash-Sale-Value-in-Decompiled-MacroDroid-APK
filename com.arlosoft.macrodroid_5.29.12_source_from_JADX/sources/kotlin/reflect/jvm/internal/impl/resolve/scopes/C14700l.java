package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import p263fb.C12253b;
import p272gc.C12354e;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.l */
/* compiled from: StaticScopeForKotlinEnum.kt */
public final class C14700l extends C14696i {

    /* renamed from: d */
    static final /* synthetic */ C16887m<Object>[] f63727d = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14700l.class), "functions", "getFunctions()Ljava/util/List;"))};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13948e f63728b;

    /* renamed from: c */
    private final C17006i f63729c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.l$a */
    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class C14701a extends C13708q implements C16254a<List<? extends C14156y0>> {
        final /* synthetic */ C14700l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14701a(C14700l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* renamed from: a */
        public final List<C14156y0> invoke() {
            return C13614t.m87751m(C14602c.m91474f(this.this$0.f63728b), C14602c.m91475g(this.this$0.f63728b));
        }
    }

    public C14700l(C17012n nVar, C13948e eVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(eVar, "containingClass");
        this.f63728b = eVar;
        eVar.mo62168h();
        C13951f fVar = C13951f.ENUM_CLASS;
        this.f63729c = nVar.mo80221f(new C14701a(this));
    }

    /* renamed from: l */
    private final List<C14156y0> m91889l() {
        return (List) C17011m.m100276a(this.f63729c, this, f63727d[0]);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C13961h mo72800e(C16157f fVar, C12253b bVar) {
        return (C13961h) mo73824i(fVar, bVar);
    }

    /* renamed from: i */
    public Void mo73824i(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return null;
    }

    /* renamed from: j */
    public List<C14156y0> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return m91889l();
    }

    /* renamed from: k */
    public C12354e<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        List<C14156y0> l = m91889l();
        C12354e<C14156y0> eVar = new C12354e<>();
        for (T next : l) {
            if (C13706o.m87924a(((C14156y0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }
}
