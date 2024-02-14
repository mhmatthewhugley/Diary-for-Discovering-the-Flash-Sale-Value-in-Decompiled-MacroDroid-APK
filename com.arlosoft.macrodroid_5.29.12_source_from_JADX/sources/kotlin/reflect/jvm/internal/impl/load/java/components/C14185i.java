package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import p288ib.C12479a;
import p288ib.C12482b;
import p288ib.C12488e;
import p288ib.C12498m;
import p297ja.C13337s;
import p362pb.C16157f;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.i */
/* compiled from: JavaAnnotationMapper.kt */
public final class C14185i extends C14172b {

    /* renamed from: h */
    static final /* synthetic */ C16887m<Object>[] f62866h = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14185i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final C17006i f62867g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.i$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C14186a extends C13708q implements C16254a<Map<C16157f, ? extends C14617g<? extends Object>>> {
        final /* synthetic */ C14185i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14186a(C14185i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final Map<C16157f, C14617g<Object>> invoke() {
            C14617g<?> gVar;
            C12482b b = this.this$0.mo72686b();
            Map<C16157f, C14617g<Object>> map = null;
            if (b instanceof C12488e) {
                gVar = C14175d.f62855a.mo72696c(((C12488e) this.this$0.mo72686b()).getElements());
            } else {
                gVar = b instanceof C12498m ? C14175d.f62855a.mo72696c(C13612s.m87736e(this.this$0.mo72686b())) : null;
            }
            if (gVar != null) {
                map = C13613s0.m87741f(C13337s.m85692a(C14174c.f62850a.mo72692d(), gVar));
            }
            return map == null ? C13615t0.m87759i() : map;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14185i(C12479a aVar, C14301g gVar) {
        super(gVar, aVar, C13902k.C13903a.f62217H);
        C13706o.m87929f(aVar, "annotation");
        C13706o.m87929f(gVar, "c");
        this.f62867g = gVar.mo72918e().mo80221f(new C14186a(this));
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<Object>> mo72240a() {
        return (Map) C17011m.m100276a(this.f62867g, this, f62866h[0]);
    }
}
